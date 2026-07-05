package defpackage;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes.dex */
public final class yk9 extends u28 {
    public static final yk9 N;
    public static final sk9 O = new sk9(2);
    public final l22 E;
    public int F;
    public uk9 G;
    public wk9 H;
    public wk9 I;
    public wk9 J;
    public wk9 K;
    public byte L;
    public int M;

    static {
        yk9 yk9Var = new yk9();
        N = yk9Var;
        yk9Var.G = uk9.K;
        wk9 wk9Var = wk9.K;
        yk9Var.H = wk9Var;
        yk9Var.I = wk9Var;
        yk9Var.J = wk9Var;
        yk9Var.K = wk9Var;
    }

    public yk9(t34 t34Var, oc7 oc7Var) {
        this.L = (byte) -1;
        this.M = -1;
        this.G = uk9.K;
        wk9 wk9Var = wk9.K;
        this.H = wk9Var;
        this.I = wk9Var;
        this.J = wk9Var;
        this.K = wk9Var;
        j22 j22Var = new j22();
        v34 v34VarJ = v34.j(j22Var, 1);
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iN = t34Var.n();
                    if (iN != 0) {
                        vk9 vk9VarI = null;
                        tk9 tk9VarG = null;
                        vk9 vk9VarI2 = null;
                        vk9 vk9VarI3 = null;
                        vk9 vk9VarI4 = null;
                        if (iN == 10) {
                            if ((this.F & 1) == 1) {
                                uk9 uk9Var = this.G;
                                uk9Var.getClass();
                                tk9VarG = tk9.g();
                                tk9VarG.i(uk9Var);
                            }
                            uk9 uk9Var2 = (uk9) t34Var.g(uk9.L, oc7Var);
                            this.G = uk9Var2;
                            if (tk9VarG != null) {
                                tk9VarG.i(uk9Var2);
                                this.G = tk9VarG.h();
                            }
                            this.F |= 1;
                        } else if (iN == 18) {
                            if ((this.F & 2) == 2) {
                                wk9 wk9Var2 = this.H;
                                wk9Var2.getClass();
                                vk9VarI2 = wk9.i(wk9Var2);
                            }
                            wk9 wk9Var3 = (wk9) t34Var.g(wk9.L, oc7Var);
                            this.H = wk9Var3;
                            if (vk9VarI2 != null) {
                                vk9VarI2.h(wk9Var3);
                                this.H = vk9VarI2.g();
                            }
                            this.F |= 2;
                        } else if (iN == 26) {
                            if ((this.F & 4) == 4) {
                                wk9 wk9Var4 = this.I;
                                wk9Var4.getClass();
                                vk9VarI3 = wk9.i(wk9Var4);
                            }
                            wk9 wk9Var5 = (wk9) t34Var.g(wk9.L, oc7Var);
                            this.I = wk9Var5;
                            if (vk9VarI3 != null) {
                                vk9VarI3.h(wk9Var5);
                                this.I = vk9VarI3.g();
                            }
                            this.F |= 4;
                        } else if (iN == 34) {
                            if ((this.F & 8) == 8) {
                                wk9 wk9Var6 = this.J;
                                wk9Var6.getClass();
                                vk9VarI4 = wk9.i(wk9Var6);
                            }
                            wk9 wk9Var7 = (wk9) t34Var.g(wk9.L, oc7Var);
                            this.J = wk9Var7;
                            if (vk9VarI4 != null) {
                                vk9VarI4.h(wk9Var7);
                                this.J = vk9VarI4.g();
                            }
                            this.F |= 8;
                        } else if (iN == 42) {
                            if ((this.F & 16) == 16) {
                                wk9 wk9Var8 = this.K;
                                wk9Var8.getClass();
                                vk9VarI = wk9.i(wk9Var8);
                            }
                            wk9 wk9Var9 = (wk9) t34Var.g(wk9.L, oc7Var);
                            this.K = wk9Var9;
                            if (vk9VarI != null) {
                                vk9VarI.h(wk9Var9);
                                this.K = vk9VarI.g();
                            }
                            this.F |= 16;
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
        if (this.L == 1) {
            return true;
        }
        this.L = (byte) 1;
        return true;
    }

    @Override // defpackage.b3
    public final int c() {
        int i = this.M;
        if (i != -1) {
            return i;
        }
        int iD = (this.F & 1) == 1 ? v34.d(1, this.G) : 0;
        if ((this.F & 2) == 2) {
            iD += v34.d(2, this.H);
        }
        if ((this.F & 4) == 4) {
            iD += v34.d(3, this.I);
        }
        if ((this.F & 8) == 8) {
            iD += v34.d(4, this.J);
        }
        if ((this.F & 16) == 16) {
            iD += v34.d(5, this.K);
        }
        int size = this.E.size() + iD;
        this.M = size;
        return size;
    }

    @Override // defpackage.b3
    public final i28 d() {
        return xk9.h();
    }

    @Override // defpackage.b3
    public final i28 e() {
        xk9 xk9VarH = xk9.h();
        xk9VarH.i(this);
        return xk9VarH;
    }

    @Override // defpackage.b3
    public final void f(v34 v34Var) throws IOException {
        c();
        if ((this.F & 1) == 1) {
            v34Var.o(1, this.G);
        }
        if ((this.F & 2) == 2) {
            v34Var.o(2, this.H);
        }
        if ((this.F & 4) == 4) {
            v34Var.o(3, this.I);
        }
        if ((this.F & 8) == 8) {
            v34Var.o(4, this.J);
        }
        if ((this.F & 16) == 16) {
            v34Var.o(5, this.K);
        }
        v34Var.r(this.E);
    }

    public yk9() {
        this.L = (byte) -1;
        this.M = -1;
        this.E = l22.E;
    }

    public yk9(xk9 xk9Var) {
        this.L = (byte) -1;
        this.M = -1;
        this.E = xk9Var.E;
    }
}
