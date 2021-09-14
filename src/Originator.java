public class Originator {
    private String state;

    public Memento storeStateToMemento(){
        return new Memento(state);
    }

    public void restoreStateFromMemento(Memento memento){
        state = memento.getState();
    }

    public String getState(){
        return this.state;
    }
    public void setState(String state){
        this.state = state;
    }
}
