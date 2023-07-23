package com.example.demo.oops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;

public class ResponseClass<T> {
	
	private List<ErrorRes> errors;
	
	private Class<T> data;

	public List<ErrorRes> getErrors() {
		return errors;
	}

	public void setErrors(List<ErrorRes> errors) {
		this.errors = errors;
	}

	public Class<T> getData() {
		return data;
	}

	public void setData(Class<T> data) {
		this.data = data;
	}

}
class ErrorRes{
	String message;
	HttpStatus httpStatus;
}

class Test{
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();
		arrayList.add("Bikash");
		arrayList.add("Ranjan");
		arrayList.add("Mohanty");
		
		ResponseClass<List<String>> responseClass = new ResponseClass<>();
		ErrorRes errorRes = new ErrorRes();
		
		responseClass.setErrors(new ArrayList<>(Arrays.asList()));
		
	}
}
