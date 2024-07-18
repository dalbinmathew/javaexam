public class CPU {
    
    double price;

    // Inner Class
    class Processor {
        
        int cores;
        String manufacturer;

        Processor(int cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }

    }

    // Static Class
    static class RAM {
        // Static classes can access only static members of the outer class
        int memory;
        String manufacturer;

        RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }
    }

    public static void main(String[] args) {
        
        CPU obj1 = new CPU();
        CPU.Processor obj2 = obj1.new Processor(4, "Intel");
        CPU.RAM obj3 = new CPU.RAM(8, "Western Digital");

        System.out.println("Processor Information:");
        System.out.println("Cores: " + obj2.cores);
        System.out.println("Manufacturer: " + obj2.manufacturer);

        System.out.println("\nRAM Information:");
        System.out.println("Memory: " + obj3.memory + "GB");
        System.out.println("Manufacturer: " + obj3.manufacturer);

    }

}