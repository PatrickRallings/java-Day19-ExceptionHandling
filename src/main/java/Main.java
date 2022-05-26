public class Main {
    public static void main(String[] args){

        //Validating Person Assignment Testing
        Person patrick = new Person("Patrick", 28);
        System.out.println(patrick.getName());

        Person patrickBlank = new Person("", 28);
        System.out.println(patrickBlank.getName());
    }
}
