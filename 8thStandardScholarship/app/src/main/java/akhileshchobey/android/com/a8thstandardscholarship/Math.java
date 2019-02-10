package akhileshchobey.android.com.a8thstandardscholarship;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Math extends AppCompatActivity {

    GridLayout chapterGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);

        chapterGrid = (GridLayout)findViewById(R.id.grid_chapters);

        setSingleEvent(chapterGrid);

    }

    private void setSingleEvent(GridLayout chapterGrid){
        for (int i = 0; i < chapterGrid.getChildCount(); i++){
            CardView chapter = (CardView) chapterGrid.getChildAt(i);
            final int finalI = i;
            chapter.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(Math.this, "Clicked at " + finalI, Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

}
