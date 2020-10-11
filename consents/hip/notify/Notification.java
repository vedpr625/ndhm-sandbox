
package in.vedprakash.sandbox.consents.hip.notify;


public class Notification {

    private String status;
    private String consentId;
    private ConsentDetail consentDetail;
    private String signature;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getConsentId() {
        return consentId;
    }

    public void setConsentId(String consentId) {
        this.consentId = consentId;
    }

    public ConsentDetail getConsentDetail() {
        return consentDetail;
    }

    public void setConsentDetail(ConsentDetail consentDetail) {
        this.consentDetail = consentDetail;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

}
