public enum Size {
    // 1.Написать enum Size который создержит 4 размера: SMALL, MEDIUM, LARGE и EXTRA_LARGE
    SMALL("S",12,13), MEDIUM("M",16,17)
    , LARGE("L",21,22), EXTRA_LARGE("XL",32,34);
//    Size должен содержать конструктор принимающий 3 параметра: сокращенное название (S, M, XL etc.), числовое значение ширены, и длины.
   private String shortName;
   private int width,length;
//    Для каждого значения написать геттер


    public String getShortName() {
        return shortName;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    Size(String shortName, int weight, int length) {
        this.shortName = shortName;
        this.width = weight;
        this.length = length;
    }

//    @Override
//    public String toString() {
//        return this.shortName+" or "+name()+" size: width="+this.width+", length="+this.length+" .";
//    }
//    Переопределить метод toString() должен выводить например "S" or "SMALL" size: width=11 , length=40 .

}