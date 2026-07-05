package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class btd extends p28 {
    public int H;
    public int I;
    public int J;
    public int K;
    public ntd L;
    public int M;
    public List N;
    public ntd O;
    public int P;
    public List Q;
    public List R;
    public vtd S;
    public int T;
    public int U;
    public List V;

    public static btd j() {
        btd btdVar = new btd();
        btdVar.I = 518;
        btdVar.J = 2054;
        ntd ntdVar = ntd.X;
        btdVar.L = ntdVar;
        List list = Collections.EMPTY_LIST;
        btdVar.N = list;
        btdVar.O = ntdVar;
        btdVar.Q = list;
        btdVar.R = list;
        btdVar.S = vtd.P;
        btdVar.V = list;
        return btdVar;
    }

    @Override // defpackage.i28
    public final b3 c() {
        ctd ctdVarI = i();
        if (ctdVarI.b()) {
            return ctdVarI;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        btd btdVarJ = j();
        btdVarJ.k(i());
        return btdVarJ;
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
            sk9 r1 = defpackage.ctd.Z     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            ctd r1 = new ctd     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r2.k(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            b3 r4 = r3.E     // Catch: java.lang.Throwable -> Lf
            ctd r4 = (defpackage.ctd) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.k(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btd.d(t34, oc7):i28");
    }

    @Override // defpackage.i28
    public final /* bridge */ /* synthetic */ i28 f(u28 u28Var) {
        k((ctd) u28Var);
        return this;
    }

    public final ctd i() {
        ctd ctdVar = new ctd(this);
        int i = this.H;
        int i2 = (i & 1) != 1 ? 0 : 1;
        ctdVar.H = this.I;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        ctdVar.I = this.J;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        ctdVar.J = this.K;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        ctdVar.K = this.L;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        ctdVar.L = this.M;
        if ((i & 32) == 32) {
            this.N = Collections.unmodifiableList(this.N);
            this.H &= -33;
        }
        ctdVar.M = this.N;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        ctdVar.N = this.O;
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 128) {
            i2 |= 64;
        }
        ctdVar.O = this.P;
        if ((this.H & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 256) {
            this.Q = Collections.unmodifiableList(this.Q);
            this.H &= -257;
        }
        ctdVar.P = this.Q;
        if ((this.H & 512) == 512) {
            this.R = Collections.unmodifiableList(this.R);
            this.H &= -513;
        }
        ctdVar.Q = this.R;
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 1024) {
            i2 |= FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        ctdVar.S = this.S;
        if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) == 2048) {
            i2 |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
        }
        ctdVar.T = this.T;
        if ((i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 4096) {
            i2 |= 512;
        }
        ctdVar.U = this.U;
        if ((this.H & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) == 8192) {
            this.V = Collections.unmodifiableList(this.V);
            this.H &= -8193;
        }
        ctdVar.V = this.V;
        ctdVar.G = i2;
        return ctdVar;
    }

    public final void k(ctd ctdVar) {
        vtd vtdVar;
        ntd ntdVar;
        ntd ntdVar2;
        if (ctdVar == ctd.Y) {
            return;
        }
        int i = ctdVar.G;
        if ((i & 1) == 1) {
            int i2 = ctdVar.H;
            this.H = 1 | this.H;
            this.I = i2;
        }
        if ((i & 2) == 2) {
            int i3 = ctdVar.I;
            this.H = 2 | this.H;
            this.J = i3;
        }
        if ((i & 4) == 4) {
            int i4 = ctdVar.J;
            this.H = 4 | this.H;
            this.K = i4;
        }
        if ((i & 8) == 8) {
            ntd ntdVar3 = ctdVar.K;
            if ((this.H & 8) != 8 || (ntdVar2 = this.L) == ntd.X) {
                this.L = ntdVar3;
            } else {
                mtd mtdVarR = ntd.r(ntdVar2);
                mtdVarR.j(ntdVar3);
                this.L = mtdVarR.h();
            }
            this.H |= 8;
        }
        if ((ctdVar.G & 16) == 16) {
            int i5 = ctdVar.L;
            this.H = 16 | this.H;
            this.M = i5;
        }
        if (!ctdVar.M.isEmpty()) {
            if (this.N.isEmpty()) {
                this.N = ctdVar.M;
                this.H &= -33;
            } else {
                if ((this.H & 32) != 32) {
                    this.N = new ArrayList(this.N);
                    this.H |= 32;
                }
                this.N.addAll(ctdVar.M);
            }
        }
        if ((ctdVar.G & 32) == 32) {
            ntd ntdVar4 = ctdVar.N;
            if ((this.H & 64) != 64 || (ntdVar = this.O) == ntd.X) {
                this.O = ntdVar4;
            } else {
                mtd mtdVarR2 = ntd.r(ntdVar);
                mtdVarR2.j(ntdVar4);
                this.O = mtdVarR2.h();
            }
            this.H |= 64;
        }
        if ((ctdVar.G & 64) == 64) {
            int i6 = ctdVar.O;
            this.H |= FreeTypeConstants.FT_LOAD_PEDANTIC;
            this.P = i6;
        }
        if (!ctdVar.P.isEmpty()) {
            if (this.Q.isEmpty()) {
                this.Q = ctdVar.P;
                this.H &= -257;
            } else {
                if ((this.H & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 256) {
                    this.Q = new ArrayList(this.Q);
                    this.H |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                }
                this.Q.addAll(ctdVar.P);
            }
        }
        if (!ctdVar.Q.isEmpty()) {
            if (this.R.isEmpty()) {
                this.R = ctdVar.Q;
                this.H &= -513;
            } else {
                if ((this.H & 512) != 512) {
                    this.R = new ArrayList(this.R);
                    this.H |= 512;
                }
                this.R.addAll(ctdVar.Q);
            }
        }
        if ((ctdVar.G & FreeTypeConstants.FT_LOAD_PEDANTIC) == 128) {
            vtd vtdVar2 = ctdVar.S;
            if ((this.H & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 1024 || (vtdVar = this.S) == vtd.P) {
                this.S = vtdVar2;
            } else {
                utd utdVarH = utd.h();
                utdVarH.j(vtdVar);
                utdVarH.j(vtdVar2);
                this.S = utdVarH.i();
            }
            this.H |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        int i7 = ctdVar.G;
        if ((i7 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 256) {
            int i8 = ctdVar.T;
            this.H |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
            this.T = i8;
        }
        if ((i7 & 512) == 512) {
            int i9 = ctdVar.U;
            this.H |= FreeTypeConstants.FT_LOAD_MONOCHROME;
            this.U = i9;
        }
        if (!ctdVar.V.isEmpty()) {
            if (this.V.isEmpty()) {
                this.V = ctdVar.V;
                this.H &= -8193;
            } else {
                if ((this.H & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 8192) {
                    this.V = new ArrayList(this.V);
                    this.H |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
                }
                this.V.addAll(ctdVar.V);
            }
        }
        g(ctdVar);
        this.E = this.E.b(ctdVar.F);
    }
}
