<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>    
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title><tiles:getAsString name="title"/></title>
    <link rel="stylesheet" href="res/css/bootstrap.min.css">
    <link rel="stylesheet" href="res/admin/css/style.css">
    
    <script src="res/js/jquery.min.js"></script>
    <script src="res/js/popper.min.js"></script>
    <script src="res/js/bootstrap.min.js"></script>
    <script src="res/admin/js/script.js"></script>
</head>
<body>
    <div class="container">
       <!--header-->
       <tiles:insertAttribute name="header" />
       <!-- /header -->
        <div class="row">  
            <!-- aside -->
            <tiles:insertAttribute name="aside" />
            <!-- //aside -->
            <tiles:insertAttribute name="body" />
        </div>
       <tiles:insertAttribute name="footer" />
    </div>

</body>
</html>