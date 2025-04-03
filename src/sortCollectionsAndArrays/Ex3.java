package sortCollectionsAndArrays;

// What is the result?

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

record Point(int x, int y) {

    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}

public class Ex3 {

    public static void main(String [] args) {
        List<Point> points = new ArrayList<>();
        points.add(new Point(4, 5));
        points.add(new Point(6, 7));
        points.add(new Point(2, 2));

        Collections.sort(points, new Comparator<Point>() {
            public int compare(Point o1, Point o2) {
                return o2.x() - o1.x();
            }
        });

        System.out.println(points); // [Point(6, 7), Point(4, 5), Point(2, 2)]
    }

//    o2.x() - o1.x(); means the Comparator is sorting the Point objects on descending value of x of Point objects.

}
