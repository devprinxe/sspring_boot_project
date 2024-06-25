package com.webexpertbd.studentDatabase.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.webexpertbd.studentDatabase.model.Student; // Add this import statement

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    //Get students whose age is greater than 20

    @Query("SELECT s FROM Student s WHERE s.age > :age")
    List<Student> findByAgeGreaterThan(@Param("age")int age);

}