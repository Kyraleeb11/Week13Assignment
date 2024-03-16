package pet.store.controller.model;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;
import lombok.NoArgsConstructor;
import pet.store.entity.Customer;
import pet.store.entity.Employee;
import pet.store.entity.PetStore;

@Data
@NoArgsConstructor
public class PetStoreData {

	private Long petStoreId;
	private String petStoreName;
	private String petStoreAddress;
	private String petStoreCity;
	private String petStoreState;
	private String petStoreZip;
	private String petStorePhone;
	private Set<PetStoreEmployee> employees = new HashSet<>();
	private Set<PetStoreCustomer> customers = new HashSet<>();

	public PetStoreData(PetStore petStore) {
		this.petStoreId = petStore.getPetStoreId();
		this.petStoreName = petStore.getPetStoreName();
		this.petStoreAddress = petStore.getPetStoreAddress();
		this.petStoreCity = petStore.getPetStoreCity();
		this.petStoreState = petStore.getPetStoreState();
		this.petStoreZip = petStore.getPetStoreZip();
		this.petStorePhone = petStore.getPetStorePhone();
		for (Employee employee : petStore.getEmployees()) {
			this.employees.add(new PetStoreEmployee(employee));
		}
		for (Customer customer : petStore.getCustomers()) {
			this.customers.add(new PetStoreCustomer(customer));
		}

	}

	@Data
	@NoArgsConstructor
	public static class PetStoreCustomer {
		// Pet store customer fields.
		private Long customerId;
		private String customerFirstName;
		private String customerLastName;
		private String customerEmail;

		public PetStoreCustomer(Customer customer) {
			customerId = customer.getCustomerId();
			customerFirstName = customer.getCustomerFirstName();
			customerLastName = customer.getCustomerLastName();
			customerEmail = customer.getCustomerEmail();
		}
	}

	@Data
	@NoArgsConstructor
	public static class PetStoreEmployee {
		// Pet store employee fields
		private Long employeeId;
		private String employeeFirstName;
		private String employeeLastName;
		private String employeePhone;
		private String employeeJobTitle;

		public PetStoreEmployee(Employee employee) {
			employeeId = employee.getEmployeeId();
			employeeFirstName = employee.getEmployeeFirstName();
			employeeLastName = employee.getEmployeeLastName();
			employeePhone = employee.getEmployeePhone();
			employeeJobTitle = employee.getEmployeeJobTitle();
		}
	}
}
