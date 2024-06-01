package ru.albert.springcourse.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Person {
private int id;
@NotEmpty(message = "Имя не должно быть пустым")
@Size (min=2, max=100, message = "ФИО должно содержать от 2 до 100 символов")
private String name;
@Min (value = 1901, message = "Год рождения должен быть больше чем 1900")
private int age;
public Person() {
	
}
public Person(int id, String name, int age) {
	this.id = id;
	this.name = name;
	this.age=age;
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
}
