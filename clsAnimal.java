package animals;

class clsAnimal 
  {
    String name;
    String FootNumber;
    
    public clsAnimal(String name, String FootNumber)
    {
        this.name = name;
        this.FootNumber = FootNumber;
    }
    public void showAnimal()
    {
        System.out.println("the animal " + this.name + " has : " + this.FootNumber + " Foot." );
    }
    
  }
