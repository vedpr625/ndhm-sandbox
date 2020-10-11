
package in.vedprakash.sandbox.consents.hip.onnotify;


public class Example {

    private String requestId;
    private String timestamp;
    private Acknowledgement acknowledgement;
    private Error error;
    private Resp resp;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Acknowledgement getAcknowledgement() {
        return acknowledgement;
    }

    public void setAcknowledgement(Acknowledgement acknowledgement) {
        this.acknowledgement = acknowledgement;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public Resp getResp() {
        return resp;
    }

    public void setResp(Resp resp) {
        this.resp = resp;
    }

}
