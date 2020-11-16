package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Computadoras;
import com.example.demo.model.Tickets;
import com.example.demo.model.Venta;
import com.example.demo.model.Clientes;
import com.example.demo.model.Proveedores;

@Controller
@RequestMapping("/")
public class controlador {
	@GetMapping("/examenUnidad2")
	public String index() {
		return "index";
	}

	@GetMapping("/examenUnidad2/Computadoras")
	public String Computadoras(Model modelo) {
		List<Computadoras> computadoras = new ArrayList<Computadoras>();
		computadoras.add(new Computadoras("1000001", "Lenovo", "AMD-A9", "Windows 10", "8 GB", "2 nucleos"));
		computadoras.add(new Computadoras("1000002", "HP", "Intel-Core i5", "Windows 10", "8 GB", "8 nucleos"));
		computadoras.add(new Computadoras("1000003", "Acer", "Ryzen 5", "Windows 10", "16 GB", "8 nucleos"));
		computadoras.add(new Computadoras("1000004", "Asus", "AMD-A10", "Windows 10", "4 GB", "4 nucleos"));
		computadoras.add(new Computadoras("1000005", "Lenovo", "Ryzen 3", "Windows 10", "8 GB", "8 nucleos"));
		computadoras.add(new Computadoras("1000006", "HP", "Intel-Core i3", "Windows 10", "4 GB", "4 nucleos"));
		computadoras.add(new Computadoras("1000007", "Acer", "AMD-A8", "Windows 10", "4 GB", "4 nucleos"));
		computadoras.add(new Computadoras("1000008", "Asus", "Intel-Core i7", "Windows 10", "8 GB", "8 nucleos"));
		computadoras.add(new Computadoras("1000009", "Huawei", "Ryzen 5", "Windows 10", "8 GB", "8 nucleos"));
		computadoras.add(new Computadoras("1000010", "Mac", "Intel-Core i9", "Mac OS", "16 GB", "8 nucleos"));
		modelo.addAttribute("computadoras", computadoras);
		return "Computadoras";
	}

	@GetMapping("/examenUnidad2/Tickets")
	public String Tickets(Model modelo) {
		List<Tickets> tickets = new ArrayList<Tickets>();
		tickets.add(new Tickets("1", "1", "1000001", "1", "$8000"));
		tickets.add(new Tickets("2", "2", "1000002", "1", "$10000"));
		tickets.add(new Tickets("3", "3", "1000003", "1", "$11000"));
		tickets.add(new Tickets("4", "4", "1000004", "1", "$15000"));
		tickets.add(new Tickets("5", "5", "1000005", "1", "$22000"));
		tickets.add(new Tickets("6", "6", "1000006", "1", "$8000"));
		tickets.add(new Tickets("7", "7", "1000007", "1", "$9000"));
		tickets.add(new Tickets("8", "8", "1000008", "1", "$15000"));
		tickets.add(new Tickets("9", "9", "1000009", "1", "$22000"));
		tickets.add(new Tickets("10", "10", "1000010", "1", "$14000"));
		modelo.addAttribute("tickets", tickets);
		return "Tickets";

	}

	@GetMapping("/examenUnidad2/Venta")
	public String Venta(Model modelo) {
		List<Venta> venta = new ArrayList<Venta>();
		venta.add(new Venta("1","1","25/10/2020","$7500","$400","$100","$8000"));
		venta.add(new Venta("2","2","05/09/2020","$9500","$400","$100","$10000"));
		venta.add(new Venta("3","3","05/05/2020","$10500","$400","$100","$11000"));
		venta.add(new Venta("4","4","27/11/2020","$14500","$400","$100","$15000"));
		venta.add(new Venta("5","5","01/01/2020","$21500","$400","$100","$22000"));
		venta.add(new Venta("6","6","12/11/2020","$7500","$400","$100","$8000"));
		venta.add(new Venta("7","7","10/12/2020","$8500","$400","$100","$9000"));
		venta.add(new Venta("8","8","09/10/2020","$14500","$400","$100","$15000"));
		venta.add(new Venta("9","9","20/05/2020","$21500","$400","$100","$22000"));
		venta.add(new Venta("10","10","13/03/2020","$13500","$400","$100","$14000"));
		modelo.addAttribute("venta", venta);
		return "Venta";

	}
	@GetMapping("/examenUnidad2/Clientes")
	public String Clientes(Model modelo) {
		List<Clientes> clientes = new ArrayList<Clientes>();
		clientes.add(new Clientes("1", "José", "Zamudio", "57156836","jose@gmail.com","Hualahuises 316"  ));
		clientes.add(new Clientes("2", "Juan", "Moreno", "85412563","juan@gmail.com","Tecpan 48"  ));
		clientes.add(new Clientes("3", "Jaime", "Hernandez",  "4853226", "jaime@gmail.com","Acambaro 55"));
		clientes.add(new Clientes("4", "Jesús", "Zepeda", "4853215",  "jesus@gmail.com","Zacapoaxtla 452"));
		clientes.add(new Clientes("5", "Javier", "Zamora", "4586325",  "javier@gmail.com","Antigua 45"));
		clientes.add(new Clientes("6", "Ana", "Diaz", "57156836",  "ana@gmail.com","Tepatitlan 486"));
		clientes.add(new Clientes("7", "Andrea", "Juarez", "85412563",  "andrea@gmail.com","Sierra de Pinos 12"));
		clientes.add(new Clientes("8", "Jessica", "Martinez", "4853226",  "jessica@gmail.com","Veracruz 14"));
		clientes.add(new Clientes("9", "Alma", "Lopez",  "4853215", "alma@gmail.com","Chihuahua 87"));
		clientes.add(new Clientes("10", "Evelin", "Ceja", "4586325",  "evelin@gmail.com","Americas 12"));
		modelo.addAttribute("clientes", clientes);
		return "Clientes";
	}
	@GetMapping("/examenUnidad2/Proveedores")
	public String Proveedores(Model modelo) {
		List<Proveedores> proveedores = new ArrayList<Proveedores>();
		proveedores.add(new Proveedores("1", "Walmart", "Zamudio", "zamudio@gmail.com","zamj981021av7", "57156836", "pino 9"));
		proveedores.add(new Proveedores("2", "Soriana", "Moreno", "moreno@gmail.com","qwey745216ru8", "85412563", "abedul 44"));
		proveedores.add(new Proveedores("3", "Chedraui", "Hernandez", "hernandez@gmail.com","dhry124547we7", "4853226", "colima 14"));
		proveedores.add(new Proveedores("4", "Aurrera", "Zepeda", "zepeda@gmail.com","anft785412se7", "4853215", "heroes 47"));
		proveedores.add(new Proveedores("5", "Bestbuy", "Zamora", "zamora@gmail.com","eywh475214hm8", "4586325", "tepa 458"));
		proveedores.add(new Proveedores("6", "MercadoLibre", "Diaz", "diaz@gmail.com","jfyr754126cb4", "57156836", "jeres 47"));
		proveedores.add(new Proveedores("7", "Sanborns", "Juarez",  "juarez@gmail.com","jeur145247an2", "85412563","campeche 85"));
		proveedores.add(new Proveedores("8", "Liverpool", "Martinez", "martinez@gmail.com","jtpa632453bf8", "4853226", "cancun 25"));
		proveedores.add(new Proveedores("9", "Amazon", "Lopez", "lopez@gmail.com","heyr754138ot5","45852456", "maracas 85"));
		proveedores.add(new Proveedores("10", "ishop", "Ceja", "ceja@gmail.com","wyri745214jf2", "4586325", "zacapo 47"));
		modelo.addAttribute("proveedores", proveedores);
		return "Proveedores";
	}

}
