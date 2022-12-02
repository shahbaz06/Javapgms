package com.GeneralJavapgm.JavaPgms;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetTest1 {

	public static void main(String[] args)
	{
		RestAssured.baseURI="https://simple-books-api.glitch.me";
		RequestSpecification req = RestAssured.given();
		//Response res = req.get("/status");
		
		
		Response res = req.queryParam("type", "fiction").get("/books/1");
		
		System.out.println(res.asString());
		
//		Response resp = req.queryParam("type", "non-fiction").get("/books/2");
//		
//		System.out.println(resp.asString());
//		
		
	}

}
