package com.example.level2.model

/* in this case use var because those data can be changed. NB: we can use val, then call method "copy" for
* object/specimen, and by lambda choose fields which we may want to change */

data class ContactData(var contactName: String, var contactProfession: String, var contactPhotoUrl: String)
