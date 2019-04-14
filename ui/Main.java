package ui;
//
import java.util.*;
import model.*;
//
public class Main{
    public Main (){
        init();
    }
    public void init(){

    }
    public static void main(String[] args) {
        SeaPort use = new SeaPort("CAMARON QUE SE DUERME", "cll 32 # 126-20", "3028475", "45871365");
        Main m = new Main();
        //
        Scanner scanStr = new Scanner(System.in);
        Scanner scanDou = new Scanner(System.in);
        Scanner scanInt = new Scanner(System.in);
        Scanner scanChar = new Scanner(System.in);
        //
        boolean exit = false;
        int option = 0;
        while(!exit){
            System.out.println("BIENVENIDO");
            System.out.println("1. AGREGAR UN CONTENEDOR AL PUERTO");
            System.out.println("2. CANTIDAD DE CONTAINERS TIPO SISTERNA");
            System.out.println("3. LISTADO DE CONTAINERS QUE SALEN");
            System.out.println("4. SALIR");
            option = scanInt.nextInt();
            switch (option) {
                case (1):
                    System.out.println("DIGITE LA IDENTIFICACION DEL CONTENEDOR:");
                    String idc = scanStr.nextLine();
                    System.out.println("DIGITE EL PESO:");
                    double weightc = scanDou.nextDouble();
                    System.out.println("DIGITE EL NUMERO DEL TIPO DE CONTENEDOR:");
                    System.out.println("1- CONTENEDOR SECO 20");
                    System.out.println("2- CONTENEDOR SECO 40");
                    System.out.println("3- TANK");
                    int opc = scanInt.nextInt();
                    char typec = 'm';
                    if (opc == 1) {
                        typec = 'a';
                    }else if (opc == 2) {
                        typec = 'b';
                    }else if (opc == 3) {
                        typec = 't';
                    }else {
                        exit = true;
                    }
                    System.out.println("DIGITE LA DESCRIPCION:");
                    String descriptionc = scanStr.nextLine();
                    System.out.println("EL CONTAINER:");
                    System.out.println("1- SALE");
                    System.out.println("2- ENTRA");
                    int optc = scanInt.nextInt();
                    boolean arrivingc = false;
                    // true = sale / false = entra
                    if (optc == 1) {
                        arrivingc = true;
                    }else if (optc == 2) {
                        arrivingc = false;
                    }else {
                        System.out.println("ERROR");
                        exit = true;
                    }
                    //
                    use.addContainer(idc, weightc, typec, descriptionc, arrivingc);
                    System.out.println("SE HA AGREGADO EL CONTAINER");
                break;
                case (2):
                    //
                    System.out.println("LA CANTIDAD DE CONTAINERS TIPO SISTERNA SON: "+use.requestTankContainerAmount());
                break;
                case (3):
                    //
                    ArrayList<Container> listContainerMsg = new ArrayList <Container>();
                    listContainerMsg = use.getOutputContainers();
                    for (int i=0;i<listContainerMsg.size();i++) {
                        System.out.println("====================================");
                        System.out.println(listContainerMsg.get(i));
                        System.out.println("====================================");
                    }
                break;
                case (4):
                    exit = true;
                break;
            }
        }
    }
}
