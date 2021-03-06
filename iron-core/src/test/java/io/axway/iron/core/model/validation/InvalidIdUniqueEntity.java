package io.axway.iron.core.model.validation;

import io.axway.iron.description.Entity;
import io.axway.iron.description.Id;
import io.axway.iron.description.Unique;

@Entity
public interface InvalidIdUniqueEntity {
    @Id
    @Unique
    long id();
}
