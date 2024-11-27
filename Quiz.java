public class Quiz{
    public static int waterM,ElectM;
    public static int resultBill;

    public static int currenrWaterMeter,lastWaterMeter;
    public static int currenrElecMeter,lastElecMeter;

    public static int calculateWaterBill () {
        if(currenrWaterMeter >= lastWaterMeter) {
            waterM = (currenrWaterMeter - lastWaterMeter) * 5;
        }
        return waterM; 
    }

    public static int calculateElecBill () {
        if(currenrElecMeter >= lastElecMeter) {
            ElectM = (currenrElecMeter - lastElecMeter) * 6;
        }
        return ElectM;
    }

    public static int calculateResultBill(String roomType){
        if (roomType.equals("S")) {
            resultBill = 1500 +calculateWaterBill() + calculateElecBill();
        }else if (roomType.equals("D")){
            resultBill = 2000 + calculateWaterBill() + calculateElecBill();
        }
        return resultBill;
    }

    public static void main(String[] args) {
        
        currenrWaterMeter = 10;
        lastWaterMeter = 5;
        currenrElecMeter = 20;
        lastElecMeter = 15;

        System.out.println(calculateResultBill("S"));
    }
}