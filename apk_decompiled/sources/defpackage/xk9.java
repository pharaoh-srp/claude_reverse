package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xk9 extends i28 implements aib {
    public int F;
    public uk9 G;
    public wk9 H;
    public wk9 I;
    public wk9 J;
    public wk9 K;

    public static xk9 h() {
        xk9 xk9Var = new xk9();
        xk9Var.G = uk9.K;
        wk9 wk9Var = wk9.K;
        xk9Var.H = wk9Var;
        xk9Var.I = wk9Var;
        xk9Var.J = wk9Var;
        xk9Var.K = wk9Var;
        return xk9Var;
    }

    @Override // defpackage.i28
    public final b3 c() {
        yk9 yk9VarG = g();
        yk9VarG.b();
        return yk9VarG;
    }

    public final Object clone() {
        xk9 xk9VarH = h();
        xk9VarH.i(g());
        return xk9VarH;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // defpackage.i28
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.i28 d(defpackage.t34 r3, defpackage.oc7 r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            sk9 r1 = defpackage.yk9.O     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            yk9 r1 = new yk9     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            b3 r4 = r3.E     // Catch: java.lang.Throwable -> Lf
            yk9 r4 = (defpackage.yk9) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.i(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xk9.d(t34, oc7):i28");
    }

    @Override // defpackage.i28
    public final /* bridge */ /* synthetic */ i28 f(u28 u28Var) {
        i((yk9) u28Var);
        return this;
    }

    public final yk9 g() {
        yk9 yk9Var = new yk9(this);
        int i = this.F;
        int i2 = (i & 1) != 1 ? 0 : 1;
        yk9Var.G = this.G;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        yk9Var.H = this.H;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        yk9Var.I = this.I;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        yk9Var.J = this.J;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        yk9Var.K = this.K;
        yk9Var.F = i2;
        return yk9Var;
    }

    public final void i(yk9 yk9Var) {
        wk9 wk9Var;
        wk9 wk9Var2;
        wk9 wk9Var3;
        wk9 wk9Var4;
        uk9 uk9Var;
        if (yk9Var == yk9.N) {
            return;
        }
        if ((yk9Var.F & 1) == 1) {
            uk9 uk9Var2 = yk9Var.G;
            if ((this.F & 1) != 1 || (uk9Var = this.G) == uk9.K) {
                this.G = uk9Var2;
            } else {
                tk9 tk9VarG = tk9.g();
                tk9VarG.i(uk9Var);
                tk9VarG.i(uk9Var2);
                this.G = tk9VarG.h();
            }
            this.F |= 1;
        }
        if ((yk9Var.F & 2) == 2) {
            wk9 wk9Var5 = yk9Var.H;
            if ((this.F & 2) != 2 || (wk9Var4 = this.H) == wk9.K) {
                this.H = wk9Var5;
            } else {
                vk9 vk9VarI = wk9.i(wk9Var4);
                vk9VarI.h(wk9Var5);
                this.H = vk9VarI.g();
            }
            this.F |= 2;
        }
        if ((yk9Var.F & 4) == 4) {
            wk9 wk9Var6 = yk9Var.I;
            if ((this.F & 4) != 4 || (wk9Var3 = this.I) == wk9.K) {
                this.I = wk9Var6;
            } else {
                vk9 vk9VarI2 = wk9.i(wk9Var3);
                vk9VarI2.h(wk9Var6);
                this.I = vk9VarI2.g();
            }
            this.F |= 4;
        }
        if ((yk9Var.F & 8) == 8) {
            wk9 wk9Var7 = yk9Var.J;
            if ((this.F & 8) != 8 || (wk9Var2 = this.J) == wk9.K) {
                this.J = wk9Var7;
            } else {
                vk9 vk9VarI3 = wk9.i(wk9Var2);
                vk9VarI3.h(wk9Var7);
                this.J = vk9VarI3.g();
            }
            this.F |= 8;
        }
        if ((yk9Var.F & 16) == 16) {
            wk9 wk9Var8 = yk9Var.K;
            if ((this.F & 16) != 16 || (wk9Var = this.K) == wk9.K) {
                this.K = wk9Var8;
            } else {
                vk9 vk9VarI4 = wk9.i(wk9Var);
                vk9VarI4.h(wk9Var8);
                this.K = vk9VarI4.g();
            }
            this.F |= 16;
        }
        this.E = this.E.b(yk9Var.E);
    }
}
