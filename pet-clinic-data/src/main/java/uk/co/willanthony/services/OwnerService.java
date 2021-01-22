package uk.co.willanthony.services;

import uk.co.willanthony.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);
    Owner findById(Long ig);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
