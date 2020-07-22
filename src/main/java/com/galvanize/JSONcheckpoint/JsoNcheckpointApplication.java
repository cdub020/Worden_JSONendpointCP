package com.galvanize.JSONcheckpoint;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

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

//	public singleMovie[] theSingleMovie() {
//		singleMovie[] singlemovie = new singleMovie[2];
//		singlemovie[0] = new singleMovie();
//		singlemovie[0].title = "The Godfather";
//		singlemovie[0].minutes = 175;
//		singlemovie[0].genre = "Crime, Drama";
//		singlemovie[0].rating = 9.2;
//		singlemovie[0].metascore = 100;
//		singlemovie[0].description = "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.";
//		singlemovie[0].votes = 1561591;
//		singlemovie[0].gross = 134.97;
//		singlemovie[0].year = "1972";
//		singleMovie.personObj[] personObj = new singleMovie.personObj[1];
//		singleMovie.personObj.Person person1 = new singleMovie.personObj.Person();
//		person1.setRole("Director");
//		person1.setFirstName("Francis Ford");
//		person1.setLastName("Copolla");
//		personObj[0] = new singleMovie.personObj();
//		personObj[0].setPerson(person1);
//		singlemovie[0].setCredits(personObj);
//		person1.setFirstName("Some name");
//		person1.setLastName("Some other name");
//		tickets1[0] = new Flight.Ticket();
//		tickets1[0].setPassenger(person1);
//		tickets1[0].setPrice(200);
//		flights[0].setTickets(tickets1);
//
//		flights[1] = new Flight();
//		flights[1].setDeparts(new Date());
//		Flight.Ticket[] tickets2 = new Flight.Ticket[1];
//		Flight.Ticket.Person person2 = new Flight.Ticket.Person();
//		person2.setLastName("Some other name");
//		tickets2[0] = new Flight.Ticket();
//		tickets2[0].setPassenger(person2);
//		tickets2[0].setPrice(400);
//		flights[1].setTickets(tickets2);
//		return singlemovie;
//	}

	@JsonInclude(JsonInclude.Include.NON_NULL)
	public static class singleMovie{
		private String title;
		private int minutes;
		private String genre;
		private double rating;
		private int metascore;
		private String description;
		private long votes;
		private double gross;
		private String year;
		private List<personObj> credits;

		@JsonProperty("Title")
		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		@JsonProperty("Minutes")
		public int getMinutes() {
			return minutes;
		}

		public void setMinutes(int minutes) {
			this.minutes = minutes;
		}

		@JsonProperty("Genre")
		public String getGenre() {
			return genre;
		}

		public void setGenre(String genre) {
			this.genre = genre;
		}

		@JsonProperty("Rating")
		public double getRating() {
			return rating;
		}

		public void setRating(double rating) {
			this.rating = rating;
		}

		@JsonProperty("Metascore")
		public int getMetascore() {
			return metascore;
		}

		public void setMetascore(int metascore) {
			this.metascore = metascore;
		}

		@JsonProperty("Description")
		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		@JsonProperty("Votes")
		public long getVotes() {
			return votes;
		}

		public void setVotes(long votes) {
			this.votes = votes;
		}

		@JsonProperty("Gross")
		public double getGross() {
			return gross;
		}

		public void setGross(double gross) {
			this.gross = gross;
		}

		@JsonProperty("Year")
		public String getYear() {
			return year;
		}

		public void setYear(String year) {
			this.year = year;
		}

		@JsonProperty("Credits")
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

	@PostMapping("/gross/total")
	public Total grossTotal (@RequestBody() singleMovie themovie) {
		Total newtotal = new Total();

		return newtotal;
	}

	public static class Total {
		private int result;

		public int getResult() {
			return result;
		}

		public void setResult(int result) {
			this.result = result;
		}
	}
}
