import java.util.ArrayList;

public class SortDriver{
    
    public static void main(String[] args){
        ArrayList<Comparable> bob = new ArrayList<Comparable>();
	bob = MySorts.populate(10,1,100);
	System.out.println(bob);
	System.out.println(MySorts.selectionSort(bob));
	System.out.println(MySorts.bubbleSort(bob));
	System.out.println(bob);
    }
}