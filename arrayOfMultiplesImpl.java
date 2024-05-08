package arrayofmultiples;

import java.util.ArrayList;

public class arrayOfMultiplesImpl implements arrayOfMultiples{

    @Override
    public ArrayList<Integer> allMultiples(int num, int length) {
        // Given a number, `num` and `length`,
        // the allMultiples() `num` multiplies
        // by its value for the provided length.
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 1; i < length + 1; i++){
            int multiple;

            multiple = num * i;
            arrayList.add(multiple);
        }
        return arrayList;
    }
}
