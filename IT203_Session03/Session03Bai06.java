public class Session03Bai06 {

    public static int[] mergeBooks(int[] a, int[] b) {
        int[] temp = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                temp[k++] = a[i++];
            } else if (a[i] > b[j]) {
                temp[k++] = b[j++];
            } else {
                temp[k++] = a[i];
                i++;
                j++;
            }
        }
        
        while (i < a.length) {
            temp[k++] = a[i++];
        }
        while (j < b.length) {
            temp[k++] = b[j++];
        }
        int[] result = new int[k];
        for (int x = 0; x < k; x++) {
            result[x] = temp[x];
        }
        return result;
    }

    public static void display(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] khoCu = {1, 3, 5, 7, 9};
        int[] loMoi = {2, 3, 5, 6, 8, 9, 10};
        System.out.print("Kho cu: ");
        display(khoCu);
        System.out.print("Lo moi: ");
        display(loMoi);
        int[] khoTong = mergeBooks(khoCu, loMoi);
        System.out.print("Kho tong (da gop & loc trung): ");
        display(khoTong);
    }
}
