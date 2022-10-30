package com.smartTech.RestApi.Service;

import com.smartTech.RestApi.Model.Services;

import java.util.List;

public interface ServicesServices {


    List<Services> getServices();
    Services saveServices(Services services);

    Services getSingleService(Long id);

    void deleteService(Long id );

    Services updateService(Services services );
}
