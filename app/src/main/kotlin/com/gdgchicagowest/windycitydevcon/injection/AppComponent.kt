package com.gdgchicagowest.windycitydevcon.injection

import com.gdgchicagowest.windycitydevcon.data.DataModule
import com.gdgchicagowest.windycitydevcon.features.dates.SessionDateComponent
import com.gdgchicagowest.windycitydevcon.features.sessions.SessionListComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class, DataModule::class))
interface AppComponent {
    fun sessionDateComponent(): SessionDateComponent
    fun sessionListComponent(): SessionListComponent
}

