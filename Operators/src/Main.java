public class Main {

    public static void main(String[] args) {
        //operators are +, -, *, ^, %, /
        //math operators
        int result = 1 + 2;     //add
        System.out.println("1 + 2 = " + result);

        int newResult = result;
        result--;       // - 1, subtract
        System.out.println(newResult + " - 1 = " + result);

        newResult = result;
        result = result * 10;    //multiply
        System.out.println(newResult + " * 10 = " + result);

        newResult = result;
        result = result / 5;     //divide
        System.out.println(newResult + " / 5 = " + result);

        newResult = result;
        result = result % 3;     //remainder
        System.out.println(newResult + " % 3 = " + result);

        newResult = result;
        result = result++;       //increment + 1
        System.out.println("Final Result is " + result);

        result += 2;   //adds 2, literal to previous
        System.out.println("The result is now " + result);

        result *= 10;    //multiplies 10, literal, to previous
        System.out.println("The result is now " + result);

        result -= 10;    //subtracts 10 from previous
        System.out.println("The result is now " + result);

        result /= 5;     //divides 5 from previous
        System.out.println("The result is now " + result);

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("Not Alien!");
        //== is equal, != is not equal
        //<= is less than or equal
        //>= is greater than or equal
        //&& is and, || is or

        int newValue = 50;
        if(newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if(isCar == true)   //must use == if referring to previous statement
            System.out.println("This is not suppose to happen");

        isCar = true;
        boolean wasCar = isCar ? true : false; //shortened if statement
        //if true, return true, if false, return false
        //ternary operator, way to set a value based on 2 conditions
        if(wasCar)  //if true, do it (Shortened)
            System.out.println("wasCar is true");



    }
}
