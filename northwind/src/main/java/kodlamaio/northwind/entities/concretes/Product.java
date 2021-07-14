package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity //Veri tabanı nesnesisin demek
@Table(name = "products") //Verinin veri tabanında hangi tabloya karşılık geleceğini belirtiyoruz
public class Product {
 
    @Id
	@GeneratedValue //Id'nin bir bir arttırılacağını söyledik
	
    @Column(name = "product_id") //Veri tabanında hanig kolona karşılık geliyorsa onu yazıyoruz
    private String id;
 
	@Column(name="category_id")
	private int categoryId;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="unit_price")
	private double unitPrice;
	
	@Column(name="units_in_stock")
	private short unitsInStock;
	
	@Column(name="quentity_per_unit")
	private String quantityPerUnit;

	public Product() {}
	
	public Product(String id, int categoryId, String productName, double unitPrice, short unitsInStock,
			String quantityPerUnit) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.unitsInStock = unitsInStock;
		this.quantityPerUnit = quantityPerUnit;
	}
	
} 
