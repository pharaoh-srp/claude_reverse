package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s0c extends m08 implements bz7 {
    public static final s0c E = new s0c(1, zh4.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        Context applicationContext = ((Context) obj).getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService(ConnectivityManager.class);
        if (connectivityManager != null && xuj.i(applicationContext)) {
            try {
                return new yh4(connectivityManager);
            } catch (Exception unused) {
            }
        }
        return xh4.a;
    }
}
