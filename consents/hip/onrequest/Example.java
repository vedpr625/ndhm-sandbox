
package in.vedprakash.sandbox.consents.hip.onrequest;


public class Example {

    private String requestId;
    private String timestamp;
    private HiRequest hiRequest;
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

    public HiRequest getHiRequest() {
        return hiRequest;
    }

    public void setHiRequest(HiRequest hiRequest) {
        this.hiRequest = hiRequest;
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
