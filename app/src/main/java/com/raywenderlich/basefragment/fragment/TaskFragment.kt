package com.raywenderlich.basefragment.fragment


import android.view.LayoutInflater
import android.view.ViewGroup
import com.raywenderlich.basefragment.R
import com.raywenderlich.basefragment.base.BaseFragment
import com.raywenderlich.basefragment.databinding.FragmentTaskBinding


class TaskFragment : BaseFragment<FragmentTaskBinding,TaskViewModel>
    (FragmentTaskBinding::inflate,TaskViewModel::class.java) {


    override fun start(inflater: LayoutInflater, viewGroup: ViewGroup?) {
        binding?.textView?.text = getString(R.string.SonOf)
    }


}