package org.launchcode.java.demos.lsn6inheritance;

public class HouseCat_child extends Cat_parent {
    private String name;
    private String species = "Felis catus";

    public HouseCat_child(String aName, double aWeight) {  //constructor
        super(aWeight);   //'super' keyword allows child class to access the constructor from parent class
        name = aName;
    }

    public HouseCat_child(String aName) {  //constructor
        name = aName;
    }

    public boolean isSatisfied() {
        return !isHungry() && !isTired();
    }

    @Override
    public String noise() {
        if (isSatisfied()) {
            return "Hello, my name is " + name + "!";
        } else {
            return super.noise();  //calls the overridden method, in parent class, via super.noise()
        }                          //prints"Meeeeeeooooowww!"
    }

    public String purr() {
        return "I'm a HouseCat_child";
    }
}
