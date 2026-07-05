package defpackage;

import android.graphics.Color;
import androidx.compose.foundation.layout.b;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class m82 implements sz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ List F;
    public final /* synthetic */ o82 G;

    public /* synthetic */ m82(List list, o82 o82Var, int i) {
        this.E = i;
        this.F = list;
        this.G = o82Var;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.E;
        iei ieiVar = iei.a;
        fqb fqbVar = fqb.E;
        lz1 lz1Var = jd4.a;
        List list = this.F;
        o82 o82Var = this.G;
        switch (i) {
            case 0:
                px9 px9Var = (px9) obj;
                int iIntValue = ((Number) obj2).intValue();
                ld4 ld4Var = (ld4) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i2 = (iIntValue2 & 6) == 0 ? iIntValue2 | (((e18) ld4Var).f(px9Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i2 |= ((e18) ld4Var).d(iIntValue) ? 32 : 16;
                }
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
                    e18Var.T();
                } else {
                    k82 k82Var = (k82) list.get(iIntValue);
                    e18Var.a0(-2130672179);
                    String str = k82Var.e;
                    long jM = d54.g;
                    if (str != null) {
                        try {
                            jM = d4c.m(Color.parseColor(str));
                            break;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    long j = jM;
                    String str2 = k82Var.b;
                    boolean z = k82Var.d;
                    boolean z2 = k82Var.f;
                    boolean zH = e18Var.h(o82Var) | e18Var.f(k82Var);
                    Object objN = e18Var.N();
                    if (zH || objN == lz1Var) {
                        objN = new l82(o82Var, k82Var, 0);
                        e18Var.k0(objN);
                    }
                    gvj.a(str2, z, z2, j, (zy7) objN, b.c(fqbVar, 1.0f), e18Var, 196608);
                    e18Var.p(false);
                }
                break;
            default:
                px9 px9Var2 = (px9) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                ld4 ld4Var2 = (ld4) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i3 = (iIntValue4 & 6) == 0 ? iIntValue4 | (((e18) ld4Var2).f(px9Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i3 |= ((e18) ld4Var2).d(iIntValue3) ? 32 : 16;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(i3 & 1, (i3 & 147) != 146)) {
                    e18Var2.T();
                } else {
                    k82 k82Var2 = (k82) list.get(iIntValue3);
                    e18Var2.a0(-136015105);
                    String str3 = k82Var2.e;
                    long jM2 = d54.g;
                    if (str3 != null) {
                        try {
                            jM2 = d4c.m(Color.parseColor(str3));
                            break;
                        } catch (IllegalArgumentException unused2) {
                        }
                    }
                    long j2 = jM2;
                    String str4 = k82Var2.b;
                    boolean z3 = k82Var2.d;
                    boolean z4 = k82Var2.f;
                    boolean zH2 = e18Var2.h(o82Var) | e18Var2.f(k82Var2);
                    Object objN2 = e18Var2.N();
                    if (zH2 || objN2 == lz1Var) {
                        objN2 = new l82(o82Var, k82Var2, 1);
                        e18Var2.k0(objN2);
                    }
                    gvj.a(str4, z3, z4, j2, (zy7) objN2, b.c(fqbVar, 1.0f), e18Var2, 196608);
                    e18Var2.p(false);
                }
                break;
        }
        return ieiVar;
    }
}
