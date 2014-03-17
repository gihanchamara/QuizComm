package com.quizcomm.dom;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Quiz")
public class Quiz {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="QuizId")
	private Long id;
	
	@Column(name="Title")
	private String title;
	
	@Column(name="Type")
	private String type;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="Owner")
	private User owner;
	
	
}
