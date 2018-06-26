package com.test;

import static org.assertj.core.api.Assertions.assertThat;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.test.domain.Product;
import com.test.repo.ProductRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=DataConfig.class)
public class ProductTest {

 
    @Autowired
    private ProductRepository productRepository;
    
    @Test
    public void whenFindByName_thenReturnProduct() {
    	
        // given
        Product axe = new Product();
        axe.setName("axe");
        productRepository.save(axe);
        // when
        Product found = productRepository.findByName(axe.getName());
     
        // then
        assertThat(found.getName())
          .isEqualTo(axe.getName());
    }
}
