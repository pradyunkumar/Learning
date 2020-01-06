package pradyunjava;

class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }
    public String getName(){
        return name;
    }
}
//SEVERAL MOVIES BEING CREATED EXTENDING MOVIE
class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    @Override
    public String plot(){
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet Earth";
    }
}

class MazeRunner extends Movie{
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try to escape a maze";
    }
}

class StarWars extends Movie{
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the universe";
    }
}

class Forgettable extends Movie{
    public Forgettable() {
        super("Forgettable");
    }
    //no plot method
}



public class Main {
    /*  Method or mechanism in object orientated programming allows actions to act different
    *   based on what is being performed on */
    public static void main(String[] args) {

        for(int i = 1; i < 11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " :" +
                                movie.getName() + "\n" +
                                "Plot: " + movie.plot() + "\n");
            /*  movie.getName() is doing a lot of different things + work
            *   java is looking at the object Movie return type from random method
            *       it then asks does this subclass(case) has a plot
            *       if it does it returns that plot method inside the subclasses
            *   assigning different functionality depending on the type of object created
            *       all these objects inherited from base movie class but uniqueness assigned to each
            *   for "Forgettable" movie, there was no overriden plot method
            *       extending the movie class, it printed the movie default class
            * */

        }
    }

    public static Movie randomMovie(){  //picks a random number and generates a new object
        int randomNumber = (int)(Math.random() * 5) + 1;    //returns random number
        System.out.println("Random Number Generated was: " + randomNumber);
        switch(randomNumber){
            case 1:
                return new Jaws();

            case 2:
                return new IndependenceDay();

            case 3:
                return new MazeRunner();

            case 4:
                return new StarWars();

            case 5:
                return new Forgettable();

            default:
                return null;
        }

    }


}


