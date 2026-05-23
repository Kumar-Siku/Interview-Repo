package com.innoventes.test.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Table(name = "company")
@Entity
public class Company extends BaseEntity {

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

    public void setWebSiteURL(String webSiteURL) {
        this.webSiteURL = webSiteURL;
    }

    public void setCompany_code(String company_code) {
        this.company_code = company_code;
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

    public String getWebSiteURL() {
        return webSiteURL;
    }

    public String getCompany_code() {
        return company_code;
    }

    @Id
	@SequenceGenerator(sequenceName = "company_seq", allocationSize = 1, name = "company_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "company_seq")
	private Long id;

	@Column(name = "company_name")
    @NotBlank
    @Size(min=5)
	private String companyName;

	@Column(name = "email")
    @Email
    @NotBlank
	private String email;
	
	@Column(name = "strength")
    @PositiveOrZero
	private Integer strength;
	
	@Column(name = "website_url")
	private String webSiteURL;


    @Column(name = "company_code", unique = true)
    @Pattern(regexp="^[A-Za-z]{2}\\d{2}[ENen]$",
    message="Invalid companycode")
    private String company_code;


    @Override
    public Long getId() {
        return 0L;
    }
}
