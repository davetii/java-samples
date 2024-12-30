package software.daveturner.samples.algo;

import java.util.List;

public class BinarySearch {

    public static int search(List<Integer> ar, int target) {
        int left=0; int right=ar.size()-1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if(ar.get(mid) == target) { return mid; }
            if (ar.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }
        return -1;
    }

    public static int findFirstGreaterValue(List<Integer> ar, int target) {
        int left=0; int right=ar.size()-1;
        int boundaryIndex = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (ar.get(mid) <= target) {
                left = mid + 1;
            } else {
                boundaryIndex = mid;
                right = mid -1;
            }
        }
        return boundaryIndex;
    }

    public static int findFirstOccurence(List<Integer> ar, int target) {
        int left=0; int right=ar.size()-1;
        int boundaryIndex = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            System.out.println("mid="+mid + " target="+target + " boundaryIndex="+ boundaryIndex + " ar.get(mid):"+ar.get(mid));
            if (target > ar.get(mid)) {
                left = mid + 1;
            } else {
                if (target == ar.get(mid)) {
                    boundaryIndex = mid;
                } else if(boundaryIndex != -1) {
                    break;
                }
                right = mid -1;
            }
        }
        return boundaryIndex;
    }

    public static int findFirstBoolean(List<Boolean> ar, boolean b) {
        int left = 0, right = ar.size()-1;
        int boundaryIndex = -1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if (ar.get(mid) == b) {
                right = mid -1;
                boundaryIndex = mid;
            } else {
                left = mid + 1;
            }
        }
        return boundaryIndex;
    }

    public int findIndex(int[] list, int v) {
        int p=0, r = list.length -1;
        while (p <= r) {
            int q = (int)Math.floor((p + r) / 2);
            if (v < list[q]) { r = q-1; }
            else if (v > list[q]){ p = q+1; }
            else return q;
        }
        return -1;
    }

    public int findIndex(String[] list, String v) {
        int p=0, r = list.length -1;
        while (p <= r) {
            int q = (int)Math.floor((p + r) / 2);
            if (v.compareTo(list[q]) < 0) { r = q-1; }
            else if (v.compareTo(list[q]) > 0){ p = q+1; }
            else return q;
        }
        return -1;
    }
}
