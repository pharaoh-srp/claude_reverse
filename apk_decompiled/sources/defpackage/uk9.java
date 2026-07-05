package defpackage;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes.dex */
public final class uk9 extends u28 {
    public static final uk9 K;
    public static final sk9 L = new sk9(0);
    public final l22 E;
    public int F;
    public int G;
    public int H;
    public byte I;
    public int J;

    static {
        uk9 uk9Var = new uk9();
        K = uk9Var;
        uk9Var.G = 0;
        uk9Var.H = 0;
    }

    public uk9(t34 t34Var) {
        this.I = (byte) -1;
        this.J = -1;
        boolean z = false;
        this.G = 0;
        this.H = 0;
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
        if (this.I == 1) {
            return true;
        }
        this.I = (byte) 1;
        return true;
    }

    @Override // defpackage.b3
    public final int c() {
        int i = this.J;
        if (i != -1) {
            return i;
        }
        int iB = (this.F & 1) == 1 ? v34.b(1, this.G) : 0;
        if ((this.F & 2) == 2) {
            iB += v34.b(2, this.H);
        }
        int size = this.E.size() + iB;
        this.J = size;
        return size;
    }

    @Override // defpackage.b3
    public final i28 d() {
        return tk9.g();
    }

    @Override // defpackage.b3
    public final i28 e() {
        tk9 tk9VarG = tk9.g();
        tk9VarG.i(this);
        return tk9VarG;
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
        v34Var.r(this.E);
    }

    public uk9() {
        this.I = (byte) -1;
        this.J = -1;
        this.E = l22.E;
    }

    public uk9(tk9 tk9Var) {
        this.I = (byte) -1;
        this.J = -1;
        this.E = tk9Var.E;
    }
}
