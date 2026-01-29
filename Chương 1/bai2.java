public class bai2{
    public static <E> void printArray(E[] array){
        for (E element : array){
            System.out.println(element);
        }
    }
    
    public static void main(String[] args){
        Integer[] intArray = {1,2,3,4,5};
        System.out.println("In mang Integer:");
        printArray(intArray);
        
        String[] strArray = {"Hello","World","Java","Generics"};
        System.out.println("\nIn mang String");
        printArray(strArray);
    }
}