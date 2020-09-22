package thinking.char07.chapter_7.exercise3;

class Art {
    Art(){
        System.out.println("Art constructor");
    }
}

class Drawing extends Art{
    Drawing(){
        System.out.println("Drawing constructor");
    }
}


class Cartoon extends Drawing{
/*    Cartoon(){
        System.out.println("Cartoon constructor");
    }*/

    public static void main(String[] args) {
        Cartoon cartoon = new Cartoon();
    }
}