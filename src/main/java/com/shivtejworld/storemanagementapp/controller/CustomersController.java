package 
com.shivtejworld.storemanagementapp.controller;

 

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

 

import com.shivtejworld.storemanagementapp.model.Customers;
import com.shivtejworld.storemanagementapp.service.CustomersService;

 

@RestController
@RequestMapping("/customers")
public class CustomersController {

 

@Autowired(required=true)
private CustomersService CustomersService;

 

@CrossOrigin
@GetMapping
public List<Customers> getAllCustomers() {
return CustomersService.getAllCustomers();
}

 

@CrossOrigin
@DeleteMapping
public String deleteCustomerById(@RequestParam Long CustomerID) { 
return CustomersService.deleteCustomersById(CustomerID);
}

 

@CrossOrigin
 
@PostMapping public Customers saveCustomer(@RequestBody Customers cust) {
System.out.println(cust); 
return CustomersService.saveCustomer(cust);
}

/* 
 * 
 * 
 * @CrossOrigin
 * 
 * @PatchMapping public String updateOrders(@RequestParam Number CustomersID,
 * 
 * @RequestParam Varchar CustomerName,
 * 
 * @RequestParam Varchar ContactName,
 * 
 * @RequestParam Varchar Address,
 * 
 * @RequestParam Char City,
 * 
 * @RequestParam Int PostalCode,
 * 
 * @RequestParam Char Country) { return
 * CustomersService.updateCustomers(CustomerID,CustomerName,ContactName,Address,
 * City,PostalCode,Country); }
 */
}