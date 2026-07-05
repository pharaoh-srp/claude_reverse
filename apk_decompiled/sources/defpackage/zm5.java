package defpackage;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class zm5 implements bz7 {
    public final /* synthetic */ zy7 E;
    public final /* synthetic */ x0a F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ ps7 H;
    public final /* synthetic */ l45 I;

    public zm5(zy7 zy7Var, x0a x0aVar, boolean z, ps7 ps7Var, l45 l45Var) {
        this.E = zy7Var;
        this.F = x0aVar;
        this.G = z;
        this.H = ps7Var;
        this.I = l45Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        KeyEvent keyEvent = ((so9) obj).a;
        if (cn5.p(keyEvent)) {
            this.E.a();
            return Boolean.TRUE;
        }
        x0a x0aVar = this.F;
        if (x0aVar.j.a()) {
            return Boolean.TRUE;
        }
        boolean z = this.G;
        boolean zS = z ? cn5.s(keyEvent) : cn5.r(keyEvent);
        ps7 ps7Var = this.H;
        if (zS) {
            gb9.D(this.I, null, null, new bn5(x0aVar, -1, ps7Var, 2, (tp4) null), 3);
            return Boolean.TRUE;
        }
        if (!(z ? cn5.r(keyEvent) : cn5.s(keyEvent))) {
            return Boolean.FALSE;
        }
        ps7Var.a(1);
        return Boolean.TRUE;
    }
}
