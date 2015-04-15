package org.owasp.webgoat.benchmark.testcode;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BenchmarkTest01667")
public class BenchmarkTest01667 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String param = "";
		java.util.Enumeration<String> headerNames = request.getHeaderNames();
		if (headerNames.hasMoreElements()) {
			param = headerNames.nextElement(); // just grab first element
		}
		
		
		String bar = "safe!";
		java.util.HashMap<String,Object> map7267 = new java.util.HashMap<String,Object>();
		map7267.put("keyA-7267", "a_Value"); // put some stuff in the collection
		map7267.put("keyB-7267", param.toString()); // put it in a collection
		map7267.put("keyC", "another_Value"); // put some stuff in the collection
		bar = (String)map7267.get("keyB-7267"); // get it back out
		bar = (String)map7267.get("keyA-7267"); // get safe value back out
		
		
		java.io.File file = new java.io.File(bar);
	}
}