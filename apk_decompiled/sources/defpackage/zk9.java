package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zk9 extends i28 implements aib {
    public int F;
    public List G;
    public List H;

    public static zk9 g() {
        zk9 zk9Var = new zk9();
        List list = Collections.EMPTY_LIST;
        zk9Var.G = list;
        zk9Var.H = list;
        return zk9Var;
    }

    @Override // defpackage.i28
    public final b3 c() {
        dl9 dl9VarH = h();
        dl9VarH.b();
        return dl9VarH;
    }

    public final Object clone() {
        zk9 zk9Var = new zk9();
        List list = Collections.EMPTY_LIST;
        zk9Var.G = list;
        zk9Var.H = list;
        zk9Var.i(h());
        return zk9Var;
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
            sk9 r1 = defpackage.dl9.L     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            dl9 r1 = new dl9     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            b3 r4 = r3.E     // Catch: java.lang.Throwable -> Lf
            dl9 r4 = (defpackage.dl9) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zk9.d(t34, oc7):i28");
    }

    @Override // defpackage.i28
    public final /* bridge */ /* synthetic */ i28 f(u28 u28Var) {
        i((dl9) u28Var);
        return this;
    }

    public final dl9 h() {
        dl9 dl9Var = new dl9(this);
        if ((this.F & 1) == 1) {
            this.G = Collections.unmodifiableList(this.G);
            this.F &= -2;
        }
        dl9Var.F = this.G;
        if ((this.F & 2) == 2) {
            this.H = Collections.unmodifiableList(this.H);
            this.F &= -3;
        }
        dl9Var.G = this.H;
        return dl9Var;
    }

    public final void i(dl9 dl9Var) {
        if (dl9Var == dl9.K) {
            return;
        }
        if (!dl9Var.F.isEmpty()) {
            if (this.G.isEmpty()) {
                this.G = dl9Var.F;
                this.F &= -2;
            } else {
                if ((this.F & 1) != 1) {
                    this.G = new ArrayList(this.G);
                    this.F |= 1;
                }
                this.G.addAll(dl9Var.F);
            }
        }
        if (!dl9Var.G.isEmpty()) {
            if (this.H.isEmpty()) {
                this.H = dl9Var.G;
                this.F &= -3;
            } else {
                if ((this.F & 2) != 2) {
                    this.H = new ArrayList(this.H);
                    this.F |= 2;
                }
                this.H.addAll(dl9Var.G);
            }
        }
        this.E = this.E.b(dl9Var.E);
    }
}
