package loopingandcollections;

import java.util.Arrays;


class Main {
    public static void main(String[] args)
    {
        System.out.println("*** Welcome to Lambda School's Java Day 2");
        System.out.println("\n\n*** Arrays ***");

        //Declaring array specifically sets a fixed amount in the array, fixed type and length
        Dog [] dogArr = new Dog[5]; // indexed 0 through 4
        dogArr[0] = new Dog("Springer", 50, false);
        dogArr[1] = new Dog("Bulldog", 45, true);
        dogArr[2] = new Dog("Collie", 45, false);
        dogArr[3] = new Dog("Chihuahua", 5, true);
        dogArr[4] = new Dog("Corgie", 35, true);
        System.out.println("Pointer: " + dogArr.toString());
        System.out.println(Arrays.toString(dogArr));

        System.out.println("\nGood for apartments");
        for(int i = 0; i < dogArr.length; i++)
        {
            if (!dogArr[i].isApartment())
            {
                continue;
            }
            System.out.println(dogArr[i]);
        }
        System.out.println("Breed 3 good for apartments: " + dogArr[2].isApartment());
        System.out.println();
        for(Dog d : dogArr)
        {
            System.out.println(d);
        }
        // the author adresses the struggle between immagrant mothers goal to create a better life for their children and the child who wants to choose their path although their mother only wants the best for them.
    }
}