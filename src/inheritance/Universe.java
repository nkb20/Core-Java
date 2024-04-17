package inheritance;

public class Universe {
     protected String galaxy= "Biilion of Galaxies";
     public void NoOfPlanet(){
         System.out.println("8 planet");
     }
}

class planet extends Universe {
    public void planetEarth() {

        System.out.println("Human lives");
    }

    public void planetMars() {
        System.out.println("No Human lives here");
    }

}
class main{
    public static void main(String[] args) {

        planet planetObj=new planet();

        planetObj.planetEarth();
        planetObj.NoOfPlanet();
        System.out.println(planetObj.galaxy);
    }
}