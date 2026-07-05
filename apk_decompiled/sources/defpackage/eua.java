package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class eua {
    public static final eua b = new eua(0);
    public static final eua c = new eua(1);
    public final /* synthetic */ int a;

    public /* synthetic */ eua(int i) {
        this.a = i;
    }

    public final void a(int i, ld4 ld4Var, iqb iqbVar, String str, String str2) {
        e18 e18Var;
        int i2 = this.a;
        int i3 = FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        switch (i2) {
            case 0:
                str.getClass();
                iqbVar.getClass();
                e18 e18Var2 = (e18) ld4Var;
                e18Var2.c0(214466758);
                int i4 = i | (e18Var2.f(str) ? 4 : 2) | (e18Var2.f(str2) ? 32 : 16);
                if (e18Var2.f(this)) {
                    i3 = 16384;
                }
                int i5 = i4 | i3;
                if (e18Var2.Q(i5 & 1, (i5 & 9363) != 9362)) {
                    o5b o5bVarD = dw1.d(lja.G, false);
                    int iHashCode = Long.hashCode(e18Var2.T);
                    hyc hycVarL = e18Var2.l();
                    iqb iqbVarE = kxk.E(e18Var2, iqbVar);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var2.e0();
                    if (e18Var2.S) {
                        e18Var2.k(re4Var);
                    } else {
                        e18Var2.n0();
                    }
                    d4c.i0(e18Var2, cd4.f, o5bVarD);
                    d4c.i0(e18Var2, cd4.e, hycVarL);
                    d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var2, cd4.h);
                    d4c.i0(e18Var2, cd4.d, iqbVarE);
                    e18Var = e18Var2;
                    ulk.c(str, str2, null, null, null, e18Var, i5 & 1022);
                    e18Var.p(true);
                } else {
                    e18Var = e18Var2;
                    e18Var.T();
                }
                r7e r7eVarS = e18Var.s();
                if (r7eVarS != null) {
                    r7eVarS.d = new mm5(this, str, str2, iqbVar, i, 18);
                }
                break;
            default:
                str.getClass();
                iqbVar.getClass();
                e18 e18Var3 = (e18) ld4Var;
                e18Var3.c0(-375687096);
                int i6 = (e18Var3.f(str2) ? 32 : 16) | i | (e18Var3.f(str) ? 4 : 2);
                if (e18Var3.f(this)) {
                    i3 = 16384;
                }
                int i7 = i3 | i6;
                if (e18Var3.Q(i7 & 1, (i7 & 9363) != 9362)) {
                    rlk.e((i7 & 126) | 3456, e18Var3, iqbVar, str, str2);
                } else {
                    e18Var3.T();
                }
                r7e r7eVarS2 = e18Var3.s();
                if (r7eVarS2 != null) {
                    r7eVarS2.d = new v3e((Object) this, str, (Object) str2, iqbVar, i, 2);
                }
                break;
        }
    }
}
