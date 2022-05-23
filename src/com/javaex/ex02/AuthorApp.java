package com.javaex.ex02;

public class AuthorApp {

	public static void main(String[] args) {
		
		AuthorDao authorDao = new AuthorDao();
		
		authorDao.authorInsert("이문열", "경북영양");
		
		
	}

}
