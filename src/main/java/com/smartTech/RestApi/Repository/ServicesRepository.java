package com.smartTech.RestApi.Repository;

import com.smartTech.RestApi.Model.Services;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicesRepository extends JpaRepository<Services,Long> {
}
