package CRUD;

public class strCar {
    
    private int id;
    private String nameClient;
    private String colorCar;
    private double payment;
    private int status;

    public strCar(int id, String nameClient, String colorCar, double payment, int status) {
        this.id = id;
        this.nameClient = nameClient;
        this.colorCar = colorCar;
        this.payment = payment;
        validateSatus(status);
        this.status = status;
    }
    
    public int getId() {
        return id;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        validateSatus(status);
        this.status = status;
    }
    
    // validations
    public void validateSatus(int status){
        if (status >= 1 && status <= 3) return;
        throw new RuntimeException("Status incorrect");
    }
    
}
