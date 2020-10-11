package in.vedprakash.sandbox.consents.fetch;

public class ConsentFetch {
	private String requestId;
	private   String timestamp;
	 private  String consentId;
	public ConsentFetch(String requestId, String timestamp, String consentId) {
		this.requestId = requestId;
		this.timestamp = timestamp;
		this.consentId = consentId;
	}
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
	public String getConsentId() {
		return consentId;
	}
	public void setConsentId(String consentId) {
		this.consentId = consentId;
	}
	 
	 
}
