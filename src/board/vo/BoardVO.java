package board.vo;

import java.io.Serializable;
import java.sql.Date;

public class BoardVO implements Serializable{
	
	//게시판 번호 int값 활용
	private int board_no;
	//게시판 번호 String값 활용
	private String board_title;
	//게시판 번호 String값 활용
	private String board_writer;
	//게시판 번호 Date값 활용 //자바 (SQL)
	private Date board_date;
	//게시판 번호 String값 활용
	private String board_content;
	
	public int getBoard_no() {
		return board_no;
	}
	public void setBoard_no(int board_no) {
		this.board_no = board_no;
	}
	public String getBoard_title() {
		return board_title;
	}
	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}
	public String getBoard_writer() {
		return board_writer;
	}
	public void setBoard_writer(String board_writer) {
		this.board_writer = board_writer;
	}
	public Date getBoard_date() {
		return board_date;
	}
	public void setBoard_date(Date board_date) {
		this.board_date = board_date;
	}
	public String getBoard_content() {
		return board_content;
	}
	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}

}
