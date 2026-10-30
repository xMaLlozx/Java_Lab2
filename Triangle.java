package Lab_2;
public class Triangle {
    public boolean Exists_Triang(int a, int b, int c){
        if(a + b > c && a + c > b && b + c > a)
            return true;
        else
            return false;
    }

    public double Area_Triang(int a, int b, int c){
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public double Area_Triang(int a, int h){
        return 0.5 * a * h;
    }
    public double Area_Triang(int a, int b, double angle){
        return 0.5 * a * b * Math.sin(angle);
    }

    public double Area_Triang(double a, double b, double angleD)
    {
        double angleR = angleD * Math.PI / 180;
        return 0.5 * a * b * Math.sin(angleR);
    }
}
