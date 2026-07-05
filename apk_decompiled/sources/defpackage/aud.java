package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes.dex */
public final class aud extends u28 {
    public static final aud I;
    public static final sk9 J = new sk9(24);
    public final l22 E;
    public List F;
    public byte G;
    public int H;

    static {
        aud audVar = new aud();
        I = audVar;
        audVar.F = Collections.EMPTY_LIST;
    }

    public aud(t34 t34Var, oc7 oc7Var) {
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
                            this.F.add(t34Var.g(ztd.P, oc7Var));
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
        hsd hsdVar = new hsd(1);
        hsdVar.H = Collections.EMPTY_LIST;
        return hsdVar;
    }

    @Override // defpackage.b3
    public final i28 e() {
        hsd hsdVar = new hsd(1);
        hsdVar.H = Collections.EMPTY_LIST;
        hsdVar.j(this);
        return hsdVar;
    }

    @Override // defpackage.b3
    public final void f(v34 v34Var) throws IOException {
        c();
        for (int i = 0; i < this.F.size(); i++) {
            v34Var.o(1, (b3) this.F.get(i));
        }
        v34Var.r(this.E);
    }

    public final hsd i() {
        hsd hsdVar = new hsd(1);
        hsdVar.H = Collections.EMPTY_LIST;
        hsdVar.j(this);
        return hsdVar;
    }

    public aud() {
        this.G = (byte) -1;
        this.H = -1;
        this.E = l22.E;
    }

    public aud(hsd hsdVar) {
        this.G = (byte) -1;
        this.H = -1;
        this.E = hsdVar.E;
    }
}
