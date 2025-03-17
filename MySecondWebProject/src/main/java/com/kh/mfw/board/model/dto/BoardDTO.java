package com.kh.mfw.board.model.dto;

import java.sql.Date;

public class BoardDTO {
	private int boardNo;
	private String boardCategory;
	private String boardTitle;
	private String boardContent;
	private String boardWriter;
	private int count;
	private Date creteDate;
	
	public BoardDTO() {
		super();
	}


	public BoardDTO(int boardNo, String boardCategory, String boardTitle, String boardContent, String boardWriter,
			int count, Date creteDate) {
		super();
		this.boardNo = boardNo;
		this.boardCategory = boardCategory;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.boardWriter = boardWriter;
		this.count = count;
		this.creteDate = creteDate;
	}


	public int getBoardNo() {
		return boardNo;
	}


	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}


	public String getBoardCategory() {
		return boardCategory;
	}


	public void setBoardCategory(String boardCategory) {
		this.boardCategory = boardCategory;
	}


	public String getBoardTitle() {
		return boardTitle;
	}


	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}


	public String getBoardContent() {
		return boardContent;
	}


	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}


	public String getBoardWriter() {
		return boardWriter;
	}


	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public Date getCreteDate() {
		return creteDate;
	}


	public void setCreteDate(Date creteDate) {
		this.creteDate = creteDate;
	}


	@Override
	public String toString() {
		return "BoardDTO [boardNo=" + boardNo + ", boardCategory=" + boardCategory + ", boardTitle=" + boardTitle
				+ ", boardContent=" + boardContent + ", boardWriter=" + boardWriter + ", count=" + count
				+ ", creteDate=" + creteDate + "]";
	}


}
