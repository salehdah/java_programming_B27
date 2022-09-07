package practice.inheritance;

public class UseDevice {
    public static void main(String[] args) {
        Device tv1=new Tv("sharp","mc2563",1436,true);
        Device phone1=new Phone("Nokia","6000",450,false);

        if(tv1 instanceof Device) {
            tv1 = (Tv) tv1;
        }
        System.out.println(tv1);
        System.out.println(phone1);
        tv1.usingDevice();
        Phone.usingDevice();
    }

}
