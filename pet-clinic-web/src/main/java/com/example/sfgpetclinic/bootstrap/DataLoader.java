package com.example.sfgpetclinic.bootstrap;

import com.example.sfgpetclinic.model.Owner;
import com.example.sfgpetclinic.model.Vet;
import com.example.sfgpetclinic.services.OwnerService;
import com.example.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Loading data...");

        System.out.println("Loading owners...");

        Owner o = new Owner();
        o.setFirstName("John");
        o.setLastName("Smith");
        ownerService.save(o);

        o = new Owner();
        o.setFirstName("Michael");
        o.setLastName("Jackson");
        ownerService.save(o);

        o = new Owner();
        o.setFirstName("Michael");
        o.setLastName("Jordan");
        ownerService.save(o);

        System.out.println("Owners loaded.");

        System.out.println("Loading vets...");

        Vet v = new Vet();
        v.setFirstName("David");
        v.setLastName("Backham");
        vetService.save(v);


        v = new Vet();
        v.setFirstName("David");
        v.setLastName("Coperfield");
        vetService.save(v);

        v = new Vet();
        v.setFirstName("David");
        v.setLastName("Blaine");
        vetService.save(v);

        System.out.println("Vets loaded.");

    }
}
