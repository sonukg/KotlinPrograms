package kotlin_fund_prog

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object ApiClient {
    private const val BASE_URL = "https://api.example.com/"

    // Lazy Initialization: The retrofit instance is created only once when first accessed, optimizing resource usage.
    val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    
    // Example of how to create a service interface
    inline fun <reified T> createService(): T {
        return retrofit.create(T::class.java)
    }
}


