package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes.dex */
public final class ptd extends r28 {
    public static final ptd S;
    public static final jsd T = new jsd(2);
    public final l22 F;
    public int G;
    public int H;
    public int I;
    public List J;
    public ntd K;
    public int L;
    public ntd M;
    public int N;
    public List O;
    public List P;
    public byte Q;
    public int R;

    static {
        ptd ptdVar = new ptd();
        S = ptdVar;
        ptdVar.H = 6;
        ptdVar.I = 0;
        List list = Collections.EMPTY_LIST;
        ptdVar.J = list;
        ntd ntdVar = ntd.X;
        ptdVar.K = ntdVar;
        ptdVar.L = 0;
        ptdVar.M = ntdVar;
        ptdVar.N = 0;
        ptdVar.O = list;
        ptdVar.P = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public ptd(t34 t34Var, oc7 oc7Var) {
        this.Q = (byte) -1;
        this.R = -1;
        this.H = 6;
        boolean z = false;
        this.I = 0;
        List list = Collections.EMPTY_LIST;
        this.J = list;
        ntd ntdVar = ntd.X;
        this.K = ntdVar;
        this.L = 0;
        this.M = ntdVar;
        this.N = 0;
        this.O = list;
        this.P = list;
        j22 j22Var = new j22();
        v34 v34VarJ = v34.j(j22Var, 1);
        int i = 0;
        while (true) {
            ?? N = 128;
            if (z) {
                if ((i & 4) == 4) {
                    this.J = Collections.unmodifiableList(this.J);
                }
                if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 128) {
                    this.O = Collections.unmodifiableList(this.O);
                }
                if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 256) {
                    this.P = Collections.unmodifiableList(this.P);
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
                    int iN = t34Var.n();
                    mtd mtdVarR = null;
                    switch (iN) {
                        case 0:
                            z = true;
                            break;
                        case 8:
                            this.G |= 1;
                            this.H = t34Var.k();
                            break;
                        case 16:
                            this.G |= 2;
                            this.I = t34Var.k();
                            break;
                        case 26:
                            if ((i & 4) != 4) {
                                this.J = new ArrayList();
                                i |= 4;
                            }
                            this.J.add(t34Var.g(std.R, oc7Var));
                            break;
                        case 34:
                            if ((this.G & 4) == 4) {
                                ntd ntdVar2 = this.K;
                                ntdVar2.getClass();
                                mtdVarR = ntd.r(ntdVar2);
                            }
                            ntd ntdVar3 = (ntd) t34Var.g(ntd.Y, oc7Var);
                            this.K = ntdVar3;
                            if (mtdVarR != null) {
                                mtdVarR.j(ntdVar3);
                                this.K = mtdVarR.h();
                            }
                            this.G |= 4;
                            break;
                        case 40:
                            this.G |= 8;
                            this.L = t34Var.k();
                            break;
                        case 50:
                            if ((this.G & 16) == 16) {
                                ntd ntdVar4 = this.M;
                                ntdVar4.getClass();
                                mtdVarR = ntd.r(ntdVar4);
                            }
                            ntd ntdVar5 = (ntd) t34Var.g(ntd.Y, oc7Var);
                            this.M = ntdVar5;
                            if (mtdVarR != null) {
                                mtdVarR.j(ntdVar5);
                                this.M = mtdVarR.h();
                            }
                            this.G |= 16;
                            break;
                        case 56:
                            this.G |= 32;
                            this.N = t34Var.k();
                            break;
                        case 66:
                            if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 128) {
                                this.O = new ArrayList();
                                i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                            }
                            this.O.add(t34Var.g(bsd.L, oc7Var));
                            break;
                        case 248:
                            if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 256) {
                                this.P = new ArrayList();
                                i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                            }
                            this.P.add(Integer.valueOf(t34Var.k()));
                            break;
                        case 250:
                            int iD = t34Var.d(t34Var.k());
                            if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 256 && t34Var.b() > 0) {
                                this.P = new ArrayList();
                                i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                            }
                            while (t34Var.b() > 0) {
                                this.P.add(Integer.valueOf(t34Var.k()));
                            }
                            t34Var.c(iD);
                            break;
                        default:
                            N = n(t34Var, v34VarJ, oc7Var, iN);
                            if (N == 0) {
                                z = true;
                            }
                            break;
                    }
                } catch (Throwable th2) {
                    if ((i & 4) == 4) {
                        this.J = Collections.unmodifiableList(this.J);
                    }
                    if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == N) {
                        this.O = Collections.unmodifiableList(this.O);
                    }
                    if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 256) {
                        this.P = Collections.unmodifiableList(this.P);
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
            } catch (InvalidProtocolBufferException e) {
                e.E = this;
                throw e;
            } catch (IOException e2) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                invalidProtocolBufferException.E = this;
                throw invalidProtocolBufferException;
            }
        }
    }

    @Override // defpackage.aib
    public final b3 a() {
        return S;
    }

    @Override // defpackage.aib
    public final boolean b() {
        byte b = this.Q;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.G & 2) != 2) {
            this.Q = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.J.size(); i++) {
            if (!((std) this.J.get(i)).b()) {
                this.Q = (byte) 0;
                return false;
            }
        }
        if ((this.G & 4) == 4 && !this.K.b()) {
            this.Q = (byte) 0;
            return false;
        }
        if ((this.G & 16) == 16 && !this.M.b()) {
            this.Q = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.O.size(); i2++) {
            if (!((bsd) this.O.get(i2)).b()) {
                this.Q = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.Q = (byte) 1;
            return true;
        }
        this.Q = (byte) 0;
        return false;
    }

    @Override // defpackage.b3
    public final int c() {
        int i = this.R;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int iB = (this.G & 1) == 1 ? v34.b(1, this.H) : 0;
        if ((this.G & 2) == 2) {
            iB += v34.b(2, this.I);
        }
        for (int i3 = 0; i3 < this.J.size(); i3++) {
            iB += v34.d(3, (b3) this.J.get(i3));
        }
        if ((this.G & 4) == 4) {
            iB += v34.d(4, this.K);
        }
        if ((this.G & 8) == 8) {
            iB += v34.b(5, this.L);
        }
        if ((this.G & 16) == 16) {
            iB += v34.d(6, this.M);
        }
        if ((this.G & 32) == 32) {
            iB += v34.b(7, this.N);
        }
        for (int i4 = 0; i4 < this.O.size(); i4++) {
            iB += v34.d(8, (b3) this.O.get(i4));
        }
        int iC = 0;
        while (true) {
            int size = this.P.size();
            List list = this.P;
            if (i2 >= size) {
                int size2 = this.F.size() + j() + (list.size() * 2) + iB + iC;
                this.R = size2;
                return size2;
            }
            iC += v34.c(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // defpackage.b3
    public final i28 d() {
        return otd.h();
    }

    @Override // defpackage.b3
    public final i28 e() {
        otd otdVarH = otd.h();
        otdVarH.j(this);
        return otdVarH;
    }

    @Override // defpackage.b3
    public final void f(v34 v34Var) throws IOException {
        c();
        q28 q28Var = new q28((r28) this);
        if ((this.G & 1) == 1) {
            v34Var.m(1, this.H);
        }
        if ((this.G & 2) == 2) {
            v34Var.m(2, this.I);
        }
        for (int i = 0; i < this.J.size(); i++) {
            v34Var.o(3, (b3) this.J.get(i));
        }
        if ((this.G & 4) == 4) {
            v34Var.o(4, this.K);
        }
        if ((this.G & 8) == 8) {
            v34Var.m(5, this.L);
        }
        if ((this.G & 16) == 16) {
            v34Var.o(6, this.M);
        }
        if ((this.G & 32) == 32) {
            v34Var.m(7, this.N);
        }
        for (int i2 = 0; i2 < this.O.size(); i2++) {
            v34Var.o(8, (b3) this.O.get(i2));
        }
        for (int i3 = 0; i3 < this.P.size(); i3++) {
            v34Var.m(31, ((Integer) this.P.get(i3)).intValue());
        }
        q28Var.J(200, v34Var);
        v34Var.r(this.F);
    }

    public ptd() {
        this.Q = (byte) -1;
        this.R = -1;
        this.F = l22.E;
    }

    public ptd(otd otdVar) {
        super(otdVar);
        this.Q = (byte) -1;
        this.R = -1;
        this.F = otdVar.E;
    }
}
