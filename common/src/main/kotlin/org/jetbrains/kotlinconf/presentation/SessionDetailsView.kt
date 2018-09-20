package org.jetbrains.kotlinconf.presentation

import org.jetbrains.kotlinconf.*
import org.jetbrains.kotlinconf.data.*

interface SessionDetailsView : BaseView {
    fun updateView(loggedIn: Boolean, isFavorite: Boolean, session: SessionModel)
    fun setupRatingButtons(rating: SessionRating?)
    fun setRatingClickable(clickable: Boolean)
}