import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.Test;



public class QuizTest {

    @Test
    public void testCalculateWaterBill() {

        Quiz.currenrWaterMeter = 150;
        Quiz.lastWaterMeter = 50;
        int expectedWaterBill = (150 - 50) * 5;  
        int actualWaterBill = Quiz.calculateWaterBill();

        assertEquals(expectedWaterBill,500);
        
    }

    @Test
    public void testCalculateElecBill() {
        
        Quiz.currenrElecMeter = 170;
        Quiz.lastElecMeter = 100;

        int expectedElecBill = (170 - 100) * 6;  
        int actualElecBill = Quiz.calculateElecBill();

    
        assertEquals(expectedElecBill, 420);
    }


    @Test
    public void totalBillWaterAndElec() {
        Quiz.currenrWaterMeter = 150;
        Quiz.lastWaterMeter = 50;
        Quiz.currenrElecMeter = 170;
        Quiz.lastElecMeter = 100;

        
        int expectedWaterBill = (150 - 50) * 5;  
        int expectedElecBill = (170 - 100) * 6;  
        int expectedTotalBill = expectedWaterBill + expectedElecBill;
        
        assertEquals(expectedTotalBill,920);
        
        
    }



    @Test
    public void testCalculateResultBillSingle() {
       
        Quiz.currenrWaterMeter = 150;
        Quiz.lastWaterMeter = 50;
        Quiz.currenrElecMeter = 170;
        Quiz.lastElecMeter = 100;

        int expectedResultBill = 1500 + (100 * 5) + (70 * 6);
        int actualResultBill = Quiz.calculateResultBill("S");

        assertEquals(expectedResultBill, 2420);
    }

    @Test
    public void testCalculateResultBillDouble() {

        Quiz.currenrWaterMeter = 150;
        Quiz.lastWaterMeter = 50;
        Quiz.currenrElecMeter = 170;
        Quiz.lastElecMeter = 100;
 
        int actualResultBill = Quiz.calculateResultBill("D");

        assertEquals(actualResultBill, 2920);
    }
}
