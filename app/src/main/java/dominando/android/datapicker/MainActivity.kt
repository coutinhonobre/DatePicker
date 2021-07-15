package dominando.android.datapicker

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.DateFormat
import java.util.*


class MainActivity : AppCompatActivity(), DatePickerDialog.OnDateSetListener {

    var tvDate: TextView? = null
    var btPickDate: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvDate = findViewById(R.id.tvDate)
        btPickDate = findViewById(R.id.btPickDate)
        btPickDate?.setOnClickListener{
            val mDatePickerDialogFragment = DatePicker()
            mDatePickerDialogFragment.show(supportFragmentManager, "DATE PICK")
        }
    }

    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
        val mCalender: Calendar = Calendar.getInstance()
        mCalender.set(Calendar.YEAR, year)
        mCalender.set(Calendar.MONTH, month)
        mCalender.set(Calendar.DAY_OF_MONTH, dayOfMonth)
        val selectedDate: String =
            DateFormat.getDateInstance(DateFormat.FULL).format(mCalender.getTime())

        tvDate?.setText(selectedDate)
    }
}