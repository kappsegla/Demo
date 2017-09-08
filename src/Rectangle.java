import java.awt.*;

public class Rectangle{
    private Color _color;
    private int _width;
    private int _height;

    public Rectangle(int width, int height, Color color) {
        _width = width;
        _height = height;
        _color = color;
    }

    public int getWidth() {
        return _width;
    }

    public void setWidth(int value) {
        //include validation when needed
        _width = value;
    }

    public int calculateArea() {
        return _width * _height;
    }

}
