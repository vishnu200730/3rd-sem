class Payment {

    // Method to calculate payment amount
    double calculateAmount(double amount) {
        return amount;
    }

    // Overloaded method
    double calculateAmount(double amount, double discount) {
        return amount - (amount * discount / 100);
    }
}

// CardPayment class
class CardPayment extends Payment {

    // Method overriding
    @Override
    double calculateAmount(double amount) {
        double fee = amount * 0.02;
        return amount + fee;
    }
}

// UPIPayment class
class UPIPayment extends Payment {

    // Method overriding
    @Override
    double calculateAmount(double amount) {
        double fee = amount * 0.01;
        return amount + fee;
    }
}

// Main class
class MainPayment {
    public static void main(String[] args) {

        // Parent class reference
        Payment p;

        // Card Payment
        p = new CardPayment();
        System.out.println("Card Payment: "
                + p.calculateAmount(1000));

        // UPI Payment
        p = new UPIPayment();
        System.out.println("UPI Payment: "
                + p.calculateAmount(1000));

        // Method overloading
        Payment p1 = new Payment();
        System.out.println("Amount after discount: "
                + p1.calculateAmount(1000, 10));
    }
}
