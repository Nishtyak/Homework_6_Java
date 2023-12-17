public class Laptop {
    private String name;
    private String series;
    private Double diagonal;
    private String processor;
    private Double processorFrequency;
    private int cores;
    private int ram;
    private int rom;
    private String color;
    private String os;
    private String videoCard;

    public Laptop(String name,
                    String series,
                    Double diagonal,
                    String processor,
                    Double processorFrequency,
                    int cores,
                    int ram,
                    int rom,
                    String color,
                    String os,
                    String videoCard) {
        this.name = name;
        this.series = series;
        this.diagonal = diagonal;
        this.processor = processor;
        this.processorFrequency = processorFrequency;
        this.cores = cores;
        this.ram = ram;
        this.rom = rom;
        this.color = color;
        this.os = os;
        this.videoCard = videoCard;
    }

    public String getName() {
        return name;
    }

    public String getSeries() {
        return series;
    }

    private Double getProcessorFrequency() {
        return processorFrequency;
    }
    
    private int getCores() {
        return cores;
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

    @Override
    public String toString() {
        return name + " " +
                series + ", " +
                diagonal + "\", " +
                processor + " " +
                processorFrequency + "ГГц, " +
                cores + "-ядерный, " +
                "ОЗУ: " + ram + "Гб, " +
                "ПЗУ: " + rom + "Гб, " +
                color + ", " +
                os + ", " +
                videoCard + "\n";
    }
}
