package Request_Body;

import java.util.List;

public class Registration{
    private String application_type;
    private List<String> redirect_uris;
    private List<String> post_logout_redirect_uris;
    private String client_name;
    private String token_endpoint_auth_method;
    private List<String> contacts;
    private String scope;

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setPword(String pword) {
        this.pword = pword;
    }

    private String uname;
    private String pword;

    public String getApplication_type() {
        return application_type;
    }

    public void setApplication_type(String application_type) {
        this.application_type = application_type;
    }

    public List<String> getRedirect_uris() {
        return redirect_uris;
    }

    public void setRedirect_uris(List<String> redirect_uris) {
        this.redirect_uris = redirect_uris;
    }

    public List<String> getPost_logout_redirect_uris() {
        return post_logout_redirect_uris;
    }

    public void setPost_logout_redirect_uris(List<String> post_logout_redirect_uris) {
        this.post_logout_redirect_uris = post_logout_redirect_uris;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public String getToken_endpoint_auth_method() {
        return token_endpoint_auth_method;
    }

    public void setToken_endpoint_auth_method(String token_endpoint_auth_method) {
        this.token_endpoint_auth_method = token_endpoint_auth_method;
    }

    public List<String> getContacts() {
        return contacts;
    }

    public void setContacts(List<String> contacts) {
        this.contacts = contacts;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
}
