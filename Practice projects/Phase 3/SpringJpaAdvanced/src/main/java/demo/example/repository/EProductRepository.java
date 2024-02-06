package demo.example.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demo.example.entity.Eproduct;

@Repository
public interface EProductRepository extends JpaRepository<Eproduct, Long > 
{
}
