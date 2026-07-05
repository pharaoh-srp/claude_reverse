package defpackage;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes3.dex */
public final class ztd extends u28 {
    public static final ztd O;
    public static final jsd P = new jsd(3);
    public final l22 E;
    public int F;
    public int G;
    public int H;
    public xtd I;
    public int J;
    public int K;
    public ytd L;
    public byte M;
    public int N;

    static {
        ztd ztdVar = new ztd();
        O = ztdVar;
        ztdVar.G = 0;
        ztdVar.H = 0;
        ztdVar.I = xtd.ERROR;
        ztdVar.J = 0;
        ztdVar.K = 0;
        ztdVar.L = ytd.LANGUAGE_VERSION;
    }

    public ztd(t34 t34Var) {
        this.M = (byte) -1;
        this.N = -1;
        boolean z = false;
        this.G = 0;
        this.H = 0;
        xtd xtdVar = xtd.ERROR;
        this.I = xtdVar;
        this.J = 0;
        this.K = 0;
        ytd ytdVar = ytd.LANGUAGE_VERSION;
        this.L = ytdVar;
        j22 j22Var = new j22();
        v34 v34VarJ = v34.j(j22Var, 1);
        while (!z) {
            try {
                try {
                    int iN = t34Var.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.F |= 1;
                            this.G = t34Var.k();
                        } else if (iN != 16) {
                            ytd ytdVar2 = null;
                            xtd xtdVar2 = null;
                            if (iN == 24) {
                                int iK = t34Var.k();
                                if (iK == 0) {
                                    xtdVar2 = xtd.WARNING;
                                } else if (iK == 1) {
                                    xtdVar2 = xtdVar;
                                } else if (iK == 2) {
                                    xtdVar2 = xtd.HIDDEN;
                                }
                                if (xtdVar2 == null) {
                                    v34VarJ.v(iN);
                                    v34VarJ.v(iK);
                                } else {
                                    this.F |= 4;
                                    this.I = xtdVar2;
                                }
                            } else if (iN == 32) {
                                this.F |= 8;
                                this.J = t34Var.k();
                            } else if (iN == 40) {
                                this.F |= 16;
                                this.K = t34Var.k();
                            } else if (iN == 48) {
                                int iK2 = t34Var.k();
                                if (iK2 == 0) {
                                    ytdVar2 = ytdVar;
                                } else if (iK2 == 1) {
                                    ytdVar2 = ytd.COMPILER_VERSION;
                                } else if (iK2 == 2) {
                                    ytdVar2 = ytd.API_VERSION;
                                }
                                if (ytdVar2 == null) {
                                    v34VarJ.v(iN);
                                    v34VarJ.v(iK2);
                                } else {
                                    this.F |= 32;
                                    this.L = ytdVar2;
                                }
                            } else if (!t34Var.q(iN, v34VarJ)) {
                            }
                        } else {
                            this.F |= 2;
                            this.H = t34Var.k();
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
        if (this.M == 1) {
            return true;
        }
        this.M = (byte) 1;
        return true;
    }

    @Override // defpackage.b3
    public final int c() {
        int i = this.N;
        if (i != -1) {
            return i;
        }
        int iB = (this.F & 1) == 1 ? v34.b(1, this.G) : 0;
        if ((this.F & 2) == 2) {
            iB += v34.b(2, this.H);
        }
        if ((this.F & 4) == 4) {
            iB += v34.a(3, this.I.E);
        }
        if ((this.F & 8) == 8) {
            iB += v34.b(4, this.J);
        }
        if ((this.F & 16) == 16) {
            iB += v34.b(5, this.K);
        }
        if ((this.F & 32) == 32) {
            iB += v34.a(6, this.L.E);
        }
        int size = this.E.size() + iB;
        this.N = size;
        return size;
    }

    @Override // defpackage.b3
    public final i28 d() {
        return wtd.h();
    }

    @Override // defpackage.b3
    public final i28 e() {
        wtd wtdVarH = wtd.h();
        wtdVarH.i(this);
        return wtdVarH;
    }

    @Override // defpackage.b3
    public final void f(v34 v34Var) throws IOException {
        c();
        if ((this.F & 1) == 1) {
            v34Var.m(1, this.G);
        }
        if ((this.F & 2) == 2) {
            v34Var.m(2, this.H);
        }
        if ((this.F & 4) == 4) {
            v34Var.l(3, this.I.E);
        }
        if ((this.F & 8) == 8) {
            v34Var.m(4, this.J);
        }
        if ((this.F & 16) == 16) {
            v34Var.m(5, this.K);
        }
        if ((this.F & 32) == 32) {
            v34Var.l(6, this.L.E);
        }
        v34Var.r(this.E);
    }

    public ztd() {
        this.M = (byte) -1;
        this.N = -1;
        this.E = l22.E;
    }

    public ztd(wtd wtdVar) {
        this.M = (byte) -1;
        this.N = -1;
        this.E = wtdVar.E;
    }
}
