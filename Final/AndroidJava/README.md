Android java is not the same as Oracle’s java
Android java is more limited than Oracle's java
Focus: Android 6.0 API 23

Does Not Work:
Try With Resources feature (must use 'finally' to close resources)
@SafeVarargs class is not available with Android

Works With Android:
Evaluate String Variables with Switch Statements
Multi-Catch Clauses
Underscore in Numeric Literals (takes place of commas to make more readable)
Diamond operators work, however it's not necessary to re-declare the data type in the 2nd '<>'

Custom APIs Unique to Android:
Android.app
Android.widget
Android.database
Android.graphics
Android.net
Android.hardware

Android Development Steps (1-3 for normal java, but add 4 for Android): 
1.	First create your code and libraries 
2.	Use javac command to compile code into class Files
3.	Run it through proguard (optional, shortens code and makes it more difficult to decompile)
4.	Must be compiled into DEX file

Android doesn’t have it’s own virtual machine. It has it’s own runtimes. 
1.	DALVIC: converts code to machine code just-in-time Android 4.4 and earlier
2.	ART: converts code to machine code ahead of time (apps run quicker and smoother) Android 5+

Apps launch activity is defined in the manifest
Activity Lifecycle States and Callback Methods
onCreate(): created
onStart(): Started
onResume(): resumed
onPause(): Paused
onStop(): Stopped
onDestroy(): destroyed

Tips: 
avoid creating unnecessary objects (Android devices have limited memory)
static methods are 15 percent faster 
use constant ints in variable declarations to save a lot of memory over ENUMs
ex(public static final int Thing1 = 1; 64 bytes
