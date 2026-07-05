package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tq9 implements rz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ float F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ Object H;

    public /* synthetic */ tq9(float f, boolean z, Float f2) {
        this.F = f;
        this.G = z;
        this.H = f2;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        fqb fqbVar = fqb.E;
        float f = this.F;
        Object obj4 = this.H;
        switch (i) {
            case 0:
                Float f2 = (Float) obj4;
                qw1 qw1Var = (qw1) obj;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                qw1Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((e18) ld4Var).f(qw1Var) ? 4 : 2;
                }
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(1 & iIntValue, (iIntValue & 19) != 18)) {
                    e18Var.T();
                } else {
                    dw1.a(yfd.p(xn5.V(b.e(b.c(fqbVar, f), 8.0f), xve.b(4.0f)), gm3.a(e18Var).k, zni.b), e18Var, 0);
                    if (this.G && f2 != null) {
                        e18Var.a0(-539990834);
                        iqb iqbVarA = nw1.a.a(sf5.N(b.o(fqbVar, 6.0f), (f2.floatValue() * qw1Var.c()) - 3.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), lja.J);
                        vve vveVar = xve.a;
                        dw1.a(yfd.p(xn5.V(iqbVarA, vveVar), gm3.a(e18Var).n, vveVar), e18Var, 0);
                        e18Var.p(false);
                    } else {
                        e18Var.a0(-539592019);
                        e18Var.p(false);
                    }
                }
                break;
            default:
                tkd tkdVar = (tkd) obj4;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e18Var2.T();
                } else {
                    kxk.g(e18Var2, b.e(fqbVar, 8.0f));
                    String str = tkdVar.b;
                    boolean z = tkdVar.e;
                    boolean z2 = tkdVar.f;
                    String str2 = tkdVar.c;
                    String str3 = tkdVar.d;
                    boolean z3 = this.G;
                    if (!z3) {
                        str3 = null;
                    }
                    ghk.e(str, str2, str3, z, z2, z3, gb9.L(b.c(fqbVar, 1.0f), f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), e18Var2, 0);
                    kxk.g(e18Var2, b.e(fqbVar, 12.0f));
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ tq9(tkd tkdVar, float f, boolean z) {
        this.H = tkdVar;
        this.F = f;
        this.G = z;
    }
}
