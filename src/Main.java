public class Main {
    public static void main(String[] args) {

        String result;
        result = goOut(12, 28);
        System.out.println(result);

        result = goOut(25, 29);
        System.out.println(result);

        result = goOut(13, -18);
        System.out.println(result);

        result = goOut(1, -30);
        System.out.println(result);

        result = goOut(50, 67);
        System.out.println(result);

    }
    public static String goOut(int age, int temperature){
        if(age >20 && age <45 && temperature >-20 && temperature <30){
            return "Можно идти гулять";
        } else if (age <20 && temperature >0 && temperature <28) {
            return "Можно идти гулять";
        } else if (age <45 && temperature >-10 && temperature <25) {
            return "Оставайтесь дома";
        } else {
            return "Оставайтесь дома";
        }
    }
}