public class Hello {

    public static void main(String[] args) {

        boolean isAlien = true;

        if (isAlien == true) {
            System.out.println("It is not an alien");
            System.out.println("And i am scared of aliens");
        }
        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score: " + topScore);

        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is an error");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Bmw";
        boolean isDomestic = (makeOfCar == "Bmw") ? false : true;


        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        int ageOfClient = 20;
        String ageText = (ageOfClient >= 18) ? "Over Eighteen" : "Still a kid";
        System.out.println("Our client is " + ageText);

        String s = (isDomestic) ? "This car is domestoc" : "This car is not domestic";
        System.out.println(s);

        double myValue = 20.00d;
        double mySecondValue =  80.00d;
        double sum = myValue + mySecondValue;
        double myTotal = sum * 100.00d;
        double myRe = myTotal % 40.00d;
        boolean isNoRemainder = (myRe == 0) ? true : false;
        System.out.println("sum: " + sum);
        System.out.println("Total: " + myTotal);
        System.out.println(myRe);
        System.out.println("isNoRemainder = " + isNoRemainder);
        System.out.println(4d);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }

    }
}
