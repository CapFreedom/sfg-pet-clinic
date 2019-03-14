package com.example.sfgpetclinic.services.map;

import com.example.sfgpetclinic.model.Vet;
import com.example.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {
}
