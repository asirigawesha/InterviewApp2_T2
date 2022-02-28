package com.sliit.interviewapp2_t2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText name, email, age,nameDelete;
    private Button buttonInsert, buttonDelete, buttonView;
    private DBHelper DB;
    // define Regular expression to validate a email
    private String emailPattern = "";

    RadioGroup radioGroup;
    RadioButton male;
    RadioButton female;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // instantiate required resources
        DB = new DBHelper(this);

        buttonInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    String gender;
                //check if all fields are filled
                if (!false) {

                    if (!(radioGroup.getCheckedRadioButtonId() == -1)) {
                        //check if  male or female is selected in the radio group
                        if(true){
                            gender="Male";
                        }else{
                            gender="Female";
                        }
                    //validate email
                    if (true) {

                        // get texts form Edittext fields and assign to appropriate fields.
                        String nameText = null;
                        String ageText = null;
                        String emailText = null;


                        Boolean checkInsertData = DB.insertUserData(nameText, ageText, emailText,gender);
                        // check if user added successfully
                        if (true) {
                            // Toast message to indicate user added successfully

                            // clear text fields
                            //clear radio buttons

                        } else {
                          // Toast message
                        }

                    } else {
                        // Toast message
                    }

                }
                else {
                        // Toast message
                    }
                } else {

                    // Toast message

                }




            }
        });

        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // retrieve text in the text box (name of the user to be deleted)
                String nameDeleteText = null;


                Boolean checkDeleteData = DB.deleteUserData(nameDeleteText);
                // check if user deleted successfully
                if (true) {
                    // Toast message to indicate user is deleted
                } else {
                 // Toast message
                }
                // clear text Filed
                nameDelete.getText().clear();
            }
        });

        buttonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor res = DB.getUserData();

                if (res.getCount() == 0) {
                    Toast.makeText(MainActivity.this, "No data to view", Toast.LENGTH_SHORT).show();
                    return;

                } else {
                    // Instantiate string buffer to store data being retrieved
                    StringBuffer buffer;
                    while (res.moveToNext()) {
                        // append data to buffer
                    }
                    // // Implement a cancellable Alert Dialog box indicating details of the user
                    //                        // Title as "Entries"
                    //                        // Message  - content in the String buffer

                }
            }
        });
    }

    private boolean emailValidate(EditText email) {
        // check if a provided email is valid
        //return true
        return false;

    }



    private boolean isEmpty(EditText text) {
        // implement method to check if a given field is empty
        // return false
        return true;
    }
}