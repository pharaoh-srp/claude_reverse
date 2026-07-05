package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vk9 extends i28 implements aib {
    public int F;
    public int G;
    public int H;

    @Override // defpackage.i28
    public final b3 c() {
        wk9 wk9VarG = g();
        wk9VarG.b();
        return wk9VarG;
    }

    public final Object clone() {
        vk9 vk9Var = new vk9();
        vk9Var.h(g());
        return vk9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // defpackage.i28
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.i28 d(defpackage.t34 r2, defpackage.oc7 r3) throws java.lang.Throwable {
        /*
            r1 = this;
            r3 = 0
            sk9 r0 = defpackage.wk9.L     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r0.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            wk9 r0 = new wk9     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r1.h(r0)
            return r1
        Lf:
            r2 = move-exception
            goto L19
        L11:
            r2 = move-exception
            b3 r0 = r2.E     // Catch: java.lang.Throwable -> Lf
            wk9 r0 = (defpackage.wk9) r0     // Catch: java.lang.Throwable -> Lf
            throw r2     // Catch: java.lang.Throwable -> L17
        L17:
            r2 = move-exception
            r3 = r0
        L19:
            if (r3 == 0) goto L1e
            r1.h(r3)
        L1e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vk9.d(t34, oc7):i28");
    }

    @Override // defpackage.i28
    public final /* bridge */ /* synthetic */ i28 f(u28 u28Var) {
        h((wk9) u28Var);
        return this;
    }

    public final wk9 g() {
        wk9 wk9Var = new wk9(this);
        int i = this.F;
        int i2 = (i & 1) != 1 ? 0 : 1;
        wk9Var.G = this.G;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        wk9Var.H = this.H;
        wk9Var.F = i2;
        return wk9Var;
    }

    public final void h(wk9 wk9Var) {
        if (wk9Var == wk9.K) {
            return;
        }
        int i = wk9Var.F;
        if ((i & 1) == 1) {
            int i2 = wk9Var.G;
            this.F = 1 | this.F;
            this.G = i2;
        }
        if ((i & 2) == 2) {
            int i3 = wk9Var.H;
            this.F = 2 | this.F;
            this.H = i3;
        }
        this.E = this.E.b(wk9Var.E);
    }
}
