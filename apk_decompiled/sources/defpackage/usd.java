package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes.dex */
public final class usd extends r28 {
    public static final usd Y;
    public static final sk9 Z = new sk9(12);
    public final l22 F;
    public int G;
    public int H;
    public int I;
    public int J;
    public ntd K;
    public int L;
    public List M;
    public ntd N;
    public int O;
    public List P;
    public List Q;
    public int R;
    public List S;
    public ttd T;
    public List U;
    public isd V;
    public byte W;
    public int X;

    static {
        usd usdVar = new usd();
        Y = usdVar;
        usdVar.p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    public usd(t34 t34Var, oc7 oc7Var) {
        boolean z;
        this.R = -1;
        this.W = (byte) -1;
        this.X = -1;
        p();
        j22 j22Var = new j22();
        boolean z2 = true;
        v34 v34VarJ = v34.j(j22Var, 1);
        int i = 0;
        boolean z3 = false;
        int i2 = 0;
        while (true) {
            ?? N = 1024;
            if (z3) {
                if (((i2 == true ? 1 : 0) & 32) == 32) {
                    this.M = Collections.unmodifiableList(this.M);
                }
                if (((i2 == true ? 1 : 0) & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 1024) {
                    this.S = Collections.unmodifiableList(this.S);
                }
                if (((i2 == true ? 1 : 0) & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 256) {
                    this.P = Collections.unmodifiableList(this.P);
                }
                if (((i2 == true ? 1 : 0) & 512) == 512) {
                    this.Q = Collections.unmodifiableList(this.Q);
                }
                if (((i2 == true ? 1 : 0) & FreeTypeConstants.FT_LOAD_MONOCHROME) == 4096) {
                    this.U = Collections.unmodifiableList(this.U);
                }
                try {
                    v34VarJ.k();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    this.F = j22Var.e();
                    throw th;
                }
                this.F = j22Var.e();
                m();
                return;
            }
            try {
                try {
                    try {
                        int iN = t34Var.n();
                        mtd mtdVarR = null;
                        hsd hsdVar = null;
                        asd asdVarI = null;
                        mtd mtdVarR2 = null;
                        switch (iN) {
                            case 0:
                                z = z2;
                                z3 = z;
                                z2 = z;
                                i2 = i2;
                                break;
                            case 8:
                                z = z2;
                                this.G |= 2;
                                this.I = t34Var.k();
                                z2 = z;
                                i2 = i2;
                                break;
                            case 16:
                                z = z2;
                                this.G |= 4;
                                this.J = t34Var.k();
                                z2 = z;
                                i2 = i2;
                                break;
                            case 26:
                                z = z2;
                                if ((this.G & 8) == 8) {
                                    ntd ntdVar = this.K;
                                    ntdVar.getClass();
                                    mtdVarR = ntd.r(ntdVar);
                                }
                                ntd ntdVar2 = (ntd) t34Var.g(ntd.Y, oc7Var);
                                this.K = ntdVar2;
                                if (mtdVarR != null) {
                                    mtdVarR.j(ntdVar2);
                                    this.K = mtdVarR.h();
                                }
                                this.G |= 8;
                                z2 = z;
                                i2 = i2;
                                break;
                            case 34:
                                z = z2;
                                int i3 = (i2 == true ? 1 : 0) & 32;
                                i2 = i2;
                                if (i3 != 32) {
                                    this.M = new ArrayList();
                                    i2 = (i2 == true ? 1 : 0) | 32;
                                }
                                this.M.add(t34Var.g(std.R, oc7Var));
                                z2 = z;
                                i2 = i2;
                                break;
                            case 42:
                                z = z2;
                                if ((this.G & 32) == 32) {
                                    ntd ntdVar3 = this.N;
                                    ntdVar3.getClass();
                                    mtdVarR2 = ntd.r(ntdVar3);
                                }
                                ntd ntdVar4 = (ntd) t34Var.g(ntd.Y, oc7Var);
                                this.N = ntdVar4;
                                if (mtdVarR2 != null) {
                                    mtdVarR2.j(ntdVar4);
                                    this.N = mtdVarR2.h();
                                }
                                this.G |= 32;
                                z2 = z;
                                i2 = i2;
                                break;
                            case 50:
                                z = z2;
                                int i4 = (i2 == true ? 1 : 0) & FreeTypeConstants.FT_LOAD_NO_RECURSE;
                                i2 = i2;
                                if (i4 != 1024) {
                                    this.S = new ArrayList();
                                    i2 = (i2 == true ? 1 : 0) | FreeTypeConstants.FT_LOAD_NO_RECURSE;
                                }
                                this.S.add(t34Var.g(vtd.Q, oc7Var));
                                z2 = z;
                                i2 = i2;
                                break;
                            case 56:
                                z = z2;
                                this.G |= 16;
                                this.L = t34Var.k();
                                z2 = z;
                                i2 = i2;
                                break;
                            case FreeTypeConstants.FT_LOAD_CROP_BITMAP /* 64 */:
                                z = z2;
                                this.G |= 64;
                                this.O = t34Var.k();
                                z2 = z;
                                i2 = i2;
                                break;
                            case 72:
                                z = z2;
                                this.G |= 1;
                                this.H = t34Var.k();
                                z2 = z;
                                i2 = i2;
                                break;
                            case 82:
                                z = z2;
                                int i5 = (i2 == true ? 1 : 0) & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                                i2 = i2;
                                if (i5 != 256) {
                                    this.P = new ArrayList();
                                    i2 = (i2 == true ? 1 : 0) | FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                                }
                                this.P.add(t34Var.g(ntd.Y, oc7Var));
                                z2 = z;
                                i2 = i2;
                                break;
                            case 88:
                                z = z2;
                                int i6 = (i2 == true ? 1 : 0) & 512;
                                i2 = i2;
                                if (i6 != 512) {
                                    this.Q = new ArrayList();
                                    i2 = (i2 == true ? 1 : 0) | 512;
                                }
                                this.Q.add(Integer.valueOf(t34Var.k()));
                                z2 = z;
                                i2 = i2;
                                break;
                            case 90:
                                z = z2;
                                int iD = t34Var.d(t34Var.k());
                                int i7 = (i2 == true ? 1 : 0) & 512;
                                i2 = i2;
                                if (i7 != 512) {
                                    i2 = i2;
                                    if (t34Var.b() > 0) {
                                        this.Q = new ArrayList();
                                        i2 = (i2 == true ? 1 : 0) | 512;
                                    }
                                }
                                while (t34Var.b() > 0) {
                                    this.Q.add(Integer.valueOf(t34Var.k()));
                                }
                                t34Var.c(iD);
                                z2 = z;
                                i2 = i2;
                                break;
                            case 242:
                                z = z2;
                                if ((this.G & FreeTypeConstants.FT_LOAD_PEDANTIC) == 128) {
                                    ttd ttdVar = this.T;
                                    ttdVar.getClass();
                                    asdVarI = ttd.i(ttdVar);
                                }
                                ttd ttdVar2 = (ttd) t34Var.g(ttd.L, oc7Var);
                                this.T = ttdVar2;
                                if (asdVarI != null) {
                                    asdVarI.k(ttdVar2);
                                    this.T = asdVarI.h();
                                }
                                this.G |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                                z2 = z;
                                i2 = i2;
                                break;
                            case 248:
                                z = z2;
                                int i8 = (i2 == true ? 1 : 0) & FreeTypeConstants.FT_LOAD_MONOCHROME;
                                i2 = i2;
                                if (i8 != 4096) {
                                    this.U = new ArrayList();
                                    i2 = (i2 == true ? 1 : 0) | FreeTypeConstants.FT_LOAD_MONOCHROME;
                                }
                                this.U.add(Integer.valueOf(t34Var.k()));
                                z2 = z;
                                i2 = i2;
                                break;
                            case 250:
                                z = z2;
                                int iD2 = t34Var.d(t34Var.k());
                                int i9 = (i2 == true ? 1 : 0) & FreeTypeConstants.FT_LOAD_MONOCHROME;
                                i2 = i2;
                                if (i9 != 4096) {
                                    i2 = i2;
                                    if (t34Var.b() > 0) {
                                        this.U = new ArrayList();
                                        i2 = (i2 == true ? 1 : 0) | FreeTypeConstants.FT_LOAD_MONOCHROME;
                                    }
                                }
                                while (t34Var.b() > 0) {
                                    this.U.add(Integer.valueOf(t34Var.k()));
                                }
                                t34Var.c(iD2);
                                z2 = z;
                                i2 = i2;
                                break;
                            case 258:
                                if ((this.G & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 256) {
                                    isd isdVar = this.V;
                                    isdVar.getClass();
                                    hsdVar = new hsd(i);
                                    z = z2;
                                    hsdVar.H = Collections.EMPTY_LIST;
                                    hsdVar.i(isdVar);
                                } else {
                                    z = z2;
                                }
                                isd isdVar2 = (isd) t34Var.g(isd.J, oc7Var);
                                this.V = isdVar2;
                                if (hsdVar != null) {
                                    hsdVar.i(isdVar2);
                                    this.V = hsdVar.g();
                                }
                                this.G |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                                z2 = z;
                                i2 = i2;
                                break;
                            default:
                                N = n(t34Var, v34VarJ, oc7Var, iN);
                                if (N == 0) {
                                    z3 = z2;
                                    z = z3;
                                } else {
                                    z = z2;
                                }
                                z2 = z;
                                i2 = i2;
                                break;
                        }
                    } catch (IOException e) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e.getMessage());
                        invalidProtocolBufferException.E = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (InvalidProtocolBufferException e2) {
                    e2.E = this;
                    throw e2;
                }
            } catch (Throwable th2) {
                if (((i2 == true ? 1 : 0) & 32) == 32) {
                    this.M = Collections.unmodifiableList(this.M);
                }
                if (((i2 == true ? 1 : 0) & FreeTypeConstants.FT_LOAD_NO_RECURSE) == N) {
                    this.S = Collections.unmodifiableList(this.S);
                }
                if (((i2 == true ? 1 : 0) & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 256) {
                    this.P = Collections.unmodifiableList(this.P);
                }
                if (((i2 == true ? 1 : 0) & 512) == 512) {
                    this.Q = Collections.unmodifiableList(this.Q);
                }
                if (((i2 == true ? 1 : 0) & FreeTypeConstants.FT_LOAD_MONOCHROME) == 4096) {
                    this.U = Collections.unmodifiableList(this.U);
                }
                try {
                    v34VarJ.k();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.F = j22Var.e();
                    throw th3;
                }
                this.F = j22Var.e();
                m();
                throw th2;
            }
        }
    }

    @Override // defpackage.aib
    public final b3 a() {
        return Y;
    }

    @Override // defpackage.aib
    public final boolean b() {
        byte b = this.W;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.G;
        if ((i & 4) != 4) {
            this.W = (byte) 0;
            return false;
        }
        if ((i & 8) == 8 && !this.K.b()) {
            this.W = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.M.size(); i2++) {
            if (!((std) this.M.get(i2)).b()) {
                this.W = (byte) 0;
                return false;
            }
        }
        if ((this.G & 32) == 32 && !this.N.b()) {
            this.W = (byte) 0;
            return false;
        }
        for (int i3 = 0; i3 < this.P.size(); i3++) {
            if (!((ntd) this.P.get(i3)).b()) {
                this.W = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.S.size(); i4++) {
            if (!((vtd) this.S.get(i4)).b()) {
                this.W = (byte) 0;
                return false;
            }
        }
        if ((this.G & FreeTypeConstants.FT_LOAD_PEDANTIC) == 128 && !this.T.b()) {
            this.W = (byte) 0;
            return false;
        }
        if ((this.G & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 256 && !this.V.b()) {
            this.W = (byte) 0;
            return false;
        }
        if (i()) {
            this.W = (byte) 1;
            return true;
        }
        this.W = (byte) 0;
        return false;
    }

    @Override // defpackage.b3
    public final int c() {
        List list;
        List list2;
        int i = this.X;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int iB = (this.G & 2) == 2 ? v34.b(1, this.I) : 0;
        if ((this.G & 4) == 4) {
            iB += v34.b(2, this.J);
        }
        if ((this.G & 8) == 8) {
            iB += v34.d(3, this.K);
        }
        for (int i3 = 0; i3 < this.M.size(); i3++) {
            iB += v34.d(4, (b3) this.M.get(i3));
        }
        if ((this.G & 32) == 32) {
            iB += v34.d(5, this.N);
        }
        for (int i4 = 0; i4 < this.S.size(); i4++) {
            iB += v34.d(6, (b3) this.S.get(i4));
        }
        if ((this.G & 16) == 16) {
            iB += v34.b(7, this.L);
        }
        if ((this.G & 64) == 64) {
            iB += v34.b(8, this.O);
        }
        if ((this.G & 1) == 1) {
            iB += v34.b(9, this.H);
        }
        for (int i5 = 0; i5 < this.P.size(); i5++) {
            iB += v34.d(10, (b3) this.P.get(i5));
        }
        int i6 = 0;
        int iC = 0;
        while (true) {
            int size = this.Q.size();
            list = this.Q;
            if (i6 >= size) {
                break;
            }
            iC += v34.c(((Integer) list.get(i6)).intValue());
            i6++;
        }
        int iD = iB + iC;
        if (!list.isEmpty()) {
            iD = iD + 1 + v34.c(iC);
        }
        this.R = iC;
        if ((this.G & FreeTypeConstants.FT_LOAD_PEDANTIC) == 128) {
            iD += v34.d(30, this.T);
        }
        int iC2 = 0;
        while (true) {
            int size2 = this.U.size();
            list2 = this.U;
            if (i2 >= size2) {
                break;
            }
            iC2 += v34.c(((Integer) list2.get(i2)).intValue());
            i2++;
        }
        int size3 = (list2.size() * 2) + iD + iC2;
        if ((this.G & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 256) {
            size3 += v34.d(32, this.V);
        }
        int size4 = this.F.size() + j() + size3;
        this.X = size4;
        return size4;
    }

    @Override // defpackage.b3
    public final i28 d() {
        return tsd.j();
    }

    @Override // defpackage.b3
    public final i28 e() {
        tsd tsdVarJ = tsd.j();
        tsdVarJ.k(this);
        return tsdVarJ;
    }

    @Override // defpackage.b3
    public final void f(v34 v34Var) throws IOException {
        c();
        q28 q28Var = new q28((r28) this);
        if ((this.G & 2) == 2) {
            v34Var.m(1, this.I);
        }
        if ((this.G & 4) == 4) {
            v34Var.m(2, this.J);
        }
        if ((this.G & 8) == 8) {
            v34Var.o(3, this.K);
        }
        for (int i = 0; i < this.M.size(); i++) {
            v34Var.o(4, (b3) this.M.get(i));
        }
        if ((this.G & 32) == 32) {
            v34Var.o(5, this.N);
        }
        for (int i2 = 0; i2 < this.S.size(); i2++) {
            v34Var.o(6, (b3) this.S.get(i2));
        }
        if ((this.G & 16) == 16) {
            v34Var.m(7, this.L);
        }
        if ((this.G & 64) == 64) {
            v34Var.m(8, this.O);
        }
        if ((this.G & 1) == 1) {
            v34Var.m(9, this.H);
        }
        for (int i3 = 0; i3 < this.P.size(); i3++) {
            v34Var.o(10, (b3) this.P.get(i3));
        }
        if (this.Q.size() > 0) {
            v34Var.v(90);
            v34Var.v(this.R);
        }
        for (int i4 = 0; i4 < this.Q.size(); i4++) {
            v34Var.n(((Integer) this.Q.get(i4)).intValue());
        }
        if ((this.G & FreeTypeConstants.FT_LOAD_PEDANTIC) == 128) {
            v34Var.o(30, this.T);
        }
        for (int i5 = 0; i5 < this.U.size(); i5++) {
            v34Var.m(31, ((Integer) this.U.get(i5)).intValue());
        }
        if ((this.G & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 256) {
            v34Var.o(32, this.V);
        }
        q28Var.J(19000, v34Var);
        v34Var.r(this.F);
    }

    public final void p() {
        this.H = 6;
        this.I = 6;
        this.J = 0;
        ntd ntdVar = ntd.X;
        this.K = ntdVar;
        this.L = 0;
        List list = Collections.EMPTY_LIST;
        this.M = list;
        this.N = ntdVar;
        this.O = 0;
        this.P = list;
        this.Q = list;
        this.S = list;
        this.T = ttd.K;
        this.U = list;
        this.V = isd.I;
    }

    public usd() {
        this.R = -1;
        this.W = (byte) -1;
        this.X = -1;
        this.F = l22.E;
    }

    public usd(tsd tsdVar) {
        super(tsdVar);
        this.R = -1;
        this.W = (byte) -1;
        this.X = -1;
        this.F = tsdVar.E;
    }
}
