public class Laptop {
    private String name;
    private String series;
    private Double diagonal;
    private String processor;
    private int ram;
    private int rom;
    private String color;
    private String os;
    private String videoCard;

    public Laptop(String name,
                    String series,
                    Double diagonal,
                    String processor,
                    int ram,
                    int rom,
                    String color,
                    String os,
                    String videoCard) {

    }

    public String getName() {
        return name;
    }

    public String getSeries() {
        return series;
    }

    public Double getDiagonal() {
        return diagonal;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    public int getRom() {
        return rom;
    }

    public String getColor() {
        return color;
    }

    public String getOs() {
        return os;
    }

    public String getVideoCard() {
        return videoCard;
    }
}
