enum Function{
    Administrator,
    Mentenanta,
    Datacenter
}
public class Workers {
    private int hoursOfWork;
    private float salary;
    private Function statut;

    public Workers(int hoursOfWork, float salary, Function statut) {
        this.hoursOfWork = hoursOfWork;
        this.salary = salary;
        this.statut = statut;
    }

    public void setHoursOfWork(int hoursOfWork) {
        this.hoursOfWork = hoursOfWork;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setStatut(Function statut) {
        this.statut = statut;
    }

    public int getHoursOfWork() {
        return hoursOfWork;
    }

    public float getSalary() {
        return salary;
    }

    public Function getStatut() {
        return statut;
    }

    public float GetSalary(int mounthNumber)
    {
        int total=0;
        if(mounthNumber%8<=7)
        {
            total+=salary*mounthNumber*hoursOfWork;
            total-=total*0.05;
        }else
            total+=salary*mounthNumber*hoursOfWork;
        return total;
    }
}
