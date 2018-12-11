<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="org.springframework.security.core.Authentication" %>
<%@ page import="org.springframework.security.core.context.SecurityContextHolder" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<body>
<h2>admin page </h2>
<form action="<c:url value='logout'/>" method="POST">
      <table>
        <tr><td>Current User:</td><td>

<%
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    if (auth != null) { %>

        <%= auth.getPrincipal().toString() %>

 <% } %>
         </td></tr>
        <tr><td colspan='2'><input name="exit" type="submit" value="Exit"></td></tr>
      </table>
      <input type="hidden" name="<c:out value="${_csrf.parameterName}"/>" value="<c:out value="${_csrf.token}"/>"/>
    </form>
</body>
</html>