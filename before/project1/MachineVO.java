package Project;

public class MachineVO {
	private String drink_name;
	private int drink_price;
	private int drink_stock;
	
	
	public MachineVO() {
		this.drink_name = "";
		this.drink_price = 0;
		this.drink_stock = 0;
	}
	
	public MachineVO(String drink_name, int drink_price, int drink_stock) {
		this.drink_name = drink_name;
		this.drink_price = drink_price;
		this.drink_stock = drink_stock;
	}


	public String getDrink_name() {
		return drink_name;
	}


	public void setDrink_name(String drink_name) {
		this.drink_name = drink_name;
	}


	public int getDrink_price() {
		return drink_price;
	}


	public void setDrink_price(int drink_price) {
		this.drink_price = drink_price;
	}


	public int getDrink_stock() {
		return drink_stock;
	}


	public void setDrink_stock(int drink_stock) {
		this.drink_stock = drink_stock;
	}
	
	
	
	
	
	
}
