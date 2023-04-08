package cscd212comparators.lab2;

import cscd212classes.lab2.Television;

public class TelevisionScreenSizeComparator {

    public TelevisionScreenSizeComparator() {

    }

    public int compare(final Television t1, final Television t2) {
        if (t1.getScreenSize() > t2.getScreenSize()) {
            return 1;
        }
        else if (t1.getScreenSize() < t2.getScreenSize()) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
