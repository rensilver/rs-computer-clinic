package rensilver.rscomputerclinic.services;

import rensilver.rscomputerclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
