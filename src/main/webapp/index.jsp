<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Product Discount Calculator" %>
</h1>
<br/>
<form action="/ProductDiscount "method="post">
    <input type="text" name="description" placeholder=" Enter in Description"><br>
    <br>
    <input type="text" name="price" placeholder=" Enter in Price"><br>
    <br>
    <input type="text" name="discount" placeholder="Enter in Discount "><br>
    <br>
    <button>Resul</button>
</form>
</body>
</html>