# CCOpenAds
Admob Open Ad
<p align="left"><a href="https://github.com/YourUsername/YourRepository/releases/tag/v1.0.0">
    <img alt="Version" src="https://img.shields.io/badge/version-v1.0.0-EB780E.svg">
  </a></p>
 
CCOpenAds is a powerful library that provides an easy way to integrate Admob Open Ads into your Android applications. This library simplifies the process of integrating the Admob Open Ad, allowing you to monetize your apps efficiently.
<p align="center">
  <img src="https://github.com/coincodersofficial/CCOpenAds/blob/master/Admob_open_Ad_image.jpg" height="640" alt="Coin Coders">
</p>

## Getting Started

Follow these simple steps to integrate the CCOpenAds library into your Android project.

### Step 1: Add JitPack Repository

Make sure you have the JitPack repository added to your project's build file. To do this, add the following code to your root-level `build.gradle` file:

```gradle
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
```
### Step 2. Add the dependency, always use latest versions <a href="https://developers.google.com/admob/android/quick-start">Admob Ads</a>

```
dependencies {
	        implementation 'com.github.coincodersofficial:CCOpenAds:1.0.0'
		implementation 'com.google.android.gms:play-services-ads:22.4.0'
	}
```
### Step 3. Create a MyApplication class extends with Application
```
public class MyApplication extends Application {
    @Override   
    public void onCreate() {
        super.onCreate();
        MobileAds.initialize(this);

			    // paste your admob open ad id here  
        new CCOpenAd(this, "ca-app-pub-3940256099942544/3419835294");

    }

}
```
### Step 4. Add these in Manifest File
```
<manifest ...

// add internet permission
 <uses-permission android:name="android.permission.INTERNET"/>

 <application
  // add the class name here
        android:name=".MyApplication"
...
...

// add meta-data here change the app id here from your admob app id
<meta-data
            android:name="com.google.android.gms.ads.APPLICATION_ID"
            android:value="ca-app-pub-3940256099942544~3347511713"/>
....
</application>
</manifest>
```
## Requirements

Before using this library, please ensure that your project meets the following requirements:

- Minimum Android SDK: CCOpenAds requires a minimum sdk 23 or high.
- Compile Android SDK: CCOpenAds requires a minimum java version 8.



### Disclaimer

This is not an official Google product.
