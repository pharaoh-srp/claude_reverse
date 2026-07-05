package defpackage;

import android.view.DragEvent;

/* JADX INFO: loaded from: classes.dex */
public final class bgh implements nb6 {
    public final /* synthetic */ rfh E;
    public final /* synthetic */ a21 F;
    public final /* synthetic */ rfh G;
    public final /* synthetic */ rfh H;
    public final /* synthetic */ rfh I;
    public final /* synthetic */ rfh J;

    public bgh(rfh rfhVar, a21 a21Var, rfh rfhVar2, rfh rfhVar3, rfh rfhVar4, rfh rfhVar5) {
        this.E = rfhVar;
        this.F = a21Var;
        this.G = rfhVar2;
        this.H = rfhVar3;
        this.I = rfhVar4;
        this.J = rfhVar5;
    }

    @Override // defpackage.nb6
    public final void G0(gb6 gb6Var) {
    }

    @Override // defpackage.nb6
    public final void H0(gb6 gb6Var) {
        DragEvent dragEventO = ttj.o(gb6Var);
        float x = dragEventO.getX();
        float y = dragEventO.getY();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
        vfh vfhVar = this.H.F;
        long jK = aqk.k(vfhVar.V, jFloatToRawIntBits);
        int iD = vfhVar.V.d(jK, true);
        if (iD >= 0) {
            vfhVar.U.j(mwa.m(iD, iD));
        }
        vfhVar.W.H(te8.E, jK);
    }

    @Override // defpackage.nb6
    public final void J(gb6 gb6Var) {
        this.J.invoke(gb6Var);
    }

    @Override // defpackage.nb6
    public final boolean a1(gb6 gb6Var) {
        this.E.invoke(gb6Var);
        this.F.invoke(spk.f(ttj.o(gb6Var).getClipData()), spk.g(ttj.o(gb6Var).getClipDescription()));
        return Boolean.TRUE.booleanValue();
    }

    @Override // defpackage.nb6
    public final void s0(gb6 gb6Var) {
        this.I.invoke(gb6Var);
    }

    @Override // defpackage.nb6
    public final void u(gb6 gb6Var) {
        this.G.invoke(gb6Var);
    }
}
