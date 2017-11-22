package com.simcoder.tinder.Chat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.firebase.auth.FirebaseAuth;
import com.simcoder.tinder.Matches.MatchesActivity;
import com.simcoder.tinder.Matches.MatchesAdapter;
import com.simcoder.tinder.Matches.MatchesObject;
import com.simcoder.tinder.R;

import java.util.ArrayList;
import java.util.List;

public class ChatActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mChatAdapter;
    private RecyclerView.LayoutManager mChatLayoutManager;

    private String cusrrentUserID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        cusrrentUserID = FirebaseAuth.getInstance().getCurrentUser().getUid();

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setNestedScrollingEnabled(false);
        mRecyclerView.setHasFixedSize(true);
        mChatLayoutManager = new LinearLayoutManager(ChatActivity.this);
        mRecyclerView.setLayoutManager(mChatLayoutManager);
        mChatAdapter = new ChatAdapter(getDataSetChat(), ChatActivity.this);
        mRecyclerView.setAdapter(mChatAdapter);
    }

    private ArrayList<ChatObject> resultsChat = new ArrayList<ChatObject>();
    private List<ChatObject> getDataSetChat() {
        return resultsChat;
    }
}
