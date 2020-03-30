package com.dbal.app.board;

public class Board {
	private String seq;
	private String title;
	private String wid;
	private String wdate;
	private String contents;
	public String getSeq() {
	return seq;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String tile) {
		this.title = tile;
	}
	public String getWid() {
		return wid;
	}
	public void setWid(String wid) {
		this.wid = wid;
	}
	public String getWdate() {
		return wdate;
	}
	public void setWdate(String wdate) {
		this.wdate = wdate;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	

}
