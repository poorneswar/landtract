/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prudvi
 */
public class LandTract {
    private double length;
    private double width;
    
    public double  getLength(){
    
    return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getwidth(){
    return width;
    }
    public void setwidth(double width){
    this.width = width;
            }
    public LandTract(double length,double width){
    super();
    this.length = length;
    this.width= width;
    }
    public double tractArea(double length,double width){
    double area = length*width;
    return area;
    }
    public boolean equals(LandTract Ltract1, LandTract Ltract2)
    {
    boolean b=false;
    if (Ltract1.getLength() ==Ltract2.getLength() && Ltract1.getwidth()==Ltract2.getwidth())
    {
    b=true;
    }
    else
    {
            b= false;
            }
    return b;
    }
    public String toString()
    {
    return "Length-"+length+"\nwidth-"+width+"\nArea-"+width*length;
    }
    
}
