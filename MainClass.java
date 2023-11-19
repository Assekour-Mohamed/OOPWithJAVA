import company.clsEmployer;
import animal.clsAnimal;
class clsMain {
    public static void main(String[] args) {
        clsEmployer  Emp = new clsEmployer("Mohamed","3333","programmer");
        Emp.showInfo();
        clsAnimal animal = new clsAnimal("moooo","22");
        animal.showAnimal();
    }
}
