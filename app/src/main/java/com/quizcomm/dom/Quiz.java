package com.quizcomm.dom;

import java.sql.Date;

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
	
	@Column(name="Status")
	private String status;
	
	@Column(name="CreatedDate")
	private Date createdDate;
	
	@Column(name="ModifiedData")
	private Date modifiedData;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedData() {
		return modifiedData;
	}

	public void setModifiedData(Date modifiedData) {
		this.modifiedData = modifiedData;
	}
	
}