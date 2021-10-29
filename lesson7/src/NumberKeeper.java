public class NumberKeeper<T extends Number> {
    private T number;

    public NumberKeeper(T value) {
        this.number = value;
    }

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }

    public Float getAsFloat() {
        return number.floatValue();
    }

    public Double getAsDouble() {
        return number.doubleValue();
    }

    public String getAsString() {
        return number.toString();
    }

    public Byte getAsByte() {
        return number.byteValue();
    }

    public Integer getAsInteger() {
        return number.intValue();
    }

    public Long getAsLong() {
        return number.longValue();
    }

    public Short getAsShort() {
        return number.shortValue();
    }
}
