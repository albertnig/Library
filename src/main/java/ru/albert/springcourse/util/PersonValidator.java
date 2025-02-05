package ru.albert.springcourse.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ru.albert.springcourse.dao.PersonDAO;
import ru.albert.springcourse.models.Person;

@Component
public class PersonValidator implements Validator{
	private final PersonDAO personDAO;
	@Autowired
	public PersonValidator (PersonDAO personDAO) {
		this.personDAO = personDAO;
	}

	@Override
	public boolean supports(Class<?> aClass) {
		return Person.class.equals(aClass);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Person person = (Person) target;
		if (personDAO.show(person.getName()).isPresent())
			errors.rejectValue("name", "", "Это имя уже есть в базе");
	}
}
