package defpackage;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes.dex */
public final class gtd extends u28 {
    public static final gtd L;
    public static final sk9 M = new sk9(17);
    public final l22 E;
    public int F;
    public int G;
    public int H;
    public ftd I;
    public byte J;
    public int K;

    static {
        gtd gtdVar = new gtd();
        L = gtdVar;
        gtdVar.G = -1;
        gtdVar.H = 0;
        gtdVar.I = ftd.PACKAGE;
    }

    public gtd(t34 t34Var) {
        this.J = (byte) -1;
        this.K = -1;
        this.G = -1;
        boolean z = false;
        this.H = 0;
        ftd ftdVar = ftd.PACKAGE;
        this.I = ftdVar;
        j22 j22Var = new j22();
        v34 v34VarJ = v34.j(j22Var, 1);
        while (!z) {
            try {
                try {
                    int iN = t34Var.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.F |= 1;
                            this.G = t34Var.k();
                        } else if (iN == 16) {
                            this.F |= 2;
                            this.H = t34Var.k();
                        } else if (iN == 24) {
                            int iK = t34Var.k();
                            ftd ftdVar2 = iK != 0 ? iK != 1 ? iK != 2 ? null : ftd.LOCAL : ftdVar : ftd.CLASS;
                            if (ftdVar2 == null) {
                                v34VarJ.v(iN);
                                v34VarJ.v(iK);
                            } else {
                                this.F |= 4;
                                this.I = ftdVar2;
                            }
                        } else if (!t34Var.q(iN, v34VarJ)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    e.E = this;
                    throw e;
                } catch (IOException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                    invalidProtocolBufferException.E = this;
                    throw invalidProtocolBufferException;
                }
            } catch (Throwable th) {
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
        byte b = this.J;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.F & 2) == 2) {
            this.J = (byte) 1;
            return true;
        }
        this.J = (byte) 0;
        return false;
    }

    @Override // defpackage.b3
    public final int c() {
        int i = this.K;
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
        int size = this.E.size() + iB;
        this.K = size;
        return size;
    }

    @Override // defpackage.b3
    public final i28 d() {
        return etd.g();
    }

    @Override // defpackage.b3
    public final i28 e() {
        etd etdVarG = etd.g();
        etdVarG.i(this);
        return etdVarG;
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
        v34Var.r(this.E);
    }

    public gtd() {
        this.J = (byte) -1;
        this.K = -1;
        this.E = l22.E;
    }

    public gtd(etd etdVar) {
        this.J = (byte) -1;
        this.K = -1;
        this.E = etdVar.E;
    }
}
