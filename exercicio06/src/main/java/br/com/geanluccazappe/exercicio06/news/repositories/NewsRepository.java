package br.com.geanluccazappe.exercicio06.news.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.geanluccazappe.exercicio06.news.models.NewsEntity;

public interface NewsRepository extends JpaRepository<NewsEntity,Long> {
    
    @Query("SELECT p FROM NewsEntity p ORDER BY p.news_date DESC")
    List<NewsEntity> findByDateDesc();
}
