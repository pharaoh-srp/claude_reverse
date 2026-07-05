package defpackage;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes.dex */
public final class itd extends u28 {
    public static final itd I;
    public static final sk9 J = new sk9(18);
    public final l22 E;
    public t1a F;
    public byte G;
    public int H;

    static {
        itd itdVar = new itd();
        I = itdVar;
        itdVar.F = n1a.F;
    }

    public itd(t34 t34Var) {
        this.G = (byte) -1;
        this.H = -1;
        this.F = n1a.F;
        j22 j22Var = new j22();
        v34 v34VarJ = v34.j(j22Var, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int iN = t34Var.n();
                    if (iN != 0) {
                        if (iN == 10) {
                            oba obaVarE = t34Var.e();
                            if (!z2) {
                                this.F = new n1a();
                                z2 = true;
                            }
                            this.F.S(obaVarE);
                        } else if (!t34Var.q(iN, v34VarJ)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (z2) {
                        this.F = this.F.i();
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
            this.F = this.F.i();
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
        if (this.G == 1) {
            return true;
        }
        this.G = (byte) 1;
        return true;
    }

    @Override // defpackage.b3
    public final int c() {
        int i = this.H;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int size = 0;
        while (true) {
            int size2 = this.F.size();
            t1a t1aVar = this.F;
            if (i2 >= size2) {
                int size3 = this.E.size() + t1aVar.size() + size;
                this.H = size3;
                return size3;
            }
            l22 l22VarR = t1aVar.R(i2);
            size += l22VarR.size() + v34.f(l22VarR.size());
            i2++;
        }
    }

    @Override // defpackage.b3
    public final i28 d() {
        return dtd.g();
    }

    @Override // defpackage.b3
    public final i28 e() {
        dtd dtdVarG = dtd.g();
        dtdVarG.l(this);
        return dtdVarG;
    }

    @Override // defpackage.b3
    public final void f(v34 v34Var) throws IOException {
        c();
        for (int i = 0; i < this.F.size(); i++) {
            l22 l22VarR = this.F.R(i);
            v34Var.x(1, 2);
            v34Var.v(l22VarR.size());
            v34Var.r(l22VarR);
        }
        v34Var.r(this.E);
    }

    public itd() {
        this.G = (byte) -1;
        this.H = -1;
        this.E = l22.E;
    }

    public itd(dtd dtdVar) {
        this.G = (byte) -1;
        this.H = -1;
        this.E = dtdVar.E;
    }
}
