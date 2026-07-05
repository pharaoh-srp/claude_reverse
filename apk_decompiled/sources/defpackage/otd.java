package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class otd extends p28 {
    public int H;
    public int I;
    public int J;
    public List K;
    public ntd L;
    public int M;
    public ntd N;
    public int O;
    public List P;
    public List Q;

    public static otd h() {
        otd otdVar = new otd();
        otdVar.I = 6;
        List list = Collections.EMPTY_LIST;
        otdVar.K = list;
        ntd ntdVar = ntd.X;
        otdVar.L = ntdVar;
        otdVar.N = ntdVar;
        otdVar.P = list;
        otdVar.Q = list;
        return otdVar;
    }

    @Override // defpackage.i28
    public final b3 c() {
        ptd ptdVarI = i();
        if (ptdVarI.b()) {
            return ptdVarI;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        otd otdVar = new otd();
        otdVar.I = 6;
        List list = Collections.EMPTY_LIST;
        otdVar.K = list;
        ntd ntdVar = ntd.X;
        otdVar.L = ntdVar;
        otdVar.N = ntdVar;
        otdVar.P = list;
        otdVar.Q = list;
        otdVar.j(i());
        return otdVar;
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
            jsd r1 = defpackage.ptd.T     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            ptd r1 = new ptd     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r2.j(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            b3 r4 = r3.E     // Catch: java.lang.Throwable -> Lf
            ptd r4 = (defpackage.ptd) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.otd.d(t34, oc7):i28");
    }

    @Override // defpackage.i28
    public final /* bridge */ /* synthetic */ i28 f(u28 u28Var) {
        j((ptd) u28Var);
        return this;
    }

    public final ptd i() {
        ptd ptdVar = new ptd(this);
        int i = this.H;
        int i2 = (i & 1) != 1 ? 0 : 1;
        ptdVar.H = this.I;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        ptdVar.I = this.J;
        if ((i & 4) == 4) {
            this.K = Collections.unmodifiableList(this.K);
            this.H &= -5;
        }
        ptdVar.J = this.K;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        ptdVar.K = this.L;
        if ((i & 16) == 16) {
            i2 |= 8;
        }
        ptdVar.L = this.M;
        if ((i & 32) == 32) {
            i2 |= 16;
        }
        ptdVar.M = this.N;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        ptdVar.N = this.O;
        if ((this.H & FreeTypeConstants.FT_LOAD_PEDANTIC) == 128) {
            this.P = Collections.unmodifiableList(this.P);
            this.H &= -129;
        }
        ptdVar.O = this.P;
        if ((this.H & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 256) {
            this.Q = Collections.unmodifiableList(this.Q);
            this.H &= -257;
        }
        ptdVar.P = this.Q;
        ptdVar.G = i2;
        return ptdVar;
    }

    public final void j(ptd ptdVar) {
        ntd ntdVar;
        ntd ntdVar2;
        if (ptdVar == ptd.S) {
            return;
        }
        int i = ptdVar.G;
        if ((i & 1) == 1) {
            int i2 = ptdVar.H;
            this.H = 1 | this.H;
            this.I = i2;
        }
        if ((i & 2) == 2) {
            int i3 = ptdVar.I;
            this.H = 2 | this.H;
            this.J = i3;
        }
        if (!ptdVar.J.isEmpty()) {
            if (this.K.isEmpty()) {
                this.K = ptdVar.J;
                this.H &= -5;
            } else {
                if ((this.H & 4) != 4) {
                    this.K = new ArrayList(this.K);
                    this.H |= 4;
                }
                this.K.addAll(ptdVar.J);
            }
        }
        if ((ptdVar.G & 4) == 4) {
            ntd ntdVar3 = ptdVar.K;
            if ((this.H & 8) != 8 || (ntdVar2 = this.L) == ntd.X) {
                this.L = ntdVar3;
            } else {
                mtd mtdVarR = ntd.r(ntdVar2);
                mtdVarR.j(ntdVar3);
                this.L = mtdVarR.h();
            }
            this.H |= 8;
        }
        int i4 = ptdVar.G;
        if ((i4 & 8) == 8) {
            int i5 = ptdVar.L;
            this.H |= 16;
            this.M = i5;
        }
        if ((i4 & 16) == 16) {
            ntd ntdVar4 = ptdVar.M;
            if ((this.H & 32) != 32 || (ntdVar = this.N) == ntd.X) {
                this.N = ntdVar4;
            } else {
                mtd mtdVarR2 = ntd.r(ntdVar);
                mtdVarR2.j(ntdVar4);
                this.N = mtdVarR2.h();
            }
            this.H |= 32;
        }
        if ((ptdVar.G & 32) == 32) {
            int i6 = ptdVar.N;
            this.H |= 64;
            this.O = i6;
        }
        if (!ptdVar.O.isEmpty()) {
            if (this.P.isEmpty()) {
                this.P = ptdVar.O;
                this.H &= -129;
            } else {
                if ((this.H & FreeTypeConstants.FT_LOAD_PEDANTIC) != 128) {
                    this.P = new ArrayList(this.P);
                    this.H |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                }
                this.P.addAll(ptdVar.O);
            }
        }
        if (!ptdVar.P.isEmpty()) {
            if (this.Q.isEmpty()) {
                this.Q = ptdVar.P;
                this.H &= -257;
            } else {
                if ((this.H & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 256) {
                    this.Q = new ArrayList(this.Q);
                    this.H |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                }
                this.Q.addAll(ptdVar.P);
            }
        }
        g(ptdVar);
        this.E = this.E.b(ptdVar.F);
    }
}
