public class carTypes {
   public static void main(String[] args) {
    car myCar = new car();
    semiTruck mySemiTruck = new semiTruck();
    van myVan = new van();

    myCar.carDesc();
    mySemiTruck.semiTruckDesc();
    myVan.vanDesc();
   } 
}

class car {
    public void carDesc(){
        System.out.println("4 wheel car. 4 Doors");
    }
}

class semiTruck extends car{
    public void semiTruckDesc(){
        System.out.println("16 wheel car. 2 Doors");
    }
}

class van extends car{
    public void vanDesc(){
        System.out.println("4 wheel car. 4 Doors");
    }
}