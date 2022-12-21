package com.example.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "teachers")
@Entity
public class Teacher implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "name", columnDefinition = "varchar(45)")
	private String name;
	@Column(name= "birthday", columnDefinition = "date")
	private Date birthday;
	@Column(name="age", columnDefinition = "age")
	private int age;
	@Column(name = "address", columnDefinition = "varchar(45)")
	private String address;

}
