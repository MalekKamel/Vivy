package com.vivy.app.shared.ui.dialog.confirmdialog

import com.vivy.app.R
import com.vivy.app.shared.ui.defaultimpl.DefaultViewModel
import com.vivy.app.shared.ui.frag.BaseDialogFrag
import kotlinx.android.synthetic.main.frag_dialog_confirm.*

class ConfirmDialog : BaseDialogFrag<DefaultViewModel>() {

    private var callback: ((Boolean) -> Unit)? = null
    private var message: String? = null

    override var layoutId: Int = R.layout.frag_dialog_confirm

    override fun setupUi() {
        btn_confirm.setOnClickListener {
            if (callback != null)
                callback!!.invoke(true)
            dismiss()
        }

        btn_dismiss.setOnClickListener {
            if (callback != null)
                callback!!.invoke(false)
            dismiss()
        }
    }

    override fun doOnViewCreated() {
        tv_message!!.text = message
    }

    companion object {

        fun newInstance(message: String, callback: (Boolean) -> Unit): ConfirmDialog {
            val fragment = ConfirmDialog()
            fragment.message = message
            fragment.callback = callback
            return fragment
        }
    }
}
