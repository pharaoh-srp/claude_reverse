package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes2.dex */
public final class x19 extends ConnectivityManager.NetworkCallback {
    public static final /* synthetic */ int c = 0;
    public final /* synthetic */ int a;
    public final Object b;

    public x19(b4b b4bVar) {
        this.a = 0;
        this.b = b4bVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.a) {
            case 2:
                lrb.n((lrb) this.b, network, true);
                break;
            default:
                super.onAvailable(network);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onBlockedStatusChanged(Network network, boolean z) {
        switch (this.a) {
            case 1:
                network.getClass();
                if (network.equals(((s1c) this.b).f.getActiveNetwork())) {
                    nga ngaVarC = nga.c();
                    String str = r1c.a;
                    ngaVarC.getClass();
                    s1c s1cVar = (s1c) this.b;
                    Object objA = s1cVar.e;
                    if (objA == null) {
                        objA = s1cVar.a();
                    }
                    q1c q1cVar = (q1c) objA;
                    s1c s1cVar2 = (s1c) this.b;
                    synchronized (s1cVar2.g) {
                        if (s1cVar2.h == z) {
                            return;
                        }
                        s1cVar2.h = z;
                        ((s1c) this.b).b(new q1c(q1cVar.a, q1cVar.b, q1cVar.c, q1cVar.d, z));
                        return;
                    }
                }
                return;
            default:
                super.onBlockedStatusChanged(network, z);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.a) {
            case 0:
                network.getClass();
                networkCapabilities.getClass();
                nga ngaVarC = nga.c();
                int i = ofj.a;
                ngaVarC.getClass();
                ((b4b) this.b).invoke(vl4.a);
                break;
            case 1:
                network.getClass();
                networkCapabilities.getClass();
                nga ngaVarC2 = nga.c();
                String str = r1c.a;
                networkCapabilities.toString();
                ngaVarC2.getClass();
                s1c s1cVar = (s1c) this.b;
                s1cVar.b(r1c.b(s1cVar.f, s1cVar.h));
                break;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                network.getClass();
                nga ngaVarC = nga.c();
                int i2 = ofj.a;
                ngaVarC.getClass();
                ((b4b) obj).invoke(new wl4(7));
                break;
            case 1:
                network.getClass();
                nga ngaVarC2 = nga.c();
                String str = r1c.a;
                ngaVarC2.getClass();
                ((s1c) obj).b(new q1c(false, false, false, false, false));
                break;
            default:
                lrb.n((lrb) obj, network, false);
                break;
        }
    }

    public /* synthetic */ x19(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
