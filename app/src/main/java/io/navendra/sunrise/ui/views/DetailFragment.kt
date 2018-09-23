package io.navendra.sunrise.ui.views

import com.airbnb.epoxy.EpoxyController
import com.airbnb.mvrx.BaseMvRxFragment
import com.airbnb.mvrx.fragmentViewModel
import com.airbnb.mvrx.withState
import io.navendra.sunrise.viewmodels.DetailViewModel


class DetailFragment : BaseSunriseFragment(){

    private val viewModel : DetailViewModel by fragmentViewModel(DetailViewModel::class)




    override fun invalidate() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

