package defpackage;

import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class utd extends p28 {
    public int H;
    public int I;
    public int J;
    public ntd K;
    public int L;
    public ntd M;
    public int N;

    public static utd h() {
        utd utdVar = new utd();
        ntd ntdVar = ntd.X;
        utdVar.K = ntdVar;
        utdVar.M = ntdVar;
        return utdVar;
    }

    @Override // defpackage.i28
    public final b3 c() {
        vtd vtdVarI = i();
        if (vtdVarI.b()) {
            return vtdVarI;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        utd utdVar = new utd();
        ntd ntdVar = ntd.X;
        utdVar.K = ntdVar;
        utdVar.M = ntdVar;
        utdVar.j(i());
        return utdVar;
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
            sk9 r1 = defpackage.vtd.Q     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            vtd r1 = new vtd     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r2.j(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            b3 r4 = r3.E     // Catch: java.lang.Throwable -> Lf
            vtd r4 = (defpackage.vtd) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.utd.d(t34, oc7):i28");
    }

    @Override // defpackage.i28
    public final /* bridge */ /* synthetic */ i28 f(u28 u28Var) {
        j((vtd) u28Var);
        return this;
    }

    public final vtd i() {
        vtd vtdVar = new vtd(this);
        int i = this.H;
        int i2 = (i & 1) != 1 ? 0 : 1;
        vtdVar.H = this.I;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        vtdVar.I = this.J;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        vtdVar.J = this.K;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        vtdVar.K = this.L;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        vtdVar.L = this.M;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        vtdVar.M = this.N;
        vtdVar.G = i2;
        return vtdVar;
    }

    public final void j(vtd vtdVar) {
        ntd ntdVar;
        ntd ntdVar2;
        if (vtdVar == vtd.P) {
            return;
        }
        int i = vtdVar.G;
        if ((i & 1) == 1) {
            int i2 = vtdVar.H;
            this.H = 1 | this.H;
            this.I = i2;
        }
        if ((i & 2) == 2) {
            int i3 = vtdVar.I;
            this.H = 2 | this.H;
            this.J = i3;
        }
        if ((i & 4) == 4) {
            ntd ntdVar3 = vtdVar.J;
            if ((this.H & 4) != 4 || (ntdVar2 = this.K) == ntd.X) {
                this.K = ntdVar3;
            } else {
                mtd mtdVarR = ntd.r(ntdVar2);
                mtdVarR.j(ntdVar3);
                this.K = mtdVarR.h();
            }
            this.H |= 4;
        }
        int i4 = vtdVar.G;
        if ((i4 & 8) == 8) {
            int i5 = vtdVar.K;
            this.H = 8 | this.H;
            this.L = i5;
        }
        if ((i4 & 16) == 16) {
            ntd ntdVar4 = vtdVar.L;
            if ((this.H & 16) != 16 || (ntdVar = this.M) == ntd.X) {
                this.M = ntdVar4;
            } else {
                mtd mtdVarR2 = ntd.r(ntdVar);
                mtdVarR2.j(ntdVar4);
                this.M = mtdVarR2.h();
            }
            this.H |= 16;
        }
        if ((vtdVar.G & 32) == 32) {
            int i6 = vtdVar.M;
            this.H = 32 | this.H;
            this.N = i6;
        }
        g(vtdVar);
        this.E = this.E.b(vtdVar.F);
    }
}
