package com.bortoluzzi.prova.shift.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bortoluzzi.prova.shift.entities.Exam;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Long> {
}
