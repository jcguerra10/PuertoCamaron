package model;
//
import java.util.*;
//
public class SeaPort{
    private String companyName;
    private String address;
    private String phone;
    private String nit;
    //
    private ArrayList<Container>containers;
    //
	public SeaPort(String companyName, String address, String phone, String nit) {
		this.companyName = companyName;
		this.address = address;
		this.phone = phone;
		this.nit = nit;
		containers = new ArrayList<Container>();
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public ArrayList<Container> getContainers() {
		return containers;
	}

	public void setContainers(ArrayList<Container> containers) {
		this.containers = containers;
	}
    //
    /**
    * create a new container with the given parameters
    * @param id A String which is unique <br>
	* @param weight A double  <br>
	* @param type A char which is the type of container <br>
	* @param description A String which is the description <br>
	* @param arriving A boolean which indicates if the container is arriving (true) and leaving (false) <br>
	*
	*/
    public void addContainer(String id, double weight, char type, String description, boolean arriving){
        Container addCont = new Container(id, weight, type, description, arriving, 0, 0);
        containers.add(addCont);
    }
    /**
	* Checks the ArrayList of container if the container type is tank
	* then the program sums 1 to cont
	*
	* @return an <code>integer</code> which means how many containers are arriving and are tank containers out of every container in the dock
	*/
    public int requestTankContainerAmount(){
        int cont = 0;
        for (int i=0;i<containers.size();i++) {
            if(containers.get(i).getType()==(containers.get(i).TANKCONTAINER)){
                cont++;
            }
        }
        return cont;
    }
    /**
    * creates a list with all of the containers that comes out
    *
    * @return an <code>ArrayList<Container></code>wich is every container that is leaving
    */
    public ArrayList getOutputContainers(){
        ArrayList<Container> listCont = new ArrayList<Container>();
        for (int i=0;i<containers.size();i++) {
            if (containers.get(i).getArriving()==true) {
                listCont.add(containers.get(i));
            }
        }
        return listCont;
    }
}
