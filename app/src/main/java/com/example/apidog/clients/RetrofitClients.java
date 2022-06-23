package com.example.apidog.clients;
import com.example.apidog.services.RetrofitApiServices;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClients {
    public static final String URL_BASES="https://www.balldontlie.io/api/v1/";
    public static Retrofit retrofits;

    public static RetrofitApiServices getApiServices(){
        if(retrofits ==null){
            retrofits = new Retrofit.Builder()
                    .baseUrl(URL_BASES)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofits.create(RetrofitApiServices.class);
    }
}
