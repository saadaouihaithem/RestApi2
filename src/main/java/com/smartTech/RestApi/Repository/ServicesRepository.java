package com.smartTech.RestApi.Repository;

import com.smartTech.RestApi.Model.Services;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServicesRepository extends JpaRepository<Services,Long> {

    List<Services> findBytitle(String title);
  //@Query("FROM Services WHERE address =: address ")

    List<Services> findByaddress(String address);

    List<Services>findByPrice(int price);





















}
