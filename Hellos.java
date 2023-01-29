package Class15HW;

public class Hellos {
    String hello(String country) {
        if (country == "USA") {
            return "Hello";
        } else if (country == "Peru") {
            return "Hola";
        } else if (country == "France") {
            return "Bonjour";
        }
        return country;
    }

    public static void main(String[] args) {
        Hellos lang = new Hellos();
        System.out.println(lang.hello("USA"));
        System.out.println(lang.hello("Peru"));
        System.out.println(lang.hello("France"));

    }
}
