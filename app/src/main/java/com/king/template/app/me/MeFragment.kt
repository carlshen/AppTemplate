package com.king.template.app.me

import android.os.Bundle
import android.view.View
import androidx.databinding.ViewDataBinding
import com.king.template.BuildConfig
import com.king.template.R
import com.king.template.app.Constants
import com.king.template.app.about.AboutActivity
import com.king.template.app.base.BaseFragment
import kotlinx.android.synthetic.main.me_fragment.*
import kotlinx.android.synthetic.main.me_fragment.tvAppVersion

/**
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
class MeFragment : BaseFragment<MeViewModel,ViewDataBinding>(),View.OnClickListener {

    companion object{
        fun newInstance(): MeFragment{
            return MeFragment()
        }
    }

    override fun initData(savedInstanceState: Bundle?) {
        super.initData(savedInstanceState)

        updateUI()
        tvAppVersion.text = "V ${BuildConfig.VERSION_NAME}"

        //TODO 对应的菜单按钮
        tvMenu1.setOnClickListener(this)
        tvMenu2.setOnClickListener(this)
        tvMenu3.setOnClickListener(this)
        tvMenu4.setOnClickListener(this)
        btnAbout.setOnClickListener(this)
    }

    private fun updateUI(){
        //TODO 更新UI显示
        tvName.text = Constants.TAG
        tvUsername.text = "138****8888"
    }

    override fun getLayoutId(): Int {
        return R.layout.me_fragment
    }

    private fun clickAbout(){
        startActivity(AboutActivity::class.java)
    }

    override fun onClick(v: View){
        when(v.id){
            R.id.btnAbout -> clickAbout()
        }
    }
}