package dominando.android.fragments.validator

import dominando.android.fragments.model.Hotel

class HotelValidator {
    fun validate(info: Hotel) = with(info){
        checkName(name) && checkAddress(address)
    }
    private fun checkName(name: String) = name.length in 2..20
    private fun checkAddress(address: String) = address.length in 4..80
}