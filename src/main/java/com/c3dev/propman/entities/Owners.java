package com.c3dev.propman.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Owners {
    
    @Id
    @GeneratedValue
    @Column(name = "OWNER_ID")
    private int ownerID;
    
    @Column(name = "OWNER_FIRST_NAME")
    private String ownerFirstName;
    
    @Column(name = "OWNER_LAST_NAME")
    private String ownerLastName;
    
    @Column(name ="OWNER_MIDDLE_NAME")
    private String ownerMiddleName;
    
    @Column(name = "OWNER_ADDRESS1")
    private String ownerAddress1;
    
    @Column(name = "OWNER_ADDRESS2")
    private String ownerAddress2;
    
    @Column(name = "OWNER_CITY")
    private String ownerCity;
    
    @Column(name = "OWNER_STATE")
    private String ownerState;
    
    @Column(name = "OWNER_ZIP")
    private String ownerZip;
    
    @Column(name = "OWNER_EMAIL")
    private String ownerEmail;
    
    @Column(name = "OWNER_PHONE")
    private String ownerPhone;
    
}
