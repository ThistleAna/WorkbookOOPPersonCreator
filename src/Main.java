public class Main {
    public static void main(String[] args) {
        System.out.println("=== CENCUS 2089, CITY OF BROKENHEARTED ===");
        Person person00 = new Person("Ada Lovelace", 25, 178, 67.9);
        System.out.println("Name = " + person00.getName());
        System.out.println("Age = " + person00.getAge());
        System.out.println("Height = " + person00.getHeight());
        System.out.println("Weight = " + person00.getWeight());

        // call the growOlder method to  make person00 older
        person00.growOlder();
        System.out.println("A year after....");
        System.out.println("Name = " + person00.getName());
        System.out.println("Age = " + person00.getAge());
        System.out.println("Height = " + person00.getHeight());
        System.out.println("Weight = " + person00.getWeight());
        
        // CREATE PERSON01 AND PERSON02 OBJECTS AND PRINT THEM

    }
}
