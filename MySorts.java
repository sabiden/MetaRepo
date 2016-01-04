//Shaik Abiden
//APCS1 pd10
//HW?? -- ??
//2015 - 12 - 29

import java.util.ArrayList;

public class MySorts {

    //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~



    //precond: lo < hi && size > 0
    //postcond: returns an ArrayList of random integers
    // from lo to hi, inclusive
    public static ArrayList populate( int size, int lo, int hi ) {
	ArrayList<Integer> retAL = new ArrayList<Integer>();
	while( size > 0 ) {
	    //offset + rand int on interval [lo,hi]
	    retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
	    size--;
	}
	return retAL;
    }




    //randomly rearrange elements of an ArrayList
    public static void shuffle( ArrayList al ) {
	int randomIndex;
        for( int i = al.size()-1; i > 0; i-- ) {
	    //pick an index at random
            randomIndex = (int)( (i+1) * Math.random() );
	    //swap the values at position i and randomIndex
            al.set( i, al.set( randomIndex, al.get(i) ) );
        }
    }



    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    /*/~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
      VOID version of SelectionSort
      Rearranges elements of input ArrayList
      postcondition: data's elements sorted in ascending order
      //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~/*/
    public static void selectionSortV( ArrayList<Comparable> data ) 
    {
	for (int l = 0; l < data.size() - 1; l++){
	    int smindx = l;
	    for (int j = l; j < data.size(); j++){
		if(data.get(j).compareTo(data.get(smindx)) < 0){
			smindx = j;
		}
	    }
	    Comparable strVal = data.get(l);
	    data.set(l, data.get(smindx));
	    data.set(smindx, strVal);
	}
    }//end selectionSort -- O(n^2)





    /*/~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
      ArrayList-returning selectionSort
      postcondition: order of input ArrayList's elements unchanged
      Returns sorted copy of input ArrayList.
      //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~/*/


     public static ArrayList<Comparable> selectionSort( ArrayList<Comparable> input ){
	 //New ArrayList as copy
	 ArrayList<Comparable> copy = new ArrayList<Comparable>();
	 //Copy the data to the copy
	 for(int i = 0; i < input.size(); i++){
	     copy.add(input.get(i));
	 }
	 //Sort using the method above
	 selectionSortV(copy);
	 //Return
	 return copy;
     }//end selectionSort -- O(n^2 b/c it calls on a function that is O(n^2))
    




    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
      VOID version of bubbleSort
      Rearranges elements of input ArrayList
      Postcondition: data's elements sorted in ascending order
      //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~/*/
    

    public static void bubbleSortV( ArrayList<Comparable> data ) {
	//Do the follwing for n-1 times to ensure everything is bubbled up
	for (int j = 0; j < data.size() - 1; j++) {
	    //Start at the end and come to the front
	    for (int i = data.size() - 1; i > 0; i--){
		//If the right value is less than the left, switch 'em
		if (data.get(i).compareTo(data.get(i - 1)) < 0){
		    Comparable strVal = data.get(i - 1);
		    data.set(i - 1,data.get(i));
		    data.set(i, strVal);
		}
	    }
	}
    }//end bubbleSortV -- O(n^2; Does n things each n times)
    

    
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
      ArrayList-returning bubbleSort
      postcondition: order of input ArrayList's elements unchanged
      Returns sorted copy of input ArrayList.
      //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~/*/
    public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> input ) {
	//New ArrayList as copy
	ArrayList<Comparable> copy = new ArrayList<Comparable>();
	//Copy the data to the copy
	for(int i = 0; i < input.size(); i++){
	    copy.add(input.get(i));
	}
	//Sort using the method above
	bubbleSortV(copy);
	//Return
	return copy;
    }//end bubbleSort -- O(n^2 b/c it calls on a function that is O(n^2))

}//end class MySorts

