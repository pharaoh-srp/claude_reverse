package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mb1 implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ zy7 F;

    public /* synthetic */ mb1(int i, zy7 zy7Var) {
        this.E = i;
        this.F = zy7Var;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        lz1 lz1Var = jd4.a;
        fqb fqbVar = fqb.E;
        zy7 zy7Var = this.F;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e18Var.T();
                } else {
                    dgj.b(this.F, fqb.E, null, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var, 0, 12);
                }
                break;
            case 1:
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e18Var2.T();
                } else {
                    uu1 uu1Var = uu1.a;
                    long jB = d54.b(0.32f, p54.d(knk.g, e18Var2));
                    Object objN = e18Var2.N();
                    if (objN == lz1Var) {
                        objN = new kac(15);
                        e18Var2.k0(objN);
                    }
                    pzg.a(tjf.a(fqbVar, (bz7) objN), null, jB, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, fd9.q0(-436771938, new sxa(zy7Var), e18Var2), e18Var2, 12582912, ModuleDescriptor.MODULE_VERSION);
                }
                break;
            default:
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    e18Var3.T();
                } else {
                    String strP = gid.p(e84.c, R.string.nav_drawer_item_all_chats, e18Var3, e18Var3, fqbVar);
                    bpc bpcVarA = a.a(ud0.C, e18Var3);
                    tkh tkhVarB = tkh.b(((jm3) gm3.c(e18Var3).e.E).g, gm3.a(e18Var3).O, 0L, null, null, null, 0L, null, 0, 0L, null, 0, 16777214);
                    iqb iqbVarV = xn5.V(b.z(gb9.I(fqbVar, e84.a)), gm3.b(e18Var3).e);
                    boolean zF = e18Var3.f(zy7Var);
                    Object objN2 = e18Var3.N();
                    if (zF || objN2 == lz1Var) {
                        objN2 = new kl1(20, zy7Var);
                        e18Var3.k0(objN2);
                    }
                    prk.k(strP, gb9.I(androidx.compose.foundation.b.c(iqbVarV, false, null, null, null, (zy7) objN2, 15), e84.b), tkhVarB, bpcVarA, dv8.F, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, 0L, 0, 0, e18Var3, 28672, 2016);
                }
                break;
        }
        return ieiVar;
    }
}
