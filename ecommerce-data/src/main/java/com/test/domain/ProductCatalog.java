package com.test.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "product_catalog")
@Getter
@Setter
@NoArgsConstructor
public class ProductCatalog implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4195260616985651493L;

	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Id
	private String id;

	@OneToMany(mappedBy = "productCatalog", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<ProductSubCatalog> productSubCatalogs;
}
