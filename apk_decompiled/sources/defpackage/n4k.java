package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class n4k extends yxj implements x4k {
    public final AtomicReference i;
    public boolean j;

    public n4k() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.i = new AtomicReference();
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0002, code lost:
    
        r3 = r3.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object d(android.os.Bundle r3, java.lang.Class r4) {
        /*
            if (r3 == 0) goto L2a
            java.lang.String r0 = "r"
            java.lang.Object r3 = r3.get(r0)
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r4.cast(r3)     // Catch: java.lang.ClassCastException -> Lf
            return r3
        Lf:
            r0 = move-exception
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getCanonicalName()
            java.lang.String r1 = "Unexpected object type. Expected, Received: "
            java.lang.String r2 = ", "
            java.lang.String r3 = defpackage.ij0.k(r1, r4, r2, r3)
            java.lang.String r4 = "AM"
            android.util.Log.w(r4, r3, r0)
            throw r0
        L2a:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n4k.d(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    public final String D(long j) {
        return (String) d(c(j), String.class);
    }

    @Override // defpackage.yxj
    public final boolean b(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) qxj.a(parcel, Bundle.CREATOR);
        qxj.e(parcel);
        f(bundle);
        parcel2.writeNoException();
        return true;
    }

    public final Bundle c(long j) {
        Bundle bundle;
        synchronized (this.i) {
            if (!this.j) {
                try {
                    this.i.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.i.get();
        }
        return bundle;
    }

    @Override // defpackage.x4k
    public final void f(Bundle bundle) {
        synchronized (this.i) {
            try {
                try {
                    this.i.set(bundle);
                    this.j = true;
                } finally {
                    this.i.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
