package org.tushar;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class TusharServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String lover1 = req.getParameter("lover1");
		String lover2 = req.getParameter("lover2");
		out.println("<html>");
		out.println("<head><title>Love Calc - By Tushar</title></head>");
		out.println("<body><center>");
		out.println("<h2>"+lover2+" loves "+lover1+".</h2>");
		out.println("<h2>Love is "+Lovecal.getPercentage(lover1, lover2)+"%</h2>");
		out.println("</center></body>");
		out.println("</html>");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doGet(req, resp);
	}
}