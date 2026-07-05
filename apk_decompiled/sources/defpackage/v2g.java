package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class v2g extends ConnectivityManager.NetworkCallback {
    public static final v2g a = new v2g();
    public static final Object b = new Object();
    public static final LinkedHashMap c = new LinkedHashMap();
    public static NetworkCapabilities d;
    public static boolean e;
    public static Boolean f;

    public static void a() {
        ArrayList<cpc> arrayList = new ArrayList();
        synchronized (b) {
            try {
                if (e && f != null) {
                    for (Map.Entry entry : c.entrySet()) {
                        bz7 bz7Var = (bz7) entry.getKey();
                        NetworkRequest networkRequest = (NetworkRequest) entry.getValue();
                        v2g v2gVar = a;
                        NetworkCapabilities networkCapabilities = d;
                        v2gVar.getClass();
                        Boolean bool = f;
                        bool.getClass();
                        arrayList.add(new cpc(bz7Var, !bool.booleanValue() && networkRequest.canBeSatisfiedBy(networkCapabilities) ? vl4.a : new wl4(7)));
                    }
                    for (cpc cpcVar : arrayList) {
                        ((bz7) cpcVar.E).invoke((xl4) cpcVar.F);
                    }
                    return;
                }
                nga ngaVarC = nga.c();
                int i = ofj.a;
                ngaVarC.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        network.getClass();
        nga ngaVarC = nga.c();
        int i = ofj.a;
        ngaVarC.getClass();
        synchronized (b) {
            if (x44.r(f, Boolean.valueOf(z))) {
                return;
            }
            f = Boolean.valueOf(z);
            a();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        nga ngaVarC = nga.c();
        int i = ofj.a;
        ngaVarC.getClass();
        synchronized (b) {
            d = networkCapabilities;
            e = true;
        }
        a();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        nga ngaVarC = nga.c();
        int i = ofj.a;
        ngaVarC.getClass();
        synchronized (b) {
            d = null;
            Iterator it = c.keySet().iterator();
            while (it.hasNext()) {
                ((bz7) it.next()).invoke(new wl4(7));
            }
        }
    }
}
