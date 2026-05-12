package com.tvkmovies.main;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="movies")
public class Movies {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer movie_id;
	
	private String movie_title;
	private String movie_category;
	private String movie_director;
	private String movie_staring;
	public Movies(String movie_title, String movie_category, String movie_director, String movie_staring) {
		super();
		this.movie_title = movie_title;
		this.movie_category = movie_category;
		this.movie_director = movie_director;
		this.movie_staring = movie_staring;
	}
	
	
	public Movies() {
		super();
	}



	public Integer getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(Integer movie_id) {
		this.movie_id = movie_id;
	}
	public String getMovie_title() {
		return movie_title;
	}
	public void setMovie_title(String movie_title) {
		this.movie_title = movie_title;
	}
	public String getMovie_category() {
		return movie_category;
	}
	public void setMovie_category(String movie_category) {
		this.movie_category = movie_category;
	}
	public String getMovie_director() {
		return movie_director;
	}
	public void setMovie_director(String movie_director) {
		this.movie_director = movie_director;
	}
	public String getMovie_staring() {
		return movie_staring;
	}
	public void setMovie_staring(String movie_staring) {
		this.movie_staring = movie_staring;
	}
	
	
	
	

}
