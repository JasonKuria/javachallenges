class GradingSystem {
    public static void main(String[] args) {
        int score = 60; // Example score, you can change this

        if (score >= 70) {
            System.out.println("Grade: A");
            System.out.println("You have passed!");
        } else if (score >= 60) {
            System.out.println("Grade: B");
            System.out.println("You have passed!");
        } else if (score >= 50) {
            System.out.println("Grade: C");
            System.out.println("You have passed!");
        } else if (score >= 40) {
            System.out.println("Grade: D");
            System.out.println("You have passed!");
        } else {
            System.out.println("Grade: F");
            System.out.println("You have failed!");
        }
    }
}