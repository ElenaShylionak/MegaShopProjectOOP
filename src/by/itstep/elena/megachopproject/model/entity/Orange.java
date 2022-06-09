package by.itstep.elena.megachopproject.model.entity;

public class Orange {


    private int diameter; //поля (состояние)
    private int vitaminC;
    String name;

    public Orange() { //дефолтный конструктор. Должен быть всегда в entity классах

    }

    public Orange(int diameter, int vitaminC, double price) { //конструктор с параметрами, инициализировать состояние объекта
        //super(price);
        this.diameter = diameter;
        this.vitaminC = vitaminC;
    }
    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getVitaminC() {
        return vitaminC;
    }

    public void setVitaminC(int vitaminC) {
        this.vitaminC = vitaminC;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override                          //для предоставления ясной и достаточной информации об объекте (Object)
    public String toString() {         //toString() — в Java метод преобразует и возвращает строку
        return "Orange{" +
                "diameter=" + diameter +
                ", vitaminC=" + vitaminC +
                ", name='" + name + '\'' +
                '}';
    }



}
