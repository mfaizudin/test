package com.example.mobileapi.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.mobileapi.Entity.ContactInfo;

@Service
public class ContactService {

    public List<ContactInfo> getAllContacts() {

        List<ContactInfo> arrList = new ArrayList<>();

        ContactInfo contact1 = new ContactInfo("user00001", "A Sebastian A/L Anthony", "sebastian@hyped.com.my");
        ContactInfo contact2 = new ContactInfo("user00002", "Balu Govindasamy", "balugov@gmail.com");
        ContactInfo contact3 = new ContactInfo("user00003", "Chong How Kee", "chonghowkee@yahoo.com");
        ContactInfo contact4 = new ContactInfo("user00004", "Robert A/L Francis", "robert@hotmail.com");
        ContactInfo contact5 = new ContactInfo("user00005", "Teoh Min Kee", "teohminkee@inglab.com.my");

        arrList.add(contact1);
        arrList.add(contact2);
        arrList.add(contact3);
        arrList.add(contact4);
        arrList.add(contact5);

        return arrList;
    }   
}
