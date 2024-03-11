package org.vdoloka.uax.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.vdoloka.uax.repository.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
