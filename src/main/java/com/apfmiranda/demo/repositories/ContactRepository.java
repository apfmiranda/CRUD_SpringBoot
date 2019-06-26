package com.apfmiranda.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apfmiranda.demo.domain.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {} 
