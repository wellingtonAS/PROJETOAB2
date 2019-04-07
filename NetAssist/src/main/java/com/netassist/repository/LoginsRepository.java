package com.netassist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.netassist.domain.Logins;

public interface LoginsRepository extends JpaRepository<Logins, Integer> {

}
