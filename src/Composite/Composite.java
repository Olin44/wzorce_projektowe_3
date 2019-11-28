package Composite;

public class Composite {
    public static void main(String[] args) {
        Graphic aPicture = new Picture();
        aPicture.add(new Line());
        aPicture.add(new Rectangle());
        Graphic aPicture2 = new Picture();
        aPicture2.add(new Text());
        aPicture2.add(new Line());
        aPicture2.add(new Rectangle());
        aPicture.add(aPicture2);
        aPicture.add(new Line());
        aPicture.draw();
    }


}
