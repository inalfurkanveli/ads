package BenimAlistirmalar;

public class C05_arrayAlistirma5 {
    public static void main(String[] args) {
        int arr[]={1,232,2323,1,2,2,2,3,3,4,4,5,6};

        int searchNumber= 12345;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==searchNumber){
                System.out.println("Array is has search number.");
                break;
            }else System.out.println("Array is has not search number.");
            break;

        }


        }
    }

