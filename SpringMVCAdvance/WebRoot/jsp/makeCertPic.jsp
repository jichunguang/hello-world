<%@page contentType="image/jpeg" %><%@page language="java" pageEncoding="gbk"%>
<jsp:useBean id="image" scope="page" class="jcg.tools.MakeCertPic"/>
<%
 String str = image.getCertPic(0,0,response.getOutputStream());
 /* 
        getOutputStream(), setCharacterEncoding(java.lang.String)
��API���ԣ�����ServletResponse.getOutputStream()������
setCharacterEncoding�������п��ܱ����ã������JSPҳ������ݣ�
������е�һ�������������ˣ��ٵ�����һ�������ͻ��׳��쳣:
getOutputStream() has already been called for this response
�������н���˷���
*/
out.clear();//��ջ�������ݡ�
pageContext.pushBody();
/*
pushBody()��������һ���µ�BodyContent(����һ��HTMLҳ���BODY�������ݣ�
����JspWriterʵ���Ķ���
out����PageContext��out���Ե�����
*/
 //����֤�����session��
 session.setAttribute("certCode",str);
%>