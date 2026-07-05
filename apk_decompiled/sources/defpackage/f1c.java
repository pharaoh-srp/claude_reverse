package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes.dex */
public final class f1c {
    public final lsc a;

    public f1c(Context context) {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
        int i = 0;
        this.a = mpk.P(Boolean.valueOf((connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(12) || !networkCapabilities.hasCapability(16)) ? false : true));
        if (connectivityManager != null) {
            connectivityManager.registerDefaultNetworkCallback(new d1c(i, this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.vp4 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.e1c
            if (r0 == 0) goto L13
            r0 = r5
            e1c r0 = (defpackage.e1c) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            e1c r0 = new e1c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.E
            int r1 = r0.G
            iei r2 = defpackage.iei.a
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L27
            defpackage.sf5.h0(r5)
            return r2
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.sf5.h0(r5)
            boolean r5 = r4.b()
            if (r5 == 0) goto L38
            goto L54
        L38:
            pza r5 = new pza
            r1 = 2
            r5.<init>(r1, r4)
            b3f r4 = defpackage.mpk.d0(r5)
            zl2 r5 = new zl2
            r1 = 15
            r5.<init>(r1)
            r0.G = r3
            java.lang.Object r4 = defpackage.j8.H(r4, r5, r0)
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L54
            return r5
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f1c.a(vp4):java.lang.Object");
    }

    public final boolean b() {
        return ((Boolean) this.a.getValue()).booleanValue();
    }
}
