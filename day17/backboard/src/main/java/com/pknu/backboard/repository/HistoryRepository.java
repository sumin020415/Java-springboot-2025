package com.pknu.backboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pknu.backboard.entity.History;
import java.util.Optional;


@Repository
public interface HistoryRepository extends JpaRepository<History, Long> {
    // 아래는 할게 없음    
    @SuppressWarnings("null")
    Optional<History> findById(Long id);
}
