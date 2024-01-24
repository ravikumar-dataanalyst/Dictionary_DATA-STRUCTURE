public class Main {
    public static void main(String[] args) {
        Dictionary dict = new Dictionary();

        // Add some entries to the dictionary
        dict.put("Econo", "OST");
        dict.put("MainStays", "OST");
        dict.put("Ylem", "Main ST");

        // Print the whole dictionary
        System.out.println("****Printing whole Dictionary****");
        dict.print();


        // Search for an entry in the dictionary
        System.out.println("****Finding and printing existing entry from dictionary****");
        String definition = dict.get("Ylem");
        System.out.println("Ylem is located at: " + definition);
    }
}