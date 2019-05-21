package mymath;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class EquationSolverTest {

    EquationSolver eqS;

    @Before
    public void setUp() throws Exception {
        eqS = new EquationSolver();
        System.out.println("PREPARATION");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("LIKVIDATION");
    }

    @Test(expected = Exception.class)
    /*
        a=0,b=3,y=17
    */
    public void solverLinearEquation() throws Exception {
        double a = 0, b = 3, y =17;
        double r = eqS.solverLinearEquation(a, b, y);
    }

    @Test
    /*
        a=10,b=0,y=17
    */
    public void solverLinearEquation2() throws Exception {
        double a = 10, b = 0, y =17;
        double r = eqS.solverLinearEquation(a, b, y);
        assertEquals(1.7, r, 0.0001);
    }

    @Test
    /*
        a=10,b=-30,y=0
    */
    public void solverLinearEquation3() throws Exception {
        double a = 10, b = -30, y =0;
        double r = eqS.solverLinearEquation(a, b, y);
        assertEquals(3, r, 0.0001);
    }


    @Test
    public void solveQuadraticEquation() throws Exception {
        double a = 0, b = 0, c=0, y=12;
        List<Double> r = eqS.solveQuadraticEquation(a,b,c,y);
        assertTrue(r.size()==0);//lista pusta, brak rozwiazan
    }

    @Test
    public void solveQuadraticEquation2() throws Exception {
        double a = 1, b = 0, c=0, y=16;
        List<Double> r = eqS.solveQuadraticEquation(a,b,c,y);
        assertTrue(r.size()==2);
        assertEquals(-4,r.get(0),0.001);
        assertEquals(4,r.get(1),0.001);
    }

    @Test( expected = Exception.class)//delta < 0 ; delta = -3, wiec wyrzuci exception dlatego dalismy expected=Exception.class i nie potrzebujemy assertTrue i assertEqauls (czego oczekujemy)
    public void solveQuadraticEquation3() throws Exception {
        double a = 1, b = 1, c=1, y=0;
        List<Double> r = eqS.solveQuadraticEquation(a,b,c,y);
    }


}