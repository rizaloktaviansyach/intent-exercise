package id.ac.polinema.intentexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;

import id.ac.polinema.intentexercise.model.User;

public class ProfileActivity extends AppCompatActivity {
    private TextView about;
    private TextView fullname;
    private TextView email;
    private TextView homepage;
    private ImageView avatarImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        about = findViewById(R.id.label_about);
        fullname = findViewById(R.id.label_fullname);
        email = findViewById(R.id.label_email);
        homepage = findViewById(R.id.label_homepage);
        avatarImage = findViewById(R.id.image_profile);

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            User user = extras.getParcelable(RegisterActivity.USER_KEY);
            String avatarurl =extras.getString(RegisterActivity.AVATAR_URL);
            about.setText(user.getAbout());
            fullname.setText(user.getFullname());
            email.setText(user.getEmail());
            homepage.setText(user.getHomepage());

            Bitmap bitmap;
            try{
                bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), Uri.parse(avatarurl));
                avatarImage.setImageBitmap(bitmap);
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
