package lab2.task6;

public class Romb extends Paralelogram{
    protected double diag1, diag2;
        public Romb(int latura1, int latura2, int latura3, int latura4, double unghi1, double unghi2, double unghi3, double unghi4, double diag1, double diag2) {
            super(latura1, latura2, latura3, latura4, unghi1, unghi2, unghi3, unghi4);
            this.diag1 = diag1;
            this.diag2 = diag2;
        }

    @Override
    public Double arie(){
        return (diag1*diag2)/2;
    }
}
