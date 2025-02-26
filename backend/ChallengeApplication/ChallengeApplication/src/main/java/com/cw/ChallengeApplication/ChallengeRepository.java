package com.cw.ChallengeApplication;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//CRUD
@Repository
public interface ChallengeRepository extends JpaRepository<Challenge,Long> {
//    Optional<Challenge> findByMonthIgnoreCase(String Month);
}

