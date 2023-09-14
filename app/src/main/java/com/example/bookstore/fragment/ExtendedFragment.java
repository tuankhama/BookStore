package com.example.bookstore.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.bookstore.LoginActivity;
import com.example.bookstore.R;
import com.example.bookstore.RegisterActivity;
import com.example.bookstore.databinding.FragmentExtendedBinding;
import com.example.bookstore.databinding.ShowProfileBinding;

public class ExtendedFragment extends Fragment {

    FragmentExtendedBinding binding;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ExtendedFragment() {
        // Required empty public constructor
    }





    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ExtendedFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ExtendedFragment newInstance(String param1, String param2) {
        ExtendedFragment fragment = new ExtendedFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);


        }

//        binding.ShowProFile.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //startActivity(new Intent(getActivity(),Show_Profile.class));
//                //getActivity().finish();
//                //getActivity();
//                Intent i= new Intent(ExtendedFragment.this.getActivity(),Show_Profile.class);
//                startActivity(i);
//            }
//        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_extended, container, false);
        binding = FragmentExtendedBinding.inflate(inflater,container,false);

        binding.ShowProFile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        return binding.getRoot();
    }
}
