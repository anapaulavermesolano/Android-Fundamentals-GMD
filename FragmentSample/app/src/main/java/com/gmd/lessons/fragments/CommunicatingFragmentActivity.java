package com.gmd.lessons.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gmd.lessons.fragments.listeners.OnMessageListener;
import com.gmd.lessons.fragments.views.AddMessageFragment;
import com.gmd.lessons.fragments.views.MessagesFragment;

public class CommunicatingFragmentActivity extends AppCompatActivity implements OnMessageListener{

    private AddMessageFragment addMessageFragment;
    private MessagesFragment messagesFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_communicating_fragment);
        ui();
    }

    private void ui() {
        addMessageFragment= (AddMessageFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentAddMessage);
        messagesFragment= (MessagesFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentMessages);
    }

    @Override
    public void recibiryEnviardesdeFragment(String message) {
        messagesFragment.mostrarMensaje(message);
    }
}
