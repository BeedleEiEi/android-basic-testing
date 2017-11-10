package cc.somkiat.basicunittesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements NameValidation.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSaveClick(View view) {
        NameValidation v = new NameValidation();

        String vgg = v.validate("yyy");

        if(vgg.isEmpty()){
            success();
        }else {
            Faisfdddd(vgg);
        }

    }

    public void onRevertClick(View view) {
        //TODO
    }

    @Override
    public void displayEmpty(String em) {
        Faisfdddd(vgg);
    }


}
