package com.company;

public class Main {

    public static void main(String[] args) {
	HavingSuperAbility[] heroes={new Warrior(),new Magic(),new Medic()};
        for (int i = 0; i < heroes.length; i++) {
            Hero(heroes[i]);
            if(heroes[i] instanceof Medic) {
                ((Medic) heroes[i]).increaseExperience();
            }
        }
    }
    public static void Hero(HavingSuperAbility ability){
ability.applySuperAbility();
    }
}
