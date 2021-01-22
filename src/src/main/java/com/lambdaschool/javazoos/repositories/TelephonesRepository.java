package com.lambdaschool.javazoos.repositories;

import com.lambdaschool.javazoos.models.Telephone;
import org.springframework.data.repository.CrudRepository;

public interface TelephonesRepository extends CrudRepository<Telephone, Long> {
}
