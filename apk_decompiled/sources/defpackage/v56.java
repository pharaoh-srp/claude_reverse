package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.settings.internal.a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v56 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ zy7 F;
    public final /* synthetic */ zy7 G;

    public /* synthetic */ v56(int i, int i2, zy7 zy7Var, zy7 zy7Var2) {
        this.E = i2;
        this.F = zy7Var;
        this.G = zy7Var2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        fqb fqbVar = fqb.E;
        zy7 zy7Var = this.G;
        zy7 zy7Var2 = this.F;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    h66.h(zy7Var2, zy7Var, e18Var, 0);
                }
                break;
            case 1:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    h66.b(zy7Var2, zy7Var, e18Var2, 0);
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                h66.h(zy7Var2, zy7Var, (ld4) obj, x44.p0(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                prk.a(zy7Var2, zy7Var, (ld4) obj, x44.p0(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                a.a(zy7Var2, zy7Var, (ld4) obj, x44.p0(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                o1d.a(zy7Var2, zy7Var, (ld4) obj, x44.p0(49));
                break;
            case 6:
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e18Var3.T();
                } else {
                    pzg.a(b.s(fqbVar, za6.d(kxf.a), MTTypesetterKt.kLineSkipLimitMultiplier, za6.d(kxf.b), 10), gm3.b(e18Var3).h, gm3.a(e18Var3).o, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, fd9.q0(764743203, new v56(zy7Var2, zy7Var, 7), e18Var3), e18Var3, 12582912, 120);
                }
                break;
            case 7:
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    e18Var4.T();
                } else {
                    q64 q64VarA = p64.a(ko0.c, lja.S, e18Var4, 0);
                    int iHashCode = Long.hashCode(e18Var4.T);
                    hyc hycVarL = e18Var4.l();
                    iqb iqbVarE = kxk.E(e18Var4, fqbVar);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var4.e0();
                    if (e18Var4.S) {
                        e18Var4.k(re4Var);
                    } else {
                        e18Var4.n0();
                    }
                    d4c.i0(e18Var4, cd4.f, q64VarA);
                    d4c.i0(e18Var4, cd4.e, hycVarL);
                    d4c.i0(e18Var4, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var4, cd4.h);
                    d4c.i0(e18Var4, cd4.d, iqbVarE);
                    tjh.b(gid.p(16.0f, R.string.shake_menu_title, e18Var4, e18Var4, fqbVar), gb9.L(fqbVar, 20.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var4).e.E).f, e18Var4, 48, 0, 131068);
                    kxk.g(e18Var4, b.e(fqbVar, 8.0f));
                    xsc.g(com.anthropic.claude.design.icon.a.a(ud0.k0, e18Var4), d4c.j0(R.string.title_feedback, e18Var4), this.F, null, null, null, false, null, null, c0l.p(), MTTypesetterKt.kLineSkipLimitMultiplier, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, 0L, null, 0, e18Var4, 8, 0, 130552);
                    bpc bpcVarA = com.anthropic.claude.design.icon.a.a(ud0.g, e18Var4);
                    String strJ0 = d4c.j0(R.string.internal_settings_title, e18Var4);
                    qnc qncVarP = c0l.p();
                    float fA = csg.A(2, e18Var4);
                    xsc.g(bpcVarA, strJ0, this.G, null, null, null, false, null, null, qncVarP, MTTypesetterKt.kLineSkipLimitMultiplier, null, new qnc(fA, fA, fA, fA), MTTypesetterKt.kLineSkipLimitMultiplier, mpk.d(csg.z(20.0f, e18Var4), csg.z(20.0f, e18Var4)), null, 0, e18Var4, 8, 0, 110072);
                    grc.z(fqbVar, 8.0f, e18Var4, true);
                }
                break;
            case 8:
                ((Integer) obj2).getClass();
                thk.d(zy7Var2, zy7Var, (ld4) obj, x44.p0(1));
                break;
            default:
                ((Integer) obj2).getClass();
                kik.c(zy7Var2, zy7Var, (ld4) obj, x44.p0(1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ v56(zy7 zy7Var, zy7 zy7Var2, int i) {
        this.E = i;
        this.F = zy7Var;
        this.G = zy7Var2;
    }
}
