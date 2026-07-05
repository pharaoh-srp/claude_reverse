package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class csd extends p28 {
    public int H;
    public int I;
    public int J;
    public int K;
    public List L;
    public List M;
    public List N;
    public List O;
    public List P;
    public List Q;
    public List R;
    public List S;
    public List T;
    public List U;
    public List V;
    public List W;
    public int X;
    public ntd Y;
    public int Z;
    public List a0;
    public List b0;
    public List c0;
    public ttd d0;
    public List e0;
    public aud f0;

    public static csd j() {
        csd csdVar = new csd();
        csdVar.I = 6;
        List list = Collections.EMPTY_LIST;
        csdVar.L = list;
        csdVar.M = list;
        csdVar.N = list;
        csdVar.O = list;
        csdVar.P = list;
        csdVar.Q = list;
        csdVar.R = list;
        csdVar.S = list;
        csdVar.T = list;
        csdVar.U = list;
        csdVar.V = list;
        csdVar.W = list;
        csdVar.Y = ntd.X;
        csdVar.a0 = list;
        csdVar.b0 = list;
        csdVar.c0 = list;
        csdVar.d0 = ttd.K;
        csdVar.e0 = list;
        csdVar.f0 = aud.I;
        return csdVar;
    }

    @Override // defpackage.i28
    public final b3 c() {
        esd esdVarI = i();
        if (esdVarI.b()) {
            return esdVarI;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        csd csdVarJ = j();
        csdVarJ.k(i());
        return csdVarJ;
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
            sk9 r1 = defpackage.esd.o0     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            esd r1 = new esd     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
            r2.k(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            b3 r4 = r3.E     // Catch: java.lang.Throwable -> Lf
            esd r4 = (defpackage.esd) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csd.d(t34, oc7):i28");
    }

    @Override // defpackage.i28
    public final /* bridge */ /* synthetic */ i28 f(u28 u28Var) {
        k((esd) u28Var);
        return this;
    }

    public final esd i() {
        esd esdVar = new esd(this);
        int i = this.H;
        int i2 = (i & 1) != 1 ? 0 : 1;
        esdVar.H = this.I;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        esdVar.I = this.J;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        esdVar.J = this.K;
        if ((i & 8) == 8) {
            this.L = Collections.unmodifiableList(this.L);
            this.H &= -9;
        }
        esdVar.K = this.L;
        if ((this.H & 16) == 16) {
            this.M = Collections.unmodifiableList(this.M);
            this.H &= -17;
        }
        esdVar.L = this.M;
        if ((this.H & 32) == 32) {
            this.N = Collections.unmodifiableList(this.N);
            this.H &= -33;
        }
        esdVar.M = this.N;
        if ((this.H & 64) == 64) {
            this.O = Collections.unmodifiableList(this.O);
            this.H &= -65;
        }
        esdVar.O = this.O;
        if ((this.H & FreeTypeConstants.FT_LOAD_PEDANTIC) == 128) {
            this.P = Collections.unmodifiableList(this.P);
            this.H &= -129;
        }
        esdVar.Q = this.P;
        if ((this.H & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 256) {
            this.Q = Collections.unmodifiableList(this.Q);
            this.H &= -257;
        }
        esdVar.R = this.Q;
        if ((this.H & 512) == 512) {
            this.R = Collections.unmodifiableList(this.R);
            this.H &= -513;
        }
        esdVar.T = this.R;
        if ((this.H & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 1024) {
            this.S = Collections.unmodifiableList(this.S);
            this.H &= -1025;
        }
        esdVar.U = this.S;
        if ((this.H & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) == 2048) {
            this.T = Collections.unmodifiableList(this.T);
            this.H &= -2049;
        }
        esdVar.V = this.T;
        if ((this.H & FreeTypeConstants.FT_LOAD_MONOCHROME) == 4096) {
            this.U = Collections.unmodifiableList(this.U);
            this.H &= -4097;
        }
        esdVar.W = this.U;
        if ((this.H & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) == 8192) {
            this.V = Collections.unmodifiableList(this.V);
            this.H &= -8193;
        }
        esdVar.X = this.V;
        if ((this.H & 16384) == 16384) {
            this.W = Collections.unmodifiableList(this.W);
            this.H &= -16385;
        }
        esdVar.Y = this.W;
        if ((i & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) == 32768) {
            i2 |= 8;
        }
        esdVar.a0 = this.X;
        if ((i & 65536) == 65536) {
            i2 |= 16;
        }
        esdVar.b0 = this.Y;
        if ((i & 131072) == 131072) {
            i2 |= 32;
        }
        esdVar.c0 = this.Z;
        if ((this.H & 262144) == 262144) {
            this.a0 = Collections.unmodifiableList(this.a0);
            this.H &= -262145;
        }
        esdVar.d0 = this.a0;
        if ((this.H & 524288) == 524288) {
            this.b0 = Collections.unmodifiableList(this.b0);
            this.H &= -524289;
        }
        esdVar.f0 = this.b0;
        if ((this.H & FreeTypeConstants.FT_LOAD_COLOR) == 1048576) {
            this.c0 = Collections.unmodifiableList(this.c0);
            this.H &= -1048577;
        }
        esdVar.g0 = this.c0;
        if ((i & FreeTypeConstants.FT_LOAD_COMPUTE_METRICS) == 2097152) {
            i2 |= 64;
        }
        esdVar.i0 = this.d0;
        if ((this.H & 4194304) == 4194304) {
            this.e0 = Collections.unmodifiableList(this.e0);
            this.H &= -4194305;
        }
        esdVar.j0 = this.e0;
        if ((i & 8388608) == 8388608) {
            i2 |= FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        esdVar.k0 = this.f0;
        esdVar.G = i2;
        return esdVar;
    }

    public final void k(esd esdVar) {
        aud audVar;
        ttd ttdVar;
        ntd ntdVar;
        if (esdVar == esd.n0) {
            return;
        }
        int i = esdVar.G;
        int i2 = 1;
        if ((i & 1) == 1) {
            int i3 = esdVar.H;
            this.H |= 1;
            this.I = i3;
        }
        if ((i & 2) == 2) {
            int i4 = esdVar.I;
            this.H = 2 | this.H;
            this.J = i4;
        }
        if ((i & 4) == 4) {
            int i5 = esdVar.J;
            this.H = 4 | this.H;
            this.K = i5;
        }
        if (!esdVar.K.isEmpty()) {
            if (this.L.isEmpty()) {
                this.L = esdVar.K;
                this.H &= -9;
            } else {
                if ((this.H & 8) != 8) {
                    this.L = new ArrayList(this.L);
                    this.H |= 8;
                }
                this.L.addAll(esdVar.K);
            }
        }
        if (!esdVar.L.isEmpty()) {
            if (this.M.isEmpty()) {
                this.M = esdVar.L;
                this.H &= -17;
            } else {
                if ((this.H & 16) != 16) {
                    this.M = new ArrayList(this.M);
                    this.H |= 16;
                }
                this.M.addAll(esdVar.L);
            }
        }
        if (!esdVar.M.isEmpty()) {
            if (this.N.isEmpty()) {
                this.N = esdVar.M;
                this.H &= -33;
            } else {
                if ((this.H & 32) != 32) {
                    this.N = new ArrayList(this.N);
                    this.H |= 32;
                }
                this.N.addAll(esdVar.M);
            }
        }
        if (!esdVar.O.isEmpty()) {
            if (this.O.isEmpty()) {
                this.O = esdVar.O;
                this.H &= -65;
            } else {
                if ((this.H & 64) != 64) {
                    this.O = new ArrayList(this.O);
                    this.H |= 64;
                }
                this.O.addAll(esdVar.O);
            }
        }
        if (!esdVar.Q.isEmpty()) {
            if (this.P.isEmpty()) {
                this.P = esdVar.Q;
                this.H &= -129;
            } else {
                if ((this.H & FreeTypeConstants.FT_LOAD_PEDANTIC) != 128) {
                    this.P = new ArrayList(this.P);
                    this.H |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                }
                this.P.addAll(esdVar.Q);
            }
        }
        if (!esdVar.R.isEmpty()) {
            if (this.Q.isEmpty()) {
                this.Q = esdVar.R;
                this.H &= -257;
            } else {
                if ((this.H & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 256) {
                    this.Q = new ArrayList(this.Q);
                    this.H |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                }
                this.Q.addAll(esdVar.R);
            }
        }
        if (!esdVar.T.isEmpty()) {
            if (this.R.isEmpty()) {
                this.R = esdVar.T;
                this.H &= -513;
            } else {
                if ((this.H & 512) != 512) {
                    this.R = new ArrayList(this.R);
                    this.H |= 512;
                }
                this.R.addAll(esdVar.T);
            }
        }
        if (!esdVar.U.isEmpty()) {
            if (this.S.isEmpty()) {
                this.S = esdVar.U;
                this.H &= -1025;
            } else {
                if ((this.H & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 1024) {
                    this.S = new ArrayList(this.S);
                    this.H |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                }
                this.S.addAll(esdVar.U);
            }
        }
        if (!esdVar.V.isEmpty()) {
            if (this.T.isEmpty()) {
                this.T = esdVar.V;
                this.H &= -2049;
            } else {
                if ((this.H & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 2048) {
                    this.T = new ArrayList(this.T);
                    this.H |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                }
                this.T.addAll(esdVar.V);
            }
        }
        if (!esdVar.W.isEmpty()) {
            if (this.U.isEmpty()) {
                this.U = esdVar.W;
                this.H &= -4097;
            } else {
                if ((this.H & FreeTypeConstants.FT_LOAD_MONOCHROME) != 4096) {
                    this.U = new ArrayList(this.U);
                    this.H |= FreeTypeConstants.FT_LOAD_MONOCHROME;
                }
                this.U.addAll(esdVar.W);
            }
        }
        if (!esdVar.X.isEmpty()) {
            if (this.V.isEmpty()) {
                this.V = esdVar.X;
                this.H &= -8193;
            } else {
                if ((this.H & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 8192) {
                    this.V = new ArrayList(this.V);
                    this.H |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
                }
                this.V.addAll(esdVar.X);
            }
        }
        if (!esdVar.Y.isEmpty()) {
            if (this.W.isEmpty()) {
                this.W = esdVar.Y;
                this.H &= -16385;
            } else {
                if ((this.H & 16384) != 16384) {
                    this.W = new ArrayList(this.W);
                    this.H |= 16384;
                }
                this.W.addAll(esdVar.Y);
            }
        }
        int i6 = esdVar.G;
        if ((i6 & 8) == 8) {
            int i7 = esdVar.a0;
            this.H |= FreeTypeConstants.FT_LOAD_NO_AUTOHINT;
            this.X = i7;
        }
        if ((i6 & 16) == 16) {
            ntd ntdVar2 = esdVar.b0;
            if ((this.H & 65536) != 65536 || (ntdVar = this.Y) == ntd.X) {
                this.Y = ntdVar2;
            } else {
                mtd mtdVarR = ntd.r(ntdVar);
                mtdVarR.j(ntdVar2);
                this.Y = mtdVarR.h();
            }
            this.H |= 65536;
        }
        if ((esdVar.G & 32) == 32) {
            int i8 = esdVar.c0;
            this.H |= 131072;
            this.Z = i8;
        }
        if (!esdVar.d0.isEmpty()) {
            if (this.a0.isEmpty()) {
                this.a0 = esdVar.d0;
                this.H &= -262145;
            } else {
                if ((this.H & 262144) != 262144) {
                    this.a0 = new ArrayList(this.a0);
                    this.H |= 262144;
                }
                this.a0.addAll(esdVar.d0);
            }
        }
        if (!esdVar.f0.isEmpty()) {
            if (this.b0.isEmpty()) {
                this.b0 = esdVar.f0;
                this.H &= -524289;
            } else {
                if ((this.H & 524288) != 524288) {
                    this.b0 = new ArrayList(this.b0);
                    this.H |= 524288;
                }
                this.b0.addAll(esdVar.f0);
            }
        }
        if (!esdVar.g0.isEmpty()) {
            if (this.c0.isEmpty()) {
                this.c0 = esdVar.g0;
                this.H &= -1048577;
            } else {
                if ((this.H & FreeTypeConstants.FT_LOAD_COLOR) != 1048576) {
                    this.c0 = new ArrayList(this.c0);
                    this.H |= FreeTypeConstants.FT_LOAD_COLOR;
                }
                this.c0.addAll(esdVar.g0);
            }
        }
        if ((esdVar.G & 64) == 64) {
            ttd ttdVar2 = esdVar.i0;
            if ((this.H & FreeTypeConstants.FT_LOAD_COMPUTE_METRICS) != 2097152 || (ttdVar = this.d0) == ttd.K) {
                this.d0 = ttdVar2;
            } else {
                asd asdVarI = ttd.i(ttdVar);
                asdVarI.k(ttdVar2);
                this.d0 = asdVarI.h();
            }
            this.H |= FreeTypeConstants.FT_LOAD_COMPUTE_METRICS;
        }
        if (!esdVar.j0.isEmpty()) {
            if (this.e0.isEmpty()) {
                this.e0 = esdVar.j0;
                this.H &= -4194305;
            } else {
                if ((this.H & 4194304) != 4194304) {
                    this.e0 = new ArrayList(this.e0);
                    this.H |= 4194304;
                }
                this.e0.addAll(esdVar.j0);
            }
        }
        if ((esdVar.G & FreeTypeConstants.FT_LOAD_PEDANTIC) == 128) {
            aud audVar2 = esdVar.k0;
            if ((this.H & 8388608) != 8388608 || (audVar = this.f0) == aud.I) {
                this.f0 = audVar2;
            } else {
                hsd hsdVar = new hsd(i2);
                hsdVar.H = Collections.EMPTY_LIST;
                hsdVar.j(audVar);
                hsdVar.j(audVar2);
                this.f0 = hsdVar.h();
            }
            this.H |= 8388608;
        }
        g(esdVar);
        this.E = this.E.b(esdVar.F);
    }
}
