package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class qsd extends i28 implements aib {
    public int F;
    public int G;
    public int H;
    public rsd I;
    public ntd J;
    public int K;
    public List L;
    public List M;

    public static qsd h() {
        qsd qsdVar = new qsd();
        qsdVar.I = rsd.TRUE;
        qsdVar.J = ntd.X;
        List list = Collections.EMPTY_LIST;
        qsdVar.L = list;
        qsdVar.M = list;
        return qsdVar;
    }

    @Override // defpackage.i28
    public final b3 c() {
        ssd ssdVarG = g();
        if (ssdVarG.b()) {
            return ssdVarG;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        qsd qsdVarH = h();
        qsdVarH.i(g());
        return qsdVarH;
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
            jsd r1 = defpackage.ssd.Q     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            ssd r1 = new ssd     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            b3 r4 = r3.E     // Catch: java.lang.Throwable -> Lf
            ssd r4 = (defpackage.ssd) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qsd.d(t34, oc7):i28");
    }

    @Override // defpackage.i28
    public final /* bridge */ /* synthetic */ i28 f(u28 u28Var) {
        i((ssd) u28Var);
        return this;
    }

    public final ssd g() {
        ssd ssdVar = new ssd(this);
        int i = this.F;
        int i2 = (i & 1) != 1 ? 0 : 1;
        ssdVar.G = this.G;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        ssdVar.H = this.H;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        ssdVar.I = this.I;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        ssdVar.J = this.J;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        ssdVar.K = this.K;
        if ((i & 32) == 32) {
            this.L = Collections.unmodifiableList(this.L);
            this.F &= -33;
        }
        ssdVar.L = this.L;
        if ((this.F & 64) == 64) {
            this.M = Collections.unmodifiableList(this.M);
            this.F &= -65;
        }
        ssdVar.M = this.M;
        ssdVar.F = i2;
        return ssdVar;
    }

    public final void i(ssd ssdVar) {
        ntd ntdVar;
        if (ssdVar == ssd.P) {
            return;
        }
        int i = ssdVar.F;
        if ((i & 1) == 1) {
            int i2 = ssdVar.G;
            this.F = 1 | this.F;
            this.G = i2;
        }
        if ((i & 2) == 2) {
            int i3 = ssdVar.H;
            this.F = 2 | this.F;
            this.H = i3;
        }
        if ((i & 4) == 4) {
            rsd rsdVar = ssdVar.I;
            rsdVar.getClass();
            this.F = 4 | this.F;
            this.I = rsdVar;
        }
        if ((ssdVar.F & 8) == 8) {
            ntd ntdVar2 = ssdVar.J;
            if ((this.F & 8) != 8 || (ntdVar = this.J) == ntd.X) {
                this.J = ntdVar2;
            } else {
                mtd mtdVarR = ntd.r(ntdVar);
                mtdVarR.j(ntdVar2);
                this.J = mtdVarR.h();
            }
            this.F |= 8;
        }
        if ((ssdVar.F & 16) == 16) {
            int i4 = ssdVar.K;
            this.F = 16 | this.F;
            this.K = i4;
        }
        if (!ssdVar.L.isEmpty()) {
            if (this.L.isEmpty()) {
                this.L = ssdVar.L;
                this.F &= -33;
            } else {
                if ((this.F & 32) != 32) {
                    this.L = new ArrayList(this.L);
                    this.F |= 32;
                }
                this.L.addAll(ssdVar.L);
            }
        }
        if (!ssdVar.M.isEmpty()) {
            if (this.M.isEmpty()) {
                this.M = ssdVar.M;
                this.F &= -65;
            } else {
                if ((this.F & 64) != 64) {
                    this.M = new ArrayList(this.M);
                    this.F |= 64;
                }
                this.M.addAll(ssdVar.M);
            }
        }
        this.E = this.E.b(ssdVar.E);
    }
}
