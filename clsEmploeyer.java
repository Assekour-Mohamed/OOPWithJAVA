package company;
class clsEmployer
{
    public String FullName;
    public String ID;
    public String Job;
    
    public clsEmployer(String FullName, String ID, String Job)
    {
        this.FullName = FullName;
        this.ID = ID;
        this.Job = Job;
    }
    public void showInfo()
    {
         
        System.out.println("Employer Name : " + this.FullName);
        System.out.println("\nEmployer ID :" + this.ID);
        System.out.println("\nEmployer Job : " + this.Job);

    }
    
}
