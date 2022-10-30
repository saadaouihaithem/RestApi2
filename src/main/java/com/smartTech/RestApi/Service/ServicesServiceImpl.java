package com.smartTech.RestApi.Service;

import com.smartTech.RestApi.Model.Services;
import com.smartTech.RestApi.Repository.ServicesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicesServiceImpl implements ServicesServices{


    @Autowired
 private ServicesRepository servicesRepository;

    @Override
    public List<Services> getServices() {
        return servicesRepository.findAll();
    }

    @Override
    public Services saveServices(Services services) {
        return servicesRepository.save(services);
    }

    @Override
    public Services getSingleService(Long id) {
        Optional<Services> services= Optional.of(servicesRepository.getById(id));
        if(services.isPresent()){

            return services.get();
        }
        throw new RuntimeException("Service not available"+id);
    }

    @Override
    public void deleteService(Long id) {

        servicesRepository.deleteById(id);

    }

    @Override
    public Services updateService(Services services ) {
        return servicesRepository.save(services);
    }
}
