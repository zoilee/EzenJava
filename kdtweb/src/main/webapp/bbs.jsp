<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String bbs = "list";
	if(request.getParameter("bbs")!=null && !request.getParameter("bbs").isEmpty()){
		bbs = request.getParameter("bbs");
	}
	bbs = "/bbs/"+bbs+".jsp";
%>
<%@ include file="include/header.jsp" %>
	<div class="row">
		<div class="col-12">
			<div class="bg-white rg p-5">
				<jsp:include page="<%=bbs%>"/>		
			</div>
		</div>
	</div>
		
<%@ include file="include/footer.jsp" %>