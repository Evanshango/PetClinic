package com.evans.sfgpetclinic.bootstrap;

import com.evans.sfgpetclinic.model.Owner;
import com.evans.sfgpetclinic.model.Vet;
import com.evans.sfgpetclinic.services.OwnerService;
import com.evans.sfgpetclinic.services.VetService;
import com.evans.sfgpetclinic.services.map.OwnerServiceMap;
import com.evans.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Barry");
        owner1.setLastName("Allen");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Cisco");
        owner2.setLastName("Ramon");

        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Ace");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Clint");
        vet2.setLastName("Barton");

        vetService.save(vet2);

        System.out.println("Loaded vets...");
    }
}
