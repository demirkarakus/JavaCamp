package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.concretes.Product;

//Jpa Repository verdiğimiz veri tipi için primery key alanında ne olduğuna bakarak sorguları hazırlıyor
public interface ProductDao extends JpaRepository<Product,Integer>{

}
