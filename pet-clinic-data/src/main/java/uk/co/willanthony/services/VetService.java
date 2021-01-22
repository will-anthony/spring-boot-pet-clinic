package uk.co.willanthony.services;

import uk.co.willanthony.model.Owner;
import uk.co.willanthony.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findByLastName(String lastName);
    Vet findById(Long ig);
    Vet save(Vet Vet);
    Set<Vet> findAll();
}
