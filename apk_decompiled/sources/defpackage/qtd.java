package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class qtd extends p28 {
    public int H;
    public int I;
    public int J;
    public boolean K;
    public rtd L;
    public List M;
    public List N;

    public static qtd h() {
        qtd qtdVar = new qtd();
        qtdVar.L = rtd.INV;
        List list = Collections.EMPTY_LIST;
        qtdVar.M = list;
        qtdVar.N = list;
        return qtdVar;
    }

    @Override // defpackage.i28
    public final b3 c() {
        std stdVarI = i();
        if (stdVarI.b()) {
            return stdVarI;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        qtd qtdVar = new qtd();
        qtdVar.L = rtd.INV;
        List list = Collections.EMPTY_LIST;
        qtdVar.M = list;
        qtdVar.N = list;
        qtdVar.j(i());
        return qtdVar;
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
            sk9 r1 = defpackage.std.R     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            std r1 = new std     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r2.j(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            b3 r4 = r3.E     // Catch: java.lang.Throwable -> Lf
            std r4 = (defpackage.std) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.j(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qtd.d(t34, oc7):i28");
    }

    @Override // defpackage.i28
    public final /* bridge */ /* synthetic */ i28 f(u28 u28Var) {
        j((std) u28Var);
        return this;
    }

    public final std i() {
        std stdVar = new std(this);
        int i = this.H;
        int i2 = (i & 1) != 1 ? 0 : 1;
        stdVar.H = this.I;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        stdVar.I = this.J;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        stdVar.J = this.K;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        stdVar.K = this.L;
        if ((i & 16) == 16) {
            this.M = Collections.unmodifiableList(this.M);
            this.H &= -17;
        }
        stdVar.L = this.M;
        if ((this.H & 32) == 32) {
            this.N = Collections.unmodifiableList(this.N);
            this.H &= -33;
        }
        stdVar.M = this.N;
        stdVar.G = i2;
        return stdVar;
    }

    public final void j(std stdVar) {
        if (stdVar == std.Q) {
            return;
        }
        int i = stdVar.G;
        if ((i & 1) == 1) {
            int i2 = stdVar.H;
            this.H = 1 | this.H;
            this.I = i2;
        }
        if ((i & 2) == 2) {
            int i3 = stdVar.I;
            this.H = 2 | this.H;
            this.J = i3;
        }
        if ((i & 4) == 4) {
            boolean z = stdVar.J;
            this.H = 4 | this.H;
            this.K = z;
        }
        if ((i & 8) == 8) {
            rtd rtdVar = stdVar.K;
            rtdVar.getClass();
            this.H = 8 | this.H;
            this.L = rtdVar;
        }
        if (!stdVar.L.isEmpty()) {
            if (this.M.isEmpty()) {
                this.M = stdVar.L;
                this.H &= -17;
            } else {
                if ((this.H & 16) != 16) {
                    this.M = new ArrayList(this.M);
                    this.H |= 16;
                }
                this.M.addAll(stdVar.L);
            }
        }
        if (!stdVar.M.isEmpty()) {
            if (this.N.isEmpty()) {
                this.N = stdVar.M;
                this.H &= -33;
            } else {
                if ((this.H & 32) != 32) {
                    this.N = new ArrayList(this.N);
                    this.H |= 32;
                }
                this.N.addAll(stdVar.M);
            }
        }
        g(stdVar);
        this.E = this.E.b(stdVar.F);
    }
}
