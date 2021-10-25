/*
Write a class named Rectangle to represent a rectangle. It contains following
members:
Data: width (double) and height (double) that specify the width and height of the rectangle.
Method:
1) A no-arg constructor that creates a default rectangle.
2) A constructor that creates a rectangle with the specified width and height.
3) A method named getArea() that returns the area of this rectangle.
4) A method named getPerimeter() that returns the perimeter
*/
package rushabh.practicesession;
public class Rectangle_constructor 
{
    double height,width;
 
 Rectangle_constructor()
 {
 height=23.5;
 width=10.5;
 }
 double getArea()
 {
  return height*width;
 }
 
 double getPerimeter()
 {
  return 2*(height+width);
 }

}