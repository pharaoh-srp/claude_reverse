package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class al9 extends i28 implements aib {
    public int F;
    public int G;
    public int H;
    public Object I;
    public bl9 J;
    public List K;
    public List L;

    public static al9 g() {
        al9 al9Var = new al9();
        al9Var.G = 1;
        al9Var.I = "";
        al9Var.J = bl9.NONE;
        List list = Collections.EMPTY_LIST;
        al9Var.K = list;
        al9Var.L = list;
        return al9Var;
    }

    @Override // defpackage.i28
    public final b3 c() {
        cl9 cl9VarH = h();
        cl9VarH.b();
        return cl9VarH;
    }

    public final Object clone() {
        al9 al9Var = new al9();
        al9Var.G = 1;
        al9Var.I = "";
        al9Var.J = bl9.NONE;
        List list = Collections.EMPTY_LIST;
        al9Var.K = list;
        al9Var.L = list;
        al9Var.i(h());
        return al9Var;
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
            sk9 r0 = defpackage.cl9.R     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r0.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            cl9 r0 = new cl9     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r1.i(r0)
            return r1
        Lf:
            r2 = move-exception
            goto L19
        L11:
            r2 = move-exception
            b3 r0 = r2.E     // Catch: java.lang.Throwable -> Lf
            cl9 r0 = (defpackage.cl9) r0     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.al9.d(t34, oc7):i28");
    }

    @Override // defpackage.i28
    public final /* bridge */ /* synthetic */ i28 f(u28 u28Var) {
        i((cl9) u28Var);
        return this;
    }

    public final cl9 h() {
        cl9 cl9Var = new cl9(this);
        int i = this.F;
        int i2 = (i & 1) != 1 ? 0 : 1;
        cl9Var.G = this.G;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        cl9Var.H = this.H;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        cl9Var.I = this.I;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        cl9Var.J = this.J;
        if ((i & 16) == 16) {
            this.K = Collections.unmodifiableList(this.K);
            this.F &= -17;
        }
        cl9Var.K = this.K;
        if ((this.F & 32) == 32) {
            this.L = Collections.unmodifiableList(this.L);
            this.F &= -33;
        }
        cl9Var.M = this.L;
        cl9Var.F = i2;
        return cl9Var;
    }

    public final void i(cl9 cl9Var) {
        if (cl9Var == cl9.Q) {
            return;
        }
        int i = cl9Var.F;
        if ((i & 1) == 1) {
            int i2 = cl9Var.G;
            this.F = 1 | this.F;
            this.G = i2;
        }
        if ((i & 2) == 2) {
            int i3 = cl9Var.H;
            this.F = 2 | this.F;
            this.H = i3;
        }
        if ((i & 4) == 4) {
            this.F |= 4;
            this.I = cl9Var.I;
        }
        if ((i & 8) == 8) {
            bl9 bl9Var = cl9Var.J;
            bl9Var.getClass();
            this.F = 8 | this.F;
            this.J = bl9Var;
        }
        if (!cl9Var.K.isEmpty()) {
            if (this.K.isEmpty()) {
                this.K = cl9Var.K;
                this.F &= -17;
            } else {
                if ((this.F & 16) != 16) {
                    this.K = new ArrayList(this.K);
                    this.F |= 16;
                }
                this.K.addAll(cl9Var.K);
            }
        }
        if (!cl9Var.M.isEmpty()) {
            if (this.L.isEmpty()) {
                this.L = cl9Var.M;
                this.F &= -33;
            } else {
                if ((this.F & 32) != 32) {
                    this.L = new ArrayList(this.L);
                    this.F |= 32;
                }
                this.L.addAll(cl9Var.M);
            }
        }
        this.E = this.E.b(cl9Var.E);
    }
}
