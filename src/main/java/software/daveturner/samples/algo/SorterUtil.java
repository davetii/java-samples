package software.daveturner.samples.algo;

public class SorterUtil {

    public static void selectionSort(int[] a) {
        for(int i = 0; i < a.length; i++) {
            int min = i;
            for(int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min  = j;
                }
            }
            int t  = a[i];
            a[i] = a[min];
            a[min] = t;
        }
    }

    public static void selectionSort(String[] a) {
        for(int i = 0; i < a.length; i++) {
            int min = i;
            for(int j = i + 1; j < a.length; j++) {
                if (a[j].compareTo(a[min]) < 0) {
                    min  = j;
                }
            }
            String t  = a[i];
            a[i] = a[min];
            a[min] = t;
        }
    }

    public static void insertionSort(int[] a) {
        for(int i =0; i < a.length; i++) {

            int current = i;
            while(current > 0 && a[current] < a[current-1]) {
                int temp = a[current];
                a[current] = a[current-1];
                a[current-1] = temp;
                current --;
            }
        }
    }

    public static void insertionSort(String[] a) {
        for(int i =0; i < a.length; i++) {
            int current = i;
            while(current > 0 && a[current].compareTo(a[current-1]) < 0) {
                String temp = a[current];
                a[current] = a[current-1];
                a[current-1] = temp;
                current --;
            }
        }
    }

    public static void mergeSort(int[] a) {
        mergeSort(a, 0, a.length -1);
    }

    static void mergeSort(int[] a, int start, int end) {
        if(end <= start) { return; }
        int mid = (start + end) / 2;
        mergeSort(a, start, mid);
        mergeSort(a, mid +1, end);
        merge(a, start, mid, end);
    }

    private static void merge(int[] a, int start, int mid, int end) {
        int[] tmpAr = new int[end - start + 1];
        int leftSlot = start, rightSlot = mid+1, k=0;
        while(leftSlot <= mid && rightSlot <= end) {
            if(a[leftSlot] < a[rightSlot]) {
              tmpAr[k] = a[leftSlot];
              leftSlot = leftSlot+1;
            } else {
              tmpAr[k] = a[rightSlot];
              rightSlot = rightSlot +1;
            }
            k = k +1;
        }

        if(leftSlot <= mid) {
            while(leftSlot <= mid) {
                tmpAr[k] = a[leftSlot];
                leftSlot = leftSlot+1;
                k = k +1;
            }
        } else if(rightSlot <= end) {
            while(rightSlot <= end) {
                tmpAr[k] = a[rightSlot];
                rightSlot = rightSlot+1;
                k = k+1;
            }
        }

        for(int x=0; x <tmpAr.length; x++) {
            a[start + x] = tmpAr[x];
        }
    }

    public static void quickSort(int[] a) {
        quickSort(a, 0, a.length -1);
    }

    public static void quickSort(int[] a, int low, int high) {
        if(low < high) {
            int pp = partition(a, low, high);
            quickSort(a, low, pp -1);
            quickSort(a, pp+1, high);
        }
    }

    public static int partition(int[] a, int low, int high) {
        int _a, _b;
        int pivot = a[high];
        int small = low -1;
        for(int j = low; j <= high -1; j++) {
            if(a[j] <= pivot) {
                small = small +1;
                _a = a[small];
                _b = a[j];
                a[small] = _b;
                a[j] = _a;
            }
        }

        _a = a[small +1];
        _b = a[high];
        a[small +1] = _b;
        a[high] = _a;
        return small +1;
    }

    public static void  bubbleSort(int[] a) {
        int maxIndex = a.length - 1;
        for(int i =0; i < maxIndex; i++) {
            boolean swapped = false;
            for(int j = 0; j < maxIndex - i; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }


    public static void basicSort(int[] a) {
        for(int i =0; i < a.length; i++) {
            if (i == a.length - 1) { break; }
            if(a[i] < a[i + 1]) { continue; }
            int curr = a[i];
            int next = a[i+1];
            a[i] = next;
            a[i+1] = curr;
            basicSort(a);
        }
    }


}
