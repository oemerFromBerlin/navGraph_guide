package com.example.togethernavgraph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.togethernavgraph.databinding.FragmentFragment1Binding
import com.example.togethernavgraph.databinding.FragmentFragment2Binding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [fragment1.newInstance] factory method to
 * create an instance of this fragment.
 */
class fragment1 : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    ////////// auch am 23.02.2023//////
    private var _binding : FragmentFragment1Binding? = null
    private val binding get() = _binding!!
    // unterstrich = coding convention


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }
////////// heute wird diese Funktion behandelt///// 23.02.2023//////
    // inflater = bedeutet "blästt/ baut den screen auf
    // saveInstanceState = sopeichert die ansicht
    // return = gibt die geladenen und gespeicherten inhalte wieder
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentFragment1Binding.inflate(inflater, container, false)
            val view = binding.root
                binding.textView.setOnClickListener{
                    Navigation.findNavController(view).navigate(R.id.navigate_to_fragment2)
            }
    return view
    }


    ////////// auch am 23.02.2023//////
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment fragment1.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            fragment1().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}