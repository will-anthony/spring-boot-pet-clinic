package uk.co.willanthony.services;

import uk.co.willanthony.model.Owner;
import uk.co.willanthony.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long ig);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
