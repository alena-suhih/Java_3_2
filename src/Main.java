public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bmi = service.calculate(90, 180);
        System.out.println("Индекс массы тела равен: " + bmi);
    }
}
