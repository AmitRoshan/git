package com.learn.fundamentalSpringJDBC;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonSpringDataRepository extends JpaRepository<Persons, Integer> {

}
