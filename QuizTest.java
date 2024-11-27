import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.Test;



public class QuizTest {

    @Test
    public void testCalculateWaterBill() {

        Quiz.currenrWaterMeter = 10;
        Quiz.lastWaterMeter = 5;
        int expectedWaterBill = (10 - 5) * 5;  
        int actualWaterBill = Quiz.calculateWaterBill();

        assertEquals(expectedWaterBill,actualWaterBill);
        
    }

    @Test
    public void testCalculateElecBill() {
        
        Quiz.currenrElecMeter = 20;
        Quiz.lastElecMeter = 15;

        int expectedElecBill = (20 - 15) * 6;  // 5 * 6 = 30
        int actualElecBill = Quiz.calculateElecBill();

    
        assertEquals(expectedElecBill, actualElecBill);
    }


    @Test
    public void totalBillWaterAndElec() {
        Quiz.currenrWaterMeter = 10;
        Quiz.lastWaterMeter = 5;
        Quiz.currenrElecMeter = 20;
        Quiz.lastElecMeter = 15;

        
        int expectedWaterBill = (10 - 5) * 5;  
        int expectedElecBill = (20 - 15) * 6;  
        int expectedTotalBill = expectedWaterBill + expectedElecBill;
        
        assertEquals(expectedTotalBill,55);
        
        
    }



    @Test
    public void testCalculateResultBillSingle() {
       
        Quiz.currenrWaterMeter = 10;
        Quiz.lastWaterMeter = 5;
        Quiz.currenrElecMeter = 20;
        Quiz.lastElecMeter = 15;

        int expectedResultBill = 1500 + (5 * 5) + (5 * 6);
        int actualResultBill = Quiz.calculateResultBill("S");

        assertEquals(expectedResultBill, actualResultBill);
    }

    @Test
    public void testCalculateResultBillDouble() {

        Quiz.currenrWaterMeter = 10;
        Quiz.lastWaterMeter = 5;
        Quiz.currenrElecMeter = 20;
        Quiz.lastElecMeter = 15;

        int expectedResultBill = 2000 + (5 * 5) + (5 * 6); 
        int actualResultBill = Quiz.calculateResultBill("D");

        assertEquals(expectedResultBill, actualResultBill);
    }
}
