<%@page import="org.example.SavingsAccount"%>
<%
SavingsAccount acc=new SavingsAccount(5000);
%>

<h2> The balance is <%=acc.getBalance() %></h2>