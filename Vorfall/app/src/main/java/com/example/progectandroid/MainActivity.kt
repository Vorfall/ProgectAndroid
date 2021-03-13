package com.example.progectandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.view.LayoutInflater
import androidx.appcompat.widget.Toolbar
import com.example.progectandroid.databinding.ActivityMainBinding
import com.mikepenz.materialdrawer.AccountHeader
import com.mikepenz.materialdrawer.AccountHeaderBuilder
import com.mikepenz.materialdrawer.Drawer
import com.mikepenz.materialdrawer.DrawerBuilder
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem
import com.mikepenz.materialdrawer.model.ProfileDrawerItem
import java.sql.Driver

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding
    private lateinit var mDrawer: Drawer
    private lateinit var mHeader: AccountHeader
    private lateinit var mToolbar: Toolbar


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
    }

    override fun onStart() {
        super.onStart()
       initFields()
        initFunc()


    }

    private fun initFunc() {
      //  setSupportActionBar(mToolbar)
        creatHeader()
        createDrawer()
    }

    private fun createDrawer() {
       mDrawer = DrawerBuilder()
           .withActivity(this)
           .withToolbar(mToolbar)
           .withActionBarDrawerToggle(true)
           .withSelectedItem(-1)
           .withAccountHeader(mHeader)
           .addDrawerItems(
               PrimaryDrawerItem().withIdentifier(100)
                   .withIconTintingEnabled(true)
                   .withName("Create group")
                   .withSelectable(false)
           ).build()
    }

    private fun creatHeader() {
        mHeader=AccountHeaderBuilder()
            .withActivity(this)
            .withHeaderBackground(R.drawable.header)
            .addProfiles(
                ProfileDrawerItem().withName("Egor")
                    .withEmail("egor@gmail.com")
            ).build()


    }

    private fun initFields() {
        mToolbar = mBinding.mainToolBar

    }
}