package androidstudio.extractstringtrailudemy;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String message =getString(R.string.message);
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
