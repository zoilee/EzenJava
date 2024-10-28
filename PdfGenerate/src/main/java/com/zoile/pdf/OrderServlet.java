package com.zoile.pdf;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;


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
		response.setContentType("application/pdf");
		response.setHeader("Content-Disposition", "attachment; filname=order.pdf");
		OutputStream out = response.getOutputStream();
		
		Document document = new Document();
		try {
			PdfWriter.getInstance(document, out);
			document.open();
			document.add(new Paragraph("빌!!!!지!!!"));
			document.add(new Paragraph("------------------"));
			document.add(new Paragraph(orderDetails.toString()));
			document.add(new Paragraph("------------------"));
			document.add(new Paragraph("총 가격 : " + totalPrice + "원"));
			document.add(new Paragraph("감사합니다"));
			
			
		}catch(DocumentException e ) {
			e.printStackTrace();
		}finally {
			document.close();
			out.close();
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
