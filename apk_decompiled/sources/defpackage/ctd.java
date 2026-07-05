package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes.dex */
public final class ctd extends r28 {
    public static final ctd Y;
    public static final sk9 Z = new sk9(15);
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
    public vtd S;
    public int T;
    public int U;
    public List V;
    public byte W;
    public int X;

    static {
        ctd ctdVar = new ctd();
        Y = ctdVar;
        ctdVar.p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public ctd(t34 t34Var, oc7 oc7Var) {
        this.R = -1;
        this.W = (byte) -1;
        this.X = -1;
        p();
        j22 j22Var = new j22();
        v34 v34VarJ = v34.j(j22Var, 1);
        boolean z = false;
        int i = 0;
        while (true) {
            ?? N = 256;
            if (z) {
                if (((i == true ? 1 : 0) & 32) == 32) {
                    this.M = Collections.unmodifiableList(this.M);
                }
                if (((i == true ? 1 : 0) & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 256) {
                    this.P = Collections.unmodifiableList(this.P);
                }
                if (((i == true ? 1 : 0) & 512) == 512) {
                    this.Q = Collections.unmodifiableList(this.Q);
                }
                if (((i == true ? 1 : 0) & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) == 8192) {
                    this.V = Collections.unmodifiableList(this.V);
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
                        utd utdVarH = null;
                        mtd mtdVarR2 = null;
                        switch (iN) {
                            case 0:
                                z = true;
                                break;
                            case 8:
                                this.G |= 2;
                                this.I = t34Var.k();
                                break;
                            case 16:
                                this.G |= 4;
                                this.J = t34Var.k();
                                break;
                            case 26:
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
                                break;
                            case 34:
                                int i2 = (i == true ? 1 : 0) & 32;
                                i = i;
                                if (i2 != 32) {
                                    this.M = new ArrayList();
                                    i = (i == true ? 1 : 0) | 32;
                                }
                                this.M.add(t34Var.g(std.R, oc7Var));
                                break;
                            case 42:
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
                                break;
                            case 50:
                                if ((this.G & FreeTypeConstants.FT_LOAD_PEDANTIC) == 128) {
                                    vtd vtdVar = this.S;
                                    vtdVar.getClass();
                                    utdVarH = utd.h();
                                    utdVarH.j(vtdVar);
                                }
                                vtd vtdVar2 = (vtd) t34Var.g(vtd.Q, oc7Var);
                                this.S = vtdVar2;
                                if (utdVarH != null) {
                                    utdVarH.j(vtdVar2);
                                    this.S = utdVarH.i();
                                }
                                this.G |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                                break;
                            case 56:
                                this.G |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                                this.T = t34Var.k();
                                break;
                            case FreeTypeConstants.FT_LOAD_CROP_BITMAP /* 64 */:
                                this.G |= 512;
                                this.U = t34Var.k();
                                break;
                            case 72:
                                this.G |= 16;
                                this.L = t34Var.k();
                                break;
                            case 80:
                                this.G |= 64;
                                this.O = t34Var.k();
                                break;
                            case 88:
                                this.G |= 1;
                                this.H = t34Var.k();
                                break;
                            case 98:
                                int i3 = (i == true ? 1 : 0) & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                                i = i;
                                if (i3 != 256) {
                                    this.P = new ArrayList();
                                    i = (i == true ? 1 : 0) | FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                                }
                                this.P.add(t34Var.g(ntd.Y, oc7Var));
                                break;
                            case 104:
                                int i4 = (i == true ? 1 : 0) & 512;
                                i = i;
                                if (i4 != 512) {
                                    this.Q = new ArrayList();
                                    i = (i == true ? 1 : 0) | 512;
                                }
                                this.Q.add(Integer.valueOf(t34Var.k()));
                                break;
                            case 106:
                                int iD = t34Var.d(t34Var.k());
                                int i5 = (i == true ? 1 : 0) & 512;
                                i = i;
                                if (i5 != 512) {
                                    i = i;
                                    if (t34Var.b() > 0) {
                                        this.Q = new ArrayList();
                                        i = (i == true ? 1 : 0) | 512;
                                    }
                                }
                                while (t34Var.b() > 0) {
                                    this.Q.add(Integer.valueOf(t34Var.k()));
                                }
                                t34Var.c(iD);
                                break;
                            case 248:
                                int i6 = (i == true ? 1 : 0) & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
                                i = i;
                                if (i6 != 8192) {
                                    this.V = new ArrayList();
                                    i = (i == true ? 1 : 0) | FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
                                }
                                this.V.add(Integer.valueOf(t34Var.k()));
                                break;
                            case 250:
                                int iD2 = t34Var.d(t34Var.k());
                                int i7 = (i == true ? 1 : 0) & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
                                i = i;
                                if (i7 != 8192) {
                                    i = i;
                                    if (t34Var.b() > 0) {
                                        this.V = new ArrayList();
                                        i = (i == true ? 1 : 0) | FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
                                    }
                                }
                                while (t34Var.b() > 0) {
                                    this.V.add(Integer.valueOf(t34Var.k()));
                                }
                                t34Var.c(iD2);
                                break;
                            default:
                                N = n(t34Var, v34VarJ, oc7Var, iN);
                                if (N == 0) {
                                    z = true;
                                }
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
                if (((i == true ? 1 : 0) & 32) == 32) {
                    this.M = Collections.unmodifiableList(this.M);
                }
                if (((i == true ? 1 : 0) & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == N) {
                    this.P = Collections.unmodifiableList(this.P);
                }
                if (((i == true ? 1 : 0) & 512) == 512) {
                    this.Q = Collections.unmodifiableList(this.Q);
                }
                if (((i == true ? 1 : 0) & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) == 8192) {
                    this.V = Collections.unmodifiableList(this.V);
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
        if ((this.G & FreeTypeConstants.FT_LOAD_PEDANTIC) == 128 && !this.S.b()) {
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
        if ((this.G & FreeTypeConstants.FT_LOAD_PEDANTIC) == 128) {
            iB += v34.d(6, this.S);
        }
        if ((this.G & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 256) {
            iB += v34.b(7, this.T);
        }
        if ((this.G & 512) == 512) {
            iB += v34.b(8, this.U);
        }
        if ((this.G & 16) == 16) {
            iB += v34.b(9, this.L);
        }
        if ((this.G & 64) == 64) {
            iB += v34.b(10, this.O);
        }
        if ((this.G & 1) == 1) {
            iB += v34.b(11, this.H);
        }
        for (int i4 = 0; i4 < this.P.size(); i4++) {
            iB += v34.d(12, (b3) this.P.get(i4));
        }
        int i5 = 0;
        int iC = 0;
        while (true) {
            int size = this.Q.size();
            list = this.Q;
            if (i5 >= size) {
                break;
            }
            iC += v34.c(((Integer) list.get(i5)).intValue());
            i5++;
        }
        int iC2 = iB + iC;
        if (!list.isEmpty()) {
            iC2 = iC2 + 1 + v34.c(iC);
        }
        this.R = iC;
        int iC3 = 0;
        while (true) {
            int size2 = this.V.size();
            List list2 = this.V;
            if (i2 >= size2) {
                int size3 = this.F.size() + j() + (list2.size() * 2) + iC2 + iC3;
                this.X = size3;
                return size3;
            }
            iC3 += v34.c(((Integer) list2.get(i2)).intValue());
            i2++;
        }
    }

    @Override // defpackage.b3
    public final i28 d() {
        return btd.j();
    }

    @Override // defpackage.b3
    public final i28 e() {
        btd btdVarJ = btd.j();
        btdVarJ.k(this);
        return btdVarJ;
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
        if ((this.G & FreeTypeConstants.FT_LOAD_PEDANTIC) == 128) {
            v34Var.o(6, this.S);
        }
        if ((this.G & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 256) {
            v34Var.m(7, this.T);
        }
        if ((this.G & 512) == 512) {
            v34Var.m(8, this.U);
        }
        if ((this.G & 16) == 16) {
            v34Var.m(9, this.L);
        }
        if ((this.G & 64) == 64) {
            v34Var.m(10, this.O);
        }
        if ((this.G & 1) == 1) {
            v34Var.m(11, this.H);
        }
        for (int i2 = 0; i2 < this.P.size(); i2++) {
            v34Var.o(12, (b3) this.P.get(i2));
        }
        if (this.Q.size() > 0) {
            v34Var.v(106);
            v34Var.v(this.R);
        }
        for (int i3 = 0; i3 < this.Q.size(); i3++) {
            v34Var.n(((Integer) this.Q.get(i3)).intValue());
        }
        for (int i4 = 0; i4 < this.V.size(); i4++) {
            v34Var.m(31, ((Integer) this.V.get(i4)).intValue());
        }
        q28Var.J(19000, v34Var);
        v34Var.r(this.F);
    }

    public final void p() {
        this.H = 518;
        this.I = 2054;
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
        this.S = vtd.P;
        this.T = 0;
        this.U = 0;
        this.V = list;
    }

    public ctd() {
        this.R = -1;
        this.W = (byte) -1;
        this.X = -1;
        this.F = l22.E;
    }

    public ctd(btd btdVar) {
        super(btdVar);
        this.R = -1;
        this.W = (byte) -1;
        this.X = -1;
        this.F = btdVar.E;
    }
}
