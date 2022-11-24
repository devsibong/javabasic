package javabasic;
//제네릭 예제
class Example<E> {
    private E element;

    void set(E element) {
        this.element = element;
    }

    E get() {
        return element;
    }

}
public class Ex02 {
    public static void main(String[] args) {
        
        Example<String> example1 = new Example<String>();
        Example<Integer> example2 = new Example<Integer>();

        example1.set("10");
        example2.set(10);

        System.out.println(example1.get());
        System.out.println(example2.get());
   
    }
}
