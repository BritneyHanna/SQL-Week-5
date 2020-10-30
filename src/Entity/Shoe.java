package Entity;

import java.util.List;

public class Shoe {
	private int shoe_id;
	private String shoe_name;
	private List<Shoe> shoes;

	public Shoe(int shoe_id, String shoe_name, List<Shoe> shoes) {
		this.setShoe_id(shoe_id);
		this.setShoe_name(shoe_name);
		this.setShoes(shoes);
	}

	public int getShoe_id() {
		return shoe_id;
	}

	public void setShoe_id(int shoe_id) {
		this.shoe_id = shoe_id;
	}

	public String getShoe_name() {
		return shoe_name;
	}

	public void setShoe_name(String shoe_name) {
		this.shoe_name = shoe_name;
	}

	public List<Shoe> getShoes() {
		return shoes;
	}

	public void setShoes(List<Shoe> shoes) {
		this.shoes = shoes;
	}

}
