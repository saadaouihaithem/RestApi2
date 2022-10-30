package com.smartTech.RestApi.Controller;

import com.smartTech.RestApi.Model.Services;
import com.smartTech.RestApi.Service.ServicesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ServicesController {

    @Autowired
 private ServicesServices servicesServices;


    @GetMapping("/Services")
    public List<Services> getServices(){
        return servicesServices.getServices();
    }


    @GetMapping("/Services/{id}")
    public Services getServices(@PathVariable Long id ){
        return servicesServices.getSingleService(id);}



  @DeleteMapping("/Services")
    public void  deleServices(@RequestParam Long id){
                 servicesServices.deleteService(id);

    }

    @PostMapping("/Services")
    public Services SaveServices(@RequestBody Services services){

        return servicesServices.saveServices(services) ;
    }

    @PutMapping("/Services/{id}")
    public Services SaveServices(@PathVariable Long id , @RequestBody Services services){
        services.setId(id);
        return servicesServices.updateService(services) ;
    }
}
