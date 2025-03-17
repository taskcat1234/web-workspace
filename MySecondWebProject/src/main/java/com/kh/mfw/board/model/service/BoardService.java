package com.kh.mfw.board.model.service;

import java.lang.runtime.TemplateRuntime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.kh.mfw.board.model.dao.BoardDAO;
import com.kh.mfw.board.model.dto.BoardDTO;
import static com.kh.mfw.common.Template.getSqlSession;

public class BoardService {
	private BoardDAO boardDao = new BoardDAO();
	public void insertBoard(BoardDTO board) {
		
		SqlSession sqlSession = getSqlSession();
		
		// 유효성 검증 => 했다고 침
		
		boardDao.insertBoard(sqlSession, board);
		sqlSession.commit(); 
		sqlSession.close();
	}
	public Map<String, Object> selectBoards(int page){
		SqlSession sqlSession = getSqlSession();
		
		// Table에서 조회해온 게시글 총 개수
		int boardCount = boardDao.selectBoardCount(sqlSession);
		// page == 앞단에서 넘어온 요청 페이지
		
		//마지막 페이지를 구해야함!
		// 한 페이지에 보여줄 게시글 개수 : 10개
		
		/*
		 * boardCount   한 페이지 개수   마지막 페이지
		 * 
		 *  100            10             10
		 *  103            10             11
		 *  112            10             12
		 *  
		 *  => 총게시글개수/한페이지개수를 올림처리할 경우 마지막페이지를 구할 수 있음
		 *  
		 *  
		 */
		int boardLimit = 10;  // 한 페이지에 보여줄 게시글 개수
		int maxPage = (int)(Math.ceil(boardCount / (double)boardLimit));
		
		// startBtn : 페이지 하단에 보여질 버튼 중 시작 값
		// page       한 페이지에 몆개의 페이지 버튼을 보일 것인지
		
		/*
		 * 생각 해보기
		 * 
		 * 한 페이지에 보여질 개수 : 5개
		 * 
		 * start : 1, 6, 11, 16
		 * 
		 * 한 페이지에 보여질 개수 : 3개
		 * 
		 * start : 1, 4, 7, 10...
		 * 
		 * startbtn = n * 한페이지개수 + 1;
		 * 
		 * page     start
		 *  1         1
		 *  5         1
		 *  6         6
		 *  8         6
		 *  10        6
		 *  14        11
		 *  
		 *  => 1 ~ 5   : n * 5 + 1 ==> n == 0
		 *  => 6 ~ 10  : n * 5 + 1 ==> n == 1
		 *  => 11 ~ 15 : n * 5 + 1 ==> n == 2
		 *  
		 *  1 ~ 5 - 1   == (0~4)   / 5 == 0
		 *  6 ~ 10 - 1  == (5~9)   / 5 == 1
		 *  11 ~ 15 - 1 == (10~14) / 5 == 2
		 *  
		 *  (page - 1) / 5 == n
		 *  
		 *  startBtn = (page - 1) / 5 * 5 + 1
		 *  
		 */
		int btnLimit = 5;    // 한 페이지에 보여줄 버튼 개수
		int startBtn = (page - 1) / btnLimit * btnLimit + 1;
		

		// endBtn
		/*
		 * startBtn : 1 => 5
		 * endBtn = startBtn + btnLimit - 1
		 */
		int endBtn = startBtn + btnLimit - 1;
		if(endBtn > maxPage) endBtn = maxPage;
		
		/*
		 * MyBatis RowBounds 사용하기
		 * 
		 * offset과 limit을 생성자 매개변수로 전달해주어야 함
		 * 
		 * page 1 : 1 ~ 3 ==> 0
		 * page 2 : 4 ~ 6 ==> 3
		 * page 3 : 7 ~ 9 ==> 6
		 * 
		 * 
		 */
		RowBounds rowBounds = new RowBounds((page - 1)* boardLimit, boardLimit);
		
		// 나중 일 -> 페이징 처리 이후
		List<BoardDTO> boards = boardDao.selectBoards(sqlSession, rowBounds);
		
		System.out.println(boards);
		
		sqlSession.close();
		
		Map<String, Object> map = new HashMap();
		map.put("boards", boards);
		map.put("boardCount", boardCount);
		map.put("page", page);
		map.put("boardLimit", boardLimit);
		map.put("btnLimit", btnLimit);
		map.put("maxPage", maxPage);
		map.put("startBtn", startBtn);
		map.put("endBtn", endBtn);
		
		
		
		return map;
		
	}
	
	public BoardDTO findByBoardNo(int boardNo) {
		
		SqlSession sqlSession = getSqlSession();
		
		// 최대 두 번 가야함
		// 조회수 증가 조릭 한 번 ==> update
		// 게시글 정보 조회 로직 한 번 ==> select
		
		int uqdateResult = boardDao.increaseCount(sqlSession, boardNo); // 조회 성공 / 조회 실패
		//boardDao.셀렉트();
		if(updateResult == 0) {
			sqlSession.close();
			return null;
		}
		
		BoardDTO board = boardDao.findByBoardNo(sqlSession, boardNo);
		
		if(board != null) {
			sqlSession.commit();
		}
		sqlSession.close();
		
		
		
		return board;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
