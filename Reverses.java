public class Reverses {
    
    public static void main(String[] args) {
        ArrayADT abst=new ArrayADT(5);
        abst.inserElement(0, 10);
        abst.inserElement(1, 20);   
        abst.inserElement(2, 23);
        abst.inserElement(3, 5);
        abst.inserElement(4, 15);
        System.out.println("Original array:");
        abst.printArray();
        int left=0;
        int right=abst.getSize()-1;
        while(left<right)
        {
            int temp=abst.getElement(left);
            abst.updateElement(left,abst.getElement(right));
            abst.updateElement(right,temp);
            left++;
            right--;
        }
        System.out.println("Reversed array:");
        abst.printArray();
    }
}
