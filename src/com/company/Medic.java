package com.company;
//В классе медик добавить поле healPoints,
// затем добавить метод increaseExperience, в котором бы увеличивалось количество единиц лечения на 10%.
public class Medic extends Hero{
    private int healthPoints=10;
    @Override
    public String applySuperAbility() {
return "Medic применил суперспособность INSTANT CURE";

  }
public void increaseExperience(){
                healthPoints*=0.1;
    System.out.println("увеличилось на "+healthPoints);
}
}
