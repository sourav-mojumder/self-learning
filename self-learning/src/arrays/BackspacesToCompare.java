package arrays;

public class BackspacesToCompare {
    public boolean backspaceCompare(String s, String t) {
        int index1 = s.length() - 1;
        int index2 = t.length() - 1;
        while (index1 >= 0 || index2 >= 0) {

            int i1 = getLastValidIndex(s, index1);
            int i2 = getLastValidIndex(t, index2);

            //if both indices are 0 mean the nothing more to compare so return true
            if (i1 < 0 && i2 < 0)
                return true;

            //if one str has ended and the other has still characters
            //meaning the strings were unequal sizes
            if (i1 < 0 || i2 < 0)
                return false;

            // compare the last valid indices are equal
            if (s.charAt(i1) != t.charAt(i2))
                return false;


            index1 = i1 - 1;
            index2 = i2 - 1;

        }
        return true;
    }

    private int getLastValidIndex(String str, int index) {
        int backspaces = 0;
        while (index >= 0) {

            if (str.charAt(index) == '#')
                backspaces++;
            else if (backspaces > 0)
                backspaces--;
            else
                break;
            index--;
        }
        return index;
    }
}

