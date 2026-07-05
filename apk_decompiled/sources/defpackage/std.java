package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes.dex */
public final class std extends r28 {
    public static final std Q;
    public static final sk9 R = new sk9(21);
    public final l22 F;
    public int G;
    public int H;
    public int I;
    public boolean J;
    public rtd K;
    public List L;
    public List M;
    public int N;
    public byte O;
    public int P;

    static {
        std stdVar = new std();
        Q = stdVar;
        stdVar.H = 0;
        stdVar.I = 0;
        stdVar.J = false;
        stdVar.K = rtd.INV;
        List list = Collections.EMPTY_LIST;
        stdVar.L = list;
        stdVar.M = list;
    }

    public std(t34 t34Var, oc7 oc7Var) {
        this.N = -1;
        this.O = (byte) -1;
        this.P = -1;
        this.H = 0;
        this.I = 0;
        this.J = false;
        rtd rtdVar = rtd.INV;
        this.K = rtdVar;
        List list = Collections.EMPTY_LIST;
        this.L = list;
        this.M = list;
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
                        } else if (iN == 16) {
                            this.G |= 2;
                            this.I = t34Var.k();
                        } else if (iN == 24) {
                            this.G |= 4;
                            this.J = t34Var.l() != 0;
                        } else if (iN == 32) {
                            int iK = t34Var.k();
                            rtd rtdVar2 = iK != 0 ? iK != 1 ? iK != 2 ? null : rtdVar : rtd.OUT : rtd.IN;
                            if (rtdVar2 == null) {
                                v34VarJ.v(iN);
                                v34VarJ.v(iK);
                            } else {
                                this.G |= 8;
                                this.K = rtdVar2;
                            }
                        } else if (iN == 42) {
                            if ((i & 16) != 16) {
                                this.L = new ArrayList();
                                i |= 16;
                            }
                            this.L.add(t34Var.g(ntd.Y, oc7Var));
                        } else if (iN == 48) {
                            if ((i & 32) != 32) {
                                this.M = new ArrayList();
                                i |= 32;
                            }
                            this.M.add(Integer.valueOf(t34Var.k()));
                        } else if (iN == 50) {
                            int iD = t34Var.d(t34Var.k());
                            if ((i & 32) != 32 && t34Var.b() > 0) {
                                this.M = new ArrayList();
                                i |= 32;
                            }
                            while (t34Var.b() > 0) {
                                this.M.add(Integer.valueOf(t34Var.k()));
                            }
                            t34Var.c(iD);
                        } else if (!n(t34Var, v34VarJ, oc7Var, iN)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((i & 16) == 16) {
                        this.L = Collections.unmodifiableList(this.L);
                    }
                    if ((i & 32) == 32) {
                        this.M = Collections.unmodifiableList(this.M);
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
        if ((i & 16) == 16) {
            this.L = Collections.unmodifiableList(this.L);
        }
        if ((i & 32) == 32) {
            this.M = Collections.unmodifiableList(this.M);
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
        return Q;
    }

    @Override // defpackage.aib
    public final boolean b() {
        byte b = this.O;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.G;
        if ((i & 1) != 1) {
            this.O = (byte) 0;
            return false;
        }
        if ((i & 2) != 2) {
            this.O = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.L.size(); i2++) {
            if (!((ntd) this.L.get(i2)).b()) {
                this.O = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.O = (byte) 1;
            return true;
        }
        this.O = (byte) 0;
        return false;
    }

    @Override // defpackage.b3
    public final int c() {
        List list;
        int i = this.P;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int iB = (this.G & 1) == 1 ? v34.b(1, this.H) : 0;
        if ((this.G & 2) == 2) {
            iB += v34.b(2, this.I);
        }
        if ((this.G & 4) == 4) {
            iB += v34.h(3) + 1;
        }
        if ((this.G & 8) == 8) {
            iB += v34.a(4, this.K.E);
        }
        for (int i3 = 0; i3 < this.L.size(); i3++) {
            iB += v34.d(5, (b3) this.L.get(i3));
        }
        int iC = 0;
        while (true) {
            int size = this.M.size();
            list = this.M;
            if (i2 >= size) {
                break;
            }
            iC += v34.c(((Integer) list.get(i2)).intValue());
            i2++;
        }
        int iC2 = iB + iC;
        if (!list.isEmpty()) {
            iC2 = iC2 + 1 + v34.c(iC);
        }
        this.N = iC;
        int size2 = this.F.size() + j() + iC2;
        this.P = size2;
        return size2;
    }

    @Override // defpackage.b3
    public final i28 d() {
        return qtd.h();
    }

    @Override // defpackage.b3
    public final i28 e() {
        qtd qtdVarH = qtd.h();
        qtdVarH.j(this);
        return qtdVarH;
    }

    @Override // defpackage.b3
    public final void f(v34 v34Var) throws IOException {
        c();
        q28 q28Var = new q28((r28) this);
        if ((this.G & 1) == 1) {
            v34Var.m(1, this.H);
        }
        if ((this.G & 2) == 2) {
            v34Var.m(2, this.I);
        }
        if ((this.G & 4) == 4) {
            boolean z = this.J;
            v34Var.x(3, 0);
            v34Var.q(z ? 1 : 0);
        }
        if ((this.G & 8) == 8) {
            v34Var.l(4, this.K.E);
        }
        for (int i = 0; i < this.L.size(); i++) {
            v34Var.o(5, (b3) this.L.get(i));
        }
        if (this.M.size() > 0) {
            v34Var.v(50);
            v34Var.v(this.N);
        }
        for (int i2 = 0; i2 < this.M.size(); i2++) {
            v34Var.n(((Integer) this.M.get(i2)).intValue());
        }
        q28Var.J(1000, v34Var);
        v34Var.r(this.F);
    }

    public std() {
        this.N = -1;
        this.O = (byte) -1;
        this.P = -1;
        this.F = l22.E;
    }

    public std(qtd qtdVar) {
        super(qtdVar);
        this.N = -1;
        this.O = (byte) -1;
        this.P = -1;
        this.F = qtdVar.E;
    }
}
