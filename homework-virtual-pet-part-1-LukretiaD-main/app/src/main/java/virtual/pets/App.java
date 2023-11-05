/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package virtual.pets;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        int choose;
        Scanner input = new Scanner(System.in);
        boolean exitLoop = false;

        System.out.println();
        System.out.println("Congrats on your new dog!! (Press Enter)");
        input.nextLine();

        // Collecting user dog name
        System.out.println("Now, he needs a name! (Enter your dog's name) ");
        String dogName = input.nextLine();
        System.out.println();

        VirtualPet dog = new VirtualPet(dogName);
        System.out.println(dogName + " is a great name!");
        input.nextLine();

        // instructions of the game
        System.out.println();
        System.out.println("Make sure " + dogName
                + " is being fed, has playtime, gets rest, gets a bath and is going to the bathroom");
        input.nextLine();
        System.out.println("Keep " + dogName + " happy and you will be the best dog parent ever!");
        input.nextLine();

        // Menu info
        while (!exitLoop) {
            System.out.println();
            System.out.println();
            System.out.println("Here's how " + dogName + " is doing.");
            mainDisplay(dog);
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println();
            System.out.println("0. Quit");
            System.out.println("1. Feed " + dogName + ".");
            System.out.println("2. Play with " + dogName + ".");
            System.out.println("3. Take " + dogName + " out to potty.");
            System.out.println("4. Let " + dogName + " get some rest.");
            System.out.println("5. Give " + dogName + " a bath.");
            System.out.println();
            System.out.println("---------------------------");
            System.out.println();

            choose = input.nextInt();

            switch (choose) {

                // Hungry function
                case 1: {
                    if (dog.getHungry() > 50) {
                        System.out.println();
                        System.out.println(dogName + " isn't that hungry");
                        System.out.println();
                    } else {
                        System.out.println();
                        System.out.println(dogName + " loved his treat!");
                        System.out.println();
                        dog.adjustHungry(+4);
                        dog.adjustEnergy(+2);
                        dog.adjustBladder(+3);
                        dog.adjustBored(-2);
                        dog.adjustHygiene(-3);
                        break;

                    }

                }
                // Bored Function
                case 2: {
                    if (dog.getBored() > 50) {
                        System.out.println();
                        System.out.println(dogName + " doesn't want to play right now");
                        System.out.println();
                    } else {
                        System.out.println();
                        System.out.println(" Woof! Woof!. . . . . " + dogName + " had fun playing with you!");
                        System.out.println();
                        dog.adjustHungry(-2);
                        dog.adjustEnergy(-5);
                        dog.adjustBladder(+3);
                        dog.adjustBored(+5);
                        dog.adjustHygiene(-5);
                        break;

                    }

                }
                // Bladder function
                case 3: {
                    if (dog.getBladder() > 50) {
                        System.out.println();
                        System.out.println(dogName + " doesn't need to potty right now");
                        System.out.println();
                    } else {
                        System.out.println();
                        System.out.println(dogName + " really needed to go!");
                        System.out.println();
                        dog.adjustHungry(+5);
                        dog.adjustEnergy(+2);
                        dog.adjustBladder(-5);
                        dog.adjustBored(+2);
                        dog.adjustHygiene(-4);
                        break;

                    }

                }
                // Energy Function
                case 4: {
                    if (dog.getEnergy() > 50) {
                        System.out.println();
                        System.out.println(dogName + " isn't tired right now.");
                        System.out.println();
                    } else {
                        System.out.println();
                        System.out.println("zzzZZZzzz. . . . " + dogName + " was tired!");
                        System.out.println();
                        dog.adjustHungry(-1);
                        dog.adjustEnergy(+5);
                        dog.adjustBladder(-2);
                        dog.adjustBored(-2);
                        dog.adjustHygiene(-2);
                        break;

                    }

                }
                // Hygiene Function
                case 5: {
                    if (dog.getHygiene() > 50) {
                        System.out.println();
                        System.out.println(dogName + " doesn't want to take a bath right now.");
                        System.out.println();
                    } else {
                        System.out.println();
                        System.out.println(dogName + " is fresh and clean now!");
                        System.out.println();
                        dog.adjustHungry(-2);
                        dog.adjustEnergy(+3);
                        dog.adjustBladder(-1);
                        dog.adjustBored(+3);
                        dog.adjustHygiene(-5);
                        break;

                    }

                }
                // Exit
                case 0: {
                    exitLoop = true;
                    break;
                }

            }

            // Tick
            dog.tick();
        }
    }

    // Display of the needs
    private static void mainDisplay(VirtualPet dog) {

        System.out.println();
        System.out.println("Hungry: " + dog.getHungry());
        System.out.println("Bored: " + dog.getBored());
        System.out.println("Bladder: " + dog.getBladder());
        System.out.println("Hygiene: " + dog.getHygiene());
        System.out.println("Energy: " + dog.getEnergy());
        System.out.println();
    }

}