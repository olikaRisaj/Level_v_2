package com.example.level2.utils

import androidx.lifecycle.ViewModel
import com.example.level2.data.ContactsListHardCode
import com.example.level2.model.ContactData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ContactsListViewModel : ViewModel() {

    private val _contactsLiveData = MutableStateFlow(mutableListOf<ContactData>())
    val contactsLiveData: StateFlow<MutableList<ContactData>> = _contactsLiveData

    init {
        _contactsLiveData.value = ContactsListHardCode().getContacts().toMutableList()
    }
}
