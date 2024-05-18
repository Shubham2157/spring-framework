/**
 * 
 */
package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author kumar
 *
 */
public class Emp {
	
	private String name;
	private List<String> phones;
	private Set<String> addresses;
	private Map<String, String> coureses;
	private Properties props;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the phones
	 */
	public List<String> getPhones() {
		return phones;
	}
	/**
	 * @param phones the phones to set
	 */
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	/**
	 * @return the addresses
	 */
	public Set<String> getAddresses() {
		return addresses;
	}
	/**
	 * @param addresses the addresses to set
	 */
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	/**
	 * @return the coureses
	 */
	public Map<String, String> getCoureses() {
		return coureses;
	}
	/**
	 * @param coureses the coureses to set
	 */
	public void setCoureses(Map<String, String> coureses) {
		this.coureses = coureses;
	}
	
	/**
	 * @return the props
	 */
	public Properties getProps() {
		return props;
	}
	/**
	 * @param props the props to set
	 */
	public void setProps(Properties props) {
		this.props = props;
	}
	/**
	 * 
	 */
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param phones
	 * @param addresses
	 * @param coureses
	 * @param props
	 */
	public Emp(String name, List<String> phones, Set<String> addresses, Map<String, String> coureses,
			Properties props) {
		super();
		this.name = name;
		this.phones = phones;
		this.addresses = addresses;
		this.coureses = coureses;
		this.props = props;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", phones=" + phones + ", addresses=" + addresses + ", coureses=" + coureses
				+ ", props=" + props + "]";
	}
	
	

}
