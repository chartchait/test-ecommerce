package com.test.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "product")
@Getter @Setter @NoArgsConstructor
public class Product extends Auditable<String> implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1329041747318208829L;

	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid",strategy = "uuid")
	@Id
	private String id;
	
	private String name;
	
	private Double price;
	
	@ManyToOne
	@JoinColumn(name = "product_sub_catalog_id")
	private ProductSubCatalog productSubCatalog;
}
