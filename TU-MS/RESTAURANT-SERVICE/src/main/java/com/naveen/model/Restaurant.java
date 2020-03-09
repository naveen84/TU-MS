package com.naveen.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/*@Data
@AllArgsConstructor
@NoArgsConstructor*/
@Entity
public class Restaurant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer resId;
	private String resName;
	private Double rating;
	private String location;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "resId")
	private List<Menu> items;
	
	public Restaurant(Integer resId, String resName, Double rating, String location, List<Menu> items) {
		super();
		this.resId = resId;
		this.resName = resName;
		this.rating = rating;
		this.location = location;
		this.items = items;
	}
	public Restaurant() {
		super();
	}
	public Integer getResId() {
		return resId;
	}
	public void setResId(Integer resId) {
		this.resId = resId;
	}
	public String getResName() {
		return resName;
	}
	public void setResName(String resName) {
		this.resName = resName;
	}
	public Double getRating() {
		return rating;
	}
	public void setRating(Double rating) {
		this.rating = rating;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<Menu> getItems() {
		return items;
	}
	public void setItems(List<Menu> items) {
		this.items = items;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Restaurant [resId=");
		builder.append(resId);
		builder.append(", resName=");
		builder.append(resName);
		builder.append(", rating=");
		builder.append(rating);
		builder.append(", location=");
		builder.append(location);
		builder.append(", items=");
		builder.append(items);
		builder.append("]");
		return builder.toString();
	}
	
	

}
