package defpackage;

import android.view.DragEvent;

/* JADX INFO: loaded from: classes.dex */
public final class f6e implements nb6 {
    public final /* synthetic */ mi6 E;
    public final /* synthetic */ tz9 F;

    public f6e(mi6 mi6Var, tz9 tz9Var) {
        this.E = mi6Var;
        this.F = tz9Var;
    }

    @Override // defpackage.nb6
    public final void G0(gb6 gb6Var) {
        this.E.b.b();
    }

    @Override // defpackage.nb6
    public final void J(gb6 gb6Var) {
        this.E.b.e();
    }

    @Override // defpackage.nb6
    public final boolean a1(gb6 gb6Var) {
        this.F.invoke(gb6Var);
        DragEvent dragEventO = ttj.o(gb6Var);
        o5l o5lVar = new o5l(spk.f(dragEventO.getClipData()), spk.g(dragEventO.getClipDescription()), 1);
        return !(o5lVar == this.E.b.a(o5lVar));
    }

    @Override // defpackage.nb6
    public final void s0(gb6 gb6Var) {
        this.E.b.c();
    }

    @Override // defpackage.nb6
    public final void u(gb6 gb6Var) {
        this.E.b.d();
    }
}
