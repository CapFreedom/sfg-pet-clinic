package com.example.sfgpetclinic.services.map;

import com.example.sfgpetclinic.model.Pet;
import com.example.sfgpetclinic.services.PetService;
import org.springframework.stereotype.Service;

@Service
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {
}
