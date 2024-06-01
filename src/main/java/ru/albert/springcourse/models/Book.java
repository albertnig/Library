package ru.albert.springcourse.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Book {
	private int id;
	@NotEmpty(message = "Название книги не должно быть пустым")
	@Size (min=2, max=200, message = "Название книги должно содержать от 2 до 200 символов")
	private String name;
	@NotEmpty(message = "Имя автора не должно быть пустым")
	@Size (min=2, max=100, message = "Имя автора должно содержать от 2 до 100 символов")
	private String autor;
	@Min (value = 1901, message = "Год издания книги должен быть больше чем 1900")
	private int year;
	public Book() {
	
	}
	public Book(int id, String name, String autor, int year) {
		this.id = id; 
		this.name = name;
		this.autor = autor;
		this.year = year;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}	
}
