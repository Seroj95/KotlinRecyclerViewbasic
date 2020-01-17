package com.example.myapplication;

public class RecyclerViewItem {
    private int imageView;
    private String texView1;
    private String textView2;

    public RecyclerViewItem(int imageView, String texView1, String textView2) {
        this.imageView = imageView;
        this.texView1 = texView1;
        this.textView2 = textView2;
    }

    public int getImageView() {
        return imageView;
    }

    public String getTexView1() {
        return texView1;
    }

    public String getTextView2() {
        return textView2;
    }
}
