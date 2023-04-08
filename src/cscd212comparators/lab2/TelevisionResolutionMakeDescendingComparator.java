package cscd212comparators.lab2;

import cscd212classes.lab2.Television;

public class TelevisionResolutionMakeDescendingComparator {

    public TelevisionResolutionMakeDescendingComparator() {

    }

    public int compare(final Television t1, final Television t2) {
        if (t1.getResolution() > t2.getResolution()) {
            return 1;
        }
        else if (t1.getResolution() < t2.getResolution()) {
            return -1;
        }
        else if (t1.getMake().compareTo(t2.getMake()) > 0) {
            return 1;
        }
        else if (t1.getMake().compareTo(t2.getMake()) < 0) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
