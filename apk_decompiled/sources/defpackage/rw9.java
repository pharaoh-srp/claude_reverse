package defpackage;

import android.text.SpannableString;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class rw9 implements sz7 {
    public final /* synthetic */ List E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ ii7 G;
    public final /* synthetic */ x48 H;
    public final /* synthetic */ m36 I;
    public final /* synthetic */ float J;
    public final /* synthetic */ fi7 K;
    public final /* synthetic */ uz7 L;
    public final /* synthetic */ bz7 M;

    public rw9(List list, boolean z, ii7 ii7Var, x48 x48Var, m36 m36Var, float f, fi7 fi7Var, uz7 uz7Var, bz7 bz7Var) {
        this.E = list;
        this.F = z;
        this.G = ii7Var;
        this.H = x48Var;
        this.I = m36Var;
        this.J = f;
        this.K = fi7Var;
        this.L = uz7Var;
        this.M = bz7Var;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        String str;
        String str2;
        n36 n36Var;
        ii7 ii7Var;
        px9 px9Var = (px9) obj;
        int iIntValue = ((Number) obj2).intValue();
        ld4 ld4Var = (ld4) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (((e18) ld4Var).f(px9Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= ((e18) ld4Var).d(iIntValue) ? 32 : 16;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(i & 1, (i & 147) != 146)) {
            n36 n36Var2 = (n36) this.E.get(iIntValue);
            e18Var.a0(-835400158);
            zy7 zy7Var = null;
            boolean z = this.F;
            ii7 ii7Var2 = this.G;
            List list = z ? (List) ii7Var2.h.get(Long.valueOf(n36Var2.a())) : null;
            Integer num = n36Var2.c;
            Integer num2 = n36Var2.d;
            iqb iqbVar = this.H.d.e;
            m36 m36Var = this.I;
            SpannableString[] spannableStringArr = (SpannableString[]) m36Var.b.getValue();
            if (spannableStringArr == null || (str = (SpannableString) mp0.I0(iIntValue, spannableStringArr)) == null) {
                n36 n36Var3 = (n36) w44.O0(iIntValue, m36Var.a.f);
                str = n36Var3 != null ? n36Var3.b : "";
            }
            lz1 lz1Var = jd4.a;
            if (z) {
                e18Var.a0(-834940801);
                boolean zH = e18Var.h(ii7Var2) | e18Var.f(n36Var2);
                Object objN = e18Var.N();
                if (zH || objN == lz1Var) {
                    objN = new p4(ii7Var2, 24, n36Var2);
                    e18Var.k0(objN);
                }
                zy7Var = (zy7) objN;
            } else {
                e18Var.a0(-834901060);
            }
            e18Var.p(false);
            List list2 = list;
            boolean z2 = !(list2 == null || list2.isEmpty());
            float f = this.J;
            fqb fqbVar = fqb.E;
            xsc.b(num, num2, str, f, zy7Var, z2, false, fqbVar, iqbVar, e18Var, 12582912, 64);
            if (!z || list2 == null || list2.isEmpty()) {
                e18Var.a0(-833001503);
                e18Var.p(false);
            } else {
                e18Var.a0(-834612139);
                fi7 fi7Var = this.K;
                String str3 = fi7Var.b;
                if (str3 == null) {
                    String str4 = fi7Var.a;
                    str2 = str4 == null ? "" : str4;
                } else {
                    str2 = str3;
                }
                boolean zH2 = e18Var.h(ii7Var2) | e18Var.f(n36Var2);
                uz7 uz7Var = this.L;
                boolean zF = zH2 | e18Var.f(uz7Var) | e18Var.f(str2);
                Object objN2 = e18Var.N();
                if (zF || objN2 == lz1Var) {
                    n36Var = n36Var2;
                    ii7Var = ii7Var2;
                    jo3 jo3Var = new jo3(ii7Var, n36Var, uz7Var, str2, 3);
                    e18Var.k0(jo3Var);
                    objN2 = jo3Var;
                } else {
                    n36Var = n36Var2;
                    ii7Var = ii7Var2;
                }
                bz7 bz7Var = (bz7) objN2;
                boolean zH3 = e18Var.h(ii7Var);
                Object objN3 = e18Var.N();
                if (zH3 || objN3 == lz1Var) {
                    objN3 = new dah(ii7Var);
                    e18Var.k0(objN3);
                }
                bz7 bz7Var2 = (bz7) objN3;
                boolean zH4 = e18Var.h(ii7Var) | e18Var.f(n36Var);
                bz7 bz7Var3 = this.M;
                boolean zF2 = zH4 | e18Var.f(bz7Var3);
                Object objN4 = e18Var.N();
                if (zF2 || objN4 == lz1Var) {
                    objN4 = new kc(ii7Var, n36Var, bz7Var3, 6);
                    e18Var.k0(objN4);
                }
                xsc.f(list, bz7Var, bz7Var2, (bz7) objN4, MTTypesetterKt.kLineSkipLimitMultiplier, fqbVar, e18Var, 196608);
                e18Var.p(false);
            }
            e18Var.p(false);
        } else {
            e18Var.T();
        }
        return iei.a;
    }
}
