public abstract class Phone implements Callable<String>, Informable<String>{
    private String number;
    private String model;
    private double weight;



    {
        number = "Missing number";
        model = "Missing model";
        weight = 0.0;
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public Phone(String number, String model){
        this.number = number;
        this.model = model;
    }
    public Phone(){}

    public void receiveCall(String name) throws NameException {
        if (name.length() < 4) throw new NameException("Имя короче 4х символов.");
        System.out.println("Звонит " + name);
    }

    public String getNumber(){
        return number;
    }
    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }
    public abstract void info();

}
