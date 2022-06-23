package com.example.apidog.services;
import com.example.apidog.entitys.Messages;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RetrofitApiServices {
    @GET("players/{id}")
    Call<Messages> getMessagesIds(@Path("id") int id);
    @GET("players")
    Call<List<Messages>>getMessagesUsersIds(@Query("id") int id);

}
