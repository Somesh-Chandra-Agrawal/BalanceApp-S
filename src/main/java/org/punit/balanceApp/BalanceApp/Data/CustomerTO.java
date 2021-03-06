package org.punit.balanceApp.BalanceApp.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * The Class CustomerTO.
 * @author SOMESH
 */
@Entity(name = "Customer")
public class CustomerTO {
	
	/** The cust id. */
	@Id 
	@Column (name = "CustId")
	private int custId;
	
	/** The cust fname. */
	@Column (name = "CustFName")
	private String custFname;
	
	/** The cust L name. */
	@Column (name = "CustLName")
	private String custLName;
	
	/** The city. */
	@Column (name = "City")
	private String city;
	
	/** The state. */
	@Column (name = "State")
	private String state;
	
	/** The contact. */
	@Column (name = "Contact")
	private String contact;
	
	/** The total due. */
	@Column (name = "TotalDue")
	private Long totalDue;
	
	/**
	 * Instantiates a new customer TO.
	 *
	 * @param custFName the cust F name
	 * @param custLName the cust L name
	 * @param city the city
	 * @param state the state
	 * @param contact the contact
	 */
	public CustomerTO(String custFName, String custLName, String city, String state, String contact) {
		this.custFname = custFName;
		this.custLName = custLName;
		this.city = city;
		this.state = state;
		this.contact = contact;
	}


	/**
	 * Gets the cust id.
	 *
	 * @return the cust id
	 */
	public int getCustId() {
		return custId;
	}


	/**
	 * Sets the cust id.
	 *
	 * @param custId the new cust id
	 */
	public void setCustId(int custId) {
		this.custId = custId;
	}


	/**
	 * Gets the cust fname.
	 *
	 * @return the cust fname
	 */
	public String getCustFname() {
		return custFname;
	}


	/**
	 * Sets the cust fname.
	 *
	 * @param custFname the new cust fname
	 */
	public void setCustFname(String custFname) {
		this.custFname = custFname;
	}


	/**
	 * Gets the cust L name.
	 *
	 * @return the cust L name
	 */
	public String getCustLName() {
		return custLName;
	}


	/**
	 * Sets the cust L name.
	 *
	 * @param custLName the new cust L name
	 */
	public void setCustLName(String custLName) {
		this.custLName = custLName;
	}


	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}


	/**
	 * Sets the city.
	 *
	 * @param city the new city
	 */
	public void setCity(String city) {
		this.city = city;
	}


	/**
	 * Gets the state.
	 *
	 * @return the state
	 */
	public String getState() {
		return state;
	}


	/**
	 * Sets the state.
	 *
	 * @param state the new state
	 */
	public void setState(String state) {
		this.state = state;
	}


	/**
	 * Gets the contact.
	 *
	 * @return the contact
	 */
	public String getContact() {
		return contact;
	}


	/**
	 * Sets the contact.
	 *
	 * @param contact the new contact
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}


	/**
	 * Gets the total due.
	 *
	 * @return the total due
	 */
	public Long getTotalDue() {
		return totalDue;
	}


	/**
	 * Sets the total due.
	 *
	 * @param totalDue the new total due
	 */
	public void setTotalDue(Long totalDue) {
		this.totalDue = totalDue;
	}
	
	

}
