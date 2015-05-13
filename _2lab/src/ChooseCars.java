

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class ChooseCars extends HttpServlet {

  public void doPost( HttpServletRequest request, 
                      HttpServletResponse response) 
                      throws IOException, ServletException {

    String c = request.getParameter("type");

    // Now use our Coffee Model above 
    Cars ce = new Cars();

    List result = ce.getTypes(c);

    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("Cars Selection Advise<br>");

    Iterator it = result.iterator();
    while(it.hasNext()) {
      out.print("<br>drive: " + it.next());
    }

    // The results will be passed back (as an attribute) to the JSP view
    // The attribute will be a name/value pair, the value in this case will be a List object 
    request.setAttribute("styles", result);
    RequestDispatcher view = request.getRequestDispatcher("result.jsp");
    view.forward(request, response); 
  }
}