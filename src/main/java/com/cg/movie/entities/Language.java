package com.cg.movie.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="language_table")
public class Language{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long languageId;
	private String languageName;

	@JsonIgnore
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Movie_Language", joinColumns = @JoinColumn(name = "languageId"), inverseJoinColumns = @JoinColumn(name = "movieId"))
	private Set<Movie> moviesList = new HashSet<>();

	public Language(Long languageId, String languageName) {
		super();
		this.languageId = languageId;
		this.languageName = languageName;
	}

	public Long getLanguageId() {
		return languageId;
	}

	public void setLanguageId(Long languageId) {
		this.languageId = languageId;
	}

	public String getLanguageName() {
		return languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	@JsonIgnore
	public Set<Movie> getMoviesList() {
		return moviesList;
	}

	public void setMoviesList(Set<Movie> moviesList) {
		this.moviesList = moviesList;
	}
	
}