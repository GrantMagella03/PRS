package com.maxtrain.gm.prs.data.models.Request;

import java.util.Set;

import com.fasterxml.jackson.annotation.*;
import com.maxtrain.gm.prs.data.models.RequestLine.RequestLine;
import com.maxtrain.gm.prs.data.models.user.User;

import jakarta.persistence.*;

@Entity
@Table(name="Requests")
public class Request {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int id;
	@Column(length=80,nullable=false)
	public String description;
	@Column(length=80,nullable=false)
	public String justification;
	@Column(length=80,nullable=true)
	public String rejectionReason;
	@Column(length=20,nullable=false)
	public String deliveryMode = "Pickup";
	@Column(length=10,nullable=false)
	public String status="NEW";
	@Column(columnDefinition="decimal(11,2) not null")
	public double total=0;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="userId")
	public User user;
	
	@JsonManagedReference
	@OneToMany(mappedBy="request")
	private Set<RequestLine> requestlines;

	public int getId() {
		return id;	
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getJustification() {
		return justification;
	}

	public void setJustification(String justification) {
		this.justification = justification;
	}

	public String getRejectionReason() {
		return rejectionReason;
	}

	public void setRejectionReason(String rejectionReason) {
		this.rejectionReason = rejectionReason;
	}

	public String getDeliveryMode() {
		return deliveryMode;
	}

	public void setDeliveryMode(String deliveryMode) {
		this.deliveryMode = deliveryMode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
