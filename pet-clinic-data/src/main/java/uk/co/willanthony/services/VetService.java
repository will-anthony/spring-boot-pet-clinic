package uk.co.willanthony.services;

import uk.co.willanthony.model.Owner;
import uk.co.willanthony.model.Vet;

import java.util.Set;

public interface VetService extends CrudService<Vet, Long> {

    Vet findByLastName(String lastName);

}
