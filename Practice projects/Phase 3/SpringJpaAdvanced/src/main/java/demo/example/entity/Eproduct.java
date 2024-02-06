package demo.example.entity;
import java.math.BigDecimal;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="eproduct")
public class Eproduct {
	@Id
	@GeneratedValue
	private long ID;
	
	private String name;
	
	private BigDecimal price;
	
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private LocalDate date_added;
	
	public long getID() {
	return ID;
	}
	public void setID(long iD) {
	ID = iD;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public BigDecimal getPrice() {
	return price;
	}
	public void setPrice(BigDecimal price) {
	this.price = price;
	}
	public LocalDate getDate_added() {
	return date_added;
	}
	public void setDate_added(LocalDate date_added) {
	this.date_added = date_added;
	}
}

