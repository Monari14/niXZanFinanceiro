package com.example.nixzan.Dashboard;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.nixzan.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // Configurar a BottomNavigationView
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        // Marcar o ícone de Dashboard como selecionado inicialmente
        bottomNavigationView.setSelectedItemId(R.id.nav_dashboard);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull android.view.MenuItem item) {
                int id = item.getItemId();

                if (id == R.id.nav_dashboard) {
                    // Se já estamos na tela de Dashboard, não faz nada
                    return true;
                } else if (id == R.id.nav_receitas) {
                    // Quando clicar em "Receitas", abre a tela de Receitas
                    startActivity(new Intent(DashboardActivity.this, ReceitasActivity.class));
                    return true;
                } else if (id == R.id.nav_despesas) {
                    // Quando clicar em "Despesas", abre a tela de Despesas
                    startActivity(new Intent(DashboardActivity.this, DespesasActivity.class));
                    return true;
                }
                return false;
            }
        });
    }
}
