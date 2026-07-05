package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class gp6 {
    public static final d9i a = new d9i(j06.J, j06.K);
    public static final yig b = kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, 400.0f, null, 5);
    public static final yig c;
    public static final yig d;

    static {
        kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, 400.0f, null, 5);
        l9e l9eVar = nzi.a;
        c = kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, 400.0f, new y69(4294967297L), 1);
        d = kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, 400.0f, new g79(4294967297L), 1);
    }

    public static wp6 a(kl7 kl7Var, vo1 vo1Var, int i) {
        vo1 vo1Var2 = lja.U;
        int i2 = 1;
        if ((i & 1) != 0) {
            l9e l9eVar = nzi.a;
            kl7Var = kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, 400.0f, new g79(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            vo1Var = vo1Var2;
        }
        return b(x44.r(vo1Var, lja.S) ? lja.J : x44.r(vo1Var, vo1Var2) ? lja.L : lja.K, kl7Var, new pgg(i2, 19));
    }

    public static final wp6 b(tt ttVar, kl7 kl7Var, bz7 bz7Var) {
        return new wp6(new b6i((he7) null, (s9g) null, new dh2(ttVar, kl7Var, bz7Var), (l6f) null, (LinkedHashMap) null, 123));
    }

    public static /* synthetic */ wp6 c(int i) {
        xo1 xo1Var = lja.K;
        l9e l9eVar = nzi.a;
        yig yigVarK = kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, 400.0f, new g79(4294967297L), 1);
        if ((i & 2) != 0) {
            xo1Var = lja.O;
        }
        return b(xo1Var, yigVarK, j06.L);
    }

    public static wp6 d(yig yigVar, tn tnVar, int i) {
        wo1 wo1Var = lja.R;
        wo1 wo1Var2 = lja.P;
        int i2 = 1;
        if ((i & 1) != 0) {
            l9e l9eVar = nzi.a;
            yigVar = kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, 400.0f, new g79(4294967297L), 1);
        }
        wo1 wo1Var3 = (i & 2) != 0 ? wo1Var : wo1Var2;
        bz7 bz7Var = tnVar;
        if ((i & 8) != 0) {
            bz7Var = j06.M;
        }
        return b(x44.r(wo1Var3, wo1Var2) ? lja.H : x44.r(wo1Var3, wo1Var) ? lja.N : lja.K, yigVar, new a52(i2, bz7Var));
    }

    public static wp6 e(kl7 kl7Var, int i) {
        if ((i & 1) != 0) {
            kl7Var = kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, 400.0f, null, 5);
        }
        return new wp6(new b6i(new he7(MTTypesetterKt.kLineSkipLimitMultiplier, kl7Var), (s9g) null, (dh2) null, (l6f) null, (LinkedHashMap) null, 126));
    }

    public static d77 f(kl7 kl7Var, int i) {
        if ((i & 1) != 0) {
            kl7Var = kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, 400.0f, null, 5);
        }
        return new d77(new b6i(new he7(MTTypesetterKt.kLineSkipLimitMultiplier, kl7Var), (s9g) null, (dh2) null, (l6f) null, (LinkedHashMap) null, 126));
    }

    public static wp6 g(kl7 kl7Var, float f, int i) {
        if ((i & 1) != 0) {
            kl7Var = kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, 400.0f, null, 5);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return new wp6(new b6i((he7) null, (s9g) null, (dh2) null, new l6f(f, d5i.b, kl7Var), (LinkedHashMap) null, 119));
    }

    public static d77 h(kl7 kl7Var, float f, int i) {
        if ((i & 1) != 0) {
            kl7Var = kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, 400.0f, null, 5);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return new d77(new b6i((he7) null, (s9g) null, (dh2) null, new l6f(f, d5i.b, kl7Var), (LinkedHashMap) null, 119));
    }

    public static d77 i(kl7 kl7Var, vo1 vo1Var, int i) {
        vo1 vo1Var2 = lja.U;
        int i2 = 1;
        if ((i & 1) != 0) {
            l9e l9eVar = nzi.a;
            kl7Var = kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, 400.0f, new g79(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            vo1Var = vo1Var2;
        }
        return j(x44.r(vo1Var, lja.S) ? lja.J : x44.r(vo1Var, vo1Var2) ? lja.L : lja.K, kl7Var, new pgg(i2, 20));
    }

    public static final d77 j(tt ttVar, kl7 kl7Var, bz7 bz7Var) {
        return new d77(new b6i((he7) null, (s9g) null, new dh2(ttVar, kl7Var, bz7Var), (l6f) null, (LinkedHashMap) null, 123));
    }

    public static /* synthetic */ d77 k(int i) {
        xo1 xo1Var = lja.K;
        l9e l9eVar = nzi.a;
        yig yigVarK = kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, 400.0f, new g79(4294967297L), 1);
        if ((i & 2) != 0) {
            xo1Var = lja.O;
        }
        return j(xo1Var, yigVarK, j06.N);
    }

    public static d77 l(yig yigVar, tn tnVar, int i) {
        wo1 wo1Var = lja.R;
        wo1 wo1Var2 = lja.P;
        if ((i & 1) != 0) {
            l9e l9eVar = nzi.a;
            yigVar = kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, 400.0f, new g79(4294967297L), 1);
        }
        wo1 wo1Var3 = (i & 2) != 0 ? wo1Var : wo1Var2;
        bz7 bz7Var = tnVar;
        if ((i & 8) != 0) {
            bz7Var = j06.O;
        }
        return j(x44.r(wo1Var3, wo1Var2) ? lja.H : x44.r(wo1Var3, wo1Var) ? lja.N : lja.K, yigVar, new a52(2, bz7Var));
    }

    public static final wp6 m(kl7 kl7Var, bz7 bz7Var) {
        return new wp6(new b6i((he7) null, new s9g(kl7Var, new a52(3, bz7Var)), (dh2) null, (l6f) null, (LinkedHashMap) null, 125));
    }

    public static /* synthetic */ wp6 n(int i, bz7 bz7Var) {
        l9e l9eVar = nzi.a;
        yig yigVarK = kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, 400.0f, new y69(4294967297L), 1);
        if ((i & 2) != 0) {
            bz7Var = f06.J;
        }
        return m(yigVarK, bz7Var);
    }

    public static final d77 o(kl7 kl7Var, bz7 bz7Var) {
        return new d77(new b6i((he7) null, new s9g(kl7Var, new a52(4, bz7Var)), (dh2) null, (l6f) null, (LinkedHashMap) null, 125));
    }

    public static /* synthetic */ d77 p(int i, bz7 bz7Var) {
        l9e l9eVar = nzi.a;
        yig yigVarK = kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, 400.0f, new y69(4294967297L), 1);
        if ((i & 2) != 0) {
            bz7Var = f06.K;
        }
        return o(yigVarK, bz7Var);
    }
}
