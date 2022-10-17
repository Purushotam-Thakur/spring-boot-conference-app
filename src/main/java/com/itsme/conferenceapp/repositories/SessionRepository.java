package com.itsme.conferenceapp.repositories;

import com.itsme.conferenceapp.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
