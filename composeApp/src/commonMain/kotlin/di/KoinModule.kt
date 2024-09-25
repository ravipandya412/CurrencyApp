package di

import com.russhwolf.settings.Settings
import data.local.PreferencesImpl
import data.remote.api.CurrencyApiServiceImpl
import domain.PreferenceRepository
import domain.model.CurrencyApiService
import org.koin.core.context.startKoin
import org.koin.dsl.module

val appModule = module {
    single { Settings() }
    single<PreferenceRepository> { PreferencesImpl(settings = get()) }
    single<CurrencyApiService> { CurrencyApiServiceImpl(preferences = get()) }
}

fun initializeKoin() {
    startKoin {
        modules(appModule)
    }
}