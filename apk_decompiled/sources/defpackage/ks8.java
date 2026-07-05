package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class ks8 {
    public static final adi d = adi.a("/");
    public static final rl7 e = new rl7(9);
    public static final g11 f = new g11(FreeTypeConstants.FT_LOAD_PEDANTIC, 2);
    public static final e7g g = new e7g();
    public static ks8 h;
    public final nd0 a;
    public final nd0 b;
    public final boolean c;

    public ks8() {
        vf4 vf4Var = vf4.O1;
        this.a = new nd0(vf4Var.K);
        this.b = new nd0(vf4Var.L);
        this.c = vf4Var.M;
    }

    public static dpc a(String str, String str2) {
        byte b;
        if (h == null) {
            h = new ks8();
        }
        String strK = h.b.k(str2.toString());
        if (strK != null) {
            b = 4;
        } else {
            strK = g.k(str2.toString());
            b = 1;
        }
        return new dpc((CharSequence) f.j(new dpc(str, strK), e), Byte.valueOf(b));
    }

    public static dpc b(String str, String str2) {
        byte b;
        if (h == null) {
            h = new ks8();
        }
        String strK = h.a.k(str2.toString());
        if (strK != null) {
            b = 4;
        } else {
            strK = g.k(str2.toString());
            b = 1;
        }
        return new dpc((CharSequence) f.j(new dpc(str, strK), e), Byte.valueOf(b));
    }
}
