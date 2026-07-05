package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes3.dex */
public final class ssd extends u28 {
    public static final ssd P;
    public static final jsd Q = new jsd(1);
    public final l22 E;
    public int F;
    public int G;
    public int H;
    public rsd I;
    public ntd J;
    public int K;
    public List L;
    public List M;
    public byte N;
    public int O;

    static {
        ssd ssdVar = new ssd();
        P = ssdVar;
        ssdVar.G = 0;
        ssdVar.H = 0;
        ssdVar.I = rsd.TRUE;
        ssdVar.J = ntd.X;
        ssdVar.K = 0;
        List list = Collections.EMPTY_LIST;
        ssdVar.L = list;
        ssdVar.M = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ssd(t34 t34Var, oc7 oc7Var) {
        rsd rsdVar;
        this.N = (byte) -1;
        this.O = -1;
        boolean z = false;
        this.G = 0;
        this.H = 0;
        rsd rsdVar2 = rsd.TRUE;
        this.I = rsdVar2;
        this.J = ntd.X;
        this.K = 0;
        List list = Collections.EMPTY_LIST;
        this.L = list;
        this.M = list;
        j22 j22Var = new j22();
        v34 v34VarJ = v34.j(j22Var, 1);
        int i = 0;
        while (!z) {
            try {
                try {
                    try {
                        int iN = t34Var.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.F |= 1;
                                this.G = t34Var.k();
                            } else if (iN != 16) {
                                Object objR = null;
                                if (iN == 24) {
                                    int iK = t34Var.k();
                                    if (iK != 0) {
                                        if (iK == 1) {
                                            objR = rsd.FALSE;
                                        } else if (iK == 2) {
                                            objR = rsd.NULL;
                                        }
                                        rsdVar = objR;
                                    } else {
                                        rsdVar = rsdVar2;
                                    }
                                    if (rsdVar == 0) {
                                        v34VarJ.v(iN);
                                        v34VarJ.v(iK);
                                    } else {
                                        this.F |= 4;
                                        this.I = rsdVar;
                                    }
                                } else if (iN == 34) {
                                    if ((this.F & 8) == 8) {
                                        ntd ntdVar = this.J;
                                        ntdVar.getClass();
                                        objR = ntd.r(ntdVar);
                                    }
                                    mtd mtdVar = objR;
                                    ntd ntdVar2 = (ntd) t34Var.g(ntd.Y, oc7Var);
                                    this.J = ntdVar2;
                                    if (mtdVar != 0) {
                                        mtdVar.j(ntdVar2);
                                        this.J = mtdVar.h();
                                    }
                                    this.F |= 8;
                                } else if (iN != 40) {
                                    jsd jsdVar = Q;
                                    if (iN == 50) {
                                        if ((i & 32) != 32) {
                                            this.L = new ArrayList();
                                            i |= 32;
                                        }
                                        this.L.add(t34Var.g(jsdVar, oc7Var));
                                    } else if (iN == 58) {
                                        if ((i & 64) != 64) {
                                            this.M = new ArrayList();
                                            i |= 64;
                                        }
                                        this.M.add(t34Var.g(jsdVar, oc7Var));
                                    } else if (!t34Var.q(iN, v34VarJ)) {
                                    }
                                } else {
                                    this.F |= 16;
                                    this.K = t34Var.k();
                                }
                            } else {
                                this.F |= 2;
                                this.H = t34Var.k();
                            }
                        }
                        z = true;
                    } catch (IOException e) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e.getMessage());
                        invalidProtocolBufferException.E = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (InvalidProtocolBufferException e2) {
                    e2.E = this;
                    throw e2;
                }
            } catch (Throwable th) {
                if ((i & 32) == 32) {
                    this.L = Collections.unmodifiableList(this.L);
                }
                if ((i & 64) == 64) {
                    this.M = Collections.unmodifiableList(this.M);
                }
                try {
                    v34VarJ.k();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.E = j22Var.e();
                    throw th2;
                }
                this.E = j22Var.e();
                throw th;
            }
        }
        if ((i & 32) == 32) {
            this.L = Collections.unmodifiableList(this.L);
        }
        if ((i & 64) == 64) {
            this.M = Collections.unmodifiableList(this.M);
        }
        try {
            v34VarJ.k();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.E = j22Var.e();
            throw th3;
        }
        this.E = j22Var.e();
    }

    @Override // defpackage.aib
    public final boolean b() {
        byte b = this.N;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.F & 8) == 8 && !this.J.b()) {
            this.N = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.L.size(); i++) {
            if (!((ssd) this.L.get(i)).b()) {
                this.N = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.M.size(); i2++) {
            if (!((ssd) this.M.get(i2)).b()) {
                this.N = (byte) 0;
                return false;
            }
        }
        this.N = (byte) 1;
        return true;
    }

    @Override // defpackage.b3
    public final int c() {
        int i = this.O;
        if (i != -1) {
            return i;
        }
        int iB = (this.F & 1) == 1 ? v34.b(1, this.G) : 0;
        if ((this.F & 2) == 2) {
            iB += v34.b(2, this.H);
        }
        if ((this.F & 4) == 4) {
            iB += v34.a(3, this.I.E);
        }
        if ((this.F & 8) == 8) {
            iB += v34.d(4, this.J);
        }
        if ((this.F & 16) == 16) {
            iB += v34.b(5, this.K);
        }
        for (int i2 = 0; i2 < this.L.size(); i2++) {
            iB += v34.d(6, (b3) this.L.get(i2));
        }
        for (int i3 = 0; i3 < this.M.size(); i3++) {
            iB += v34.d(7, (b3) this.M.get(i3));
        }
        int size = this.E.size() + iB;
        this.O = size;
        return size;
    }

    @Override // defpackage.b3
    public final i28 d() {
        return qsd.h();
    }

    @Override // defpackage.b3
    public final i28 e() {
        qsd qsdVarH = qsd.h();
        qsdVarH.i(this);
        return qsdVarH;
    }

    @Override // defpackage.b3
    public final void f(v34 v34Var) throws IOException {
        c();
        if ((this.F & 1) == 1) {
            v34Var.m(1, this.G);
        }
        if ((this.F & 2) == 2) {
            v34Var.m(2, this.H);
        }
        if ((this.F & 4) == 4) {
            v34Var.l(3, this.I.E);
        }
        if ((this.F & 8) == 8) {
            v34Var.o(4, this.J);
        }
        if ((this.F & 16) == 16) {
            v34Var.m(5, this.K);
        }
        for (int i = 0; i < this.L.size(); i++) {
            v34Var.o(6, (b3) this.L.get(i));
        }
        for (int i2 = 0; i2 < this.M.size(); i2++) {
            v34Var.o(7, (b3) this.M.get(i2));
        }
        v34Var.r(this.E);
    }

    public ssd() {
        this.N = (byte) -1;
        this.O = -1;
        this.E = l22.E;
    }

    public ssd(qsd qsdVar) {
        this.N = (byte) -1;
        this.O = -1;
        this.E = qsdVar.E;
    }
}
