package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes3.dex */
public final class nsd extends u28 {
    public static final nsd M;
    public static final jsd N = new jsd(0);
    public final l22 E;
    public int F;
    public lsd G;
    public List H;
    public ssd I;
    public msd J;
    public byte K;
    public int L;

    static {
        nsd nsdVar = new nsd();
        M = nsdVar;
        nsdVar.G = lsd.RETURNS_CONSTANT;
        nsdVar.H = Collections.EMPTY_LIST;
        nsdVar.I = ssd.P;
        nsdVar.J = msd.AT_MOST_ONCE;
    }

    public nsd(t34 t34Var, oc7 oc7Var) {
        this.K = (byte) -1;
        this.L = -1;
        lsd lsdVar = lsd.RETURNS_CONSTANT;
        this.G = lsdVar;
        this.H = Collections.EMPTY_LIST;
        this.I = ssd.P;
        msd msdVar = msd.AT_MOST_ONCE;
        this.J = msdVar;
        j22 j22Var = new j22();
        v34 v34VarJ = v34.j(j22Var, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    int iN = t34Var.n();
                    if (iN != 0) {
                        msd msdVar2 = null;
                        lsd lsdVar2 = null;
                        qsd qsdVarH = null;
                        if (iN == 8) {
                            int iK = t34Var.k();
                            if (iK == 0) {
                                lsdVar2 = lsdVar;
                            } else if (iK == 1) {
                                lsdVar2 = lsd.CALLS;
                            } else if (iK == 2) {
                                lsdVar2 = lsd.RETURNS_NOT_NULL;
                            }
                            if (lsdVar2 == null) {
                                v34VarJ.v(iN);
                                v34VarJ.v(iK);
                            } else {
                                this.F |= 1;
                                this.G = lsdVar2;
                            }
                        } else if (iN == 18) {
                            int i = (c == true ? 1 : 0) & 2;
                            c = c;
                            if (i != 2) {
                                this.H = new ArrayList();
                                c = 2;
                            }
                            this.H.add(t34Var.g(ssd.Q, oc7Var));
                        } else if (iN == 26) {
                            if ((this.F & 2) == 2) {
                                ssd ssdVar = this.I;
                                ssdVar.getClass();
                                qsdVarH = qsd.h();
                                qsdVarH.i(ssdVar);
                            }
                            ssd ssdVar2 = (ssd) t34Var.g(ssd.Q, oc7Var);
                            this.I = ssdVar2;
                            if (qsdVarH != null) {
                                qsdVarH.i(ssdVar2);
                                this.I = qsdVarH.g();
                            }
                            this.F |= 2;
                        } else if (iN == 32) {
                            int iK2 = t34Var.k();
                            if (iK2 == 0) {
                                msdVar2 = msdVar;
                            } else if (iK2 == 1) {
                                msdVar2 = msd.EXACTLY_ONCE;
                            } else if (iK2 == 2) {
                                msdVar2 = msd.AT_LEAST_ONCE;
                            }
                            if (msdVar2 == null) {
                                v34VarJ.v(iN);
                                v34VarJ.v(iK2);
                            } else {
                                this.F |= 4;
                                this.J = msdVar2;
                            }
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
                if (((c == true ? 1 : 0) & 2) == 2) {
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
        if (((c == true ? 1 : 0) & 2) == 2) {
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
        byte b = this.K;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.H.size(); i++) {
            if (!((ssd) this.H.get(i)).b()) {
                this.K = (byte) 0;
                return false;
            }
        }
        if ((this.F & 2) != 2 || this.I.b()) {
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
        int iA = (this.F & 1) == 1 ? v34.a(1, this.G.E) : 0;
        for (int i2 = 0; i2 < this.H.size(); i2++) {
            iA += v34.d(2, (b3) this.H.get(i2));
        }
        if ((this.F & 2) == 2) {
            iA += v34.d(3, this.I);
        }
        if ((this.F & 4) == 4) {
            iA += v34.a(4, this.J.E);
        }
        int size = this.E.size() + iA;
        this.L = size;
        return size;
    }

    @Override // defpackage.b3
    public final i28 d() {
        return ksd.h();
    }

    @Override // defpackage.b3
    public final i28 e() {
        ksd ksdVarH = ksd.h();
        ksdVarH.i(this);
        return ksdVarH;
    }

    @Override // defpackage.b3
    public final void f(v34 v34Var) throws IOException {
        c();
        if ((this.F & 1) == 1) {
            v34Var.l(1, this.G.E);
        }
        for (int i = 0; i < this.H.size(); i++) {
            v34Var.o(2, (b3) this.H.get(i));
        }
        if ((this.F & 2) == 2) {
            v34Var.o(3, this.I);
        }
        if ((this.F & 4) == 4) {
            v34Var.l(4, this.J.E);
        }
        v34Var.r(this.E);
    }

    public nsd() {
        this.K = (byte) -1;
        this.L = -1;
        this.E = l22.E;
    }

    public nsd(ksd ksdVar) {
        this.K = (byte) -1;
        this.L = -1;
        this.E = ksdVar.E;
    }
}
