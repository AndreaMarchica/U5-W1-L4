package andreamarchica.U5W1L2.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*@Entity*/
@Getter
@NoArgsConstructor
public class Order {
	@Id
	@GeneratedValue
	private long id;
	private int numeroOrdine;
	private andreamarchica.U5W1L2.entities.State state;
	private int numCoperti;
	private LocalTime oraAcquisizione;
	private List<Item> orderedProducts;
	private andreamarchica.U5W1L2.entities.Table table;

	public Order(int numCoperti, andreamarchica.U5W1L2.entities.Table table) {
		Random rndm = new Random();
		if (table.getNumMaxCoperti() <= numCoperti)
			throw new RuntimeException("Numero coperti maggiore di numero massimo posti sul tavolo!");
		this.numeroOrdine = rndm.nextInt(1000, 100000);
		this.state = andreamarchica.U5W1L2.entities.State.IN_CORSO;
		this.numCoperti = numCoperti;
		this.oraAcquisizione = LocalTime.now();
		this.orderedProducts = new ArrayList<>();
		this.table = table;
	}

	public void addItem(Item item) {
		this.orderedProducts.add(item);
	}

	public double getTotal() {
		return this.orderedProducts.stream().mapToDouble(Item::getPrice).sum() + (this.table.getCostoCoperto() * this.numCoperti);
	}

	public void print() {
		System.out.println("id ordine--> " + this.numeroOrdine);
		System.out.println("stato--> " + this.state);
		System.out.println("numero coperti--> " + this.numCoperti);
		System.out.println("ora acquisizione--> " + this.oraAcquisizione);
		System.out.println("numero tavolo--> " + this.table.getNumTable());
		System.out.println("Lista: ");
		this.orderedProducts.forEach(System.out::println);
		System.out.println("totale--> " + this.getTotal());

	}
}
