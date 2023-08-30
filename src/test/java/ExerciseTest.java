import org.junit.jupiter.api.Test;
import org.example.Exercise;
import static org.junit.jupiter.api.Assertions.*;

public class ExerciseTest {

    @Test
    public void probarNumerosPrimos(){
        int [] primos = {2, 3, 5, 7, 11, 13};
        for(int num: primos) {
            assertTrue(Exercise.isPrime(num));
        }
    }

    @Test
    public void probarNumerosNoPrimos(){
        int [] noPrimos = {0, 1, 4, 6, 9, 15};
        for(int num: noPrimos) {
            assertFalse(Exercise.isPrime(num));
        }
    }

    @Test
    public void probarNumerosNegativos(){
        int [] negativos = {-1, -2};
        for(int num: negativos) assertFalse(Exercise.isPrime(num));
    }

    @Test
    public void probarNumeroPrimoLargo(){
        assertTrue(Exercise.isPrime(104729));
    }

    @Test
    public void probarNumeroNoPrimoLargo(){
        assertFalse(Exercise.isPrime(100000));
    }

}
