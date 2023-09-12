package POST_Req;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface MyApiService {

    @POST("oauth2/default/registration")
    Call<ResponseBody> postRequest(@Header("Accept") String acceptHeader, @Body Request_Body.Registration requestBody);
}
