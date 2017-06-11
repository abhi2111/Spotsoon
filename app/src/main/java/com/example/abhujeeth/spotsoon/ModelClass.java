package com.example.abhujeeth.spotsoon;

/**
 * Created by abhujeeth on 6/10/17.
 */

public class ModelClass {
   private String text_one,text_two,text_three;
    private int image_one,image_two;

    public ModelClass(String text_one,String text_two,String text_three,int image_one,int image_two)
    {
        this.text_one=text_one;
        this.text_two=text_two;
        this.text_three=text_three;
        this.image_one=image_one;
        this.image_two=image_two;
    }

    public String getText_one()
    {
        return text_one;
    }

    public String getText_two()
    {
        return text_two;
    }

    public String getText_three()
    {
        return text_three;
    }

    public  int getImage_one()
    {
        return image_one;
    }

    public int getImage_two() {
        return image_two;
    }
}
