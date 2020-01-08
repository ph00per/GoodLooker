package com.phooper.goodlooker.ui.widgets.recyclerview.model

import com.example.delegateadapter.delegate.diff.IComparableItem
import com.phooper.goodlooker.models.Hyperlink

class ULItemViewModel(val text: String, val hyperlinks : List<Hyperlink>? = null) :
    IComparableItem {

    override fun id(): Any = text

    override fun content() = text
}