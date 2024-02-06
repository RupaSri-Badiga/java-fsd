package demo.in28minutes.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.in28minutes.hibernate.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer>{

}

