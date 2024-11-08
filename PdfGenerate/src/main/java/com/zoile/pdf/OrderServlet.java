package com.zoile.pdf;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;

import javafx.scene.paint.Color;


@WebServlet("/order")
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	
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
		//System.out.println(orderDetails.toString());
		//pdf 빌지 출력
		
		/*
		response.setContentType("application/pdf");
		response.setHeader("Content-Disposition", "attachment; filname=order.pdf");
		OutputStream out = response.getOutputStream();
		*/
		
		//pdf 파일 저장
		String pdfDirPath = getServletContext().getRealPath("/pdfgen");
		File pdfDir = new File(pdfDirPath);
		if(!pdfDir.exists()) {
			pdfDir.mkdirs(); //폴더가 없을경우 생성함
		}
		
		String pdfPath = pdfDirPath + File.separator + "order.pdf";
		
		
		Document document = new Document();
		try {
			PdfWriter.getInstance(document, new FileOutputStream(pdfPath));
			document.open();
			
			//한글폰트 설정
			Font font;
			try {
				String fontPath = getServletContext().getRealPath("/res/fonts/H2MKPB.TTF");
				BaseFont bf = BaseFont.createFont(fontPath, BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
				font = new Font(bf, 16, Font.NORMAL, BaseColor.BLACK);
			}catch(IOException e) {
				font = new Font(Font.FontFamily.TIMES_ROMAN, 16);
				System.out.println("폰트 로드 실패!");
			}
			//타이틀 폰트
			Font titleFont = new Font(font);
			titleFont.setColor(BaseColor.PINK);
			
			document.add(new Paragraph("빌!!!!지!!!", titleFont));
			document.add(new Paragraph("------------------", font));
			document.add(new Paragraph(orderDetails.toString(), font));
			document.add(new Paragraph("------------------", font));
			document.add(new Paragraph("총 가격 : " + totalPrice + "원", font));
			document.add(new Paragraph("감사합니다"));
			
			
		}catch(DocumentException e ) {
			e.printStackTrace();
		}finally {
			document.close();
			//out.close();
			System.out.println("pdf파일이 생성되었습니다.");
		}
		//파일 경로 보내기
		response.setContentType("application/json");
		response.getWriter().write("{\"filePath\" : \"pdfgen/order.pdf\"}");
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
