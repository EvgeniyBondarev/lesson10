public class XiaomiPhone extends Phone {
    public XiaomiPhone(){
        super();
    }
    public XiaomiPhone(String number, String model) {
        super(number, model);
    }
    public XiaomiPhone(String number, String model, double weight){
        super(number, model, weight);
    }
    public void info(){
        System.out.printf("Number: %s \tModel: %s \tWeight: %.2f\n", getNumber(), getModel(), getWeight());
    }
}
