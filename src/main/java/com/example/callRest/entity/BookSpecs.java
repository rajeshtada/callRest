package com.example.callRest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
public class BookSpecs {

	 	@Id
	 	@Column(name = "spec_id")
	    private Long specId;
	     
	    private byte[] file;
	     
	    @OneToOne
	    @JoinColumn(name = "specId")
	    @MapsId
	    private Book book;
	     
}
