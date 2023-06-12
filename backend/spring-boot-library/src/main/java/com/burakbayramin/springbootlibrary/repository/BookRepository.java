package com.burakbayramin.springbootlibrary.repository;

import com.burakbayramin.springbootlibrary.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
