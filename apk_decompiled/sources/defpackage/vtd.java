package defpackage;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes.dex */
public final class vtd extends r28 {
    public static final vtd P;
    public static final sk9 Q = new sk9(23);
    public final l22 F;
    public int G;
    public int H;
    public int I;
    public ntd J;
    public int K;
    public ntd L;
    public int M;
    public byte N;
    public int O;

    static {
        vtd vtdVar = new vtd();
        P = vtdVar;
        vtdVar.H = 0;
        vtdVar.I = 0;
        ntd ntdVar = ntd.X;
        vtdVar.J = ntdVar;
        vtdVar.K = 0;
        vtdVar.L = ntdVar;
        vtdVar.M = 0;
    }

    public vtd(t34 t34Var, oc7 oc7Var) {
        this.N = (byte) -1;
        this.O = -1;
        boolean z = false;
        this.H = 0;
        this.I = 0;
        ntd ntdVar = ntd.X;
        this.J = ntdVar;
        this.K = 0;
        this.L = ntdVar;
        this.M = 0;
        j22 j22Var = new j22();
        v34 v34VarJ = v34.j(j22Var, 1);
        while (!z) {
            try {
                try {
                    int iN = t34Var.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.G |= 1;
                            this.H = t34Var.k();
                        } else if (iN != 16) {
                            mtd mtdVarR = null;
                            if (iN == 26) {
                                if ((this.G & 4) == 4) {
                                    ntd ntdVar2 = this.J;
                                    ntdVar2.getClass();
                                    mtdVarR = ntd.r(ntdVar2);
                                }
                                ntd ntdVar3 = (ntd) t34Var.g(ntd.Y, oc7Var);
                                this.J = ntdVar3;
                                if (mtdVarR != null) {
                                    mtdVarR.j(ntdVar3);
                                    this.J = mtdVarR.h();
                                }
                                this.G |= 4;
                            } else if (iN == 34) {
                                if ((this.G & 16) == 16) {
                                    ntd ntdVar4 = this.L;
                                    ntdVar4.getClass();
                                    mtdVarR = ntd.r(ntdVar4);
                                }
                                ntd ntdVar5 = (ntd) t34Var.g(ntd.Y, oc7Var);
                                this.L = ntdVar5;
                                if (mtdVarR != null) {
                                    mtdVarR.j(ntdVar5);
                                    this.L = mtdVarR.h();
                                }
                                this.G |= 16;
                            } else if (iN == 40) {
                                this.G |= 8;
                                this.K = t34Var.k();
                            } else if (iN == 48) {
                                this.G |= 32;
                                this.M = t34Var.k();
                            } else if (!n(t34Var, v34VarJ, oc7Var, iN)) {
                            }
                        } else {
                            this.G |= 2;
                            this.I = t34Var.k();
                        }
                    }
                    z = true;
                } catch (Throwable th) {
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

    @Override // defpackage.aib
    public final b3 a() {
        return P;
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
        int i = this.G;
        if ((i & 2) != 2) {
            this.N = (byte) 0;
            return false;
        }
        if ((i & 4) == 4 && !this.J.b()) {
            this.N = (byte) 0;
            return false;
        }
        if ((this.G & 16) == 16 && !this.L.b()) {
            this.N = (byte) 0;
            return false;
        }
        if (i()) {
            this.N = (byte) 1;
            return true;
        }
        this.N = (byte) 0;
        return false;
    }

    @Override // defpackage.b3
    public final int c() {
        int i = this.O;
        if (i != -1) {
            return i;
        }
        int iB = (this.G & 1) == 1 ? v34.b(1, this.H) : 0;
        if ((this.G & 2) == 2) {
            iB += v34.b(2, this.I);
        }
        if ((this.G & 4) == 4) {
            iB += v34.d(3, this.J);
        }
        if ((this.G & 16) == 16) {
            iB += v34.d(4, this.L);
        }
        if ((this.G & 8) == 8) {
            iB += v34.b(5, this.K);
        }
        if ((this.G & 32) == 32) {
            iB += v34.b(6, this.M);
        }
        int size = this.F.size() + j() + iB;
        this.O = size;
        return size;
    }

    @Override // defpackage.b3
    public final i28 d() {
        return utd.h();
    }

    @Override // defpackage.b3
    public final i28 e() {
        utd utdVarH = utd.h();
        utdVarH.j(this);
        return utdVarH;
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
        if ((this.G & 4) == 4) {
            v34Var.o(3, this.J);
        }
        if ((this.G & 16) == 16) {
            v34Var.o(4, this.L);
        }
        if ((this.G & 8) == 8) {
            v34Var.m(5, this.K);
        }
        if ((this.G & 32) == 32) {
            v34Var.m(6, this.M);
        }
        q28Var.J(200, v34Var);
        v34Var.r(this.F);
    }

    public vtd() {
        this.N = (byte) -1;
        this.O = -1;
        this.F = l22.E;
    }

    public vtd(utd utdVar) {
        super(utdVar);
        this.N = (byte) -1;
        this.O = -1;
        this.F = utdVar.E;
    }
}
