package com.example.burger.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
@Entity
@Table(name="burger")

public class Burger {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    @NotNull
	    @Size(min = 5, max = 200)
	    private String burgerName;
	    @NotNull
	    @Size(min = 5, max = 200)
	    private String restaurantName;
	    @NotNull
	    @Size(min = 5, max = 200)
	    private String notes;
	    @NotNull
	    @Min(value = 1, message= "the rating should be between 1-5")
	    @Max(value = 5, message= "the rating should be between 1-5")
	    private Integer rating;
	    
	    @Column(updatable=false)
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date createdAt;
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date updatedAt;
	    
	    public Burger(String burgerName, String restaurantName, Integer rating , String notes) {
	        this.burgerName = burgerName;
	        this.restaurantName = restaurantName;
	        this.rating = rating;
	        this.notes = notes ;
	    }
	    public Burger () {
	    	
	    }

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getBurgerName() {
			return burgerName;
		}

		public void setBurgerName(String burgerName) {
			this.burgerName = burgerName;
		}

		public String getRestaurantName() {
			return restaurantName;
		}

		public void setRestaurantName(String restaurantName) {
			this.restaurantName = restaurantName;
		}

		public Integer getRating() {
			return rating;
		}

		public void setRating(Integer rating) {
			this.rating = rating;
		}
		
		public Date getCreatedAt() {
			return createdAt;
		}

		@PrePersist
		public void setCreatedAt() {
			this.createdAt = new Date();
		}
		
		public Date getUpdatedAt() {
			return updatedAt;
		}
		@PreUpdate
		public void setUpdatedAt() {
			this.updatedAt = new Date();
		}
		public String getNotes() {
			return notes;
		}
		public void setNotes(String notes) {
			this.notes = notes;
		}
		
	    

}
