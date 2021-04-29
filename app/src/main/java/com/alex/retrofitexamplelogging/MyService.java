package com.alex.retrofitexamplelogging;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface MyService {

    @POST("/v1/artists/6Ujb9g9pljLl91qELsPZYo?si=Dp5RzJWNQXGY2v74-Vkdrg&nd=1")
    Call<MyResponse> makeCall();

}
