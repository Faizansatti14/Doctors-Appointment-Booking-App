package com.example.doctor_appointmentapp.Activity

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.doctor_appointmentapp.Adapter.TopDoctorAdapter
import com.example.doctor_appointmentapp.Adapter.TopDoctorAdapter2
import com.example.doctor_appointmentapp.R
import com.example.doctor_appointmentapp.ViewModel.MainViewModel
import com.example.doctor_appointmentapp.databinding.ActivityTopDoctorsBinding
import com.example.doctor_appointmentapp.databinding.ViewholderTopDoctor2Binding

class TopDoctorsActivity : BaseActivity() {
    private lateinit var binding: ActivityTopDoctorsBinding
    private val viewModel=MainViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityTopDoctorsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initTopDoctors()

    }

    private fun initTopDoctors() {
        binding.apply {
            progressBarTopDoctor.visibility = View.VISIBLE
            viewModel.doctors.observe(this@TopDoctorsActivity, Observer {
                viewTopDoctorList.layoutManager=
                    LinearLayoutManager(this@TopDoctorsActivity, LinearLayoutManager.VERTICAL,false)
                viewTopDoctorList.adapter= TopDoctorAdapter2(it)
                progressBarTopDoctor.visibility= View.GONE
            })

            viewModel.loadDoctors()

            backBtn.setOnClickListener{finish()}
        }
    }
}