package org.quietlip.rxpractice

import androidx.coordinatorlayout.widget.CoordinatorLayout
import io.reactivex.rxjava3.disposables.CompositeDisposable

object SimpleRx {
    var bag = CompositeDisposable()

    fun simpleValues(){
        println("~~~~~~simpleValues~~~~~~")
    }
}