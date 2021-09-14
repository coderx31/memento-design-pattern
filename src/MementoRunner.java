public class MementoRunner {
    public static void main(String[] args) {
        System.out.println("--------Memento Design Pattern-------");
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();

        originator.setState("1 State");
        careTaker.addToMemento(originator.storeStateToMemento());

        originator.setState("2 State");
        originator.setState("3 State");

        careTaker.addToMemento(originator.storeStateToMemento());

        originator.setState("Final State");
        careTaker.addToMemento(originator.storeStateToMemento());

        originator.restoreStateFromMemento(careTaker.getFromMemento(0));
        System.out.println("1st saved state is "+ originator.getState());

        originator.restoreStateFromMemento(careTaker.getFromMemento(1));
        System.out.println("2st saved state is "+ originator.getState());
    }
}
