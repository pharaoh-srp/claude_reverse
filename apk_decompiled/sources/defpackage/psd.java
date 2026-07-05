package defpackage;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes.dex */
public final class psd extends r28 {
    public static final psd K;
    public static final sk9 L = new sk9(11);
    public final l22 F;
    public int G;
    public int H;
    public byte I;
    public int J;

    static {
        psd psdVar = new psd();
        K = psdVar;
        psdVar.H = 0;
    }

    public psd(t34 t34Var, oc7 oc7Var) {
        this.I = (byte) -1;
        this.J = -1;
        boolean z = false;
        this.H = 0;
        j22 j22Var = new j22();
        v34 v34VarJ = v34.j(j22Var, 1);
        while (!z) {
            try {
                try {
                    try {
                        int iN = t34Var.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.G |= 1;
                                this.H = t34Var.k();
                            } else if (!n(t34Var, v34VarJ, oc7Var, iN)) {
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
        return K;
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
        if (i()) {
            this.I = (byte) 1;
            return true;
        }
        this.I = (byte) 0;
        return false;
    }

    @Override // defpackage.b3
    public final int c() {
        int i = this.J;
        if (i != -1) {
            return i;
        }
        int size = this.F.size() + j() + ((this.G & 1) == 1 ? v34.b(1, this.H) : 0);
        this.J = size;
        return size;
    }

    @Override // defpackage.b3
    public final i28 d() {
        return osd.h();
    }

    @Override // defpackage.b3
    public final i28 e() {
        osd osdVarH = osd.h();
        osdVarH.i(this);
        return osdVarH;
    }

    @Override // defpackage.b3
    public final void f(v34 v34Var) throws IOException {
        c();
        q28 q28Var = new q28((r28) this);
        if ((this.G & 1) == 1) {
            v34Var.m(1, this.H);
        }
        q28Var.J(200, v34Var);
        v34Var.r(this.F);
    }

    public psd() {
        this.I = (byte) -1;
        this.J = -1;
        this.F = l22.E;
    }

    public psd(osd osdVar) {
        super(osdVar);
        this.I = (byte) -1;
        this.J = -1;
        this.F = osdVar.E;
    }
}
