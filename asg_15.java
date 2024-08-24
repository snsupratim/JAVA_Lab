// Parent class Bank
class Bank {
    // Method to get the rate of interest
    double getRateOfInterest() {
        return 0;
    }
}

// Child class SBI extending Bank
class SBI extends Bank {
    // Override method to get the rate of interest for SBI
    @Override
    double getRateOfInterest() {
        return 8.0; // SBI provides 8% rate of interest
    }
}

// Child class ICICI extending Bank
class ICICI extends Bank {
    // Override method to get the rate of interest for ICICI
    @Override
    double getRateOfInterest() {
        return 7.0; // ICICI provides 7% rate of interest
    }
}

// Child class AXIS extending Bank
class AXIS extends Bank {
    // Override method to get the rate of interest for AXIS
    @Override
    double getRateOfInterest() {
        return 9.0; // AXIS provides 9% rate of interest
    }
}

// Main class
public class asg_15 {
    public static void main(String[] args) {
        // Creating objects of SBI, ICICI, and AXIS banks
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        AXIS axis = new AXIS();

        // Displaying the rate of interest provided by each bank
        System.out.println("Rate of Interest from SBI: " + sbi.getRateOfInterest() + "%");
        System.out.println("Rate of Interest from ICICI: " + icici.getRateOfInterest() + "%");
        System.out.println("Rate of Interest from AXIS: " + axis.getRateOfInterest() + "%");
    }
}
