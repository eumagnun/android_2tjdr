package br.com.danielamaral.jogo_do_milhao;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.OnReceiveContentListener
import android.view.View;
import android.view.ViewGroup;
import androidx.navigation.findNavController

import br.com.danielamaral.jogo_do_milhao.databinding.FragmentHomeBinding;


class HomeFragment: Fragment() {

    @Override
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val binding:FragmentHomeBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_home, container, false)

        binding.btJogar.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_homeFragment_to_jogoFragment)
        }

        return binding.root
    }

}