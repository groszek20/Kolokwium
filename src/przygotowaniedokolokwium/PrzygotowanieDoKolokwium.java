/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package przygotowaniedokolokwium;

public class PrzygotowanieDoKolokwium {

    public static void main(String[] args) {
        Sport[] sporty = new Sport[2];
        SportZPilka[] sportyZPilka = new SportZPilka[2];
        sportyZPilka[0] = new PilkaNozna("Bramkarz");
        sportyZPilka[1] = new Koszykowka("Rozgrywajacy");
        sporty[0] = new Biegi("Maraton");
        sporty[1] = sportyZPilka[0];
        sporty[2] = sportyZPilka[1];
        for (Sport sport : sporty) {
            sport.wypisz();            
        }

    }
    
}
