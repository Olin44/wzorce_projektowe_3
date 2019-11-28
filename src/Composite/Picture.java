package Composite;

public class Picture extends GraphicImpl implements Graphic {
    @Override
    public void draw() {
        System.out.println("Start obrazka");
        for(Graphic graphic : graphics){
            graphic.draw();
        }
        System.out.println("Koniec obrazka");
    }

    @Override
    public void add(Graphic graphic) {
        super.add(graphic);
    }

    @Override
    public void remove(Graphic graphic) {
        super.remove(graphic);
    }

    @Override
    public Graphic getChild(int i) {
        return super.getChild(i);
    }
}
