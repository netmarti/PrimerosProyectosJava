
package sample;



class MergeSortArray {
    private static final int minMergeSortListSize  =  32;


    public static void mergeSortArray(int[] a, int start, int end) {
        int[] temp = new int[end];
	int i1, i2, tempi;

        if ((end-start) < minMergeSortListSize) {
	    /* Use insertion sort for small datasets. */
	    for (int i=start; i < end; i++) {
	        int j, v = a[i];
	        for (j = i - 1; j >= 0; j--) {
	            if (a[j] <= v)
	                break;
	            a[j + 1] = a[j];
	        }
	        a[j + 1] = v;
	    }
	    return;
	}

        mergeSortArray(a, start, start + ((end-start)/2));
        mergeSortArray(a, start + ((end-start)/2), end);
        i1 = 0;
	i2 = end/2;
	tempi = 0;
	while (i1 < end/2 && i2 < end) {
	    if (a[i1] <= a[i2])
	        temp[tempi++] = a[i1++];
	    else
	        temp[tempi++] = a[i2++];
	}

	while (i1 < end/2) {
	    temp[tempi++] = a[i1++];
	}
	while (i2 < end) {
	    temp[tempi++] = a[i2++];
	}
        System.arraycopy(a, start, temp, start, end-start);
    }


    public static void main(String[] argv) {
        int size=34;
        int[] a = new int[size];
        java.util.Random rand = 
            new java.util.Random(System.currentTimeMillis());
        for (int i=0; i<size; i++) {
            a[i] = rand.nextInt() % size;
        }
        
        for (int i=1; i<size; i++) {
           System.out.print(a[i] + " ");
            }
        mergeSortArray(a, 0, size);
        
        
        
        for (int i=1; i<size; i++) {
            if (!(a[i-1] <= a[i])) {
                System.out.println("ERROR");
                System.exit(-1);
            }
        }
        System.out.println("SUCCESS");
        for (int i=1; i<size; i++) {
           System.out.print(a[i] + " ");
            }
        
        System.exit(0);
    }
}
