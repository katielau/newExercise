package tests;

import android.test.ActivityInstrumentationTestCase2;
import android.test.UiThreadTest;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.katie1.exercisenew2.MainActivity;
import com.example.katie1.exercisenew2.R;

/**
 * Created by Katie1 on 4/19/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;


    public JUnit_test(){
        super(MainActivity.class);
    }


    @UiThreadTest
    public void test_first() {

        mainActivity = getActivity();

        TextView textView = (TextView) mainActivity.findViewById(R.id.textView);
        EditText num1 = (EditText) mainActivity.findViewById(R.id.num1);
        EditText num2 = (EditText) mainActivity.findViewById(R.id.num2);
        Button button = (Button) mainActivity.findViewById(R.id.button);

        num1.setText("1");
        num2.setText("2");

        button.performClick();


        String tester = textView.getText().toString();
        assertEquals("3.0", tester);
    }
}
