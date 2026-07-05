package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes.dex */
public final class mtd extends p28 {
    public int H;
    public List I;
    public boolean J;
    public int K;
    public ntd L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public ntd R;
    public int S;
    public ntd T;
    public int U;
    public int V;

    public static mtd i() {
        mtd mtdVar = new mtd();
        mtdVar.I = Collections.EMPTY_LIST;
        ntd ntdVar = ntd.X;
        mtdVar.L = ntdVar;
        mtdVar.R = ntdVar;
        mtdVar.T = ntdVar;
        return mtdVar;
    }

    @Override // defpackage.i28
    public final b3 c() {
        ntd ntdVarH = h();
        if (ntdVarH.b()) {
            return ntdVarH;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        mtd mtdVarI = i();
        mtdVarI.j(h());
        return mtdVarI;
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
            sk9 r1 = defpackage.ntd.Y     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            ntd r1 = new ntd     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r2.j(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            b3 r4 = r3.E     // Catch: java.lang.Throwable -> Lf
            ntd r4 = (defpackage.ntd) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mtd.d(t34, oc7):i28");
    }

    @Override // defpackage.i28
    public final /* bridge */ /* synthetic */ i28 f(u28 u28Var) {
        j((ntd) u28Var);
        return this;
    }

    public final ntd h() {
        ntd ntdVar = new ntd(this);
        int i = this.H;
        if ((i & 1) == 1) {
            this.I = Collections.unmodifiableList(this.I);
            this.H &= -2;
        }
        ntdVar.H = this.I;
        int i2 = (i & 2) != 2 ? 0 : 1;
        ntdVar.I = this.J;
        if ((i & 4) == 4) {
            i2 |= 2;
        }
        ntdVar.J = this.K;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        ntdVar.K = this.L;
        if ((i & 16) == 16) {
            i2 |= 8;
        }
        ntdVar.L = this.M;
        if ((i & 32) == 32) {
            i2 |= 16;
        }
        ntdVar.M = this.N;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        ntdVar.N = this.O;
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 128) {
            i2 |= 64;
        }
        ntdVar.O = this.P;
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 256) {
            i2 |= FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        ntdVar.P = this.Q;
        if ((i & 512) == 512) {
            i2 |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
        }
        ntdVar.Q = this.R;
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 1024) {
            i2 |= 512;
        }
        ntdVar.R = this.S;
        if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) == 2048) {
            i2 |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        ntdVar.S = this.T;
        if ((i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 4096) {
            i2 |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
        }
        ntdVar.T = this.U;
        if ((i & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) == 8192) {
            i2 |= FreeTypeConstants.FT_LOAD_MONOCHROME;
        }
        ntdVar.U = this.V;
        ntdVar.G = i2;
        return ntdVar;
    }

    public final mtd j(ntd ntdVar) {
        ntd ntdVar2;
        ntd ntdVar3;
        ntd ntdVar4;
        ntd ntdVar5 = ntd.X;
        if (ntdVar == ntdVar5) {
            return this;
        }
        if (!ntdVar.H.isEmpty()) {
            if (this.I.isEmpty()) {
                this.I = ntdVar.H;
                this.H &= -2;
            } else {
                if ((this.H & 1) != 1) {
                    this.I = new ArrayList(this.I);
                    this.H |= 1;
                }
                this.I.addAll(ntdVar.H);
            }
        }
        int i = ntdVar.G;
        if ((i & 1) == 1) {
            boolean z = ntdVar.I;
            this.H |= 2;
            this.J = z;
        }
        if ((i & 2) == 2) {
            int i2 = ntdVar.J;
            this.H |= 4;
            this.K = i2;
        }
        if ((i & 4) == 4) {
            ntd ntdVar6 = ntdVar.K;
            if ((this.H & 8) != 8 || (ntdVar4 = this.L) == ntdVar5) {
                this.L = ntdVar6;
            } else {
                mtd mtdVarR = ntd.r(ntdVar4);
                mtdVarR.j(ntdVar6);
                this.L = mtdVarR.h();
            }
            this.H |= 8;
        }
        if ((ntdVar.G & 8) == 8) {
            int i3 = ntdVar.L;
            this.H |= 16;
            this.M = i3;
        }
        if (ntdVar.p()) {
            int i4 = ntdVar.M;
            this.H |= 32;
            this.N = i4;
        }
        int i5 = ntdVar.G;
        if ((i5 & 32) == 32) {
            int i6 = ntdVar.N;
            this.H |= 64;
            this.O = i6;
        }
        if ((i5 & 64) == 64) {
            int i7 = ntdVar.O;
            this.H |= FreeTypeConstants.FT_LOAD_PEDANTIC;
            this.P = i7;
        }
        if ((i5 & FreeTypeConstants.FT_LOAD_PEDANTIC) == 128) {
            int i8 = ntdVar.P;
            this.H |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
            this.Q = i8;
        }
        if ((i5 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 256) {
            ntd ntdVar7 = ntdVar.Q;
            if ((this.H & 512) != 512 || (ntdVar3 = this.R) == ntdVar5) {
                this.R = ntdVar7;
            } else {
                mtd mtdVarR2 = ntd.r(ntdVar3);
                mtdVarR2.j(ntdVar7);
                this.R = mtdVarR2.h();
            }
            this.H |= 512;
        }
        int i9 = ntdVar.G;
        if ((i9 & 512) == 512) {
            int i10 = ntdVar.R;
            this.H |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
            this.S = i10;
        }
        if ((i9 & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 1024) {
            ntd ntdVar8 = ntdVar.S;
            if ((this.H & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 2048 || (ntdVar2 = this.T) == ntdVar5) {
                this.T = ntdVar8;
            } else {
                mtd mtdVarR3 = ntd.r(ntdVar2);
                mtdVarR3.j(ntdVar8);
                this.T = mtdVarR3.h();
            }
            this.H |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
        }
        int i11 = ntdVar.G;
        if ((i11 & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) == 2048) {
            int i12 = ntdVar.T;
            this.H |= FreeTypeConstants.FT_LOAD_MONOCHROME;
            this.U = i12;
        }
        if ((i11 & FreeTypeConstants.FT_LOAD_MONOCHROME) == 4096) {
            int i13 = ntdVar.U;
            this.H |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
            this.V = i13;
        }
        g(ntdVar);
        this.E = this.E.b(ntdVar.F);
        return this;
    }
}
