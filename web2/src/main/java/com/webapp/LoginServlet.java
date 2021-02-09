//package webapp;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//
//@WebServlet(urlPatterns = "/login.do")
//public class LoginServlet extends HttpServlet {
//	private UserValidationService service = new UserValidationService();
//
//	// servelet java class, which is for business logic
//	// not static content
//	// jsp (from java EE): java server pages, designed to write dynamic content to browser
//	// jsp will eventually compiles to servelet
//
//	protected void doGet(
//			HttpServletRequest request,
//			HttpServletResponse response)
//			throws ServletException, IOException {
//				// request parameter: browser -- server(servelet)
//				// request attributes: servelet --- jsp
////				request.setAttribute("name", request.getParameter("name"));
////				request.setAttribute("password", request.getParameter("password"));
//
//
//				//redirect request to jsp
//				request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
//   			}
//
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String name = request.getParameter("name");
//		String password = request.getParameter("password");
//		boolean isUserValid = service.isUserValid(name, password);
//
//		request.setAttribute("name", name);
//		request.setAttribute("password", password);
//
//		if(isUserValid) {
//			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
//		} else {
//			request.setAttribute("errorMessage", "invalid credentials");
//
//			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
//		}
//
// 	}
//}
