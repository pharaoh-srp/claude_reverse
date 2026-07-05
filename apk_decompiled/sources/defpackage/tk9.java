package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tk9 extends i28 implements aib {
    public int F;
    public int G;
    public int H;

    public static tk9 g() {
        return new tk9();
    }

    @Override // defpackage.i28
    public final b3 c() {
        uk9 uk9VarH = h();
        uk9VarH.b();
        return uk9VarH;
    }

    public final Object clone() {
        tk9 tk9Var = new tk9();
        tk9Var.i(h());
        return tk9Var;
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
            sk9 r0 = defpackage.uk9.L     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r0.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            uk9 r0 = new uk9     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r1.i(r0)
            return r1
        Lf:
            r2 = move-exception
            goto L19
        L11:
            r2 = move-exception
            b3 r0 = r2.E     // Catch: java.lang.Throwable -> Lf
            uk9 r0 = (defpackage.uk9) r0     // Catch: java.lang.Throwable -> Lf
            throw r2     // Catch: java.lang.Throwable -> L17
        L17:
            r2 = move-exception
            r3 = r0
        L19:
            if (r3 == 0) goto L1e
            r1.i(r3)
        L1e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tk9.d(t34, oc7):i28");
    }

    @Override // defpackage.i28
    public final /* bridge */ /* synthetic */ i28 f(u28 u28Var) {
        i((uk9) u28Var);
        return this;
    }

    public final uk9 h() {
        uk9 uk9Var = new uk9(this);
        int i = this.F;
        int i2 = (i & 1) != 1 ? 0 : 1;
        uk9Var.G = this.G;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        uk9Var.H = this.H;
        uk9Var.F = i2;
        return uk9Var;
    }

    public final void i(uk9 uk9Var) {
        if (uk9Var == uk9.K) {
            return;
        }
        int i = uk9Var.F;
        if ((i & 1) == 1) {
            int i2 = uk9Var.G;
            this.F = 1 | this.F;
            this.G = i2;
        }
        if ((i & 2) == 2) {
            int i3 = uk9Var.H;
            this.F = 2 | this.F;
            this.H = i3;
        }
        this.E = this.E.b(uk9Var.E);
    }
}
