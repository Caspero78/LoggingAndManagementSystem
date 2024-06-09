package Project.VirtualBanking.models.dtos;

import Project.VirtualBanking.models.entities.Child;

import java.time.LocalDate;

public class ChildDto {

    private Integer childId;
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private String emailAddress;
    private String schoolEmailAddressID;
    private String username;
    private String password;
    private LocalDate accountCreationDate;
    private boolean active;
    private String details;

    public ChildDto() {
    }

    public ChildDto(Integer childId, String name, String surname, LocalDate dateOfBirth, String emailAddress,
                    String schoolEmailAddressID, String username, String password, LocalDate accountCreationDate,
                    boolean active, String details) {
        this.childId = childId;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.emailAddress = emailAddress;
        this.schoolEmailAddressID = schoolEmailAddressID;
        this.username = username;
        this.password = password;
        this.accountCreationDate = accountCreationDate;
        this.active = active;
        this.details = details;
    }

    public Integer getChildId() {
        return childId;
    }
    public void setChildId(Integer childId) {
        this.childId = childId;
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

    public String getSchoolEmailAddressID() {
        return schoolEmailAddressID;
    }
    public void setSchoolEmailAddressID(String schoolEmailAddressID) {
        this.schoolEmailAddressID = schoolEmailAddressID;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getAccountCreationDate() {
        return accountCreationDate;
    }
    public void setAccountCreationDate(LocalDate accountCreationDate) {
        this.accountCreationDate = accountCreationDate;
    }

    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }

    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }

    public static ChildDto fromEntity(Child child){
        return new ChildDto(
                child.getChildId(),
                child.getName(),
                child.getSurname(),
                child.getDateOfBirth(),
                child.getEmailAddress(),
                child.getSchoolEmailAddressID(),
                child.getUsername(),
                child.getPassword(),
                child.getAccountCreationDate(),
                child.isActive(),
                child.getDetails()
        );
    }
}