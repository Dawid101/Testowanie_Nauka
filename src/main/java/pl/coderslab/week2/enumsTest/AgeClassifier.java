package pl.coderslab.week2.enumsTest;

public class AgeClassifier {
    public static AgeGroup classify(int age){
        for(AgeGroup group : AgeGroup.values()){
            if(age >= group.getMinAge() && age <= group.getMaxAge()){
                return group;
            }
        }
        throw new IllegalArgumentException("Age out of range");
    }
}
