package Sorting;
import java.util.*; 
import java.lang.*; 
import java.io.*; 

class Points
{
    int x, y;
    Points(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}

// This class implements 
// Comparator interface to compare 
class MyCmp implements Comparator<Points>
{
    // Sorts the Point objects according
    // to x-coordinates in natural order
    public int compare(Points p1, Points p2)
    {
        return p1.x - p2.x;
    }


	
}

// Main class
class non_primitive_sorting_using_comparator
{ 
    public static void main(String[] args) 
    { 
        // Array of 3 objects
        Points arr[] = {
            new Points(10, 20), 
            new Points(3, 12), 
            new Points(5, 7) };
            
        // Sorting the object containing the array 
        // by passing the array and object MyCmp
        Arrays.sort(arr,new MyCmp());
        
        // Displaying the sorted array
        for(int i = 0; i < arr.length; i++)
            System.out.println(
                arr[i].x + " " + arr[i].y);
    } 
} 
