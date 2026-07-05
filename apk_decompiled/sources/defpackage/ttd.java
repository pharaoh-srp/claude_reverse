package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes.dex */
public final class ttd extends u28 {
    public static final ttd K;
    public static final sk9 L = new sk9(22);
    public final l22 E;
    public int F;
    public List G;
    public int H;
    public byte I;
    public int J;

    static {
        ttd ttdVar = new ttd();
        K = ttdVar;
        ttdVar.G = Collections.EMPTY_LIST;
        ttdVar.H = -1;
    }

    public ttd(t34 t34Var, oc7 oc7Var) {
        this.I = (byte) -1;
        this.J = -1;
        this.G = Collections.EMPTY_LIST;
        this.H = -1;
        j22 j22Var = new j22();
        v34 v34VarJ = v34.j(j22Var, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    try {
                        int iN = t34Var.n();
                        if (iN != 0) {
                            if (iN == 10) {
                                if (!z2) {
                                    this.G = new ArrayList();
                                    z2 = true;
                                }
                                this.G.add(t34Var.g(ntd.Y, oc7Var));
                            } else if (iN == 16) {
                                this.F |= 1;
                                this.H = t34Var.k();
                            } else if (!t34Var.q(iN, v34VarJ)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        e.E = this;
                        throw e;
                    }
                } catch (IOException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                    invalidProtocolBufferException.E = this;
                    throw invalidProtocolBufferException;
                }
            } catch (Throwable th) {
                if (z2) {
                    this.G = Collections.unmodifiableList(this.G);
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
        if (z2) {
            this.G = Collections.unmodifiableList(this.G);
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

    public static asd i(ttd ttdVar) {
        asd asdVarI = asd.i();
        asdVarI.k(ttdVar);
        return asdVarI;
    }

    @Override // defpackage.aib
    public final boolean b() {
        byte b = this.I;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.G.size(); i++) {
            if (!((ntd) this.G.get(i)).b()) {
                this.I = (byte) 0;
                return false;
            }
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
        int iB = 0;
        for (int i2 = 0; i2 < this.G.size(); i2++) {
            iB += v34.d(1, (b3) this.G.get(i2));
        }
        if ((this.F & 1) == 1) {
            iB += v34.b(2, this.H);
        }
        int size = this.E.size() + iB;
        this.J = size;
        return size;
    }

    @Override // defpackage.b3
    public final i28 d() {
        return asd.i();
    }

    @Override // defpackage.b3
    public final i28 e() {
        return i(this);
    }

    @Override // defpackage.b3
    public final void f(v34 v34Var) throws IOException {
        c();
        for (int i = 0; i < this.G.size(); i++) {
            v34Var.o(1, (b3) this.G.get(i));
        }
        if ((this.F & 1) == 1) {
            v34Var.m(2, this.H);
        }
        v34Var.r(this.E);
    }

    public final asd j() {
        return i(this);
    }

    public ttd() {
        this.I = (byte) -1;
        this.J = -1;
        this.E = l22.E;
    }

    public ttd(asd asdVar) {
        this.I = (byte) -1;
        this.J = -1;
        this.E = asdVar.E;
    }
}
