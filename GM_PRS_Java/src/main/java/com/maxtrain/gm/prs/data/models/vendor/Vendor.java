package com.maxtrain.gm.prs.data.models.vendor;

//import com.maxtrain.gm.prs.data.models.product.Product;

import jakarta.persistence.*;

@Entity
@Table(name="Vendors", uniqueConstraints=@UniqueConstraint(name="UIDX_Code", columnNames = {"code"}))
public class Vendor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int id;
	@Column(length=30,nullable=false)
	public String code;
	@Column(length=30,nullable=false)
	public String name;
	@Column(length=30,nullable=false)
	public String address;
	@Column(length=30,nullable=false)
	public String city;
	@Column(length=2,nullable=false)
	public String state;
	@Column(length=5,nullable=false)
	public String zip;
	@Column(length=12,nullable=true)
	public String phone;
	@Column(length=255,nullable=true)
	public String email;
	
	//@OneToMany(mappedBy="Product")
	//public Product product;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}

