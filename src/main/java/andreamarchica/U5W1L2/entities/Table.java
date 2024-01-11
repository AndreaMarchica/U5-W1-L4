package andreamarchica.U5W1L2.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/*@Entity*/
@AllArgsConstructor
@Getter
@NoArgsConstructor
public class Table {
	@Id
	@GeneratedValue
	private long id;
	private int numTable;
	private int numMaxCoperti;
	private boolean isFree;
	private double costoCoperto;

	public void print() {
		System.out.println("numero tavolo--> " + numTable);
		System.out.println("numero massimo coperti--> " + numMaxCoperti);
		System.out.println("occupato/libero--> " + (this.isFree ? "Libero" : "Occupato"));
	}

}
