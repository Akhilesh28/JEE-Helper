package akhileshchobey.android.com.a8thstandardscholarship;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private CardView mathCard, itCard, englishCard, flashCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mathCard = (CardView) findViewById(R.id.math_card);
        itCard = (CardView) findViewById(R.id.it_card);
        englishCard = (CardView) findViewById(R.id.english_card);
        flashCard = (CardView) findViewById(R.id.flashcard_card);

        mathCard.setOnClickListener(this);
        itCard.setOnClickListener(this);
        englishCard.setOnClickListener(this);
        flashCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()){
            case R.id.math_card: i = new Intent(this, Math.class); startActivity(i);break;
            case R.id.it_card: i = new Intent(this, IntelligenceTest.class);startActivity(i);break;
            case R.id.english_card: i = new Intent(this, English.class);startActivity(i);break;
            case R.id.flashcard_card: i = new Intent(this, flashcard.class);startActivity(i);break;
            default: break;
        }
    }
}
