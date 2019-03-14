package com.example.sfgpetclinic.bootstrap;

import com.example.sfgpetclinic.model.Owner;
import com.example.sfgpetclinic.model.Vet;
import com.example.sfgpetclinic.services.OwnerService;
import com.example.sfgpetclinic.services.VetService;
import com.example.sfgpetclinic.services.map.OwnerMapService;
import com.example.sfgpetclinic.services.map.VetMapService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader() {
        this.ownerService = new OwnerMapService();
        this.vetService = new VetMapService();
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Loading data...");

        System.out.println("Loading owners...");

        Owner o = new Owner();
        o.setId(1L);
        o.setFirstName("John");
        o.setLastName("Smith");
        ownerService.save(o.getId(), o);

        o = new Owner();
        o.setId(2L);
        o.setFirstName("Michael");
        o.setLastName("Jackson");
        ownerService.save(o.getId(), o);

        o = new Owner();
        o.setId(3L);
        o.setFirstName("Michael");
        o.setLastName("Jordan");
        ownerService.save(o.getId(), o);

        System.out.println("Owners loaded.");

        System.out.println("Loading vets...");

        Vet v = new Vet();
        v.setId(1L);
        v.setFirstName("David");
        v.setLastName("Backham");
        vetService.save(v.getId(), v);


        v = new Vet();
        v.setId(2L);
        v.setFirstName("David");
        v.setLastName("Coperfield");
        vetService.save(v.getId(), v);

        v = new Vet();
        v.setId(3L);
        v.setFirstName("David");
        v.setLastName("Blaine");
        vetService.save(v.getId(), v);

        System.out.println("Vets loaded.");

    }
}
