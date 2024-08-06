package com.example.lap61;

class Cake {
    private String name;
    private String des;
    private int image;

    public Cake() {
    }

    public Cake(String name,String des,int image) {
        this.des = des;
        this.image = image;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
