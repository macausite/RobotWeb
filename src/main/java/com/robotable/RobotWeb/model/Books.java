package com.robotable.RobotWeb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Books {

	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAithor() {
		return aithor;
	}
	public void setAithor(String aithor) {
		this.aithor = aithor;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Id
	@Column
private int bookid;
	@Column
	private  String bookname;
@Column
private String aithor;
@Column
private int price;
}
