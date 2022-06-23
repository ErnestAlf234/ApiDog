package com.example.apidog;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.apidog.client.RetrofitClient;
import com.example.apidog.databinding.ActivityMainBinding;
import com.example.apidog.entity.Message;
import com.example.apidog.service.RetrofitApiService;

import java.util.List;
import java.util.Random;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends Activity {

    private TextView mTextView;
    private Button mButton;
    private RetrofitApiService apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initValues();
        //getMessages(2);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                getMessage(random.nextInt(264));
            }
        });


    }
    private void initView(){
        mTextView=findViewById(R.id.messageTextView);
        mButton=findViewById(R.id.messageButtonView);
    }
    private void initValues(){
        apiService = RetrofitClient.getApiService();
    }
    private void getMessage(int id){
        apiService.getMessageId(id).enqueue(new Callback<Message>() {
            @Override
            public void onResponse(Call<Message> call, Response<Message> response) {
                Message message = response.body();
                mTextView.setText(message.toString());
            }

            @Override
            public void onFailure(Call<Message> call, Throwable t) {
                mTextView.setText(t.getMessage());

            }
        });

    }
    private void getMessages(int id){
        apiService.getMessagesUserId(id).enqueue(new Callback<List<Message>>() {
            @Override
            public void onResponse(Call<List<Message>> call, Response<List<Message>> response) {
                List<Message> messages = response.body();
                mTextView.setText("Objetos recuperados: " + messages.size());
            }

            @Override
            public void onFailure(Call<List<Message>> call, Throwable t) {
                mTextView.setText(t.getMessage());

            }
        });

    }
}