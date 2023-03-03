package shiyan2;

import shiyan2.father.Pen;
import shiyan2.son.Black;
import shiyan2.son.SmallPen;

public class test {
    public static void main(String[] args) {
        Pen sp = new SmallPen();
        sp.setColor(new Black());
    }
}
