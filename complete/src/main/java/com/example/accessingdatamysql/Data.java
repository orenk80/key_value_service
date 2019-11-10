package com.example.accessingdatamysql;

import org.springframework.context.annotation.Primary;

import javax.persistence.*;

@Entity
public class Data {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer entityId;

    private String name;

    private String value;

    private Integer ownerId;

	@Column(name="value",  unique = true, nullable = false, length=255)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name="value",  length=255)
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}


	public Integer getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}



}
