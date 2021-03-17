package com.example.progectandroid.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.progectandroid.R
import com.example.progectandroid.databinding.FragmentUpcomingEventsBinding


class upcoming_events : Fragment() {

    private  lateinit var mBinding: FragmentUpcomingEventsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentUpcomingEventsBinding.inflate(layoutInflater)
        return mBinding.root
    }

    override fun onResume() {
        super.onResume()

    }
}