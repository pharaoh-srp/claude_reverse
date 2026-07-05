package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kq1 {
    public final Context a;

    public kq1(Context context, int i) {
        switch (i) {
            case 1:
                context.getClass();
                this.a = context;
                break;
            case 2:
                context.getClass();
                this.a = context;
                break;
            default:
                this.a = context.getApplicationContext();
                break;
        }
    }

    public static q95 a(kq1 kq1Var, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return kq1Var.c();
        }
        if (obj instanceof r38) {
            for (p95 p95Var : ((r38) obj).a) {
            }
        }
        Context context = kq1Var.a;
        context.getClass();
        if (context.getPackageManager().hasSystemFeature("android.software.leanback") || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return kq1Var.c();
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            ha5 ha5Var = new ha5(context);
            ha5 ha5Var2 = ha5Var.isAvailableOnDevice() ? ha5Var : null;
            return ha5Var2 == null ? kq1Var.c() : ha5Var2;
        }
        if (i <= 33) {
            return kq1Var.c();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0073, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 34) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(defpackage.jw7 r5) {
        /*
            java.lang.String r0 = r5.o
            r1 = 0
            if (r0 == 0) goto L7f
            boolean r0 = defpackage.gkb.h(r0)
            if (r0 != 0) goto Ld
            goto L7f
        Ld:
            java.lang.String r5 = r5.o
            java.lang.String r0 = defpackage.tpi.a
            r5.getClass()
            int r0 = r5.hashCode()
            r2 = 4
            r3 = 1
            r4 = -1
            switch(r0) {
                case -1487656890: goto L61;
                case -1487464693: goto L56;
                case -1487464690: goto L4b;
                case -1487394660: goto L40;
                case -1487018032: goto L35;
                case -879272239: goto L2a;
                case -879258763: goto L1f;
                default: goto L1e;
            }
        L1e:
            goto L6b
        L1f:
            java.lang.String r0 = "image/png"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L28
            goto L6b
        L28:
            r4 = 6
            goto L6b
        L2a:
            java.lang.String r0 = "image/bmp"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L33
            goto L6b
        L33:
            r4 = 5
            goto L6b
        L35:
            java.lang.String r0 = "image/webp"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L3e
            goto L6b
        L3e:
            r4 = r2
            goto L6b
        L40:
            java.lang.String r0 = "image/jpeg"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L49
            goto L6b
        L49:
            r4 = 3
            goto L6b
        L4b:
            java.lang.String r0 = "image/heif"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L54
            goto L6b
        L54:
            r4 = 2
            goto L6b
        L56:
            java.lang.String r0 = "image/heic"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L5f
            goto L6b
        L5f:
            r4 = r3
            goto L6b
        L61:
            java.lang.String r0 = "image/avif"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L6a
            goto L6b
        L6a:
            r4 = r1
        L6b:
            switch(r4) {
                case 0: goto L6f;
                case 1: goto L75;
                case 2: goto L75;
                case 3: goto L75;
                case 4: goto L75;
                case 5: goto L75;
                case 6: goto L75;
                default: goto L6e;
            }
        L6e:
            goto L7a
        L6f:
            int r5 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r5 < r0) goto L7a
        L75:
            int r5 = defpackage.pe1.f(r2, r1, r1, r1)
            return r5
        L7a:
            int r5 = defpackage.pe1.f(r3, r1, r1, r1)
            return r5
        L7f:
            int r5 = defpackage.pe1.f(r1, r1, r1, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq1.b(jw7):int");
    }

    public q95 c() throws PackageManager.NameNotFoundException {
        String string;
        Context context = this.a;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        List listP1 = w44.p1(arrayList);
        if (listP1.isEmpty()) {
            return null;
        }
        Iterator it = listP1.iterator();
        q95 q95Var = null;
        while (it.hasNext()) {
            try {
                Object objNewInstance = Class.forName((String) it.next()).getConstructor(Context.class).newInstance(context);
                objNewInstance.getClass();
                q95 q95Var2 = (q95) objNewInstance;
                if (!q95Var2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (q95Var != null) {
                        Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                        return null;
                    }
                    q95Var = q95Var2;
                }
            } catch (Throwable unused) {
            }
        }
        return q95Var;
    }
}
