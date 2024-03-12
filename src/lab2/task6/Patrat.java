package lab2.task6;

public class Patrat extends Dreptunghi{
    public Patrat(int latura1, int latura2, int latura3, int latura4, double unghi1, double unghi2, double unghi3, double unghi4) {
        super(latura1, latura2, latura3, latura4, unghi1, unghi2, unghi3, unghi4);
    }

    @Override
    public Double arie(){
        return (double) (latura1*latura1);
    }
}
