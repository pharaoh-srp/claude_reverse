package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes.dex */
public final class dl9 extends u28 {
    public static final dl9 K;
    public static final sk9 L = new sk9(3);
    public final l22 E;
    public List F;
    public List G;
    public int H;
    public byte I;
    public int J;

    static {
        dl9 dl9Var = new dl9();
        K = dl9Var;
        List list = Collections.EMPTY_LIST;
        dl9Var.F = list;
        dl9Var.G = list;
    }

    public dl9(t34 t34Var, oc7 oc7Var) {
        this.H = -1;
        this.I = (byte) -1;
        this.J = -1;
        List list = Collections.EMPTY_LIST;
        this.F = list;
        this.G = list;
        j22 j22Var = new j22();
        v34 v34VarJ = v34.j(j22Var, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    try {
                        int iN = t34Var.n();
                        if (iN != 0) {
                            if (iN == 10) {
                                if ((i & 1) != 1) {
                                    this.F = new ArrayList();
                                    i |= 1;
                                }
                                this.F.add(t34Var.g(cl9.R, oc7Var));
                            } else if (iN == 40) {
                                if ((i & 2) != 2) {
                                    this.G = new ArrayList();
                                    i |= 2;
                                }
                                this.G.add(Integer.valueOf(t34Var.k()));
                            } else if (iN == 42) {
                                int iD = t34Var.d(t34Var.k());
                                if ((i & 2) != 2 && t34Var.b() > 0) {
                                    this.G = new ArrayList();
                                    i |= 2;
                                }
                                while (t34Var.b() > 0) {
                                    this.G.add(Integer.valueOf(t34Var.k()));
                                }
                                t34Var.c(iD);
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
                if ((i & 1) == 1) {
                    this.F = Collections.unmodifiableList(this.F);
                }
                if ((i & 2) == 2) {
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
        if ((i & 1) == 1) {
            this.F = Collections.unmodifiableList(this.F);
        }
        if ((i & 2) == 2) {
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
        List list;
        int i = this.J;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int iD = 0;
        for (int i3 = 0; i3 < this.F.size(); i3++) {
            iD += v34.d(1, (b3) this.F.get(i3));
        }
        int iC = 0;
        while (true) {
            int size = this.G.size();
            list = this.G;
            if (i2 >= size) {
                break;
            }
            iC += v34.c(((Integer) list.get(i2)).intValue());
            i2++;
        }
        int iC2 = iD + iC;
        if (!list.isEmpty()) {
            iC2 = iC2 + 1 + v34.c(iC);
        }
        this.H = iC;
        int size2 = this.E.size() + iC2;
        this.J = size2;
        return size2;
    }

    @Override // defpackage.b3
    public final i28 d() {
        return zk9.g();
    }

    @Override // defpackage.b3
    public final i28 e() {
        zk9 zk9VarG = zk9.g();
        zk9VarG.i(this);
        return zk9VarG;
    }

    @Override // defpackage.b3
    public final void f(v34 v34Var) throws IOException {
        c();
        for (int i = 0; i < this.F.size(); i++) {
            v34Var.o(1, (b3) this.F.get(i));
        }
        if (this.G.size() > 0) {
            v34Var.v(42);
            v34Var.v(this.H);
        }
        for (int i2 = 0; i2 < this.G.size(); i2++) {
            v34Var.n(((Integer) this.G.get(i2)).intValue());
        }
        v34Var.r(this.E);
    }

    public dl9() {
        this.H = -1;
        this.I = (byte) -1;
        this.J = -1;
        this.E = l22.E;
    }

    public dl9(zk9 zk9Var) {
        this.H = -1;
        this.I = (byte) -1;
        this.J = -1;
        this.E = zk9Var.E;
    }
}
