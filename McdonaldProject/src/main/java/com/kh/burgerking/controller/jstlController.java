package com.kh.burgerking.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.burgerking.model.dto.UserDTO;
import com.kh.burgerking.model.service.UserService;

/**
 * Servlet implementation class jstlController
 */
@WebServlet("/jstl")
public class jstlController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public jstlController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int point = 500;
		request.setAttribute("point", point);
		
		String[] colors = {"red","orangered","orange","yellow","yellowgreen","green"};
		request.setAttribute("colors", colors);
		
		// TB_USER가지고 할 것
		List<UserDTO> list = new UserService().findAll();
		
		request.setAttribute("users", list);
		request.setAttribute("msg", "인제 리스트가 널이 아니면 조회성공이라고 보내고싶어");
		
		
		
		
		request.getRequestDispatcher("/WEB-INF/views/jstl/JSTL.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
