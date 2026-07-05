package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fw4 implements Runnable {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public /* synthetic */ fw4(wk wkVar, g91 g91Var, int i, Runnable runnable) {
        this.G = wkVar;
        this.H = g91Var;
        this.F = i;
        this.I = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        Object obj = this.I;
        int i2 = this.F;
        Object obj2 = this.H;
        Object obj3 = this.G;
        switch (i) {
            case 0:
                iw4 iw4Var = (iw4) obj3;
                hi6 hi6Var = (hi6) obj2;
                String str = (String) obj;
                if (iw4Var.c == null) {
                    return;
                }
                ((HashMap) hi6Var.G).put(str, Integer.valueOf(i2));
                iw4Var.b.i(i2);
                return;
            default:
                wk wkVar = (wk) obj3;
                g91 g91Var = (g91) obj2;
                Runnable runnable = (Runnable) obj;
                sze szeVar = (sze) wkVar.h;
                int i3 = 1;
                try {
                    try {
                        sze szeVar2 = (sze) wkVar.a;
                        Objects.requireNonNull(szeVar2);
                        szeVar.j(new yki(szeVar2, i3));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) wkVar.d).getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            szeVar.j(new o77(wkVar, g91Var, i2));
                        } else {
                            wkVar.e(g91Var, i2);
                        }
                        break;
                    } catch (SynchronizationException unused) {
                        ((fj0) wkVar.f).I(g91Var, i2 + 1, false);
                    }
                    runnable.run();
                    return;
                } catch (Throwable th) {
                    runnable.run();
                    throw th;
                }
        }
    }

    public /* synthetic */ fw4(iw4 iw4Var, hi6 hi6Var, String str, int i) {
        this.G = iw4Var;
        this.H = hi6Var;
        this.I = str;
        this.F = i;
    }
}
