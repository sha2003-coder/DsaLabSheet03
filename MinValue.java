public class MinValue {
    public static void main(String[] args) {
        ArrayADT abst=new ArrayADT(5);
        abst.inserElement(0, 10);
        abst.inserElement(1, 20);
        abst.inserElement(2, 5);
        abst.inserElement(3, 15);
        int min=0;
        for(int i=0;i<abst.getSize();i++)
        {
            if(abst.getElement(i)<abst.getElement(min))
            {
                min=i;
            }
        }
        System.out.println("Minimum value in the array is: " + abst.getElement(min));        
}
}
