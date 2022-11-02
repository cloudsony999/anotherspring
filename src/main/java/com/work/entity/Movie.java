package com.work.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "movie")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Movie {

	@Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "movieid", length = 10)
	private int id;
	@Column(name = "moviename", length = 20)
	private String title;

}
