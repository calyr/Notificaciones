package mobile.calyr.com.notificaciones;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by robertocarloscallisayamamani on 10/10/17.
 */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {
    private static final String TAG = "firebase token";
    @Override
    public void onTokenRefresh() {
        String token = FirebaseInstanceId.getInstance().getToken();
        System.out.println("Token firebase" + token);

    }

    private void enviarTokenRegistro(String token){
        Log.d(TAG,token);
    }
}
