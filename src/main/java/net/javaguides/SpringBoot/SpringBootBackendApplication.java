package net.javaguides.SpringBoot;

import net.javaguides.SpringBoot.model.Employee;
import net.javaguides.SpringBoot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
//		Employee employee = new Employee();
//		employee.setFirstName("Rajesh");
//		employee.setLastName("Agrawal");
//		employee.setEmailId("rajesh@gmail.com");
//		employeeRepository.save(employee);
//
//		Employee employee1 = new Employee();
//		employee1.setFirstName("Abhishek");
//		employee1.setLastName("Verma");
//		employee1.setEmailId("av3924@gmail.com");
//		employeeRepository.save(employee1);
	}
}
