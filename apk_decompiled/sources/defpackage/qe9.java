package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.util.Log;
import androidx.concurrent.futures.b;

/* JADX INFO: loaded from: classes2.dex */
public final class qe9 implements ServiceConnection {
    public b E;
    public re9 F;
    public final Context G;

    public qe9(Context context, b bVar) {
        this.G = context;
        this.E = bVar;
    }

    public final void a(Exception exc) {
        if (this.F != null) {
            Log.e("JavaScriptSandbox", "Sandbox has died", exc);
            this.F.i();
        } else {
            this.G.unbindService(this);
            re9.N.set(true);
        }
        b bVar = this.E;
        if (bVar != null) {
            bVar.b(exc);
        }
        this.E = null;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        a(new RuntimeException("JavaScriptSandbox internal error: onBindingDied()"));
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        a(new RuntimeException("JavaScriptSandbox internal error: onNullBinding()"));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    @Override // android.content.ServiceConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onServiceConnected(android.content.ComponentName r3, android.os.IBinder r4) {
        /*
            r2 = this;
            androidx.concurrent.futures.b r3 = r2.E
            if (r3 != 0) goto L5
            return
        L5:
            int r3 = defpackage.du8.i
            r3 = 0
            if (r4 != 0) goto Lc
            r0 = r3
            goto L22
        Lc:
            java.lang.String r0 = defpackage.eu8.e
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            if (r0 == 0) goto L1b
            boolean r1 = r0 instanceof defpackage.eu8
            if (r1 == 0) goto L1b
            eu8 r0 = (defpackage.eu8) r0
            goto L22
        L1b:
            cu8 r0 = new cu8
            r0.<init>()
            r0.i = r4
        L22:
            re9 r4 = new re9     // Catch: java.lang.RuntimeException -> L33 android.os.RemoteException -> L35 android.os.DeadObjectException -> L37
            android.content.Context r1 = r2.G     // Catch: java.lang.RuntimeException -> L33 android.os.RemoteException -> L35 android.os.DeadObjectException -> L37
            r4.<init>(r1, r2, r0)     // Catch: java.lang.RuntimeException -> L33 android.os.RemoteException -> L35 android.os.DeadObjectException -> L37
            r2.F = r4     // Catch: java.lang.RuntimeException -> L33 android.os.RemoteException -> L35 android.os.DeadObjectException -> L37
            androidx.concurrent.futures.b r0 = r2.E
            r0.a(r4)
            r2.E = r3
            return
        L33:
            r3 = move-exception
            goto L39
        L35:
            r3 = move-exception
            goto L39
        L37:
            r3 = move-exception
            goto L4a
        L39:
            r2.a(r3)
            boolean r2 = r3 instanceof java.lang.RuntimeException
            if (r2 == 0) goto L43
            java.lang.RuntimeException r3 = (java.lang.RuntimeException) r3
            goto L49
        L43:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r3)
            r3 = r2
        L49:
            throw r3
        L4a:
            r2.a(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qe9.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        a(new RuntimeException("JavaScriptSandbox internal error: onServiceDisconnected()"));
    }
}
