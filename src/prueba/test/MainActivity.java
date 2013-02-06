package prueba.test;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //asdasd
        setContentView(R.layout.main);
        TextView text1 = new TextView(this);
        text1.setText("caca World");
        setContentView(text1);
    }
}
