<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sf:form modelAttribute="user" method="post">
        用户名:<sf:input path="username"/><sf:errors path="username"/>
        <br>
        密码:<sf:input path="password"/><sf:errors path="password"/>
        <br>
        昵称:<sf:input path="nickname"/><sf:errors path="nickname"/>
        <br>
        <input type="submit" value="提交">
    </sf:form>

</body>
</html>