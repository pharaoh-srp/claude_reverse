package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class u98 {
    public static u98 c;
    public final Context a;
    public volatile String b;

    public u98(Context context) {
        this.a = context.getApplicationContext();
    }

    public static u98 a(Context context) {
        dgj.v(context);
        synchronized (u98.class) {
            if (c == null) {
                k3k k3kVar = z0l.a;
                synchronized (z0l.class) {
                    if (z0l.e == null) {
                        z0l.e = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                c = new u98(context);
            }
        }
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f6, code lost:
    
        r5 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean d(android.content.pm.PackageInfo r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u98.d(android.content.pm.PackageInfo, boolean):boolean");
    }

    public static zqk e(PackageInfo packageInfo, zqk... zqkVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            juk jukVar = new juk(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < zqkVarArr.length; i++) {
                if (zqkVarArr[i].equals(jukVar)) {
                    return zqkVarArr[i];
                }
            }
        }
        return null;
    }

    public final boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (d(packageInfo, false)) {
            return true;
        }
        if (d(packageInfo, true)) {
            if (z88.a(this.a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(int r18) {
        /*
            Method dump skipped, instruction units count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u98.c(int):boolean");
    }
}
