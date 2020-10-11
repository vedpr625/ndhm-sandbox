
package in.vedprakash.sandbox.consents.onfetch;


public class Consent {

    private String status;
    private ConsentDetail consentDetail;
    private String signature;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
