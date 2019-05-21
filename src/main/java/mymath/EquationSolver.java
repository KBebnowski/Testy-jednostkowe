package mymath;

import java.util.ArrayList;
import java.util.List;

public class EquationSolver {

    public double solverLinearEquation(double a, double b, double y) throws Exception {
        if(a==0){
            throw new Exception("No solutions exist");
        }
        return (y-b)/a;
    }

    public List<Double> solveQuadraticEquation(double a, double b, double c, double y) throws Exception {
        ArrayList<Double> lista = new ArrayList<Double>();
        double delta = b*b - 4*a*(c-y);

        if(delta<0){
            throw new Exception("No solutions");
        }
        else if(delta ==0 ){
            double wynik;
            wynik = -b/2*a;
            lista.add(wynik);
        }
        else {
            double pierwiastekDelta=Math.sqrt(delta);
            double wynik1 = (-b-pierwiastekDelta)/2*a;
            double wynik2 = (-b+pierwiastekDelta)/2*a;
            lista.add(wynik1);
            lista.add(wynik2);
        }
        return lista;
    }

}
