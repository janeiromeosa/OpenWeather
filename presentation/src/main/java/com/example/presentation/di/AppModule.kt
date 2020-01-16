import android.content.Context
import com.example.presentation.App
import com.example.presentation.currentweather.HomeActivity
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module.module

val appModule = module {
    single {(context: Context) -> HomeActivity() }
}