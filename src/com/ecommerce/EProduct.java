package com.ecommerce;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="eproduct")
public class EProduct {

		@Id @GeneratedValue
		@Column(name="id")
		private int id;
		
		@Column(name="name")
		private String name;
		
		@Column(name="price")
		private double price;
		
		@Column(name="date_added")
		private Date dateAdded;
		
		
		
		public EProduct() {
			super();
			// TODO Auto-generated constructor stub
		}
		public EProduct(int id, String name, double price, Date dateAdded) {
			super();
			this.id = id;
			this.name = name;
			this.price = price;
			this.dateAdded = dateAdded;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getPrice() {
			return price;
		}
		
		public void setPrice(double price) {
			this.price = price;
		}
		public Date getDateAdded() {
			return dateAdded;
		}
		public void setDateAdded(Date dateAdded) {
			this.dateAdded = dateAdded;
		}
		@Override
		public String toString() {
			return "EProduct [id=" + id + ", name=" + name + ", price=" + price + ", dateAdded=" + dateAdded + "]";
		}
		
		
		
}
