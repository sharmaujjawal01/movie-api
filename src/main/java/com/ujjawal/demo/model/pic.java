package com.ujjawal.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class pic 
{
	@Id
	private int pid;
	private String pname;
	private String genere;
	private String director;
	private int year;
	
	
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	@Override
	public String toString() {
		return "pic [pid=" + pid + ", pname=" + pname + ", genere=" + genere + ", director=" + director + ", year="
				+ year + "]";
	}
	
	

}
