package pet.store.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
public class Customer {

	@Id //Tells JPA that this is the primary key.
	//Tells JPA that MySQL will automatically generate the primary key values using the database's primary key column
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long customerId;
	private String customerFirstName;
	private String customerLastName;
	private String customerEmail;
	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	//Creates the many-to-many relationship between customers and pet stores. It is mapped using the customers field in the PetStore class. 
	//connects to pet stores via customers
	@ManyToMany(mappedBy = "customers", cascade = CascadeType.PERSIST)
	private Set<PetStore> petStores = new HashSet<>(); 
}
