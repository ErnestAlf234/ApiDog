package com.example.apidog.service;
import com.example.apidog.entity.Message;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RetrofitApiService {
    @GET("breeds/{id}")
    Call<Message> getMessageId(@Path("id") int id);
    @GET("breeds")
    Call<List<Message>> getMessagesUserId(@Query("id") int id);
}
