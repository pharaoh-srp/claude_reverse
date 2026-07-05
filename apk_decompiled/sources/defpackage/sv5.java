package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class sv5 implements wti {
    public final poj a;
    public final boolean b;

    public sv5(poj pojVar, boolean z) {
        this.a = pojVar;
        this.b = z;
    }

    @Override // defpackage.wti
    public final float a(ge2 ge2Var, y9d y9dVar, float f, float f2) {
        ge2Var.getClass();
        y9dVar.getClass();
        return y9dVar == y9d.E ? f2 : y9dVar == y9d.F ? (Math.max(f, f2) + f2) / 2.0f : (f2 / 2.0f) + f;
    }

    @Override // defpackage.wti
    public final float b(ge2 ge2Var, y9d y9dVar, float f, float f2) {
        ge2Var.getClass();
        y9dVar.getClass();
        y9d y9dVar2 = y9d.E;
        boolean z = this.b;
        if (y9dVar == y9dVar2) {
            if (!z) {
                f2 = -f2;
            }
            return (f2 / 2.0f) + f;
        }
        if (y9dVar != y9d.F) {
            return z ? f2 : MTTypesetterKt.kLineSkipLimitMultiplier;
        }
        float fMax = Math.max(f, f2);
        if (!z) {
            f2 = -f2;
        }
        return (fMax + f2) / 2.0f;
    }

    @Override // defpackage.wti
    public final List c(ge2 ge2Var, pa1 pa1Var) {
        ge2Var.getClass();
        pa1Var.getClass();
        lub lubVarE = ge2Var.d().e(pa1Var);
        return x44.X(Double.valueOf(lubVarE.a), Double.valueOf((lubVarE.a + lubVarE.b) / 2.0d), Double.valueOf(lubVarE.b));
    }

    @Override // defpackage.wti
    public final boolean d(yd2 yd2Var) {
        return this.b;
    }

    @Override // defpackage.wti
    public final List f(yd2 yd2Var, float f, float f2, pa1 pa1Var) {
        pa1Var.getClass();
        return g(yd2Var, f, f2, pa1Var);
    }

    @Override // defpackage.wti
    public final List g(ge2 ge2Var, float f, float f2, qa1 qa1Var) {
        ge2Var.getClass();
        qa1Var.getClass();
        lub lubVarE = ge2Var.d().e(qa1Var);
        double d = lubVarE.a * lubVarE.b;
        poj pojVar = this.a;
        if (d >= 0.0d) {
            lub lubVarE2 = ge2Var.d().e(qa1Var);
            double d2 = lubVarE2.b;
            return d2 > 0.0d ? w44.b1(pojVar.J(ge2Var, lubVarE2.a, d2, f, f2, 1), Double.valueOf(lubVarE2.a)) : w44.b1(pojVar.J(ge2Var, Math.abs(d2), Math.abs(lubVarE2.a), f, f2, -1), Double.valueOf(lubVarE2.b));
        }
        lub lubVarE3 = ge2Var.d().e(qa1Var);
        double d3 = lubVarE3.b;
        return w44.b1(w44.a1(pojVar.J(ge2Var, 0.0d, d3, ((float) (d3 / lubVarE3.a())) * f, f2, 1), pojVar.J(ge2Var, 0.0d, Math.abs(lubVarE3.a), ((float) ((-lubVarE3.a) / lubVarE3.a())) * f, f2, -1)), Double.valueOf(0.0d));
    }
}
