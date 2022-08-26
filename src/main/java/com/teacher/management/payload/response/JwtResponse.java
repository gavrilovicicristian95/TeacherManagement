package com.teacher.management.payload.response;

import java.util.List;

public class JwtResponse {
	private String token;
	private String type = "Bearer";
	private Long id;
	private String username;
	private String email;
	private List<String> roles;

	private double totalResearch;

	private double totalDidactica;

	private double totalInstitutional;

	private double totalActivity;

	public JwtResponse(String accessToken, Long id, String username, String email, List<String> roles,
					   double totalResearch, double totalDidactica, double totalInstitutional, double totalActivity) {
		this.token = accessToken;
		this.id = id;
		this.username = username;
		this.email = email;
		this.roles = roles;
		this.totalResearch = totalResearch;
		this.totalDidactica = totalDidactica;
		this.totalInstitutional = totalInstitutional;
		this.totalActivity = totalActivity;
	}

	public String getAccessToken() {
		return token;
	}

	public void setAccessToken(String accessToken) {
		this.token = accessToken;
	}

	public String getTokenType() {
		return type;
	}

	public void setTokenType(String tokenType) {
		this.type = tokenType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<String> getRoles() {
		return roles;
	}

	public Double getTotalResearch() {
		return totalResearch;
	}

	public void setTotalResearch(Double totalResearch) {
		this.totalResearch = totalResearch;
	}

	public Double getTotalDidactica() {
		return totalDidactica;
	}

	public void setTotalDidactica(Double totalDidactica) {
		this.totalDidactica = totalDidactica;
	}

	public Double getTotalInstitutional() {
		return totalInstitutional;
	}

	public void setTotalInstitutional(Double totalInstitutional) {
		this.totalInstitutional = totalInstitutional;
	}

	public Double getTotalActivity() {
		return totalActivity;
	}

	public void setTotalActivity(Double totalActivity) {
		this.totalActivity = totalActivity;
	}

}
