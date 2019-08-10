package com.vivy.app.ui.search.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import com.vivy.app.BuildConfig
import com.vivy.app.R
import com.vivy.app.shared.data.model.Doctor
import com.vivy.app.shared.ui.adapter.BasePagedListAdapter
import com.vivy.app.shared.ui.adapter.BaseViewHolder
import com.vivy.app.shared.ui.view.BaseView
import com.vivy.app.shared.util.app.MyApp
import com.vivy.app.shared.util.picasso.PicassoUtil
import kotlinx.android.synthetic.main.item_doctor.view.*


/**
 * Created by Sha on 4/20/17.
 */

class DoctorsAdapter(baseView: BaseView) : BasePagedListAdapter<Doctor>(
        baseView,
        object : DiffUtil.ItemCallback<Doctor>() {
            override fun areItemsTheSame(oldItem: Doctor, newItem: Doctor): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: Doctor, newItem: Doctor): Boolean {
                return oldItem == newItem
            }
        }) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<Doctor> {
        return Vh(parent)
    }

    inner class Vh internal constructor(viewGroup: ViewGroup)
        : BaseViewHolder<Doctor>(viewGroup, R.layout.item_doctor) {

        override fun bindView(item: Doctor) {
            itemView.tvName.text = item.name
            itemView.tvAddress.text = item.address
            showAvatar(item)
        }

        private fun showAvatar(item: Doctor) {
            PicassoUtil.round(
                    iv =itemView.iAvatar,
                    url = "${BuildConfig.API_BASE_URL}doctors/${item.id}/keys/profilepictures",
                    placeholder = MyApp.context.getDrawable(R.drawable.bg_person_placeholder)
            )

        }

    }
}
