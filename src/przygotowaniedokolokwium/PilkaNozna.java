
package przygotowaniedokolokwium;

class PilkaNozna extends SportZPilka {

   // String nazwa;
    public PilkaNozna() {
    }

    public PilkaNozna(String nazwa) {
        super(nazwa);
    }
    
    public void wypisz(){
        System.out.println("Pozycja: " + nazwa);
    }
}
