package com.accenture.dealership;

import com.accenture.dealership.entity.Car;
import com.accenture.dealership.entity.Client;
import com.accenture.dealership.entity.Employee;
import com.accenture.dealership.entity.Sale;
import com.accenture.dealership.entity.employeeType.Intern;
import com.accenture.dealership.entity.employeeType.Manager;
import com.accenture.dealership.entity.employeeType.Salesman;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		Intern estagiario = new Intern();
		estagiario.setName("MARCELO");
		estagiario.setSocialID("123.746.354-81");

		Manager gerente = new Manager();
		gerente.setName("gerente bolado");
		gerente.setSocialID("1111111");
		gerente.setPassword("123");

		Salesman vendedor = new Salesman();
		vendedor.setName("vendedor bolado");
		vendedor.setSocialID("1254564");

		Client cliente = new Client("cliente bolado",true);

		Car carroTeste = new Car("wongs","top",10000,2019);

		Sale venda = new Sale(carroTeste,vendedor,cliente,1);

		gerente.authenticate("123",venda);

		System.out.println(venda.vender());

	}
}
