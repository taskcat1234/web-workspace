package com.kh.mfw.board.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.mfw.board.model.service.BoardService;

@WebServlet("/board")
public class BoardDetailViewContriller extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public BoardDetailViewContriller() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//GET 방식 
		int boardNo = Integer.parseInt(request.getParameter("boardNo"));
		
		HttpSession session = request.getSession();
		
		if(boardNo < 1) {
			session.setAttribute("message","장난꾸러기");
			response.sendRedirect(request.getContextPath());
			return;
		}
		
		new BoardService().findByBoardNo(boardNo);
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
