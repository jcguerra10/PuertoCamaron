package model;
//
import java.util.*;
//
public class Container{
    public static final char TANKCONTAINER = 't';
    public static final char DRYVAN20 = 'a';
    public static final char DRYVAN40 = 'b';
    public static final double BASE_COST = 2000000;
    //
    private String id;
    private double weight;
    private char type;
    private String description;
    private boolean arriving;
    private int days;
    private double cost;
    //
	public Container(String id, double weight, char type, String description, boolean arriving, int days, double cost) {
		this.id = id;
		this.weight = weight;
		this.type = type;
		this.description = description;
		this.arriving = arriving;
		this.days = days;
		this.cost = cost;
	}
    //
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean getArriving() {
		return arriving;
	}

	public void setArriving(boolean arriving) {
		this.arriving = arriving;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
    //
    /**
    
    */
    public double calculateCost(){
        double tot = 0;
        if (arriving == true) {
            tot += BASE_COST;
            tot *= weight;
            tot += days*100000;
        }else {
            tot += days*150000;
        }
        return tot;
    }

    public String toString(){
        String msg = "";
        msg += "ID: " +id+"\n";
        msg += "PESO:"+weight+"\n";
        msg += "DESCRIPCION: "+description+"\n";
        return msg;
    }
}
