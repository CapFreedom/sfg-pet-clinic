package com.example.sfgpetclinic.services.map;

import com.example.sfgpetclinic.model.Owner;
import com.example.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Owner findByLastName(String lastName) {
        for (Owner o : map.values()) {
            if (o.getLastName().equals(lastName)) {
                return o;
            }
        }
        return null;
    }
}
