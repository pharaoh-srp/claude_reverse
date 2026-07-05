package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.experience.SpotlightContent;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sy3 implements sz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    public /* synthetic */ sy3(bz7 bz7Var, String str, boolean z) {
        this.E = 0;
        this.F = z;
        this.G = bz7Var;
        this.H = str;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.E;
        lz1 lz1Var = jd4.a;
        fqb fqbVar = fqb.E;
        boolean z = this.F;
        iei ieiVar = iei.a;
        Object obj5 = this.H;
        Object obj6 = this.G;
        switch (i) {
            case 0:
                bz7 bz7Var = (bz7) obj6;
                String str = (String) obj5;
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
                    String strJ0 = d4c.j0(R.string.ccr_save, e18Var);
                    iqb iqbVarI = gb9.I(b.c(fqbVar, 1.0f), mncVar);
                    boolean z2 = this.F;
                    boolean zG = e18Var.g(z2) | e18Var.f(bz7Var) | e18Var.f(str);
                    Object objN = e18Var.N();
                    if (zG || objN == lz1Var) {
                        objN = new ry3(z2, bz7Var, str, 0);
                        e18Var.k0(objN);
                    }
                    dtj.a(strJ0, iqbVarI, z2, null, e12.a, null, 0L, (zy7) objN, e18Var, 24576, 104);
                }
                break;
            case 1:
                SpotlightContent spotlightContent = (SpotlightContent) obj6;
                vig vigVar = (vig) obj5;
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
                    dkk.c(spotlightContent, null, z ? 8.0f : 16.0f, mncVar2, null, vigVar, e18Var2, (iH2 << 6) & 7168);
                }
                break;
            case 2:
                lod lodVar = (lod) obj6;
                znd zndVar = (znd) obj5;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                ld4 ld4Var3 = (ld4) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((c90) obj).getClass();
                if ((iIntValue & 48) == 0) {
                    iIntValue |= ((e18) ld4Var3).g(zBooleanValue) ? 32 : 16;
                }
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue & 1, (iIntValue & 145) != 144)) {
                    e18Var3.T();
                } else if (!zBooleanValue) {
                    e18Var3.a0(-1656381776);
                    if (z) {
                        e18Var3.a0(-1656103396);
                        e18Var3.p(false);
                    } else {
                        e18Var3.a0(-1656347490);
                        String str2 = zndVar.d.b;
                        List list = (List) lodVar.k.getValue();
                        int size = list != null ? list.size() : 0;
                        List list2 = (List) lodVar.l.getValue();
                        qik.e(size + (list2 != null ? list2.size() : 0), 0, e18Var3, str2);
                        e18Var3.p(false);
                    }
                    e18Var3.p(false);
                } else {
                    e18Var3.a0(-1656527724);
                    qik.c(lodVar, zndVar, e18Var3, 64);
                    e18Var3.p(false);
                }
                break;
            case 3:
                whd whdVar = (whd) obj6;
                zy7 zy7Var = (zy7) obj5;
                ld4 ld4Var4 = (ld4) obj3;
                int iH3 = ebh.h((Integer) obj4, (s64) obj, (mnc) obj2);
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iH3 & 1, (iH3 & 129) != 128)) {
                    e18Var4.T();
                } else {
                    iqb iqbVar = e93.a;
                    xvk.c(gb9.L(fqbVar, 12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), fd9.q0(-266868814, new iv(whdVar, z, zy7Var), e18Var4), e18Var4, 48, 0);
                }
                break;
            default:
                sn8 sn8Var = (sn8) obj6;
                phg phgVar = (phg) obj5;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                ld4 ld4Var5 = (ld4) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((c90) obj).getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= ((e18) ld4Var5).g(zBooleanValue2) ? 32 : 16;
                }
                int i2 = iIntValue2;
                e18 e18Var5 = (e18) ld4Var5;
                if (!e18Var5.Q(i2 & 1, (i2 & 145) != 144)) {
                    e18Var5.T();
                } else if (zBooleanValue2) {
                    e18Var5.a0(108272535);
                    tjh.b(d4c.j0(R.string.stt_input_transcribing, e18Var5), null, gm3.a(e18Var5).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var5).e.E).i, e18Var5, 0, 0, 131066);
                    e18Var5.p(false);
                } else if (sn8Var == null) {
                    e18Var5.a0(696281940);
                    bvk.a(phgVar.j, b.e(b.c(fqbVar, 1.0f), 25.0f), 0L, 0L, e18Var5, 56);
                    e18Var5.p(false);
                } else {
                    e18Var5.a0(108759204);
                    cxe cxeVarA = axe.a(new ho0(8.0f, true, new sz6(1)), lja.Q, e18Var5, 54);
                    int iHashCode = Long.hashCode(e18Var5.T);
                    hyc hycVarL = e18Var5.l();
                    iqb iqbVarE = kxk.E(e18Var5, fqbVar);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var5.e0();
                    if (e18Var5.S) {
                        e18Var5.k(re4Var);
                    } else {
                        e18Var5.n0();
                    }
                    d4c.i0(e18Var5, cd4.f, cxeVarA);
                    d4c.i0(e18Var5, cd4.e, hycVarL);
                    d4c.i0(e18Var5, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var5, cd4.h);
                    d4c.i0(e18Var5, cd4.d, iqbVarE);
                    String strJ02 = d4c.j0(z ? R.string.stt_release_to_cancel : R.string.stt_release_to_send, e18Var5);
                    tkh tkhVar = ((jm3) gm3.c(e18Var5).e.E).i;
                    long j = gm3.a(e18Var5).O;
                    Object objN2 = e18Var5.N();
                    if (objN2 == lz1Var) {
                        objN2 = new z1g(13);
                        e18Var5.k0(objN2);
                    }
                    tjh.b(strJ02, tjf.a(fqbVar, (bz7) objN2), j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, tkhVar, e18Var5, 0, 24576, 114680);
                    bvk.a(phgVar.j, zni.t(xn5.i0(b.e(new hw9(1.0f, true), 25.0f), new z1g(10)), new z1g(11)), 0L, 0L, e18Var5, 8);
                    e18Var5.p(true);
                    e18Var5.p(false);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ sy3(Object obj, Object obj2, boolean z, int i) {
        this.E = i;
        this.G = obj;
        this.H = obj2;
        this.F = z;
    }

    public /* synthetic */ sy3(Object obj, boolean z, Object obj2, int i) {
        this.E = i;
        this.G = obj;
        this.F = z;
        this.H = obj2;
    }
}
