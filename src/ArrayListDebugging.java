import java.util.ArrayList;
public class ArrayListDebugging {
    public static void main(String [] args){
                // Create an arraylist
                ArrayList <String> alArrayList = new ArrayList<String>();// change the data type and the name to string and alArrayList
                System.out.println("Initial size of alArrayList: " + alArrayList.size());

                // Add elements to the arraylist
        alArrayList.add("C");//instead of al change the name of the array to alArrayList
        alArrayList.add("A");
        alArrayList.add("E");
        alArrayList.add("B");
        alArrayList.add("D");
        alArrayList.add("F");
        alArrayList.add(1, "A2");
                System.out.println("Size of al after additions: " + alArrayList.size());// change sizes to size

                // Display the arraylist
                System.out.println("Contents of alArrayList: " + alArrayList);

                // Removes elements from the arraylist
        alArrayList.remove("F");
        alArrayList.remove("G");
        alArrayList.remove(2);

                System.out.println("Size of al after deletions: " +alArrayList.size());//change sizes to size
                System.out.println("Contents of alArrayList: " +alArrayList);
            }
        }


