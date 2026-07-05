package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class s0h implements Runnable {
    public final long E;
    public final PowerManager.WakeLock F;
    public final FirebaseMessaging G;
    public final ThreadPoolExecutor H = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new vk5("firebase-iid-executor", 1));

    public s0h(FirebaseMessaging firebaseMessaging, long j) {
        this.G = firebaseMessaging;
        this.E = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.F = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.G.b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final boolean b() throws IOException {
        try {
            if (this.G.a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            Log.isLoggable("FirebaseMessaging", 3);
            return true;
        } catch (IOException e) {
            String message = e.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e.getMessage() != null) {
                    throw e;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        PowerManager.WakeLock wakeLock = this.F;
        dpf dpfVarK = dpf.K();
        FirebaseMessaging firebaseMessaging = this.G;
        if (dpfVarK.N(firebaseMessaging.b)) {
            wakeLock.acquire();
        }
        boolean z = false;
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.i = true;
                }
                if (!firebaseMessaging.h.e()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.i = false;
                    }
                    if (dpf.K().N(firebaseMessaging.b)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (dpf.K().M(firebaseMessaging.b) && !a()) {
                    new xg0(this, z, 4).a();
                    if (dpf.K().N(firebaseMessaging.b)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (b()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.i = false;
                    }
                } else {
                    firebaseMessaging.h(this.E);
                }
                if (dpf.K().N(firebaseMessaging.b)) {
                    wakeLock.release();
                }
            } catch (IOException e) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
                synchronized (firebaseMessaging) {
                    firebaseMessaging.i = false;
                    if (dpf.K().N(firebaseMessaging.b)) {
                        wakeLock.release();
                    }
                }
            }
        } catch (Throwable th) {
            if (dpf.K().N(firebaseMessaging.b)) {
                wakeLock.release();
            }
            throw th;
        }
    }
}
