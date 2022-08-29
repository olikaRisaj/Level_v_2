package com.example.level2.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.level2.model.ContactData

class ContactsListViewModel : ViewModel() {

    private val _contactsLiveData = MutableLiveData<MutableList<ContactData>>()
    val contactsLiveData: LiveData<MutableList<ContactData>> = _contactsLiveData

    init {
        _contactsLiveData.value = ContactsListHardCode().contacts.toMutableList()
    }
}
