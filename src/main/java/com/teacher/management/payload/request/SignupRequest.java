package com.teacher.management.payload.request;

import java.util.Set;

import javax.validation.constraints.*;
 
public class SignupRequest {
    @NotBlank
    @Size(min = 3, max = 20)
    private String username;
 
    @NotBlank
    @Size(max = 50)
    @Email
    private String email;
    
    private Set<String> role;

    public double totalResearch;

    public double totalDidactica;

    public double totalInstitutional;

    public double totalActivity;
    
    @NotBlank
    @Size(min = 6, max = 40)
    private String password;
  
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
    
    public Set<String> getRole() {
      return this.role;
    }
    
    public void setRole(Set<String> role) {
      this.role = role;
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
