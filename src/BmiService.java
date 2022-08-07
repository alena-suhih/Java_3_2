public class BmiService {
    public int calculate(int weight, int height) {
        int bmi;
        int heightSq = height * height / 10_000;
        bmi = weight / heightSq;
        return bmi;
    }
}
