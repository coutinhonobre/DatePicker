package dominando.android.datapicker

import android.app.DatePickerDialog
import android.app.DatePickerDialog.OnDateSetListener
import android.app.Dialog
import android.os.Bundle
import androidx.annotation.Nullable
import androidx.fragment.app.DialogFragment
import java.util.*


class DatePicker : DialogFragment() {

    override fun onCreateDialog(@Nullable savedInstanceState: Bundle?): Dialog {
        val mCalender: Calendar = Calendar.getInstance()
        val year: Int = mCalender.get(Calendar.YEAR)
        val month: Int = mCalender.get(Calendar.MONTH)
        val dayOfMonth: Int = mCalender.get(Calendar.DAY_OF_MONTH)
        val datePickerDialog = DatePickerDialog(
            requireActivity(),
            activity as OnDateSetListener?,
            year,
            month,
            dayOfMonth
        )
        datePickerDialog.datePicker.minDate = System.currentTimeMillis()
        return datePickerDialog
    }
}