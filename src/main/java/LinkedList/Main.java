package LinkedList;



public class Main {
    public static void main(String[] args) {
        LinkedLIst<String> list = new LinkedLIst<> ();
        //
        // ******INSERTION******
        //

        // Insert the values
        list.insert (list, "ss");
        list.insert(list, "aa");
        list.insert(list, "ee");
        list.insert(list, "yy");
        list.insert(list, "hh");
        list.insert(list, "tt");
        list.insert(list, "ww");
        list.insert(list, "pp");



        // Print the LinkedList
        list.print (list);
    }
}
