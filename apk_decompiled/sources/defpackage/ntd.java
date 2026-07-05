package defpackage;

import androidx.health.platform.client.proto.g;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes.dex */
public final class ntd extends r28 {
    public static final ntd X;
    public static final sk9 Y = new sk9(19);
    public final l22 F;
    public int G;
    public List H;
    public boolean I;
    public int J;
    public ntd K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public ntd Q;
    public int R;
    public ntd S;
    public int T;
    public int U;
    public byte V;
    public int W;

    static {
        ntd ntdVar = new ntd();
        X = ntdVar;
        ntdVar.q();
    }

    public ntd(t34 t34Var, oc7 oc7Var) {
        this.V = (byte) -1;
        this.W = -1;
        q();
        j22 j22Var = new j22();
        v34 v34VarJ = v34.j(j22Var, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int iN = t34Var.n();
                    sk9 sk9Var = Y;
                    mtd mtdVarR = null;
                    switch (iN) {
                        case 0:
                            break;
                        case 8:
                            this.G |= FreeTypeConstants.FT_LOAD_MONOCHROME;
                            this.U = t34Var.k();
                            continue;
                        case g.AVG_FIELD_NUMBER /* 18 */:
                            if (!z2) {
                                this.H = new ArrayList();
                                z2 = true;
                            }
                            this.H.add(t34Var.g(ltd.M, oc7Var));
                            continue;
                        case 24:
                            this.G |= 1;
                            this.I = t34Var.l() != 0;
                            continue;
                        case FreeTypeConstants.FT_LOAD_FORCE_AUTOHINT /* 32 */:
                            this.G |= 2;
                            this.J = t34Var.k();
                            continue;
                        case 42:
                            if ((this.G & 4) == 4) {
                                ntd ntdVar = this.K;
                                ntdVar.getClass();
                                mtdVarR = r(ntdVar);
                            }
                            ntd ntdVar2 = (ntd) t34Var.g(sk9Var, oc7Var);
                            this.K = ntdVar2;
                            if (mtdVarR != null) {
                                mtdVarR.j(ntdVar2);
                                this.K = mtdVarR.h();
                            }
                            this.G |= 4;
                            continue;
                        case mdj.f /* 48 */:
                            this.G |= 16;
                            this.M = t34Var.k();
                            continue;
                        case 56:
                            this.G |= 32;
                            this.N = t34Var.k();
                            continue;
                        case FreeTypeConstants.FT_LOAD_CROP_BITMAP /* 64 */:
                            this.G |= 8;
                            this.L = t34Var.k();
                            continue;
                        case 72:
                            this.G |= 64;
                            this.O = t34Var.k();
                            continue;
                        case 82:
                            if ((this.G & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 256) {
                                ntd ntdVar3 = this.Q;
                                ntdVar3.getClass();
                                mtdVarR = r(ntdVar3);
                            }
                            ntd ntdVar4 = (ntd) t34Var.g(sk9Var, oc7Var);
                            this.Q = ntdVar4;
                            if (mtdVarR != null) {
                                mtdVarR.j(ntdVar4);
                                this.Q = mtdVarR.h();
                            }
                            this.G |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                            continue;
                        case 88:
                            this.G |= 512;
                            this.R = t34Var.k();
                            continue;
                        case 96:
                            this.G |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                            this.P = t34Var.k();
                            continue;
                        case 106:
                            if ((this.G & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 1024) {
                                ntd ntdVar5 = this.S;
                                ntdVar5.getClass();
                                mtdVarR = r(ntdVar5);
                            }
                            ntd ntdVar6 = (ntd) t34Var.g(sk9Var, oc7Var);
                            this.S = ntdVar6;
                            if (mtdVarR != null) {
                                mtdVarR.j(ntdVar6);
                                this.S = mtdVarR.h();
                            }
                            this.G |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                            continue;
                        case 112:
                            this.G |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                            this.T = t34Var.k();
                            continue;
                        default:
                            if (!n(t34Var, v34VarJ, oc7Var, iN)) {
                            }
                            break;
                    }
                    z = true;
                } catch (Throwable th) {
                    if (z2) {
                        this.H = Collections.unmodifiableList(this.H);
                    }
                    try {
                        v34VarJ.k();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.F = j22Var.e();
                        throw th2;
                    }
                    this.F = j22Var.e();
                    m();
                    throw th;
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
        if (z2) {
            this.H = Collections.unmodifiableList(this.H);
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
    }

    public static mtd r(ntd ntdVar) {
        mtd mtdVarI = mtd.i();
        mtdVarI.j(ntdVar);
        return mtdVarI;
    }

    @Override // defpackage.aib
    public final b3 a() {
        return X;
    }

    @Override // defpackage.aib
    public final boolean b() {
        byte b = this.V;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.H.size(); i++) {
            if (!((ltd) this.H.get(i)).b()) {
                this.V = (byte) 0;
                return false;
            }
        }
        if ((this.G & 4) == 4 && !this.K.b()) {
            this.V = (byte) 0;
            return false;
        }
        if ((this.G & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 256 && !this.Q.b()) {
            this.V = (byte) 0;
            return false;
        }
        if ((this.G & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 1024 && !this.S.b()) {
            this.V = (byte) 0;
            return false;
        }
        if (i()) {
            this.V = (byte) 1;
            return true;
        }
        this.V = (byte) 0;
        return false;
    }

    @Override // defpackage.b3
    public final int c() {
        int i = this.W;
        if (i != -1) {
            return i;
        }
        int iB = (this.G & FreeTypeConstants.FT_LOAD_MONOCHROME) == 4096 ? v34.b(1, this.U) : 0;
        for (int i2 = 0; i2 < this.H.size(); i2++) {
            iB += v34.d(2, (b3) this.H.get(i2));
        }
        if ((this.G & 1) == 1) {
            iB += v34.h(3) + 1;
        }
        if ((this.G & 2) == 2) {
            iB += v34.b(4, this.J);
        }
        if ((this.G & 4) == 4) {
            iB += v34.d(5, this.K);
        }
        if ((this.G & 16) == 16) {
            iB += v34.b(6, this.M);
        }
        if ((this.G & 32) == 32) {
            iB += v34.b(7, this.N);
        }
        if ((this.G & 8) == 8) {
            iB += v34.b(8, this.L);
        }
        if ((this.G & 64) == 64) {
            iB += v34.b(9, this.O);
        }
        if ((this.G & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 256) {
            iB += v34.d(10, this.Q);
        }
        if ((this.G & 512) == 512) {
            iB += v34.b(11, this.R);
        }
        if ((this.G & FreeTypeConstants.FT_LOAD_PEDANTIC) == 128) {
            iB += v34.b(12, this.P);
        }
        if ((this.G & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 1024) {
            iB += v34.d(13, this.S);
        }
        if ((this.G & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) == 2048) {
            iB += v34.b(14, this.T);
        }
        int size = this.F.size() + j() + iB;
        this.W = size;
        return size;
    }

    @Override // defpackage.b3
    public final i28 d() {
        return mtd.i();
    }

    @Override // defpackage.b3
    public final void f(v34 v34Var) throws IOException {
        c();
        q28 q28Var = new q28((r28) this);
        if ((this.G & FreeTypeConstants.FT_LOAD_MONOCHROME) == 4096) {
            v34Var.m(1, this.U);
        }
        for (int i = 0; i < this.H.size(); i++) {
            v34Var.o(2, (b3) this.H.get(i));
        }
        if ((this.G & 1) == 1) {
            boolean z = this.I;
            v34Var.x(3, 0);
            v34Var.q(z ? 1 : 0);
        }
        if ((this.G & 2) == 2) {
            v34Var.m(4, this.J);
        }
        if ((this.G & 4) == 4) {
            v34Var.o(5, this.K);
        }
        if ((this.G & 16) == 16) {
            v34Var.m(6, this.M);
        }
        if ((this.G & 32) == 32) {
            v34Var.m(7, this.N);
        }
        if ((this.G & 8) == 8) {
            v34Var.m(8, this.L);
        }
        if ((this.G & 64) == 64) {
            v34Var.m(9, this.O);
        }
        if ((this.G & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 256) {
            v34Var.o(10, this.Q);
        }
        if ((this.G & 512) == 512) {
            v34Var.m(11, this.R);
        }
        if ((this.G & FreeTypeConstants.FT_LOAD_PEDANTIC) == 128) {
            v34Var.m(12, this.P);
        }
        if ((this.G & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 1024) {
            v34Var.o(13, this.S);
        }
        if ((this.G & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) == 2048) {
            v34Var.m(14, this.T);
        }
        q28Var.J(200, v34Var);
        v34Var.r(this.F);
    }

    public final boolean p() {
        return (this.G & 16) == 16;
    }

    public final void q() {
        this.H = Collections.EMPTY_LIST;
        this.I = false;
        this.J = 0;
        ntd ntdVar = X;
        this.K = ntdVar;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = ntdVar;
        this.R = 0;
        this.S = ntdVar;
        this.T = 0;
        this.U = 0;
    }

    @Override // defpackage.b3
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final mtd e() {
        return r(this);
    }

    public ntd() {
        this.V = (byte) -1;
        this.W = -1;
        this.F = l22.E;
    }

    public ntd(mtd mtdVar) {
        super(mtdVar);
        this.V = (byte) -1;
        this.W = -1;
        this.F = mtdVar.E;
    }
}
