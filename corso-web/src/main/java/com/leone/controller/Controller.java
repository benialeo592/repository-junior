package com.leone.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.leone.action.UserDao;
import com.leone.form.FieldForm;
import com.leone.form.MatchForm;
import com.leone.form.SubscriptionForm;
import com.leone.model.User;
import com.leone.service.MatchService;
import com.leone.service.UserService;




@WebServlet(name="ControllerServlet", urlPatterns = {"/", "/doLogin", "/doSubscription", "/doLogout", "/doMatch"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		try {
			process(request, response);
		} catch (ServletException | IOException | SQLException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			process(request, response);
		} catch (ServletException | IOException | SQLException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException, ParseException {
		String uri = request.getRequestURI();
		int lastindex = uri.lastIndexOf('/');
		String action = uri.substring(lastindex + 1);
		
		if(action.equals("doLogin")) {
			doLogin(request, response);
		}else if (action.equals("doSubscription")) {
			doSubscription(request, response);
		}else if (action.equals("doLogout")) {
			doLogout(request, response);
		}else if (action.equals("doMatch")) {
			doMatch(request, response);
		}
	}

	private void doMatch(HttpServletRequest request, HttpServletResponse response) throws ParseException {
		
		if(request.getSession() != null) {
			String dateStr = request.getParameter("data");
			Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateStr);
			FieldForm field = new FieldForm();
			field.setName(request.getParameter("campo"));
			MatchForm match = new MatchForm(date, field);
			MatchService mService = new MatchService();
			mService.createMatch(match);
			
		}
		
	}

	private void doLogout(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession();
		if(session != null) {
			session.invalidate();
		}
		response.sendRedirect("index.jsp");
		
	}

	private void doSubscription(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
			String username = request.getParameter("inputUsername");
			String email = request.getParameter("inputEmail");
			String password1 = request.getParameter("inputPassword1");
			String password2 = request.getParameter("inputPassword2");
			
			if(password1.equals(password2)) {
				UserService uServ = new UserService();
				SubscriptionForm sf = new SubscriptionForm(username, email, password1);
					uServ.createUser(sf);
			RequestDispatcher ds = request.getRequestDispatcher("index.jsp");
					ds.forward(request, response);;
			}else {
				response.sendRedirect("index.jsp");
			}
	}

	private void doLogin(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		
		String username = request.getParameter("inputUsername");
		String password = request.getParameter("inputPassword");
		UserDao uDao = new UserDao();
		User u = uDao.getUserByNameAndPass(username, password);
		if(u.getUsername() == null) {
			response.sendRedirect("login.jsp");
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("username" , u.getUsername());
			session.setAttribute("email" , u.getEmail());
			response.sendRedirect("index.jsp");
			}
	
	}




	
}
