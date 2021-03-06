/*
 * Copyright (C) 2019 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.spacedimvisuel.screens.win

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import com.example.spacedimvisuel.R
import com.example.spacedimvisuel.databinding.WinFragmentBinding
import com.example.spacedimvisuel.screens.lose.LoseFragmentDirections


/**
 * Fragment where the game is played
 */
class WinFragment : Fragment() {


    private lateinit var binding: WinFragmentBinding


    private lateinit var viewModel: WinViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate view and obtain an instance of the binding class
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.win_fragment,
            container,
            false
        )
        binding.neumorphButton.setOnClickListener { nextScreen() }
        return binding.root

    }

    private fun nextScreen() {
        val action = WinFragmentDirections.actionWinDestinationToLoginDestination()
        NavHostFragment.findNavController(this).navigate(action)
    }
}