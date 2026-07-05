package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pl1 implements sz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ zy7 F;
    public final /* synthetic */ zy7 G;
    public final /* synthetic */ zy7 H;

    public /* synthetic */ pl1(zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, int i) {
        this.E = i;
        this.F = zy7Var;
        this.G = zy7Var2;
        this.H = zy7Var3;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.E;
        iei ieiVar = iei.a;
        fqb fqbVar = fqb.E;
        switch (i) {
            case 0:
                mnc mncVar = (mnc) obj2;
                ld4 ld4Var = (ld4) obj3;
                int iH = ebh.h((Integer) obj4, (s64) obj, mncVar);
                if ((iH & 48) == 0) {
                    iH |= ((e18) ld4Var).f(mncVar) ? 32 : 16;
                }
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iH & 1, (iH & 145) != 144)) {
                    e18Var.T();
                } else {
                    csg.i(this.F, gb9.I(b.c(fqbVar, 1.0f), mncVar), false, gm3.b(e18Var).f, null, sf5.a(1.0f, gm3.a(e18Var).v), null, qvj.n, e18Var, 805306368);
                    kxk.g(e18Var, b.e(fqbVar, 8.0f));
                    csg.i(this.G, gb9.I(b.c(fqbVar, 1.0f), mncVar), false, gm3.b(e18Var).f, null, sf5.a(1.0f, gm3.a(e18Var).v), null, qvj.o, e18Var, 805306368);
                    kxk.g(e18Var, b.e(fqbVar, 8.0f));
                    csg.j(this.H, gb9.I(b.c(fqbVar, 1.0f), mncVar), false, null, null, null, null, qvj.p, e18Var, 805306368, 508);
                    tjh.b(gid.p(8.0f, R.string.voice_tool_approval_disclaimer, e18Var, e18Var, fqbVar), gb9.I(b.c(fqbVar, 1.0f), mncVar), gm3.a(e18Var).N, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 0, 130040);
                    kxk.g(e18Var, b.e(fqbVar, 16.0f));
                }
                break;
            default:
                mnc mncVar2 = (mnc) obj2;
                ld4 ld4Var2 = (ld4) obj3;
                int iH2 = ebh.h((Integer) obj4, (s64) obj, mncVar2);
                if ((iH2 & 48) == 0) {
                    iH2 |= ((e18) ld4Var2).f(mncVar2) ? 32 : 16;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iH2 & 1, (iH2 & 145) != 144)) {
                    e18Var2.T();
                } else {
                    gtk.d(this.F, this.G, gb9.I(b.c(fqbVar, 1.0f), mncVar2), this.H, gb9.d(MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13), false, 0, e18Var2, 24576, 96);
                }
                break;
        }
        return ieiVar;
    }
}
