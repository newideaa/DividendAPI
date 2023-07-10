package com.example.dividendservice.persist;

import com.example.dividendservice.persist.entity.CompanyEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CompanyRepository extends JpaRepository<CompanyEntity, Long> {
    boolean existsByTicker(String ticker);

    //Optional을 사용하는 이유
    Optional<CompanyEntity> findByName(String name);

    Optional<CompanyEntity> findByTicker(String ticker);

    Page<CompanyEntity> findByNameStartingWithIgnoreCase(String s, Pageable pageable);

}
