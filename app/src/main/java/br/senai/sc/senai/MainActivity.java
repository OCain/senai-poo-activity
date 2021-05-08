package br.senai.sc.senai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBtnMostrar(View v) {
        List<EditText> editTexts = getTextFields();
        Editable textoDoisCampos = null;
        for (EditText editText : editTexts) {
            if (textoDoisCampos == null) {
                textoDoisCampos = editText.getText();
            } else {
                textoDoisCampos.append(editText.getText());
            }
        }
        Toast.makeText(MainActivity.this, textoDoisCampos, Toast.LENGTH_LONG).show();
    }

    public void onClickBtnLimpar(View v) {
        List<EditText> editTexts = getTextFields();
        for (EditText editText : editTexts) {
            editText.setText("");
        }
    }

    private List<EditText> getTextFields() {
        EditText editText = findViewById(R.id.et_texto);
        EditText editText2 = findViewById(R.id.et_texto2);
        return Arrays.asList(editText, editText2);
    }
}