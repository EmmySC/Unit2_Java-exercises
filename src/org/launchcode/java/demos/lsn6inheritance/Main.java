package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String[] args) {
        HouseCat_child garfield = new HouseCat_child("Garfield", 12);
        garfield.eat();  //HouseCat_child inherits eat() method from Cat_parent
        System.out.println(garfield.isTired());  //should print true (the cat is now tired)

        HouseCat_child spike = new HouseCat_child("Spike");
        System.out.println(spike.getWeight());  //should print 13.0

        Cat_parent plainCat = new Cat_parent(8.6);
        HouseCat_child cheshireCat = new HouseCat_child("Cheshire", 12);
        System.out.println(plainCat.noise());  //should print "Meeeeeeooooowww!"
        System.out.println(cheshireCat.noise());  //should print "Hello, my name is Cheshire!"
    }

    //public abstract String noise();

}

