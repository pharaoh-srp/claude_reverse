package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class nyk implements Runnable {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ String F;
    public final /* synthetic */ String G;
    public final /* synthetic */ u1l H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ hyk J;
    public final /* synthetic */ Object K;

    public nyk(hyk hykVar, String str, String str2, u1l u1lVar, boolean z, x4k x4kVar) {
        this.F = str;
        this.G = str2;
        this.H = u1lVar;
        this.I = z;
        this.K = x4kVar;
        this.J = hykVar;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00e7 -> B:51:0x00ee). Please report as a decompilation issue!!! */
    @Override // java.lang.Runnable
    public final void run() {
        hyk hykVar;
        pfk pfkVar;
        switch (this.E) {
            case 0:
                u1l u1lVar = this.H;
                String str = this.G;
                String str2 = this.F;
                x4k x4kVar = (x4k) this.K;
                hyk hykVar2 = this.J;
                Bundle bundle = new Bundle();
                try {
                    pfk pfkVar2 = hykVar2.H;
                    if (pfkVar2 == null) {
                        hykVar2.b0().J.a(str2, str, "Failed to get user properties; not connected to service");
                    } else {
                        bundle = h1l.V0(pfkVar2.s(str2, str, this.I, u1lVar));
                        hykVar2.c1();
                        hykVar2.J0().j1(x4kVar, bundle);
                    }
                } catch (RemoteException e) {
                    hykVar2.b0().J.a(str2, e, "Failed to get user properties; remote exception");
                } finally {
                    hykVar2.J0().j1(x4kVar, bundle);
                }
                return;
            default:
                synchronized (((AtomicReference) this.K)) {
                    try {
                        try {
                            hykVar = this.J;
                            pfkVar = hykVar.H;
                        } catch (RemoteException e2) {
                            this.J.b0().J.d("(legacy) Failed to get user properties; remote exception", null, this.F, e2);
                            ((AtomicReference) this.K).set(Collections.EMPTY_LIST);
                        }
                        if (pfkVar == null) {
                            hykVar.b0().J.d("(legacy) Failed to get user properties; not connected to service", null, this.F, this.G);
                            ((AtomicReference) this.K).set(Collections.EMPTY_LIST);
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            ((AtomicReference) this.K).set(pfkVar.s(this.F, this.G, this.I, this.H));
                        } else {
                            ((AtomicReference) this.K).set(pfkVar.i(null, this.F, this.G, this.I));
                        }
                        this.J.c1();
                        ((AtomicReference) this.K).notify();
                        return;
                    } finally {
                        ((AtomicReference) this.K).notify();
                    }
                }
        }
    }

    public nyk(hyk hykVar, AtomicReference atomicReference, String str, String str2, u1l u1lVar, boolean z) {
        this.K = atomicReference;
        this.F = str;
        this.G = str2;
        this.H = u1lVar;
        this.I = z;
        this.J = hykVar;
    }
}
