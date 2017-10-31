package my.edu.tarc.lab21loancalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String LOAN_STATUS = "status";
    public static final String LOAN_REPAYMENT = "repayment";

    private EditText editTextPrice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateRepayment(View view){
        Intent intent = new Intent(this, ResultActivity.class);
        //putExtra has two para (Tag, Value)

        double repayment=0;
        intent.putExtra(LOAN_STATUS, "Approve");
        intent.putExtra(LOAN_REPAYMENT, repayment);
        startActivity(intent);
    }
}
