package Project.VirtualBanking.models.dtos;

import Project.VirtualBanking.models.entities.Parent;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ParentDto {

    private Integer parentId;
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private String emailAddress;
    private Boolean emailAddressVerified;
    private String phoneNumber;
    private String password;
    private LocalDateTime accountCreationDate;
    private Boolean active;
    private String details;

    public ParentDto() {
    }

    public ParentDto(Integer parentId, String name, String surname, LocalDate dateOfBirth, String emailAddress,
                     Boolean emailAddressVerified, String phoneNumber, String password,
                     LocalDateTime accountCreationDate, Boolean active, String details) {
        this.parentId = parentId;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.emailAddress = emailAddress;
        this.emailAddressVerified = emailAddressVerified;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.accountCreationDate = accountCreationDate;
        this.active = active;
        this.details = details;
    }

    public Integer getParentId() {
        return parentId;
    }
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Boolean getEmailAddressVerified() {
        return emailAddressVerified;
    }
    public void setEmailAddressVerified(Boolean emailAddressVerified) {
        this.emailAddressVerified = emailAddressVerified;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getAccountCreationDate() {
        return accountCreationDate;
    }
    public void setAccountCreationDate(LocalDateTime accountCreationDate) {
        this.accountCreationDate = accountCreationDate;
    }

    public Boolean isActive() {
        return active;
    }
    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }

    public static ParentDto fromEntity(Parent parent){
        return new ParentDto(
                parent.getParentId(),
                parent.getName(),
                parent.getSurname(),
                parent.getDateOfBirth(),
                parent.getEmailAddress(),
                parent.isEmailAddressVerified(),
                parent.getPhoneNumber(),
                parent.getPassword(),
                parent.getAccountCreationDate(),
                parent.isActive(),
                parent.getDetails()
        );
    }
}