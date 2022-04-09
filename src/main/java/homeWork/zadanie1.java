package homeWork;

public class zadanie1 {

    public static int first,second,third;

    public static void main(String[] args) {
        first = 9;
        second = 3;
        third = 4;
        while(second<first){
            System.out.println(third);
            second++;
        }

        for (int i = 1;first>second;second++){
            System.out.println(third);
        }

        do {
            System.out.println(11);
            second++;
        }while (first>second);

        /*
        Операторы ветвления
         */

        if (first>second){
            System.out.println("first win");
        }else{
            System.out.println("Second win");
        }


        switch (first){
            case 1:
                System.out.println("First");
                break;
            case 2:
                System.out.println("Second");
                break;
            default:
                System.out.println("Такой переменной нет");
        }

        
    }

}
