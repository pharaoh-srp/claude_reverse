package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class px9 {
    public isc a;
    public isc b;

    public static iqb a(px9 px9Var, iqb iqbVar, kl7 kl7Var, kl7 kl7Var2, int i) {
        if ((i & 1) != 0) {
            kl7Var = kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, 400.0f, null, 5);
        }
        if ((i & 2) != 0) {
            l9e l9eVar = nzi.a;
            kl7Var2 = kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, 400.0f, new y69(4294967297L), 1);
        }
        yig yigVarK = (i & 4) != 0 ? kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, 400.0f, null, 5) : null;
        px9Var.getClass();
        return (kl7Var == null && kl7Var2 == null && yigVarK == null) ? iqbVar : iqbVar.B(new qy9(kl7Var, kl7Var2, yigVarK));
    }

    public static iqb b(px9 px9Var) {
        return new qsc(px9Var.a, px9Var.b);
    }

    public static iqb c(px9 px9Var) {
        return new qsc(px9Var.a, null, 4);
    }
}
