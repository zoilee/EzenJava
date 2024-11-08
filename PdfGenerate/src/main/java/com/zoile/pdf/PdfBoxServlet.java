package com.zoile.pdf;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType0Font;



/**
 * Servlet implementation class PdfBoxServlet
 */
@WebServlet("/orderbox")
public class PdfBoxServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//폼에서 제품이름 가격 가져오기
		Map<String, String[]> parameterMap = request.getParameterMap();
		
		String[] productNames = parameterMap.get("pdname[]");
		String[] productPrices = parameterMap.get("pdprice[]");
		String totalPrice = request.getParameter("totalPrice");
		
		StringBuilder orderDetails = new StringBuilder();
		
		
		if(productNames != null && productPrices != null && productNames.length == productPrices.length) {
			for(int i = 0; i <productNames.length; i++) {
				String productName = productNames[i];
				String productPrice = productPrices[i];
				orderDetails.append("상품명 : ").append(productName).append("\n");
				orderDetails.append("가격 : ").append(productPrice).append("원 \n");
				
			}
		}
		
		
		//pdf 파일 저장
		String pdfDirPath = getServletContext().getRealPath("/pdfgen");
		File pdfDir = new File(pdfDirPath);
		if(!pdfDir.exists()) {
			pdfDir.mkdirs(); //폴더가 없을경우 생성함
		}
		String pdfPath = pdfDirPath + File.separator + "order.pdf";
		
		PDDocument document = new PDDocument();
		PDPage page = new PDPage();
		document.addPage(page);
		
		PDPageContentStream contentStream = null;
		
		try {
			//
			contentStream = new PDPageContentStream(document, page);
			PDType0Font font;
			try {
				String fontPath = getServletContext().getRealPath("/res/fonts/H2MKPB.TTF");
				font = PDType0Font.load(document, new File(fontPath));
				System.out.println("폰트로드 성공" + fontPath);
			}catch(IOException e) {
				e.printStackTrace();
				System.out.println("폰트로드실패");
				font = PDType0Font.load(document, new File(getServletContext().getRealPath("/res/fonts/H2MKPB.TTF")));
			}
			
			//타이틀
			contentStream.beginText();
			contentStream.setFont(font, 20);
			contentStream.newLineAtOffset(50, 750);
			contentStream.showText("빌지입니당");
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(font, 20);
			contentStream.newLineAtOffset(50, 730);
			contentStream.showText("-------------------------");
			contentStream.endText();
			
			int yPosition = 710;
			for (String line : orderDetails.toString().split("\n")) {
				contentStream.beginText();
				contentStream.setFont(font, 14);
				contentStream.newLineAtOffset(50, yPosition);
				contentStream.showText(line);
				contentStream.endText();
				yPosition -= 20; // 줄 간격 조정
			}
			
			contentStream.beginText();
			contentStream.setFont(font, 20);
			contentStream.newLineAtOffset(50, yPosition - 20);
			contentStream.showText("총 가격 : "+ totalPrice +"원");
			contentStream.endText();
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(contentStream != null) contentStream.close();
			document.save(pdfPath);
			document.close();
		}
		response.setContentType("application/json");
		response.getWriter().write("{\"filePath\" : \"pdfgen/order.pdf\"}");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
