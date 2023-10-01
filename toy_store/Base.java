public class Base {
    public static void main(String[] args) {
        ToyStore store = new ToyStore();

        // добавить игрушки
        store.addToy(1, "Toy 1", 10, 20);
        store.addToy(2, "Toy 2", 5, 10);
        store.addToy(3, "Toy 3", 20, 70);

        // установить вес
        store.setToyWeight(2, 30);

        // игра
        store.play();

        // получить выигрыш
        try {
            store.getPrizeToy();
        } catch (ArithmeticException e) {
            System.out.println("ошибка");
        }
    
    }
}
 