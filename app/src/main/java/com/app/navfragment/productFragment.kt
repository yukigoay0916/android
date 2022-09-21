package com.app.navfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.navfragment.databinding.FragmentProductBinding


/**
 * A simple [Fragment] subclass.
 * Use the [productFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class productFragment : Fragment() {
    private var _binding: FragmentProductBinding?=null
    private val binding get()=_binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProductBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return  root;
    }
}