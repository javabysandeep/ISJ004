package collectionFramework.introduction;

public class CustomArrayListTest {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(60);
        arrayList.add(80);
        arrayList.add(800);
        arrayList.add(900);
        arrayList.add(1000);
        arrayList.add(10000);
        System.out.println("Size of container "+arrayList.size);
        System.out.println("Capacity of container "+arrayList.capacity);


        for (Object obj:arrayList.values) {
            System.out.println(obj);
        }
    }
}
