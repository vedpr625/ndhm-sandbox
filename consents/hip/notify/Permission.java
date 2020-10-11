
package in.vedprakash.sandbox.consents.hip.notify;


public class Permission {

    private String accessMode;
    private DateRange dateRange;
    private String dataEraseAt;
    private Frequency frequency;

    public String getAccessMode() {
        return accessMode;
    }

    public void setAccessMode(String accessMode) {
        this.accessMode = accessMode;
    }

    public DateRange getDateRange() {
        return dateRange;
    }

    public void setDateRange(DateRange dateRange) {
        this.dateRange = dateRange;
    }

    public String getDataEraseAt() {
        return dataEraseAt;
    }

    public void setDataEraseAt(String dataEraseAt) {
        this.dataEraseAt = dataEraseAt;
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }

}
