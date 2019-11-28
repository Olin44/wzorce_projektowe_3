package Composite;

import java.util.ArrayList;

public abstract class GraphicImpl implements Graphic{
    ArrayList<Graphic> graphics = new ArrayList<Graphic>();
    public abstract void draw();

    @Override
    public void add(Graphic graphic){
        this.graphics.add(graphic);
    }

    @Override
    public void remove(Graphic graphic){
        this.graphics.remove(graphic);
    }

    @Override
    public Graphic getChild(int i){
        return this.graphics.get(i);
    }
}
