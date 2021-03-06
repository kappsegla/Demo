package se.newton.martin.ovning3.shapes;

import se.newton.martin.ovning3.interfaces.IResizable;

public class ResizableEllipse extends Ellipse implements IResizable {
    public ResizableEllipse(double length, double width) {
        super(length, width);
    }

    @Override
    public void resize(int percent) {
        setLength( getLength() * percent * 0.01 );
        setWidth( getWidth() * percent * 0.01 );
    }
}
