package com.example.tabmenukotlin.fracgment

import android.os.Bundle
import android.text.InputType
import android.text.TextUtils
import android.text.method.DigitsKeyListener
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.tabmenukotlin.R
import kotlinx.android.synthetic.main.fragment_fragment1.*
import kotlinx.android.synthetic.main.fragment_fragment1.view.*

class fragment1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        /** Inflate the layout for this fragment*/
        val fragone = inflater.inflate(R.layout.fragment_fragment1, container, false)

           fragone.spinner1.onItemSelectedListener = object  :AdapterView.OnItemSelectedListener{
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long)
                {
                    /**set veluse*/
                    when(position){

                        0->{
                            covertbt1.setOnClickListener {

//                              Toast.makeText(requireContext(),"haello",Toast.LENGTH_SHORT).show()
                                if (isVisible){
                                errormasge.visibility = View.VISIBLE}else{View.INVISIBLE }
                                TextUtils.isEmpty(enterdata1.setError("ples select corect mesurment").toString())
                            }

                        }
                        1-> {
                            covertbt1.setOnClickListener {
                            val emtycheck = enterdata1.text.toString()
                            if (emtycheck.isNullOrEmpty() || "," in emtycheck || "-" in emtycheck || " " in emtycheck)
                            {
                                TextUtils.isEmpty(enterdata1.setError("plese enter veluse").toString())
                            } else {
                                val custemerdata: Double = enterdata1.text.toString().toDouble()
                                val hector = custemerdata * 2.47
                                acerview2.text = "  $hector "
                            }
                        }

                        }
                        2-> {
                            covertbt1.setOnClickListener {
                                val emtycheck = enterdata1.text.toString()
                                if (emtycheck.isNullOrEmpty() || "," in emtycheck||"-" in emtycheck||" " in emtycheck)

                                {
                                    TextUtils.isEmpty(enterdata1.setError("plese enter veluse").toString())
                                }
                                else {

                                    val custemerdata:Double= enterdata1.text.toString().toDouble()
                                    val hector =  custemerdata * 2.47
                                    acerview2.text = "  $hector "
                                }

                            }
                        }
                        3-> {
                            covertbt1.setOnClickListener {
                                val emtycheck = enterdata1.text.toString()
                                if (emtycheck.isNullOrEmpty() || "," in emtycheck||"-" in emtycheck||" " in emtycheck)

                                {
                                    TextUtils.isEmpty(enterdata1.setError("plese enter veluse").toString())
                                }
                                else {

                                    val custemerdata:Double= enterdata1.text.toString().toDouble()
                                    val hector =  custemerdata * 2.47
                                    acerview2.text = "  $hector "
                                }

                            }
                        }
                        4->{
                            covertbt1.setOnClickListener {
                                val emtycheck = enterdata1.text.toString()
                                if (emtycheck.isNullOrEmpty() || "," in emtycheck||"-" in emtycheck||" " in emtycheck)

                                {
                                    TextUtils.isEmpty(enterdata1.setError("plese enter veluse").toString())
                                }
                                else {

                                    val custemerdata:Double= enterdata1.text.toString().toDouble()
                                    val hector =  custemerdata * 2.47
                                    acerview2.text = "  $hector "
                                }

                            }

                        }
                        5->{
                            covertbt1.setOnClickListener {
                                val emtycheck = enterdata1.text.toString()
                                if (emtycheck.isNullOrEmpty() || "," in emtycheck||"-" in emtycheck||" " in emtycheck)

                                {
                                    TextUtils.isEmpty(enterdata1.setError("plese enter veluse").toString())
                                }
                                else {

                                    val custemerdata:Double= enterdata1.text.toString().toDouble()
                                    val hector =  custemerdata * 2.47
                                    acerview2.text = "  $hector "
                                }

                            }

                        }
                        6->{
                            covertbt1.setOnClickListener {
                                val emtycheck = enterdata1.text.toString()
                                if (emtycheck.isNullOrEmpty() || "," in emtycheck||"-" in emtycheck||" " in emtycheck)

                                {
                                    TextUtils.isEmpty(enterdata1.setError("plese enter veluse").toString())
                                }
                                else {

                                    val custemerdata:Double= enterdata1.text.toString().toDouble()
                                    val hector =  custemerdata * 2.47
                                    acerview2.text = "  $hector "
                                }

                            }

                        }
                    }

//                   Toast.makeText(requireContext(),"select${parent?.getItemAtPosition(position).toString()}",Toast.LENGTH_SHORT).show()

                }

                override fun onNothingSelected(parent: AdapterView<*>?) {

                }

            }

        return fragone
    }
}
