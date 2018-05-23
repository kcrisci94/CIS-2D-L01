import java.util.ArrayList;
import java.util.List;

public class Main {

    //SAVE MEMORY USING CONSTANTS, STATICS, AND FINALS
    public static final int thing1 = 59;

    public static void main(String[] args) {

        //DIAMOND OPERATOR
        List<String> myList = new ArrayList<>();
        myList.add("Hello");
        myList.add("My Name is");
        myList.add("Kaleb");

        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }

    }

    //ADD TO MANIFEST
    //EACH ACTIVITY DEFINES IT'S OWN CLASS
    Manifest-Version: 1.0
    Main-Class: Main
            <activity
    android: name=".MainActivity"
    android: label="@string/app_name"
    android: theme="@style/App_Theme.NoActionBar" >
   <intent-filter>
   <action android:name="android.intent.action.MAIN" />
   <category android:name="android.intent.category.LAUNCHER" />
   </intent-filter>
    </activity>
}

