package com.naveen.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*@NoArgsConstructor
@AllArgsConstructor
@Data*/
@Entity
public class Menu {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer m_id;
	private String m_name;
	private Double price;
	private double rating;
	public Menu(Integer m_id, String m_name, Double price, double rating) {
		super();
		this.m_id = m_id;
		this.m_name = m_name;
		this.price = price;
		this.rating = rating;
	}
	public Menu() {
		super();
	}	
	public Integer getM_id() {
		return m_id;
	}
	public void setM_id(Integer m_id) {
		this.m_id = m_id;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Menu [m_id=");
		builder.append(m_id);
		builder.append(", m_name=");
		builder.append(m_name);
		builder.append(", price=");
		builder.append(price);
		builder.append(", rating=");
		builder.append(rating);
		builder.append("]");
		return builder.toString();
	}
	
	
}
