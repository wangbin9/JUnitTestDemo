package com.feicuiedu.junittestdemo.apiTest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Toast;

import com.feicuiedu.junittestdemo.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RetrofitPostActivity extends AppCompatActivity {

    @Bind(R.id.et_Username)
    EditText etUsername;
    @Bind(R.id.et_Passrword)
    EditText etPassrword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit_post);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_Register)
    public void onClick() {

        RetrofitClient.getInstance().getRetrofitApi().getUserRequest(new User(etUsername.getText().toString(), etPassrword.getText().toString())).enqueue(new Callback<UserResult>() {
            @Override
            public void onResponse(Call<UserResult> call, Response<UserResult> response) {

                Toast.makeText(RetrofitPostActivity.this, "响应成功", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<UserResult> call, Throwable t) {
                Toast.makeText(RetrofitPostActivity.this, "响应失败："+t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
