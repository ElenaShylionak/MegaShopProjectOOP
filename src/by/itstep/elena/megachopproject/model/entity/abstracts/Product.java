package by.itstep.elena.megachopproject.model.entity.abstracts;

public class Product {


    private double price; //поле

    public Product() { //деф конструктор
    }

    public Product(double price) { //с параметрами
        this.price = price;
    }

    public double getPrice() { //гетер
        return price;
    }

    public void setPrice(double price) { //сетер
        if (price > 0) {
            this.price = price;
        }
    }
    @Override
    public String toString() {
        return   "price=" + price;
    }
}
