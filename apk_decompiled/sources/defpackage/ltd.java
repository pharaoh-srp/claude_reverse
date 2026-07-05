package defpackage;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes.dex */
public final class ltd extends u28 {
    public static final ltd L;
    public static final sk9 M = new sk9(20);
    public final l22 E;
    public int F;
    public ktd G;
    public ntd H;
    public int I;
    public byte J;
    public int K;

    static {
        ltd ltdVar = new ltd();
        L = ltdVar;
        ltdVar.G = ktd.INV;
        ltdVar.H = ntd.X;
        ltdVar.I = 0;
    }

    public ltd(t34 t34Var, oc7 oc7Var) {
        this.J = (byte) -1;
        this.K = -1;
        ktd ktdVar = ktd.INV;
        this.G = ktdVar;
        this.H = ntd.X;
        boolean z = false;
        this.I = 0;
        j22 j22Var = new j22();
        v34 v34VarJ = v34.j(j22Var, 1);
        while (!z) {
            try {
                try {
                    int iN = t34Var.n();
                    if (iN != 0) {
                        mtd mtdVarR = null;
                        ktd ktdVar2 = null;
                        if (iN == 8) {
                            int iK = t34Var.k();
                            if (iK == 0) {
                                ktdVar2 = ktd.IN;
                            } else if (iK == 1) {
                                ktdVar2 = ktd.OUT;
                            } else if (iK == 2) {
                                ktdVar2 = ktdVar;
                            } else if (iK == 3) {
                                ktdVar2 = ktd.STAR;
                            }
                            if (ktdVar2 == null) {
                                v34VarJ.v(iN);
                                v34VarJ.v(iK);
                            } else {
                                this.F |= 1;
                                this.G = ktdVar2;
                            }
                        } else if (iN == 18) {
                            if ((this.F & 2) == 2) {
                                ntd ntdVar = this.H;
                                ntdVar.getClass();
                                mtdVarR = ntd.r(ntdVar);
                            }
                            ntd ntdVar2 = (ntd) t34Var.g(ntd.Y, oc7Var);
                            this.H = ntdVar2;
                            if (mtdVarR != null) {
                                mtdVarR.j(ntdVar2);
                                this.H = mtdVarR.h();
                            }
                            this.F |= 2;
                        } else if (iN == 24) {
                            this.F |= 4;
                            this.I = t34Var.k();
                        } else if (!t34Var.q(iN, v34VarJ)) {
                        }
                    }
                    z = true;
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
        if ((this.F & 2) != 2 || this.H.b()) {
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
        int iA = (this.F & 1) == 1 ? v34.a(1, this.G.E) : 0;
        if ((this.F & 2) == 2) {
            iA += v34.d(2, this.H);
        }
        if ((this.F & 4) == 4) {
            iA += v34.b(3, this.I);
        }
        int size = this.E.size() + iA;
        this.K = size;
        return size;
    }

    @Override // defpackage.b3
    public final i28 d() {
        return jtd.g();
    }

    @Override // defpackage.b3
    public final i28 e() {
        jtd jtdVarG = jtd.g();
        jtdVarG.i(this);
        return jtdVarG;
    }

    @Override // defpackage.b3
    public final void f(v34 v34Var) throws IOException {
        c();
        if ((this.F & 1) == 1) {
            v34Var.l(1, this.G.E);
        }
        if ((this.F & 2) == 2) {
            v34Var.o(2, this.H);
        }
        if ((this.F & 4) == 4) {
            v34Var.m(3, this.I);
        }
        v34Var.r(this.E);
    }

    public ltd() {
        this.J = (byte) -1;
        this.K = -1;
        this.E = l22.E;
    }

    public ltd(jtd jtdVar) {
        this.J = (byte) -1;
        this.K = -1;
        this.E = jtdVar.E;
    }
}
