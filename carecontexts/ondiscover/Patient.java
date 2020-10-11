
package in.vedprakash.sandbox.carecontexts.ondiscover;

import java.util.List;

public class Patient {

    private String referenceNumber;
    private String display;
    private List<CareContext> careContexts = null;
    private List<String> matchedBy = null;

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public List<CareContext> getCareContexts() {
        return careContexts;
    }

    public void setCareContexts(List<CareContext> careContexts) {
        this.careContexts = careContexts;
    }

    public List<String> getMatchedBy() {
        return matchedBy;
    }

    public void setMatchedBy(List<String> matchedBy) {
        this.matchedBy = matchedBy;
    }

}
