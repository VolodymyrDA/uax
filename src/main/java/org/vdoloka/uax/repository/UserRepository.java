package org.vdoloka.uax.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.vdoloka.uax.repository.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
