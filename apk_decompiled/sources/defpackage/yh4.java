package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes2.dex */
public final class yh4 implements xh4 {
    public final ConnectivityManager b;

    public yh4(ConnectivityManager connectivityManager) {
        this.b = connectivityManager;
    }

    @Override // defpackage.xh4
    public final boolean b() {
        ConnectivityManager connectivityManager = this.b;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }
}
