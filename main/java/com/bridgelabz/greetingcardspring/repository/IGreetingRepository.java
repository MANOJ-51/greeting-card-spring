package com.bridgelabz.greetingcardspring.repository;

import com.bridgelabz.greetingcardspring.model.GreetingModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGreetingRepository extends JpaRepository<GreetingModel, Long> {
}
