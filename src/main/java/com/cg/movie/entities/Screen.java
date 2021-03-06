package com.cg.movie.entities;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="screen_table")
public class Screen {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long screenId;
	private String screenName;
	private Timestamp movieEndDate;
//	private Integer rows;
//	private Integer columns;

	@JsonIgnore
	@OneToMany(mappedBy = "screen", cascade = CascadeType.ALL)
	private Set<Show> showsList = new HashSet<>();

	@ManyToOne
	@JoinColumn(name = "theaterId")
	private Theatre theatre;

	public Long getScreenId() {
		return screenId;
	}

	public void setScreenId(Long screenId) {
		this.screenId = screenId;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public Timestamp getMovieEndDate() {
		return movieEndDate;
	}

	public void setMovieEndDate(Timestamp movieEndDate) {
		this.movieEndDate = movieEndDate;
	}

	@JsonIgnore
	public Set<Show> getShowsList() {
		return showsList;
	}

	public void setShowsList(Set<Show> showsList) {
		this.showsList = showsList;
	}

	public Theatre getTheatre() {
		return theatre;
	}

	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}

	// the method below will add show to screen
	// also serves the purpose to avoid cyclic references.
	public void addShow(Show show) {
		show.setScreen(this); // this will avoid nested cascade
		this.getShowsList().add(show);
	}

}
