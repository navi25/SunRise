package io.navendra.sunrise.viewmodels

import com.airbnb.mvrx.BaseMvRxViewModel
import com.airbnb.mvrx.MvRxState

/**
 * Base MvRx View Model class for SunRise App
 */
open class BaseSunriseViewModel(state: MvRxState, debugMode : Boolean) : BaseMvRxViewModel<MvRxState>(state, debugMode)