package jp.s64.android.prototype.myechoapplication

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.Navigation

class InputFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.input_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val editText = view.findViewById<EditText>(R.id.editText)

        view.findViewById<Button>(R.id.button2).setOnClickListener {
            Navigation.findNavController(it).navigate(
                    R.id.action_flow_input_to_flow_result,
                    ResultFragmentArgs.Builder()
                            .setInput_text(editText.text.toString())
                            .build()
                            .toBundle()
            )
        }
    }

}
