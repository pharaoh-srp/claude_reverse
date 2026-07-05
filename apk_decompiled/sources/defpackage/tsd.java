package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class tsd extends p28 {
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
    public List S;
    public ttd T;
    public List U;
    public isd V;

    public static tsd j() {
        tsd tsdVar = new tsd();
        tsdVar.I = 6;
        tsdVar.J = 6;
        ntd ntdVar = ntd.X;
        tsdVar.L = ntdVar;
        List list = Collections.EMPTY_LIST;
        tsdVar.N = list;
        tsdVar.O = ntdVar;
        tsdVar.Q = list;
        tsdVar.R = list;
        tsdVar.S = list;
        tsdVar.T = ttd.K;
        tsdVar.U = list;
        tsdVar.V = isd.I;
        return tsdVar;
    }

    @Override // defpackage.i28
    public final b3 c() {
        usd usdVarI = i();
        if (usdVarI.b()) {
            return usdVarI;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        tsd tsdVarJ = j();
        tsdVarJ.k(i());
        return tsdVarJ;
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
            sk9 r1 = defpackage.usd.Z     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            usd r1 = new usd     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r2.k(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            b3 r4 = r3.E     // Catch: java.lang.Throwable -> Lf
            usd r4 = (defpackage.usd) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tsd.d(t34, oc7):i28");
    }

    @Override // defpackage.i28
    public final /* bridge */ /* synthetic */ i28 f(u28 u28Var) {
        k((usd) u28Var);
        return this;
    }

    public final usd i() {
        usd usdVar = new usd(this);
        int i = this.H;
        int i2 = (i & 1) != 1 ? 0 : 1;
        usdVar.H = this.I;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        usdVar.I = this.J;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        usdVar.J = this.K;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        usdVar.K = this.L;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        usdVar.L = this.M;
        if ((i & 32) == 32) {
            this.N = Collections.unmodifiableList(this.N);
            this.H &= -33;
        }
        usdVar.M = this.N;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        usdVar.N = this.O;
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 128) {
            i2 |= 64;
        }
        usdVar.O = this.P;
        if ((this.H & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 256) {
            this.Q = Collections.unmodifiableList(this.Q);
            this.H &= -257;
        }
        usdVar.P = this.Q;
        if ((this.H & 512) == 512) {
            this.R = Collections.unmodifiableList(this.R);
            this.H &= -513;
        }
        usdVar.Q = this.R;
        if ((this.H & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 1024) {
            this.S = Collections.unmodifiableList(this.S);
            this.H &= -1025;
        }
        usdVar.S = this.S;
        if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) == 2048) {
            i2 |= FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        usdVar.T = this.T;
        if ((this.H & FreeTypeConstants.FT_LOAD_MONOCHROME) == 4096) {
            this.U = Collections.unmodifiableList(this.U);
            this.H &= -4097;
        }
        usdVar.U = this.U;
        if ((i & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) == 8192) {
            i2 |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
        }
        usdVar.V = this.V;
        usdVar.G = i2;
        return usdVar;
    }

    public final void k(usd usdVar) {
        isd isdVar;
        ttd ttdVar;
        ntd ntdVar;
        ntd ntdVar2;
        if (usdVar == usd.Y) {
            return;
        }
        int i = usdVar.G;
        if ((i & 1) == 1) {
            int i2 = usdVar.H;
            this.H = 1 | this.H;
            this.I = i2;
        }
        if ((i & 2) == 2) {
            int i3 = usdVar.I;
            this.H = 2 | this.H;
            this.J = i3;
        }
        if ((i & 4) == 4) {
            int i4 = usdVar.J;
            this.H = 4 | this.H;
            this.K = i4;
        }
        if ((i & 8) == 8) {
            ntd ntdVar3 = usdVar.K;
            if ((this.H & 8) != 8 || (ntdVar2 = this.L) == ntd.X) {
                this.L = ntdVar3;
            } else {
                mtd mtdVarR = ntd.r(ntdVar2);
                mtdVarR.j(ntdVar3);
                this.L = mtdVarR.h();
            }
            this.H |= 8;
        }
        if ((usdVar.G & 16) == 16) {
            int i5 = usdVar.L;
            this.H = 16 | this.H;
            this.M = i5;
        }
        if (!usdVar.M.isEmpty()) {
            if (this.N.isEmpty()) {
                this.N = usdVar.M;
                this.H &= -33;
            } else {
                if ((this.H & 32) != 32) {
                    this.N = new ArrayList(this.N);
                    this.H |= 32;
                }
                this.N.addAll(usdVar.M);
            }
        }
        if ((usdVar.G & 32) == 32) {
            ntd ntdVar4 = usdVar.N;
            if ((this.H & 64) != 64 || (ntdVar = this.O) == ntd.X) {
                this.O = ntdVar4;
            } else {
                mtd mtdVarR2 = ntd.r(ntdVar);
                mtdVarR2.j(ntdVar4);
                this.O = mtdVarR2.h();
            }
            this.H |= 64;
        }
        if ((usdVar.G & 64) == 64) {
            int i6 = usdVar.O;
            this.H |= FreeTypeConstants.FT_LOAD_PEDANTIC;
            this.P = i6;
        }
        if (!usdVar.P.isEmpty()) {
            if (this.Q.isEmpty()) {
                this.Q = usdVar.P;
                this.H &= -257;
            } else {
                if ((this.H & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 256) {
                    this.Q = new ArrayList(this.Q);
                    this.H |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                }
                this.Q.addAll(usdVar.P);
            }
        }
        if (!usdVar.Q.isEmpty()) {
            if (this.R.isEmpty()) {
                this.R = usdVar.Q;
                this.H &= -513;
            } else {
                if ((this.H & 512) != 512) {
                    this.R = new ArrayList(this.R);
                    this.H |= 512;
                }
                this.R.addAll(usdVar.Q);
            }
        }
        if (!usdVar.S.isEmpty()) {
            if (this.S.isEmpty()) {
                this.S = usdVar.S;
                this.H &= -1025;
            } else {
                if ((this.H & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 1024) {
                    this.S = new ArrayList(this.S);
                    this.H |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                }
                this.S.addAll(usdVar.S);
            }
        }
        if ((usdVar.G & FreeTypeConstants.FT_LOAD_PEDANTIC) == 128) {
            ttd ttdVar2 = usdVar.T;
            if ((this.H & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 2048 || (ttdVar = this.T) == ttd.K) {
                this.T = ttdVar2;
            } else {
                asd asdVarI = ttd.i(ttdVar);
                asdVarI.k(ttdVar2);
                this.T = asdVarI.h();
            }
            this.H |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
        }
        if (!usdVar.U.isEmpty()) {
            if (this.U.isEmpty()) {
                this.U = usdVar.U;
                this.H &= -4097;
            } else {
                if ((this.H & FreeTypeConstants.FT_LOAD_MONOCHROME) != 4096) {
                    this.U = new ArrayList(this.U);
                    this.H |= FreeTypeConstants.FT_LOAD_MONOCHROME;
                }
                this.U.addAll(usdVar.U);
            }
        }
        if ((usdVar.G & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 256) {
            isd isdVar2 = usdVar.V;
            if ((this.H & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 8192 || (isdVar = this.V) == isd.I) {
                this.V = isdVar2;
            } else {
                hsd hsdVar = new hsd(0);
                hsdVar.H = Collections.EMPTY_LIST;
                hsdVar.i(isdVar);
                hsdVar.i(isdVar2);
                this.V = hsdVar.g();
            }
            this.H |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        g(usdVar);
        this.E = this.E.b(usdVar.F);
    }
}
