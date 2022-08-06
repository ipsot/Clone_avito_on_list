<!DOCTYPE html>
<html>
<head>
    <title>Buysell</title>
<body>
<h1>BUYSELL</h1><hr>
<h4>Products from Russia</h4>
<#list products as product>
    <div>
        <p><b>${product.title}</b> ${product.price} rub. | <a href="/product/${product.id}">More...</a></p>
    </div>
</#list>
<hr>
<h3>Add new product</h3>
<form action="/product/create" method="post">
    Announcement title: <input type="text" name="title"/><br>
    Product description: <input type="text" name="description"/><br>
    Price: <input type="number" name="price"/><br>
    City:  <input type="text" name="city"/><br>
    Author: <input type="text" name="author"/><br>
    <input type="submit" value="Add product">
</form>
</body>
</head>
</html>