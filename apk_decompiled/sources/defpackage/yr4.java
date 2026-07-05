package defpackage;

import android.net.Uri;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yr4 implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ String G;

    public /* synthetic */ yr4(String str, String str2, int i) {
        this.E = i;
        this.F = str;
        this.G = str2;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String strN;
        int i = this.E;
        String str = this.G;
        String str2 = this.F;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                pz7 pz7Var = (pz7) obj;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                pz7Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((e18) ld4Var).h(pz7Var) ? 4 : 2;
                }
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                    e18Var.T();
                } else {
                    if (bsg.I0(str2)) {
                        e18Var.a0(-1719169579);
                        if (str != null) {
                            e18Var.a0(-1719123017);
                            strN = d4c.k0(R.string.conway_composer_placeholder_fork, new Object[]{str}, e18Var);
                            e18Var.p(false);
                        } else {
                            strN = vb7.n(e18Var, -1718994553, R.string.conway_composer_placeholder, e18Var, false);
                        }
                        tjh.b(strN, null, gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 0, 24960, 110586);
                        e18Var.p(false);
                    } else {
                        e18Var.a0(-1718630861);
                        e18Var.p(false);
                    }
                    pz7Var.invoke(e18Var, Integer.valueOf(iIntValue & 14));
                }
                break;
            case 1:
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e18Var2.T();
                } else {
                    wtk.d(this.F, this.G, null, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var2, 0, 60);
                }
                break;
            case 2:
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((nr7) obj).getClass();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    e18Var3.T();
                } else {
                    tjh.b(this.F, null, gm3.a(e18Var3).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var3).e.E).i, e18Var3, 0, 0, 131066);
                    String str3 = this.G;
                    if (str3 == null) {
                        e18Var3.a0(767277125);
                        e18Var3.p(false);
                    } else {
                        e18Var3.a0(767020693);
                        tjh.b(str3, null, gm3.a(e18Var3).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var3).e.E).k, e18Var3, 0, 0, 131066);
                        e18Var3.p(false);
                    }
                }
                break;
            case 3:
                i4g i4gVar = (i4g) obj;
                ld4 ld4Var4 = (ld4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                i4gVar.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((e18) ld4Var4).f(i4gVar) ? 4 : 2;
                }
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    e18Var4.T();
                } else {
                    xo1 xo1Var = lja.K;
                    iqb iqbVarN = gb9.N(b.c, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, i4gVar.b, 7);
                    o5b o5bVarD = dw1.d(xo1Var, false);
                    int iHashCode = Long.hashCode(e18Var4.T);
                    hyc hycVarL = e18Var4.l();
                    iqb iqbVarE = kxk.E(e18Var4, iqbVarN);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var4.e0();
                    if (e18Var4.S) {
                        e18Var4.k(re4Var);
                    } else {
                        e18Var4.n0();
                    }
                    d4c.i0(e18Var4, cd4.f, o5bVarD);
                    d4c.i0(e18Var4, cd4.e, hycVarL);
                    d4c.i0(e18Var4, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var4, cd4.h);
                    d4c.i0(e18Var4, cd4.d, iqbVarE);
                    tnk.h(Uri.parse(str2), this.G, b.c(fqb.E, 1.0f), null, e18Var4, 384);
                    e18Var4.p(true);
                }
                break;
            default:
                ld4 ld4Var5 = (ld4) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((i4g) obj).getClass();
                e18 e18Var5 = (e18) ld4Var5;
                if (!e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    e18Var5.T();
                } else {
                    xvk.c(yfd.p(b.c, gm3.a(e18Var5).p, zni.b), fd9.q0(-859648687, new ny3(str2, str, 10), e18Var5), e18Var5, 48, 0);
                }
                break;
        }
        return ieiVar;
    }
}
