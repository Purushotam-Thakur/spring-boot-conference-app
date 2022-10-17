package com.itsme.conferenceapp.repositories;

import com.itsme.conferenceapp.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
