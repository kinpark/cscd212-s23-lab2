package cscd212classes.lab2;

import java.util.Objects;

public class Television {
    private boolean fourK;
    private String make;
    private String model;
    private int resolution;
    private int screenSize;
    private boolean smart;

    public Television(final String model, final boolean smart, final int screenSize,  final int resolution, final String make) {
        this.make = make;
        this.model = model;
        this.resolution = resolution;
        this.screenSize = screenSize;
        this.smart = smart;
    }

    public Television(final String make, final String model, final boolean smart, final int screenSize, final int resolution) {
        this.make = make;
        this.model = model;
        this.smart = smart;
        this.screenSize = screenSize;
        this.resolution = resolution;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getResolution() {
        return this.resolution;
    }

    public int getScreenSize() {
        return this.screenSize;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) { return false; }
        Television that = (Television) o;
        return this.fourK == that.fourK && this.resolution == that.resolution && this.screenSize == that.screenSize && this.smart == that.smart && Objects.equals(this.make, that.make) && Objects.equals(this.model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.fourK, this.make, this.model, this.resolution, this.screenSize, this.smart);
    }

    @Override
    public String toString() {
        return "Television{" +
                "fourK=" + this.fourK +
                ", make='" + this.make + '\'' +
                ", model='" + this.model + '\'' +
                ", resolution=" + this.resolution +
                ", screenSize=" + this.screenSize +
                ", smart=" + this.smart +
                '}';
    }

    public int compareTo(final Television another)
    {
        if (this.make.compareTo(another.getMake()) > 0) {
            return 1;
        }
        else if (this.make.compareTo(another.getMake()) < 0) {
            return -1;
        }
        else if (this.model.compareTo(another.getModel()) > 0) {
            return 1;
        }
        else if (this.model.compareTo(another.getModel()) < 0) {
            return -1;
        }
        else if (this.screenSize > another.getScreenSize()) {
            return 1;
        }
        else if (this.screenSize < another.getScreenSize()) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
