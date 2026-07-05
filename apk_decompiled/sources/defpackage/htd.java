package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes.dex */
public final class htd extends u28 {
    public static final htd I;
    public static final sk9 J = new sk9(16);
    public final l22 E;
    public List F;
    public byte G;
    public int H;

    static {
        htd htdVar = new htd();
        I = htdVar;
        htdVar.F = Collections.EMPTY_LIST;
    }

    public htd(t34 t34Var, oc7 oc7Var) {
        this.G = (byte) -1;
        this.H = -1;
        this.F = Collections.EMPTY_LIST;
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
                            if (!z2) {
                                this.F = new ArrayList();
                                z2 = true;
                            }
                            this.F.add(t34Var.g(gtd.M, oc7Var));
                        } else if (!t34Var.q(iN, v34VarJ)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (z2) {
                        this.F = Collections.unmodifiableList(this.F);
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
            this.F = Collections.unmodifiableList(this.F);
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
        byte b = this.G;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.F.size(); i++) {
            if (!((gtd) this.F.get(i)).b()) {
                this.G = (byte) 0;
                return false;
            }
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
        int iD = 0;
        for (int i2 = 0; i2 < this.F.size(); i2++) {
            iD += v34.d(1, (b3) this.F.get(i2));
        }
        int size = this.E.size() + iD;
        this.H = size;
        return size;
    }

    @Override // defpackage.b3
    public final i28 d() {
        return dtd.h();
    }

    @Override // defpackage.b3
    public final i28 e() {
        dtd dtdVarH = dtd.h();
        dtdVarH.k(this);
        return dtdVarH;
    }

    @Override // defpackage.b3
    public final void f(v34 v34Var) throws IOException {
        c();
        for (int i = 0; i < this.F.size(); i++) {
            v34Var.o(1, (b3) this.F.get(i));
        }
        v34Var.r(this.E);
    }

    public htd() {
        this.G = (byte) -1;
        this.H = -1;
        this.E = l22.E;
    }

    public htd(dtd dtdVar) {
        this.G = (byte) -1;
        this.H = -1;
        this.E = dtdVar.E;
    }
}
