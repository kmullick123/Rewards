package com.idexcel.rewardspro.Rewards.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class CustomerData {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long transid;
	private String custname;
	private int amountspent;
	private Date transdate;
	
	@Transient
	private int rewardPoints;
	
	
	public Long getTransid() {
		return transid;
	}
	public void setTransid(Long transid) {
		this.transid = transid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public int getAmountspent() {
		return amountspent;
	}
	public void setAmountspent(int amountspent) {
		this.amountspent = amountspent;
	}
	public Date getTransdate() {
		return transdate;
	}
	public void setTransdate(Date transdate) {
		this.transdate = transdate;
	}
	public int getRewardPoints() {
		int points = 0;
		int over100 = this.getAmountspent() - 100;
	    
	    if (over100 > 0) {
	      // A customers receive 2 point  every dollar over $100   
	      points += (over100 * 2);
	    }    
	    if (this.getAmountspent() > 50) {
	      // plus 1 point for every dollar spent over 50
	      points += 50;      
	    }
		return points;
	}
	
}
