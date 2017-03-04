package com.ip.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CandidateSkills")
public class CandidateSkills {
	
	public CandidateSkills() {
		super();
	}

	@Id
	@Column(name="Id",columnDefinition="INT")
	private int id;
	
	@Column(name="Tags", columnDefinition="VARCHAR(200)")
	private String tags;
	
	@Column(name="Description", columnDefinition="VARCHAR(200)")
	private String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
