package dominando.android.fragments.detail

import dominando.android.fragments.model.Hotel

interface HotelDetailsView {
    fun showHotelDetails(hotel: Hotel)
    fun errorHotelNotFound()
}