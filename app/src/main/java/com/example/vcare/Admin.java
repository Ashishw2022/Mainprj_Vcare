package com.example.vcare;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;

public class Admin extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener  {
    private LinearLayout doc,user,appo,add;
    private DrawerLayout drawerLayout3;
    private NavigationView navigationView;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        drawerLayout3 = findViewById(R.id.addrawer_layout);
        NavigationView navigationView1 = findViewById(R.id.adnav_view);
        Toolbar toolbar2= findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        navigationView1.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout3, toolbar2, R.string.nav_drawer_open, R.string.nav_drawer_close);
        drawerLayout3.addDrawerListener(toggle);
        toggle.syncState();
        navigationView1.setNavigationItemSelectedListener(Admin.this);
        navigationView1.setCheckedItem(R.id.nav_home);
        doc=findViewById(R.id.doc);
        user=findViewById(R.id.user);
        appo=findViewById(R.id.app);
        add=findViewById(R.id.addoc);


        doc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Admin.this,Admin_Activity.class));
            }
        });
        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Admin.this,Useradmin_Activity.class));
            }
        });
        appo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Admin.this,Admin_Available_Appointments.class));
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Admin.this,Doctors_Add_Admin.class));
            }
        });


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_home:
                startActivity(new Intent(this, Admin.class));
                break;
            case R.id.appointment_doc:
                startActivity(new Intent(this, Admin_Available_Appointments.class));
                break;
            case R.id.payment_doc:
                //startActivity(new Intent(this, Admin_Payments.class));
                break;
            case R.id.chat:
                startActivity(new Intent(Admin.this, Admin_ChatDisplay.class));
                break;
            case R.id.Add_doc:
                startActivity(new Intent(Admin.this, Doctors_Add_Admin.class));
                break;
            case R.id.feedback_doc:
                startActivity(new Intent(Admin.this, Admin_FeedBack.class));
                break;
            case R.id.logout:
                Doctors_Session_Mangement doctors_session_mangement = new Doctors_Session_Mangement(Admin.this);
                doctors_session_mangement.removeSession();
                FirebaseAuth.getInstance().signOut();
                Intent intent1 = new Intent(Admin.this, Login.class);
                intent1.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent1);
                break;
        }
        drawerLayout3.closeDrawer(GravityCompat.START);
        return true;
    }
}