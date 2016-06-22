package connection;

import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by krupal-pc on 6/21/2016.
 */

public interface ApiCall {
    @GET("/citiesJSON")
    Call<ResponseBody> getGeoNames(@QueryMap Map<String, String> options);
}
