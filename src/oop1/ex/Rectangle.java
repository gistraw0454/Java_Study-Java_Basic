package oop1.ex;

public class Rectangle {
    int width;
    int height;

    int calculateArea(){
        return width*height;
    }

    int calulatePerimeter(){
        return width*2 + height*2;
    }

    boolean isSquare(){
        return width == height;
    }

}
