package dominando.android.fragments.detail

import dominando.android.fragments.repository.HotelRepository

class HotelDetailsPresenter(private val view: HotelDetailsView, private val repository: HotelRepository) {
    fun loadHotelDetails(id: Long){
        repository.hotelById(id){hotel ->
            if (hotel != null){
                view.showHotelDetails(hotel)
            } else {
                view.errorHotelNotFound()
            }
        }
    }
}