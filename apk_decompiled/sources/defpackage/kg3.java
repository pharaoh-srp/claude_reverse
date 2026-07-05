package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class kg3 implements s6a {
    public final o13 a;
    public final p13 b;
    public final o13 c;
    public final p13 d;
    public final ide e = new ide("(.+) \\+(\\d+)");

    public kg3(o13 o13Var, p13 p13Var, o13 o13Var2, p13 p13Var2) {
        this.a = o13Var;
        this.b = p13Var;
        this.c = o13Var2;
        this.d = p13Var2;
    }

    @Override // defpackage.s6a
    public final boolean a(String str) {
        str.getClass();
        return ig3.b(str);
    }

    @Override // defpackage.s6a
    public final void b(String str, String str2, ld4 ld4Var, int i) {
        e18 e18Var;
        rg3 rg3Var;
        str.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1234390510);
        int i2 = i | (e18Var2.f(str) ? 4 : 2) | (e18Var2.f(str2) ? 32 : 16) | (e18Var2.h(this) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        final int i3 = 1;
        final int i4 = 0;
        if (e18Var2.Q(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 14) == 4;
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (z || objN == lz1Var) {
                objN = ig3.a(str);
                e18Var2.k0(objN);
            }
            final String str3 = (String) objN;
            boolean z2 = (i2 & 112) == 32;
            Object objN2 = e18Var2.N();
            if (z2 || objN2 == lz1Var) {
                if (str2 == null) {
                    objN2 = rg3.c;
                } else {
                    ova ovaVarE = this.e.e(str2);
                    if (ovaVarE != null) {
                        ax5 ax5VarG = ulk.g(ovaVarE);
                        String str4 = (String) ((mva) ax5VarG.v().a()).get(1);
                        Integer numS0 = isg.s0((String) ((mva) ax5VarG.v().a()).get(2));
                        rg3Var = new rg3(str4, numS0 != null ? numS0.intValue() : 0);
                    } else {
                        rg3Var = new rg3(str2, 0);
                    }
                    objN2 = rg3Var;
                }
                e18Var2.k0(objN2);
            }
            rg3 rg3Var2 = (rg3) objN2;
            boolean zF = e18Var2.f(str3);
            Object objN3 = e18Var2.N();
            if (zF || objN3 == lz1Var) {
                objN3 = str3 != null ? (String) this.b.invoke(str3) : null;
                e18Var2.k0(objN3);
            }
            String str5 = (String) objN3;
            boolean zF2 = e18Var2.f(str3);
            Object objN4 = e18Var2.N();
            if (zF2 || objN4 == lz1Var) {
                String str6 = str3 != null ? (String) this.d.invoke(str3) : null;
                e18Var2.k0(str6);
                objN4 = str6;
            }
            String str7 = (String) objN4;
            String strB = rg3Var2.b();
            if (strB == null) {
                strB = vb7.n(e18Var2, -838273988, R.string.generic_unknown, e18Var2, false);
            } else {
                e18Var2.a0(-838274701);
                e18Var2.p(false);
            }
            int iA = rg3Var2.a();
            boolean zF3 = e18Var2.f(str3) | e18Var2.h(this);
            Object objN5 = e18Var2.N();
            if (zF3 || objN5 == lz1Var) {
                objN5 = new zy7() { // from class: jg3
                    @Override // defpackage.zy7
                    public final Object a() {
                        int i5 = i4;
                        iei ieiVar = iei.a;
                        kg3 kg3Var = this;
                        String str8 = str3;
                        switch (i5) {
                            case 0:
                                if (str8 != null) {
                                    kg3Var.a.invoke(str8);
                                }
                                break;
                            default:
                                if (str8 != null) {
                                    kg3Var.c.invoke(str8);
                                }
                                break;
                        }
                        return ieiVar;
                    }
                };
                e18Var2.k0(objN5);
            }
            zy7 zy7Var = (zy7) objN5;
            boolean zF4 = e18Var2.f(str3) | e18Var2.h(this);
            Object objN6 = e18Var2.N();
            if (zF4 || objN6 == lz1Var) {
                objN6 = new zy7() { // from class: jg3
                    @Override // defpackage.zy7
                    public final Object a() {
                        int i5 = i3;
                        iei ieiVar = iei.a;
                        kg3 kg3Var = this;
                        String str8 = str3;
                        switch (i5) {
                            case 0:
                                if (str8 != null) {
                                    kg3Var.a.invoke(str8);
                                }
                                break;
                            default:
                                if (str8 != null) {
                                    kg3Var.c.invoke(str8);
                                }
                                break;
                        }
                        return ieiVar;
                    }
                };
                e18Var2.k0(objN6);
            }
            e18Var = e18Var2;
            dkk.a(strB, iA, zy7Var, str5, (zy7) objN6, str7, null, null, null, 0L, 0L, null, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var, 0);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new m6(this, i, str, str2, 28);
        }
    }
}
