package com.app.AuthenticationPanel;

public interface AuthCallback {
	void onTokenReceived(String token);
    void onError(Throwable t);
    void onNewBearer(String Bearertoken);

}
