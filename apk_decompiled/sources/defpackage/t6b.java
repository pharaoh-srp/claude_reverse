package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
public final class t6b implements wui {
    public final /* synthetic */ x6b b;

    public t6b(x6b x6bVar) {
        this.b = x6bVar;
    }

    @Override // defpackage.wui
    public final void a(yui yuiVar) {
    }

    @Override // defpackage.wui
    public final void b() {
        x6b x6bVar = this.b;
        Surface surface = x6bVar.D1;
        if (surface != null) {
            dke dkeVar = x6bVar.n1;
            Handler handler = (Handler) dkeVar.E;
            if (handler != null) {
                handler.post(new uui(dkeVar, surface, SystemClock.elapsedRealtime(), 0));
            }
            x6bVar.G1 = true;
        }
    }

    @Override // defpackage.wui
    public final void c() {
        x6b x6bVar = this.b;
        if (x6bVar.D1 != null) {
            x6bVar.S0(0, 1);
        }
    }

    @Override // defpackage.wui
    public final void d() {
        y77 y77Var = this.b.m0;
        if (y77Var != null) {
            y77Var.a();
        }
    }
}
