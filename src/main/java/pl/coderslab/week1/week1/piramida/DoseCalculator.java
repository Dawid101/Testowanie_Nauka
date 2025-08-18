package pl.coderslab.week1.week1.piramida;

public class DoseCalculator {
    // Method for calculating the corrected dose of medicine based on the corrected formula
    public double calculateYoungDose(double adultDose, double childAgeInYears) {
        // Calculating the corrected dose for the child
        return adultDose * (childAgeInYears / (childAgeInYears + 12));
    }

    public double calculateClarkDose(double adultDose, double childWeight){
        return adultDose * (childWeight / 68);
    }
}
