package my.edu.tarc.lab21loancalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    private TextView textViewMonthlyRepayment, textViewStatus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        //Get Extra value
        //getIntent() method = asking "who called me?"
        Intent intent = getIntent();
        String status = intent.getStringExtra(MainActivity.LOAN_STATUS);

        //For numerical data, a default value must be provided
        double repayment = intent.getDoubleExtra(MainActivity.LOAN_REPAYMENT,0);

        textViewMonthlyRepayment.setText(getString(R.string.monthly_repayment)+ repayment);
        textViewStatus.setText(getString(R.string.status)+ status);
    }

    public void closeActivity(View view){
        finish();
    }
}
