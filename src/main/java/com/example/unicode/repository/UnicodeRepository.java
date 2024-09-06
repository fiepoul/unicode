package com.example.unicode.repository;

import com.example.unicode.model.Unicode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnicodeRepository extends JpaRepository<Unicode, Long>  {

}
