package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class f8g {
    public static final yig a = kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, 7);

    public static final wlg a(long j, kl7 kl7Var, String str, ld4 ld4Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            kl7Var = a;
        }
        kl7 kl7Var2 = kl7Var;
        if ((i2 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        e18 e18Var = (e18) ld4Var;
        boolean zF = e18Var.f(d54.f(j));
        Object objN = e18Var.N();
        if (zF || objN == jd4.a) {
            d9i d9iVar = new d9i(bx.V, new e0(10, d54.f(j)));
            e18Var.k0(d9iVar);
            objN = d9iVar;
        }
        return n80.c(new d54(j), (c9i) objN, kl7Var2, null, str2, e18Var, ((i << 3) & 896) | ((i << 6) & 57344), 8);
    }
}
