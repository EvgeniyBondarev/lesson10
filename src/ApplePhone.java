public class ApplePhone extends Phone {
    public ApplePhone(){
        super();
    }
    public ApplePhone(String number, String model) {
        super(number, model);
    }
    public ApplePhone(String number, String model, double weight){
        super(number, model, weight);
    }
    public void info(){
        System.out.printf("Number: %s \tModel: %s \tWeight: %.2f\n", getNumber(), getModel(), getWeight());
    }
}
