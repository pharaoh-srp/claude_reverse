package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes.dex */
public final class gsd extends r28 {
    public static final gsd M;
    public static final sk9 N = new sk9(9);
    public final l22 F;
    public int G;
    public int H;
    public List I;
    public List J;
    public byte K;
    public int L;

    static {
        gsd gsdVar = new gsd();
        M = gsdVar;
        gsdVar.H = 6;
        List list = Collections.EMPTY_LIST;
        gsdVar.I = list;
        gsdVar.J = list;
    }

    public gsd(t34 t34Var, oc7 oc7Var) {
        this.K = (byte) -1;
        this.L = -1;
        this.H = 6;
        List list = Collections.EMPTY_LIST;
        this.I = list;
        this.J = list;
        j22 j22Var = new j22();
        v34 v34VarJ = v34.j(j22Var, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iN = t34Var.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.G |= 1;
                            this.H = t34Var.k();
                        } else if (iN == 18) {
                            if ((i & 2) != 2) {
                                this.I = new ArrayList();
                                i |= 2;
                            }
                            this.I.add(t34Var.g(vtd.Q, oc7Var));
                        } else if (iN == 248) {
                            if ((i & 4) != 4) {
                                this.J = new ArrayList();
                                i |= 4;
                            }
                            this.J.add(Integer.valueOf(t34Var.k()));
                        } else if (iN == 250) {
                            int iD = t34Var.d(t34Var.k());
                            if ((i & 4) != 4 && t34Var.b() > 0) {
                                this.J = new ArrayList();
                                i |= 4;
                            }
                            while (t34Var.b() > 0) {
                                this.J.add(Integer.valueOf(t34Var.k()));
                            }
                            t34Var.c(iD);
                        } else if (!n(t34Var, v34VarJ, oc7Var, iN)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((i & 2) == 2) {
                        this.I = Collections.unmodifiableList(this.I);
                    }
                    if ((i & 4) == 4) {
                        this.J = Collections.unmodifiableList(this.J);
                    }
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
        if ((i & 2) == 2) {
            this.I = Collections.unmodifiableList(this.I);
        }
        if ((i & 4) == 4) {
            this.J = Collections.unmodifiableList(this.J);
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
        return M;
    }

    @Override // defpackage.aib
    public final boolean b() {
        byte b = this.K;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.I.size(); i++) {
            if (!((vtd) this.I.get(i)).b()) {
                this.K = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.K = (byte) 1;
            return true;
        }
        this.K = (byte) 0;
        return false;
    }

    @Override // defpackage.b3
    public final int c() {
        int i = this.L;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int iB = (this.G & 1) == 1 ? v34.b(1, this.H) : 0;
        for (int i3 = 0; i3 < this.I.size(); i3++) {
            iB += v34.d(2, (b3) this.I.get(i3));
        }
        int iC = 0;
        while (true) {
            int size = this.J.size();
            List list = this.J;
            if (i2 >= size) {
                int size2 = this.F.size() + j() + (list.size() * 2) + iB + iC;
                this.L = size2;
                return size2;
            }
            iC += v34.c(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // defpackage.b3
    public final i28 d() {
        return fsd.h();
    }

    @Override // defpackage.b3
    public final i28 e() {
        fsd fsdVarH = fsd.h();
        fsdVarH.j(this);
        return fsdVarH;
    }

    @Override // defpackage.b3
    public final void f(v34 v34Var) throws IOException {
        c();
        q28 q28Var = new q28((r28) this);
        if ((this.G & 1) == 1) {
            v34Var.m(1, this.H);
        }
        for (int i = 0; i < this.I.size(); i++) {
            v34Var.o(2, (b3) this.I.get(i));
        }
        for (int i2 = 0; i2 < this.J.size(); i2++) {
            v34Var.m(31, ((Integer) this.J.get(i2)).intValue());
        }
        q28Var.J(19000, v34Var);
        v34Var.r(this.F);
    }

    public gsd() {
        this.K = (byte) -1;
        this.L = -1;
        this.F = l22.E;
    }

    public gsd(fsd fsdVar) {
        super(fsdVar);
        this.K = (byte) -1;
        this.L = -1;
        this.F = fsdVar.E;
    }
}
