package com.smartTech.RestApi.Service;

import com.smartTech.RestApi.Model.Services;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface ServicesServices {


    List<Services> getServices();
    Services saveServices(Services services);

    Services getSingleService(Long id);

    void deleteService(Long id );

    Services updateService(Services services );
    List <Services> getServicesBytitle(String title);

    List<Services> getServicesByTitleAndLocation(String address);

    List <Services>getServicesByPrice(int price );



}
