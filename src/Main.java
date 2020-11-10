import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<Workers>Muncitori= new ArrayList<Workers>();
        Workers worker1=new Workers(4,2000,Function.Mentenanta);
        Workers worker2=new Workers(8,4000,Function.Datacenter);
        Workers worker3=new Workers(8,8000,Function.Administrator);
        Muncitori.add(worker1);
        Muncitori.add(worker2);
        Muncitori.add(worker3);
        float allCost=0;
        for (Workers work:Muncitori) {
            allCost+=work.GetSalary(3);
        }

        System.out.println(allCost);
    }
}
