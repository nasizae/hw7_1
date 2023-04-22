package com.company;

public class Main {

    public static void main(String[] args) {
	HavingSuperAbility[] heroes={new Warrior(),new Magic(),new Medic()};
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i].applySuperAbility());
            if(heroes[i] instanceof Medic) {
                ((Medic) heroes[i]).increaseExperience();
            }
        }
    }
}
