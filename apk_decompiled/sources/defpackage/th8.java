package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.health.connect.HealthConnectManager;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class th8 implements bh8, hxc {
    public final Executor a;
    public final Context b;
    public final HealthConnectManager c;

    public th8(Context context) {
        context.getClass();
        this.a = d4c.C(g86.a);
        this.b = context;
        Object systemService = context.getSystemService("healthconnect");
        systemService.getClass();
        this.c = df8.l(systemService);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.bh8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.xr r9, defpackage.vp4 r10) throws android.os.RemoteException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.th8.a(xr, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.bh8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.mr r12, defpackage.vp4 r13) throws android.os.RemoteException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.th8.b(mr, vp4):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x056c A[PHI: r8
      0x056c: PHI (r8v47 java.lang.Object) = 
      (r8v46 java.lang.Object)
      (r8v63 java.lang.Object)
      (r8v64 java.lang.Object)
      (r8v75 java.lang.Object)
      (r8v76 java.lang.Object)
      (r8v77 java.lang.Object)
      (r8v79 java.lang.Object)
      (r8v80 java.lang.Object)
      (r8v81 java.lang.Object)
      (r8v85 java.lang.Object)
      (r8v119 java.lang.Object)
      (r8v120 java.lang.Object)
      (r8v124 java.lang.Object)
      (r8v129 java.lang.Object)
      (r8v131 java.lang.Object)
     binds: [B:149:0x052e, B:540:0x118a, B:537:0x1172, B:517:0x1037, B:514:0x1021, B:507:0x0fe9, B:317:0x0cc5, B:310:0x0c6c, B:307:0x0c45, B:301:0x0bcc, B:202:0x07a3, B:199:0x0771, B:189:0x06e9, B:160:0x05b1, B:153:0x056b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // defpackage.bh8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.m3e r73, defpackage.vp4 r74) throws android.os.RemoteException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 4832
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.th8.c(m3e, vp4):java.lang.Object");
    }

    @Override // defpackage.bh8
    public final hxc d() {
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.bh8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.lr r14, defpackage.vp4 r15) throws android.os.RemoteException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.th8.e(lr, vp4):java.lang.Object");
    }

    @Override // defpackage.hxc
    public final Object f(tp4 tp4Var) throws PackageManager.NameNotFoundException {
        Context context = this.b;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(4096L));
        pwf pwfVar = new pwf();
        String[] strArr = packageInfo.requestedPermissions;
        if (strArr == null) {
            strArr = new String[0];
        }
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            str.getClass();
            if (isg.q0(str, "android.permission.health.", false)) {
                int[] iArr = packageInfo.requestedPermissionsFlags;
                iArr.getClass();
                if ((iArr[i] & 2) > 0) {
                    String str2 = strArr[i];
                    str2.getClass();
                    pwfVar.add(str2);
                }
            }
        }
        return sf5.k(pwfVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.bz7 r5, defpackage.vp4 r6) throws android.os.RemoteException, java.io.IOException {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.sh8
            if (r0 == 0) goto L13
            r0 = r6
            sh8 r0 = (defpackage.sh8) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            sh8 r0 = new sh8
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.E
            int r6 = r0.G
            r1 = 1
            if (r6 == 0) goto L2c
            if (r6 != r1) goto L25
            defpackage.sf5.h0(r4)     // Catch: android.health.connect.HealthConnectException -> L3b
            return r4
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.sf5.h0(r4)
            r0.G = r1     // Catch: android.health.connect.HealthConnectException -> L3b
            java.lang.Object r4 = r5.invoke(r0)     // Catch: android.health.connect.HealthConnectException -> L3b
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L3a
            return r5
        L3a:
            return r4
        L3b:
            r4 = move-exception
            int r5 = defpackage.fa5.a(r4)
            r6 = 3
            if (r5 == r6) goto L68
            r6 = 4
            if (r5 == r6) goto L62
            r6 = 5
            if (r5 == r6) goto L5c
            r6 = 6
            if (r5 == r6) goto L52
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r4)
            goto L6d
        L52:
            android.os.RemoteException r5 = new android.os.RemoteException
            java.lang.String r4 = defpackage.fa5.u(r4)
            r5.<init>(r4)
            goto L6d
        L5c:
            java.lang.SecurityException r5 = new java.lang.SecurityException
            r5.<init>(r4)
            goto L6d
        L62:
            java.io.IOException r5 = new java.io.IOException
            r5.<init>(r4)
            goto L6d
        L68:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>(r4)
        L6d:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.th8.g(bz7, vp4):java.lang.Object");
    }
}
