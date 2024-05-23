package com.example.callRest.dao;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.example.callRest.entity.Book;

public class BookSpecification implements Specification<Book> {

	private String randomColumnName; // A varchar column.
    private String valueToSearchFor;
    
    public BookSpecification (String randomColumnName, String valueToSearchFor) {
        this.randomColumnName = randomColumnName;
        this.valueToSearchFor = valueToSearchFor;
    }
    
	@Override
	public Predicate toPredicate(Root<Book> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
		
		Predicate equal = builder.equal(root.get(this.randomColumnName), this.valueToSearchFor);
//		Predicate and = builder.and(builder.equal(root.<String>get(this.randomColumnName), this.valueToSearchFor));
		return equal;
	}

	
}
