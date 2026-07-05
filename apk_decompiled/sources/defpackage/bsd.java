package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes.dex */
public final class bsd extends u28 {
    public static final bsd K;
    public static final sk9 L = new sk9(5);
    public final l22 E;
    public int F;
    public int G;
    public List H;
    public byte I;
    public int J;

    static {
        bsd bsdVar = new bsd();
        K = bsdVar;
        bsdVar.G = 0;
        bsdVar.H = Collections.EMPTY_LIST;
    }

    public bsd(t34 t34Var, oc7 oc7Var) {
        this.I = (byte) -1;
        this.J = -1;
        boolean z = false;
        this.G = 0;
        this.H = Collections.EMPTY_LIST;
        j22 j22Var = new j22();
        v34 v34VarJ = v34.j(j22Var, 1);
        char c = 0;
        while (!z) {
            try {
                try {
                    int iN = t34Var.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.F |= 1;
                            this.G = t34Var.k();
                        } else if (iN == 18) {
                            if ((c & 2) != 2) {
                                this.H = new ArrayList();
                                c = 2;
                            }
                            this.H.add(t34Var.g(zrd.L, oc7Var));
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
                if ((c & 2) == 2) {
                    this.H = Collections.unmodifiableList(this.H);
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
        if ((c & 2) == 2) {
            this.H = Collections.unmodifiableList(this.H);
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
        byte b = this.I;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.F & 1) != 1) {
            this.I = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.H.size(); i++) {
            if (!((zrd) this.H.get(i)).b()) {
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
        int iB = (this.F & 1) == 1 ? v34.b(1, this.G) : 0;
        for (int i2 = 0; i2 < this.H.size(); i2++) {
            iB += v34.d(2, (b3) this.H.get(i2));
        }
        int size = this.E.size() + iB;
        this.J = size;
        return size;
    }

    @Override // defpackage.b3
    public final i28 d() {
        asd asdVar = new asd(0);
        asdVar.H = Collections.EMPTY_LIST;
        return asdVar;
    }

    @Override // defpackage.b3
    public final i28 e() {
        asd asdVar = new asd(0);
        asdVar.H = Collections.EMPTY_LIST;
        asdVar.j(this);
        return asdVar;
    }

    @Override // defpackage.b3
    public final void f(v34 v34Var) throws IOException {
        c();
        if ((this.F & 1) == 1) {
            v34Var.m(1, this.G);
        }
        for (int i = 0; i < this.H.size(); i++) {
            v34Var.o(2, (b3) this.H.get(i));
        }
        v34Var.r(this.E);
    }

    public bsd() {
        this.I = (byte) -1;
        this.J = -1;
        this.E = l22.E;
    }

    public bsd(asd asdVar) {
        this.I = (byte) -1;
        this.J = -1;
        this.E = asdVar.E;
    }
}
