package thinking.char09.exercise8;

/**
 * @author sgc
 * @create 2020/8/3
 */
public class Exercise8 {
    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich();
        sandwich.f();

    }
}

class Meal {
    Meal() {
        System.out.println("Meal()");
    }
}

class Bread {
    Bread() {
        System.out.println("Bread()");
    }
}

class Cheese {
    Cheese() {
        System.out.println("Cheese()");
    }
}

class Lettuce {
    Lettuce() {
        System.out.println("Lettuce");
    }
}

class Lunch extends Meal {
    Lunch() {
        System.out.println("Lunch()");
    }
}

class PortableLunch extends Lunch {
    PortableLunch() {
        System.out.println("PortableLunch()");
    }
}

class Pickle {
    Pickle() {
        System.out.println("Pickle()");
    }
}

class Sandwich extends PortableLunch implements FastFood{
    @Override
    public void f() {
        System.out.println("ffffffffffffffff");
    }
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    private Pickle p = new Pickle();
    public Sandwich() {
        System.out.println("Sandwich()");
    }
}

interface FastFood {
    void f();
}



