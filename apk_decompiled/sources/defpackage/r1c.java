package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r1c {
    public static final String a = nga.e("NetworkStateTracker");

    public static final s1c a(Context context, ggj ggjVar) {
        return new s1c(context, ggjVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.q1c b(android.net.ConnectivityManager r9, boolean r10) {
        /*
            java.lang.String r1 = defpackage.r1c.a
            r9.getClass()
            android.net.NetworkInfo r2 = r9.getActiveNetworkInfo()     // Catch: java.lang.SecurityException -> L55
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L19
            boolean r0 = r2.isConnected()     // Catch: java.lang.SecurityException -> L15
            if (r0 == 0) goto L19
            r5 = r3
            goto L1b
        L15:
            r0 = move-exception
            r9 = r0
            r7 = r10
            goto L58
        L19:
            r5 = r3
            r3 = r4
        L1b:
            android.net.Network r0 = r9.getActiveNetwork()     // Catch: java.lang.SecurityException -> L2c
            android.net.NetworkCapabilities r0 = r9.getNetworkCapabilities(r0)     // Catch: java.lang.SecurityException -> L2c
            if (r0 == 0) goto L2e
            r6 = 16
            boolean r0 = r0.hasCapability(r6)     // Catch: java.lang.SecurityException -> L2c
            goto L3a
        L2c:
            r0 = move-exception
            goto L30
        L2e:
            r0 = r4
            goto L3a
        L30:
            nga r6 = defpackage.nga.c()     // Catch: java.lang.SecurityException -> L55
            java.lang.String r7 = "Unable to validate active network"
            r6.b(r1, r7, r0)     // Catch: java.lang.SecurityException -> L55
            goto L2e
        L3a:
            boolean r9 = r9.isActiveNetworkMetered()     // Catch: java.lang.SecurityException -> L55
            if (r2 == 0) goto L48
            boolean r2 = r2.isRoaming()     // Catch: java.lang.SecurityException -> L15
            if (r2 != 0) goto L48
            r6 = r5
            goto L49
        L48:
            r6 = r4
        L49:
            q1c r2 = new q1c     // Catch: java.lang.SecurityException -> L55
            r5 = r9
            r7 = r10
            r4 = r0
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.SecurityException -> L52
            return r2
        L52:
            r0 = move-exception
        L53:
            r9 = r0
            goto L58
        L55:
            r0 = move-exception
            r7 = r10
            goto L53
        L58:
            nga r10 = defpackage.nga.c()
            java.lang.String r0 = "Unable to get active network state"
            r10.b(r1, r0, r9)
            q1c r3 = new q1c
            r6 = 0
            r8 = r7
            r7 = 1
            r4 = 0
            r5 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r1c.b(android.net.ConnectivityManager, boolean):q1c");
    }
}
