import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class PartialMode extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

		if(SearchServer.ifPartial == true) {
			SearchServer.ifPartial = false;
		}else {
			SearchServer.ifPartial = true;
		}
		response.sendRedirect("/?query="+request.getParameter("query")+"&ifAdd=false");

	}
}
