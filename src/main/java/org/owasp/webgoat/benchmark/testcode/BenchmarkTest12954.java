package org.owasp.webgoat.benchmark.testcode;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BenchmarkTest12954")
public class BenchmarkTest12954 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String param = request.getQueryString();

		String bar = new Test().doSomething(param);
		
		try {	
			java.nio.file.Path path = java.nio.file.Paths.get(org.owasp.webgoat.benchmark.helpers.Utils.testfileDir + bar);
			java.io.InputStream is = java.nio.file.Files.newInputStream(path, java.nio.file.StandardOpenOption.READ);
		} catch (Exception e) {
			// OK to swallow any exception for now
			System.out.println("File exception caught and swallowed: " + e.getMessage());
		}
	}  // end doPost

    private class Test {

        public String doSomething(String param) throws ServletException, IOException {

		// Chain a bunch of propagators in sequence
		String a85896 = param; //assign
		StringBuilder b85896 = new StringBuilder(a85896);  // stick in stringbuilder
		b85896.append(" SafeStuff"); // append some safe content
		b85896.replace(b85896.length()-"Chars".length(),b85896.length(),"Chars"); //replace some of the end content
		java.util.HashMap<String,Object> map85896 = new java.util.HashMap<String,Object>();
		map85896.put("key85896", b85896.toString()); // put in a collection
		String c85896 = (String)map85896.get("key85896"); // get it back out
		String d85896 = c85896.substring(0,c85896.length()-1); // extract most of it
		String e85896 = new String( new sun.misc.BASE64Decoder().decodeBuffer( 
		    new sun.misc.BASE64Encoder().encode( d85896.getBytes() ) )); // B64 encode and decode it
		String f85896 = e85896.split(" ")[0]; // split it on a space
		org.owasp.webgoat.benchmark.helpers.ThingInterface thing = org.owasp.webgoat.benchmark.helpers.ThingFactory.createThing();
		String g85896 = "barbarians_at_the_gate";  // This is static so this whole flow is 'safe'
		String bar = thing.doSomething(g85896); // reflection

            return bar;
        }
    } // end innerclass Test

} // end DataflowThruInnerClass