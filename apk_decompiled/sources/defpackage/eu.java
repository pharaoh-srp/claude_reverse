package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class eu implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ float I;
    public final /* synthetic */ Object J;

    public /* synthetic */ eu(ud0 ud0Var, String str, String str2, float f, nwb nwbVar) {
        this.E = 3;
        this.F = ud0Var;
        this.G = str;
        this.J = str2;
        this.I = f;
        this.H = nwbVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        float f = this.I;
        iei ieiVar = iei.a;
        Object obj3 = this.H;
        Object obj4 = this.J;
        Object obj5 = this.G;
        Object obj6 = this.F;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                zok.a((List) obj6, (bz7) obj5, (zy7) obj4, (iqb) obj3, this.I, (ld4) obj, x44.p0(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                cvk.d((List) obj6, (bz7) obj5, (bz7) obj4, (iqb) obj3, this.I, (ld4) obj, x44.p0(3073));
                break;
            case 2:
                pz7 pz7Var = (pz7) obj6;
                ta4 ta4Var = (ta4) obj5;
                String str = (String) obj3;
                zy7 zy7Var = (zy7) obj4;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    FillElement fillElement = b.c;
                    k4g k4gVar = k4g.a;
                    iqb iqbVarP = yfd.p(xn5.V(fillElement, k4g.b), gm3.a(e18Var).o, zni.b);
                    q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, iqbVarP);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var.e0();
                    if (e18Var.S) {
                        e18Var.k(re4Var);
                    } else {
                        e18Var.n0();
                    }
                    d4c.i0(e18Var, cd4.f, q64VarA);
                    d4c.i0(e18Var, cd4.e, hycVarL);
                    d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var, cd4.h);
                    d4c.i0(e18Var, cd4.d, iqbVarE);
                    fqb fqbVar = fqb.E;
                    quj.d(gb9.N(b.c(fqbVar, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, k4g.h, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13), z4g.E, fd9.q0(-749983653, new rq(str, 15), e18Var), null, fd9.q0(1439669213, new wh(13, zy7Var), e18Var), pz7Var, e18Var, 25008, 8);
                    ta4Var.invoke(s64.a, e18Var, 6);
                    grc.z(fqbVar, f, e18Var, true);
                }
                break;
            default:
                ud0 ud0Var = (ud0) obj6;
                String strN = (String) obj5;
                String str2 = (String) obj4;
                nwb nwbVar = (nwb) obj3;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    fqb fqbVar2 = fqb.E;
                    if (ud0Var != null) {
                        e18Var2.a0(448650354);
                        ud0 ud0Var2 = ud0.d;
                        bpc bpcVarA = a.a(ud0Var, e18Var2);
                        if (strN == null) {
                            strN = vb7.n(e18Var2, 14476124, R.string.mcp_tool_content_description, e18Var2, false);
                        } else {
                            e18Var2.a0(14475535);
                            e18Var2.p(false);
                        }
                        cv8.b(bpcVarA, strN, b.o(fqbVar2, 16.0f), gm3.a(e18Var2).M, e18Var2, 392, 0);
                        e18Var2.p(false);
                    } else if (str2 != null && !((Boolean) nwbVar.getValue()).booleanValue()) {
                        e18Var2.a0(449021765);
                        Context context = (Context) e18Var2.j(w00.b);
                        boolean zF = e18Var2.f(str2);
                        Object objN = e18Var2.N();
                        lz1 lz1Var = jd4.a;
                        if (zF || objN == lz1Var) {
                            fx8 fx8Var = new fx8(context);
                            fx8Var.c = str2;
                            mx8.a(fx8Var);
                            objN = fx8Var.a();
                            e18Var2.k0(objN);
                        }
                        jx8 jx8Var = (jx8) objN;
                        if (strN == null) {
                            strN = vb7.n(e18Var2, 14496700, R.string.mcp_tool_content_description, e18Var2, false);
                        } else {
                            e18Var2.a0(14496111);
                            e18Var2.p(false);
                        }
                        va6 va6Var = new va6(f - 4.0f);
                        va6 va6Var2 = new va6(MTTypesetterKt.kLineSkipLimitMultiplier);
                        if (va6Var.compareTo(va6Var2) < 0) {
                            va6Var = va6Var2;
                        }
                        iqb iqbVarO = b.o(fqbVar2, va6Var.E);
                        boolean zF2 = e18Var2.f(nwbVar);
                        Object objN2 = e18Var2.N();
                        if (zF2 || objN2 == lz1Var) {
                            objN2 = new shf(8, nwbVar);
                            e18Var2.k0(objN2);
                        }
                        nuk.d(jx8Var, strN, iqbVarO, null, null, null, null, (bz7) objN2, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, 0, false, e18Var2, 0, 0, 65016);
                        e18Var2.p(false);
                    } else if (strN == null) {
                        e18Var2.a0(450002543);
                        iv1.b(ud0.B1, d4c.j0(R.string.mcp_tool_content_description, e18Var2), null, ef2.F, gm3.a(e18Var2).M, e18Var2, 3072, 4);
                        e18Var2.p(false);
                    } else {
                        e18Var2.a0(449694217);
                        tjh.b(quk.i(strN), gb9.N(fqbVar2, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 0.5f, 7), gm3.a(e18Var2).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (tkh) gm3.c(e18Var2).f.G, e18Var2, 48, 0, 131064);
                        e18Var2.p(false);
                    }
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ eu(pz7 pz7Var, ta4 ta4Var, float f, String str, zy7 zy7Var) {
        this.E = 2;
        this.F = pz7Var;
        this.G = ta4Var;
        this.I = f;
        this.H = str;
        this.J = zy7Var;
    }

    public /* synthetic */ eu(List list, bz7 bz7Var, qz7 qz7Var, iqb iqbVar, float f, int i, int i2) {
        this.E = i2;
        this.F = list;
        this.G = bz7Var;
        this.J = qz7Var;
        this.H = iqbVar;
        this.I = f;
    }
}
