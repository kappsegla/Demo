package se.newton.martin.lsp;

public class Square extends Rectangle {

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        super.setWidth(height);//Bad code, violates LSP
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setHeight(width);//Bad code, violates LSP
    }
}
