package util;

public enum PropertyUtil {
	
	EXCEPTION_BAD_REQUEST("exception.bad.request"),
	EXCEPTION_NO_CONTENT("exception.no.content"),	
	INTERNAL_SERVER_ERROR("exception.internal.error"),
	
	LOG_EXCEPTION_BAD_REQUEST("log.exception.bad.request"),
	LOG_EXCEPTION_NO_CONTENT("log.exception.no.content"),
	LOG_INTERNAL_SERVER_ERROR("log.internal.error");
	
    private String key;
    
    public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	private PropertyUtil(String key) {
    	this.key = key;
    }
}
