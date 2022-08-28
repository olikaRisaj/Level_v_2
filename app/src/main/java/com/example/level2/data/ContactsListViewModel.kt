package com.example.level2.data

import androidx.lifecycle.ViewModel
import com.example.level2.model.ContactData

class ContactsListViewModel: ViewModel() {
    private val contacts = listOf(
        ContactData("name surname1", "profession1", "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460__340.png"),
        ContactData("name surname2", "profession2", "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460__340.png"),
        ContactData("name surname3", "profession3", "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460__340.png"),
        ContactData("name surname4", "profession4", "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460__340.png"),
        ContactData("name surname5", "profession5", "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460__340.png"),
        ContactData("name surname6", "profession6", "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460__340.png"),
        ContactData("name surname7", "profession7", "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460__340.png"),
        ContactData("name surname8", "profession8", "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460__340.png"),
        ContactData("name surname9", "profession9", "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460__340.png"),
        ContactData("name surname10", "profession10", "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460__340.png"),
        ContactData("name surname11", "profession11", "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460__340.png"),
        ContactData("name surname12", "profession12", "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460__340.png"),
        ContactData("name surname13", "profession13", "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460__340.png"),
        ContactData("name surname14", "profession14", "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460__340.png"),
        ContactData("name surname15", "profession15", "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460__340.png"),
        ContactData("name surname16", "profession16", "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460__340.png"))

    fun getContacts(): List<ContactData> {
        return contacts
    }
}
