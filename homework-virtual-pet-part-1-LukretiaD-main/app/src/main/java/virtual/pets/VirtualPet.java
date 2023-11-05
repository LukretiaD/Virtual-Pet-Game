package virtual.pets;

public class VirtualPet {

    

    //Declaring the variables
    private String petName;
    private int hungry;
    private int bored;
    private int bladder;
    private int energy;
    private int hygiene;


//Setting a default value to the variables
public VirtualPet(String none) {
    petName = none;
    hungry = 25;
    bored = 25;
    bladder = 25;
    energy = 25;
    hygiene = 25;
}

//The tick
public void tick() {
    hungry += 1;
    bored += 1;
    bladder += 1;
    energy += 1;
    hygiene += 1;
}

//Creating a Getter and Setter
    
    public int getHygiene() {
        return hygiene;
    }
    public void setHygiene(int hygiene) {
        this.hygiene = hygiene;
    }
    public int getEnergy() {
        return energy;
    }
    public void setEnergy(int energy) {
        this.energy = energy;
    }
    public int getBladder() {
        return bladder;
    }
    public void setBladder(int bladder) {
        this.bladder = bladder;
    }
    public int getBored() {
        return bored;
    }
    public void setBored(int bored) {
        this.bored = bored;
    }
    public int getHungry() {
        return hungry;
    }
    public void setHungry(int hungry) {
        this.hungry = hungry;
    }
    public String getPetName() {
        return petName;
    }
    public void setPetName(String petName) {
        this.petName = petName;
    }


//Methods that increases and decrease the variables
    public void adjustHungry(int h) {
        hungry += h;
    }

    public void adjustBored(int b) {
        bored += b;
    }

    public void adjustBladder(int a) {
        bladder += a;
    }

    public void adjustEnergy(int e) {
        energy += e;
    }

    public void adjustHygiene(int y) {
        hygiene +=y;

    }
}
