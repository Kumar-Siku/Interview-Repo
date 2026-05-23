package com.innoventes.test.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CompanyDTO {

	private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public void setCompany_code(String company_code) {
        this.company_code = company_code;
    }

    public void setWebSiteURL(String webSiteURL) {
        this.webSiteURL = webSiteURL;
    }

    public Long getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getEmail() {
        return email;
    }

    public Integer getStrength() {
        return strength;
    }

    public String getCompany_code() {
        return company_code;
    }

    public String getWebSiteURL() {
        return webSiteURL;
    }

    @NotBlank
    @Size(min=5)
	private String companyName;

    @NotBlank
    @Email
	private String email;

    @PositiveOrZero
	private Integer strength;

    @Column(name = "company_code", unique = true)
    @Pattern(regexp="^[A-Za-z]{2}\\d{2}[ENen]$",
            message="Invalid companycode")
    private String company_code;
	
	private String webSiteURL;
}
