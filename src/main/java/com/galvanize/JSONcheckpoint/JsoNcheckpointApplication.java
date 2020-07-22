package com.galvanize.JSONcheckpoint;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/movies")
public class JsoNcheckpointApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsoNcheckpointApplication.class, args);
	}

	@GetMapping("/movie")
	public singleMovie getMovie() {
		singleMovie singlemovie = new singleMovie();
		singlemovie.title = "The Godfather";
		singlemovie.minutes = 175;
		singlemovie.genre = "Crime, Drama";
		singlemovie.rating = 9.2;
		singlemovie.metascore = 100;
		singlemovie.description = "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.";
		singlemovie.votes = 1561591;
		singlemovie.gross = 134.97;
		singlemovie.year = "1972";

		singleMovie.personObj.Person person1 = new singleMovie.personObj.Person();
		person1.setRole("Director");
		person1.setFirstName("Francis Ford");
		person1.setLastName("Copolla");

		singleMovie.personObj.Person person2 = new singleMovie.personObj.Person();
		person2.setRole("Star");
		person2.setFirstName("Marlon");
		person2.setLastName("Brando");

		singleMovie.personObj.Person person3 = new singleMovie.personObj.Person();
		person3.setRole("Star");
		person3.setFirstName("Al");
		person3.setLastName("Pacino");

		singleMovie.personObj.Person person4 = new singleMovie.personObj.Person();
		person4.setRole("Star");
		person4.setFirstName("James");
		person4.setLastName("Caan");

		singleMovie.personObj.Person person5 = new singleMovie.personObj.Person();
		person5.setRole("Star");
		person5.setFirstName("Diane");
		person5.setLastName("Keaton");

		List <singleMovie.personObj> newpersonlist = new ArrayList<>();
		newpersonlist.add(new singleMovie.personObj());
		newpersonlist.get(0).setPerson(person1);
		newpersonlist.add(new singleMovie.personObj());
		newpersonlist.get(1).setPerson(person2);
		newpersonlist.add(new singleMovie.personObj());
		newpersonlist.get(2).setPerson(person3);
		newpersonlist.add(new singleMovie.personObj());
		newpersonlist.get(3).setPerson(person4);
		newpersonlist.add(new singleMovie.personObj());
		newpersonlist.get(4).setPerson(person5);

		singlemovie.setCredits(newpersonlist);
		return singlemovie;
	}
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public static class singleMovie{
		@JsonProperty("Title")
		private String title;
		@JsonProperty("Minutes")
		private int minutes;
		@JsonProperty("Genre")
		private String genre;
		@JsonProperty("Rating")
		private double rating;
		@JsonProperty("Metascore")
		private int metascore;
		@JsonProperty("Description")
		private String description;
		@JsonProperty("Votes")
		private long votes;
		@JsonProperty("Gross")
		private double gross;
		@JsonProperty("Year")
		private String year;
		@JsonProperty("Credits")
		private List<personObj> credits;

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public int getMinutes() {
			return minutes;
		}

		public void setMinutes(int minutes) {
			this.minutes = minutes;
		}

		public String getGenre() {
			return genre;
		}

		public void setGenre(String genre) {
			this.genre = genre;
		}

		public double getRating() {
			return rating;
		}

		public void setRating(double rating) {
			this.rating = rating;
		}

		public int getMetascore() {
			return metascore;
		}

		public void setMetascore(int metascore) {
			this.metascore = metascore;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public long getVotes() {
			return votes;
		}

		public void setVotes(long votes) {
			this.votes = votes;
		}

		public double getGross() {
			return gross;
		}

		public void setGross(double gross) {
			this.gross = gross;
		}

		public String getYear() {
			return year;
		}

		public void setYear(String year) {
			this.year = year;
		}

		public List<personObj> getCredits() {
			return credits;
		}

		public void setCredits(List<personObj> credits) {
			this.credits = credits;
		}
		@JsonInclude(JsonInclude.Include.NON_NULL)
		public static class personObj {
			@JsonProperty("Person")
			private Person person;

			public Person getPerson() {
				return person;
			}

			public void setPerson(Person person) {
				this.person = person;
			}

			@JsonInclude(JsonInclude.Include.NON_NULL)
			public static class Person {
				private String role;
				private String FirstName;
				private String LastName;

				@JsonProperty("Role")
				public String getRole() {
					return role;
				}

				public void setRole(String role) {
					this.role = role;
				}

				@JsonProperty("FirstName")
				public String getFirstName() {
					return FirstName;
				}

				public void setFirstName(String firstName) {
					FirstName = firstName;
				}

				@JsonProperty("LastName")
				public String getLastName() {
					return LastName;
				}

				public void setLastName(String lastName) {
					LastName = lastName;
				}
			}
		}
	}
}
