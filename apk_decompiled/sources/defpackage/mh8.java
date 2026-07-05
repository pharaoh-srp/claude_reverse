package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class mh8 implements bh8, hxc {
    public final yof a;

    public mh8(Context context, String str) {
        context.getClass();
        if (str.length() == 0) {
            sz6.p("Service package name must not be empty.");
            throw null;
        }
        yof yofVar = new yof(context, new zf(str, 6, (char) 0));
        str.equals("com.google.android.apps.healthdata");
        this.a = yofVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.bh8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.xr r5, defpackage.vp4 r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.hh8
            if (r0 == 0) goto L13
            r0 = r6
            hh8 r0 = (defpackage.hh8) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            hh8 r0 = new hh8
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.E
            int r1 = r0.G
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.sf5.h0(r6)     // Catch: android.os.RemoteException -> L75
            goto L4e
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.sf5.h0(r6)
            yof r4 = r4.a     // Catch: android.os.RemoteException -> L75
            androidx.health.platform.client.proto.s r5 = defpackage.uok.l(r5)     // Catch: android.os.RemoteException -> L75
            r4.getClass()     // Catch: android.os.RemoteException -> L75
            u95 r6 = new u95     // Catch: android.os.RemoteException -> L75
            r1 = 17
            r6.<init>(r4, r1, r5)     // Catch: android.os.RemoteException -> L75
            exf r4 = r4.a(r2, r6)     // Catch: android.os.RemoteException -> L75
            r0.G = r2     // Catch: android.os.RemoteException -> L75
            java.lang.Object r6 = defpackage.twj.e(r4, r0)     // Catch: android.os.RemoteException -> L75
            m45 r4 = defpackage.m45.E
            if (r6 != r4) goto L4e
            return r4
        L4e:
            androidx.health.platform.client.proto.w r6 = (androidx.health.platform.client.proto.w) r6     // Catch: android.os.RemoteException -> L75
            o89 r4 = r6.p()
            r4.getClass()
            java.lang.Object r4 = defpackage.w44.L0(r4)
            r4.getClass()
            androidx.health.platform.client.proto.c r4 = (androidx.health.platform.client.proto.c) r4
            hs r4 = defpackage.xik.e(r4)
            java.util.Map r5 = r4.a
            r5.size()
            java.util.Map r5 = r4.b
            r5.size()
            java.lang.String r5 = "HealthConnectClient"
            r6 = 3
            android.util.Log.isLoggable(r5, r6)
            return r4
        L75:
            r4 = move-exception
            boolean r5 = r4 instanceof android.os.DeadObjectException
            if (r5 != 0) goto L92
            boolean r5 = r4 instanceof android.os.TransactionTooLargeException
            if (r5 == 0) goto L88
            android.os.TransactionTooLargeException r5 = new android.os.TransactionTooLargeException
            java.lang.String r6 = r4.getMessage()
            r5.<init>(r6)
            goto L9b
        L88:
            android.os.RemoteException r5 = new android.os.RemoteException
            java.lang.String r6 = r4.getMessage()
            r5.<init>(r6)
            goto L9b
        L92:
            android.os.DeadObjectException r5 = new android.os.DeadObjectException
            java.lang.String r6 = r4.getMessage()
            r5.<init>(r6)
        L9b:
            r5.initCause(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mh8.a(xr, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.bh8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.mr r6, defpackage.vp4 r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mh8.b(mr, vp4):java.lang.Object");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // defpackage.bh8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.m3e r70, defpackage.vp4 r71) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 4466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mh8.c(m3e, vp4):java.lang.Object");
    }

    @Override // defpackage.bh8
    public final hxc d() {
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.bh8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.lr r10, defpackage.vp4 r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mh8.e(lr, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.hxc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.tp4 r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mh8.f(tp4):java.lang.Object");
    }
}
