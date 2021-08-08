package builder;

public class Laptop {
	public static class Builder {
        private String graphicsCard;
        private String secondaryMemory;
        private String processor;
        private String ram;

        public Builder() {
        }

        public Laptop build() {
            return new Laptop(this);
        }

        public Builder graphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder secondaryMemory(String secondaryMemory) {
            this.secondaryMemory = secondaryMemory;
            return this;
        }

        public Builder processor(String processor) {
            this.processor = processor;
            return this;
        }

        public Builder ram(String ram) {
            this.ram = ram;
            return this;
        }

    }

    private String graphicsCard;
    private String secondaryMemory;
    private String processor;
    private String ram;

    private Laptop(Builder builder) {
        this.graphicsCard = builder.graphicsCard;
        this.secondaryMemory = builder.secondaryMemory;
        this.processor = builder.processor;
        this.ram = builder.ram;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public String getSecondaryMemory() {
        return secondaryMemory;
    }

    public String getProcessor() {
        return processor;
    }

    public String getRam() {
        return ram;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Laptop{");
        sb.append("graphicsCard='").append(graphicsCard).append('\'');
        sb.append(", secondaryMemory='").append(secondaryMemory).append('\'');
        sb.append(", processor='").append(processor).append('\'');
        sb.append(", ram='").append(ram).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
