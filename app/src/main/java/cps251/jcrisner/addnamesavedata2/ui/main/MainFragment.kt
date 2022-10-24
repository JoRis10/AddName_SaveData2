package cps251.jcrisner.addnamesavedata2.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import cps251.jcrisner.addnamesavedata2.databinding.FragmentMainBinding
import cps251.jcrisner.addnamesavedata2.R
import androidx.databinding.DataBindingUtil
import cps251.jcrisner.addnamesavedata2.BR.mainViewModel

class MainFragment : Fragment() {

    private lateinit var viewModel: MainViewModel
    lateinit var binding: FragmentMainBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        super.onCreateView(inflater, container, savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false)
        binding.setLifecycleOwner(this)
        binding.setVariable(mainViewModel,viewModel)
        return binding.root
    }

}