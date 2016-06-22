package connection;

import retrofit2.Retrofit;

/**
 * Created by krupal-pc on 6/21/2016.
 */

public class ApiService {
    public static ApiCall mApiCall;

    public static ApiCall getInstance() {
        if (mApiCall == null) {

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("http://api.geonames.org/")
                    .build();
            mApiCall = retrofit.create(ApiCall.class);
        }
        return mApiCall;
    }
}
