package creo.com.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class scheduledetails extends AppCompatActivity {
    TextView place,time,date,amount;
    CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scheduledetails);

        place=(TextView)findViewById(R.id.trn);
        cardView=findViewById(R.id.carde);
        time=findViewById(R.id.trnn);
        date=findViewById(R.id.trnnn);
        amount=findViewById(R.id.amount);


        String s=getIntent().getStringExtra("name").toString();
        Log.d("mm","mm"+s);
        place.setText(s);
        String d=getIntent().getStringExtra("date");
        date.setText(d);
        String f=getIntent().getStringExtra("time");
        time.setText(f);
        String rate=getIntent().getStringExtra("rate");
        amount.setText("₹ "+rate);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(scheduledetails.this,AddPayment.class));
            }
        });
    }
}
