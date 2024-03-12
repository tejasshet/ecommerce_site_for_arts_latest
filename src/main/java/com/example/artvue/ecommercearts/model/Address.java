//package com.example.artvue.ecommercearts.model;
//
//import jakarta.persistence.*;
//
//@Entity
//public class Address implements Serializable {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "address_id")
//    private int AddressID;
//
//    @ManyToOne
//    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
//    private Customer customer;  //class still not created...
//
//    @Column(name = "customer_name")
//    private String customerName;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "mobile_no", referencedColumnName = "mobile_no")
//    private long MobileNo;
//
//    @Column(name = "street")
//    private String Street;
//
//    @Column(name = "city")
//    private String City;
//
//    @Column(name = "country")
//    private String Country;
//
//    @Column(name = "pincode")
//    private String Pincode;
//
//    public int getAddressID() {
//        return AddressID;
//    }
//
//    public void setAddressID(int addressID) {
//        AddressID = addressID;
//    }
//
//    public String getCustomerName() {
//        return customerName;
//    }
//
//    public void setCustomerName(String customerName) {
//        this.customerName = customerName;
//    }
//
//    public long getMobileNo() {
//        return MobileNo;
//    }
//
//    public void setMobileNo(long mobileNo) {
//        MobileNo = mobileNo;
//    }
//
//    public String getStreet() {
//        return Street;
//    }
//
//    public void setStreet(String street) {
//        Street = street;
//    }
//
//    public String getCity() {
//        return City;
//    }
//
//    public void setCity(String city) {
//        City = city;
//    }
//
//    public String getCountry() {
//        return Country;
//    }
//
//    public void setCountry(String country) {
//        Country = country;
//    }
//
//    public String getPincode() {
//        return Pincode;
//    }
//
//    public void setPincode(String pincode) {
//        Pincode = pincode;
//    }
//
//}
//
//
//
