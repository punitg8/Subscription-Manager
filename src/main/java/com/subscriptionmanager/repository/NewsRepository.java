package com.subscriptionmanager.repository;

import com.subscriptionmanager.model.Genre;
import com.subscriptionmanager.model.News;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, String> {

  List<News> findByGenre(Genre genre);

}
