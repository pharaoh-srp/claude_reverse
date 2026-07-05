package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes.dex */
public final class yrd extends u28 {
    public static final yrd T;
    public static final sk9 U = new sk9(7);
    public final l22 E;
    public int F;
    public xrd G;
    public long H;
    public float I;
    public double J;
    public int K;
    public int L;
    public int M;
    public bsd N;
    public List O;
    public int P;
    public int Q;
    public byte R;
    public int S;

    static {
        yrd yrdVar = new yrd();
        T = yrdVar;
        yrdVar.i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean] */
    public yrd(t34 t34Var, oc7 oc7Var) {
        asd asdVar;
        this.R = (byte) -1;
        this.S = -1;
        i();
        j22 j22Var = new j22();
        v34 v34VarJ = v34.j(j22Var, 1);
        int i = 0;
        boolean z = false;
        char c = 0;
        while (true) {
            ?? Q = 256;
            if (z) {
                if ((c & 256) == 256) {
                    this.O = Collections.unmodifiableList(this.O);
                }
                try {
                    v34VarJ.k();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    this.E = j22Var.e();
                    throw th;
                }
                this.E = j22Var.e();
                return;
            }
            try {
                try {
                    int iN = t34Var.n();
                    switch (iN) {
                        case 0:
                            z = true;
                            break;
                        case 8:
                            int iK = t34Var.k();
                            xrd xrdVarB = xrd.b(iK);
                            if (xrdVarB == null) {
                                v34VarJ.v(iN);
                                v34VarJ.v(iK);
                            } else {
                                this.F |= 1;
                                this.G = xrdVarB;
                            }
                            break;
                        case 16:
                            this.F |= 2;
                            long jL = t34Var.l();
                            this.H = (-(jL & 1)) ^ (jL >>> 1);
                            break;
                        case 29:
                            this.F |= 4;
                            this.I = Float.intBitsToFloat(t34Var.i());
                            break;
                        case 33:
                            this.F |= 8;
                            this.J = Double.longBitsToDouble(t34Var.j());
                            break;
                        case 40:
                            this.F |= 16;
                            this.K = t34Var.k();
                            break;
                        case mdj.f /* 48 */:
                            this.F |= 32;
                            this.L = t34Var.k();
                            break;
                        case 56:
                            this.F |= 64;
                            this.M = t34Var.k();
                            break;
                        case 66:
                            if ((this.F & FreeTypeConstants.FT_LOAD_PEDANTIC) == 128) {
                                bsd bsdVar = this.N;
                                bsdVar.getClass();
                                asdVar = new asd(i);
                                asdVar.H = Collections.EMPTY_LIST;
                                asdVar.j(bsdVar);
                            } else {
                                asdVar = null;
                            }
                            bsd bsdVar2 = (bsd) t34Var.g(bsd.L, oc7Var);
                            this.N = bsdVar2;
                            if (asdVar != null) {
                                asdVar.j(bsdVar2);
                                this.N = asdVar.g();
                            }
                            this.F |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                            break;
                        case 74:
                            if ((c & 256) != 256) {
                                this.O = new ArrayList();
                                c = 256;
                            }
                            this.O.add(t34Var.g(U, oc7Var));
                            break;
                        case 80:
                            this.F |= 512;
                            this.Q = t34Var.k();
                            break;
                        case 88:
                            this.F |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                            this.P = t34Var.k();
                            break;
                        default:
                            Q = t34Var.q(iN, v34VarJ);
                            if (Q == 0) {
                                z = true;
                            }
                            break;
                    }
                } catch (Throwable th2) {
                    if ((c & 256) == Q) {
                        this.O = Collections.unmodifiableList(this.O);
                    }
                    try {
                        v34VarJ.k();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
                        this.E = j22Var.e();
                        throw th3;
                    }
                    this.E = j22Var.e();
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
    public final boolean b() {
        byte b = this.R;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.F & FreeTypeConstants.FT_LOAD_PEDANTIC) == 128 && !this.N.b()) {
            this.R = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.O.size(); i++) {
            if (!((yrd) this.O.get(i)).b()) {
                this.R = (byte) 0;
                return false;
            }
        }
        this.R = (byte) 1;
        return true;
    }

    @Override // defpackage.b3
    public final int c() {
        int i = this.S;
        if (i != -1) {
            return i;
        }
        int iA = (this.F & 1) == 1 ? v34.a(1, this.G.E) : 0;
        if ((this.F & 2) == 2) {
            long j = this.H;
            iA += v34.g((j >> 63) ^ (j << 1)) + v34.h(2);
        }
        if ((this.F & 4) == 4) {
            iA += v34.h(3) + 4;
        }
        if ((this.F & 8) == 8) {
            iA += v34.h(4) + 8;
        }
        if ((this.F & 16) == 16) {
            iA += v34.b(5, this.K);
        }
        if ((this.F & 32) == 32) {
            iA += v34.b(6, this.L);
        }
        if ((this.F & 64) == 64) {
            iA += v34.b(7, this.M);
        }
        if ((this.F & FreeTypeConstants.FT_LOAD_PEDANTIC) == 128) {
            iA += v34.d(8, this.N);
        }
        for (int i2 = 0; i2 < this.O.size(); i2++) {
            iA += v34.d(9, (b3) this.O.get(i2));
        }
        if ((this.F & 512) == 512) {
            iA += v34.b(10, this.Q);
        }
        if ((this.F & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 256) {
            iA += v34.b(11, this.P);
        }
        int size = this.E.size() + iA;
        this.S = size;
        return size;
    }

    @Override // defpackage.b3
    public final i28 d() {
        return wrd.h();
    }

    @Override // defpackage.b3
    public final i28 e() {
        wrd wrdVarH = wrd.h();
        wrdVarH.i(this);
        return wrdVarH;
    }

    @Override // defpackage.b3
    public final void f(v34 v34Var) throws IOException {
        c();
        if ((this.F & 1) == 1) {
            v34Var.l(1, this.G.E);
        }
        if ((this.F & 2) == 2) {
            long j = this.H;
            v34Var.x(2, 0);
            v34Var.w((j >> 63) ^ (j << 1));
        }
        if ((this.F & 4) == 4) {
            float f = this.I;
            v34Var.x(3, 5);
            v34Var.t(Float.floatToRawIntBits(f));
        }
        if ((this.F & 8) == 8) {
            double d = this.J;
            v34Var.x(4, 1);
            v34Var.u(Double.doubleToRawLongBits(d));
        }
        if ((this.F & 16) == 16) {
            v34Var.m(5, this.K);
        }
        if ((this.F & 32) == 32) {
            v34Var.m(6, this.L);
        }
        if ((this.F & 64) == 64) {
            v34Var.m(7, this.M);
        }
        if ((this.F & FreeTypeConstants.FT_LOAD_PEDANTIC) == 128) {
            v34Var.o(8, this.N);
        }
        for (int i = 0; i < this.O.size(); i++) {
            v34Var.o(9, (b3) this.O.get(i));
        }
        if ((this.F & 512) == 512) {
            v34Var.m(10, this.Q);
        }
        if ((this.F & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 256) {
            v34Var.m(11, this.P);
        }
        v34Var.r(this.E);
    }

    public final void i() {
        this.G = xrd.BYTE;
        this.H = 0L;
        this.I = MTTypesetterKt.kLineSkipLimitMultiplier;
        this.J = 0.0d;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = bsd.K;
        this.O = Collections.EMPTY_LIST;
        this.P = 0;
        this.Q = 0;
    }

    public yrd() {
        this.R = (byte) -1;
        this.S = -1;
        this.E = l22.E;
    }

    public yrd(wrd wrdVar) {
        this.R = (byte) -1;
        this.S = -1;
        this.E = wrdVar.E;
    }
}
