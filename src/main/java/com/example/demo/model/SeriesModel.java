package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SeriesModel {
	
        @Id	
        private int id;
        private String name;
        private String seasons;
        private String episodes;
        private String rating;
        
        
		public int getId() {
			return id;
		}
		public String getName() {
			return name;
		}
		public String getSeasons() {
			return seasons;
		}
		public String getEpisodes() {
			return episodes;
		}
		public String getRating() {
			return rating;
		}
		public void setId(int id) {
			this.id = id;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setSeasons(String seasons) {
			this.seasons = seasons;
		}
		public void setEpisodes(String episodes) {
			this.episodes = episodes;
		}
		public void setRating(String rating) {
			this.rating = rating;
		}
        
        
		
        
}
