/*
For this problem, we have 2 types of queries you can perform on a List:

1. Insert y at index x:
    Insert
    x y
2. Delete the element at index x:
    Delete
    x
Given a list, L, of N integers, perform Q queries on the list.
Once all queries are completed, print the modified list as a single line of space-separated integers.

Input Format:
The first line contains an integer, N (the initial number of elements in L).
The second line contains N space-separated integers describing L.
The third line contains an integer, Q (the number of queries).
The 2Q subsequent lines describe the queries, and each query is described over two lines:

    1 - If the first line of a query contains the String Insert,
    then the second line contains two space separated integers x y, and the value y must be inserted into L at index x.

    2 - If the first line of a query contains the String Delete,
    then the second line contains index x, whose element must be deleted from L.

Sample Input:
5
12 0 1 78 12
2
Insert
5 23
Delete
0

Sample Output:
0 1 78 12 23

 */
package dataStructures;

import java.util.*;


public class JavaLists {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> L = new ArrayList<>();
        while (n-- > 0) {
            L.add(sc.nextInt());
        }
        int q = sc.nextInt();
        while (q-- > 0) {
            String query = sc.next();
            if (query.contains("Insert")) {
                int idx = sc.nextInt();
                int value = sc.nextInt();
                L.add(idx, value);
            } else if (query.contains("Delete")) {
                int idx = Integer.parseInt(sc.next());
                L.remove(idx);
            }
        }
        for (int el:L) {
            System.out.print(el + " ");
        }
    }
}
