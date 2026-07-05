package defpackage;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes.dex */
public final class cl9 extends u28 {
    public static final cl9 Q;
    public static final sk9 R = new sk9(4);
    public final l22 E;
    public int F;
    public int G;
    public int H;
    public Object I;
    public bl9 J;
    public List K;
    public int L;
    public List M;
    public int N;
    public byte O;
    public int P;

    static {
        cl9 cl9Var = new cl9();
        Q = cl9Var;
        cl9Var.G = 1;
        cl9Var.H = 0;
        cl9Var.I = "";
        cl9Var.J = bl9.NONE;
        List list = Collections.EMPTY_LIST;
        cl9Var.K = list;
        cl9Var.M = list;
    }

    public cl9(t34 t34Var) {
        this.L = -1;
        this.N = -1;
        this.O = (byte) -1;
        this.P = -1;
        this.G = 1;
        boolean z = false;
        this.H = 0;
        this.I = "";
        bl9 bl9Var = bl9.NONE;
        this.J = bl9Var;
        List list = Collections.EMPTY_LIST;
        this.K = list;
        this.M = list;
        j22 j22Var = new j22();
        v34 v34VarJ = v34.j(j22Var, 1);
        int i = 0;
        while (!z) {
            try {
                try {
                    int iN = t34Var.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.F |= 1;
                            this.G = t34Var.k();
                        } else if (iN == 16) {
                            this.F |= 2;
                            this.H = t34Var.k();
                        } else if (iN == 24) {
                            int iK = t34Var.k();
                            bl9 bl9Var2 = iK != 0 ? iK != 1 ? iK != 2 ? null : bl9.DESC_TO_CLASS_ID : bl9.INTERNAL_TO_CLASS_ID : bl9Var;
                            if (bl9Var2 == null) {
                                v34VarJ.v(iN);
                                v34VarJ.v(iK);
                            } else {
                                this.F |= 8;
                                this.J = bl9Var2;
                            }
                        } else if (iN == 32) {
                            if ((i & 16) != 16) {
                                this.K = new ArrayList();
                                i |= 16;
                            }
                            this.K.add(Integer.valueOf(t34Var.k()));
                        } else if (iN == 34) {
                            int iD = t34Var.d(t34Var.k());
                            if ((i & 16) != 16 && t34Var.b() > 0) {
                                this.K = new ArrayList();
                                i |= 16;
                            }
                            while (t34Var.b() > 0) {
                                this.K.add(Integer.valueOf(t34Var.k()));
                            }
                            t34Var.c(iD);
                        } else if (iN == 40) {
                            if ((i & 32) != 32) {
                                this.M = new ArrayList();
                                i |= 32;
                            }
                            this.M.add(Integer.valueOf(t34Var.k()));
                        } else if (iN == 42) {
                            int iD2 = t34Var.d(t34Var.k());
                            if ((i & 32) != 32 && t34Var.b() > 0) {
                                this.M = new ArrayList();
                                i |= 32;
                            }
                            while (t34Var.b() > 0) {
                                this.M.add(Integer.valueOf(t34Var.k()));
                            }
                            t34Var.c(iD2);
                        } else if (iN == 50) {
                            oba obaVarE = t34Var.e();
                            this.F |= 4;
                            this.I = obaVarE;
                        } else if (!t34Var.q(iN, v34VarJ)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((i & 16) == 16) {
                        this.K = Collections.unmodifiableList(this.K);
                    }
                    if ((i & 32) == 32) {
                        this.M = Collections.unmodifiableList(this.M);
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
        if ((i & 16) == 16) {
            this.K = Collections.unmodifiableList(this.K);
        }
        if ((i & 32) == 32) {
            this.M = Collections.unmodifiableList(this.M);
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
        if (this.O == 1) {
            return true;
        }
        this.O = (byte) 1;
        return true;
    }

    @Override // defpackage.b3
    public final int c() {
        List list;
        List list2;
        l22 obaVar;
        int i = this.P;
        if (i != -1) {
            return i;
        }
        int iB = (this.F & 1) == 1 ? v34.b(1, this.G) : 0;
        if ((this.F & 2) == 2) {
            iB += v34.b(2, this.H);
        }
        if ((this.F & 8) == 8) {
            iB += v34.a(3, this.J.E);
        }
        int i2 = 0;
        int iC = 0;
        while (true) {
            int size = this.K.size();
            list = this.K;
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
        this.L = iC;
        int i3 = 0;
        int iC3 = 0;
        while (true) {
            int size2 = this.M.size();
            list2 = this.M;
            if (i3 >= size2) {
                break;
            }
            iC3 += v34.c(((Integer) list2.get(i3)).intValue());
            i3++;
        }
        int size3 = iC2 + iC3;
        if (!list2.isEmpty()) {
            size3 = size3 + 1 + v34.c(iC3);
        }
        this.N = iC3;
        if ((this.F & 4) == 4) {
            Object obj = this.I;
            if (obj instanceof String) {
                try {
                    obaVar = new oba(((String) obj).getBytes("UTF-8"));
                    this.I = obaVar;
                } catch (UnsupportedEncodingException e) {
                    xh6.f("UTF-8 not supported?", e);
                    return 0;
                }
            } else {
                obaVar = (l22) obj;
            }
            size3 += obaVar.size() + v34.f(obaVar.size()) + v34.h(6);
        }
        int size4 = this.E.size() + size3;
        this.P = size4;
        return size4;
    }

    @Override // defpackage.b3
    public final i28 d() {
        return al9.g();
    }

    @Override // defpackage.b3
    public final i28 e() {
        al9 al9VarG = al9.g();
        al9VarG.i(this);
        return al9VarG;
    }

    @Override // defpackage.b3
    public final void f(v34 v34Var) throws IOException {
        l22 obaVar;
        c();
        if ((this.F & 1) == 1) {
            v34Var.m(1, this.G);
        }
        if ((this.F & 2) == 2) {
            v34Var.m(2, this.H);
        }
        if ((this.F & 8) == 8) {
            v34Var.l(3, this.J.E);
        }
        if (this.K.size() > 0) {
            v34Var.v(34);
            v34Var.v(this.L);
        }
        for (int i = 0; i < this.K.size(); i++) {
            v34Var.n(((Integer) this.K.get(i)).intValue());
        }
        if (this.M.size() > 0) {
            v34Var.v(42);
            v34Var.v(this.N);
        }
        for (int i2 = 0; i2 < this.M.size(); i2++) {
            v34Var.n(((Integer) this.M.get(i2)).intValue());
        }
        if ((this.F & 4) == 4) {
            Object obj = this.I;
            if (obj instanceof String) {
                try {
                    obaVar = new oba(((String) obj).getBytes("UTF-8"));
                    this.I = obaVar;
                } catch (UnsupportedEncodingException e) {
                    xh6.f("UTF-8 not supported?", e);
                    return;
                }
            } else {
                obaVar = (l22) obj;
            }
            v34Var.x(6, 2);
            v34Var.v(obaVar.size());
            v34Var.r(obaVar);
        }
        v34Var.r(this.E);
    }

    public cl9() {
        this.L = -1;
        this.N = -1;
        this.O = (byte) -1;
        this.P = -1;
        this.E = l22.E;
    }

    public cl9(al9 al9Var) {
        this.L = -1;
        this.N = -1;
        this.O = (byte) -1;
        this.P = -1;
        this.E = al9Var.E;
    }
}
