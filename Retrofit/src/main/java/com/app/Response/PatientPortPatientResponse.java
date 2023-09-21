
package com.app.Response;
import com.google.gson.annotations.SerializedName;

public class PatientPortPatientResponse {

	@SerializedName("id")
    private String id;

    @SerializedName("pid")
    private String pid;

    @SerializedName("pubpid")
    private String pubpid;

    @SerializedName("title")
    private String title;

    @SerializedName("fname")
    private String fname;

    @SerializedName("mname")
    private String mname;

    @SerializedName("lname")
    private String lname;

    @SerializedName("ss")
    private String ss;

    @SerializedName("street")
    private String street;

    @SerializedName("postal_code")
    private String postalCode;

    @SerializedName("city")
    private String city;

    @SerializedName("state")
    private String state;

    @SerializedName("county")
    private String county;

    @SerializedName("country_code")
    private String countryCode;

    @SerializedName("drivers_license")
    private String driversLicense;

    @SerializedName("contact_relationship")
    private String contactRelationship;

    @SerializedName("phone_contact")
    private String phoneContact;

    @SerializedName("phone_home")
    private String phoneHome;

    @SerializedName("phone_biz")
    private String phoneBiz;

    @SerializedName("phone_cell")
    private String phoneCell;

    @SerializedName("email")
    private String email;

    @SerializedName("DOB")
    private String dob;

    @SerializedName("sex")
    private String sex;

    @SerializedName("race")
    private String race;

    @SerializedName("ethnicity")
    private String ethnicity;

    @SerializedName("status")
    private String status;
    
    //getters
    
    public String getId() {
        return id;
    }

    public String getPid() {
        return pid;
    }

    public String getPubpid() {
        return pubpid;
    }

    public String getTitle() {
        return title;
    }

    public String getFname() {
        return fname;
    }

    public String getMname() {
        return mname;
    }

    public String getLname() {
        return lname;
    }

    public String getSs() {
        return ss;
    }

    public String getStreet() {
        return street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCounty() {
        return county;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getDriversLicense() {
        return driversLicense;
    }

    public String getContactRelationship() {
        return contactRelationship;
    }

    public String getPhoneContact() {
        return phoneContact;
    }

    public String getPhoneHome() {
        return phoneHome;
    }

    public String getPhoneBiz() {
        return phoneBiz;
    }

    public String getPhoneCell() {
        return phoneCell;
    }

    public String getEmail() {
        return email;
    }

    public String getDob() {
        return dob;
    }

    public String getSex() {
        return sex;
    }

    public String getRace() {
        return race;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public String getStatus() {
        return status;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public void setPubpid(String pubpid) {
        this.pubpid = pubpid;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setSs(String ss) {
        this.ss = ss;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setDriversLicense(String driversLicense) {
        this.driversLicense = driversLicense;
    }

    public void setContactRelationship(String contactRelationship) {
        this.contactRelationship = contactRelationship;
    }

    public void setPhoneContact(String phoneContact) {
        this.phoneContact = phoneContact;
    }

    public void setPhoneHome(String phoneHome) {
        this.phoneHome = phoneHome;
    }

    public void setPhoneBiz(String phoneBiz) {
        this.phoneBiz = phoneBiz;
    }

    public void setPhoneCell(String phoneCell) {
        this.phoneCell = phoneCell;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
