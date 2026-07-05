package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes.dex */
public final class ysd extends r28 {
    public static final ysd O;
    public static final sk9 P = new sk9(13);
    public final l22 F;
    public int G;
    public List H;
    public List I;
    public List J;
    public ttd K;
    public aud L;
    public byte M;
    public int N;

    static {
        ysd ysdVar = new ysd();
        O = ysdVar;
        List list = Collections.EMPTY_LIST;
        ysdVar.H = list;
        ysdVar.I = list;
        ysdVar.J = list;
        ysdVar.K = ttd.K;
        ysdVar.L = aud.I;
    }

    public ysd(t34 t34Var, oc7 oc7Var) {
        this.M = (byte) -1;
        this.N = -1;
        List list = Collections.EMPTY_LIST;
        this.H = list;
        this.I = list;
        this.J = list;
        this.K = ttd.K;
        this.L = aud.I;
        j22 j22Var = new j22();
        int i = 1;
        v34 v34VarJ = v34.j(j22Var, 1);
        boolean z = false;
        int i2 = 0;
        while (!z) {
            try {
                try {
                    int iN = t34Var.n();
                    if (iN != 0) {
                        if (iN == 26) {
                            int i3 = (i2 == true ? 1 : 0) & 1;
                            i2 = i2;
                            if (i3 != 1) {
                                this.H = new ArrayList();
                                i2 = (i2 == true ? 1 : 0) | 1;
                            }
                            this.H.add(t34Var.g(usd.Z, oc7Var));
                        } else if (iN == 34) {
                            int i4 = (i2 == true ? 1 : 0) & 2;
                            i2 = i2;
                            if (i4 != 2) {
                                this.I = new ArrayList();
                                i2 = (i2 == true ? 1 : 0) | 2;
                            }
                            this.I.add(t34Var.g(ctd.Z, oc7Var));
                        } else if (iN != 42) {
                            hsd hsdVar = null;
                            asd asdVarI = null;
                            if (iN == 242) {
                                if ((this.G & 1) == 1) {
                                    ttd ttdVar = this.K;
                                    ttdVar.getClass();
                                    asdVarI = ttd.i(ttdVar);
                                }
                                ttd ttdVar2 = (ttd) t34Var.g(ttd.L, oc7Var);
                                this.K = ttdVar2;
                                if (asdVarI != null) {
                                    asdVarI.k(ttdVar2);
                                    this.K = asdVarI.h();
                                }
                                this.G |= 1;
                            } else if (iN == 258) {
                                if ((this.G & 2) == 2) {
                                    aud audVar = this.L;
                                    audVar.getClass();
                                    hsdVar = new hsd(i);
                                    hsdVar.H = Collections.EMPTY_LIST;
                                    hsdVar.j(audVar);
                                }
                                aud audVar2 = (aud) t34Var.g(aud.J, oc7Var);
                                this.L = audVar2;
                                if (hsdVar != null) {
                                    hsdVar.j(audVar2);
                                    this.L = hsdVar.h();
                                }
                                this.G |= 2;
                            } else if (!n(t34Var, v34VarJ, oc7Var, iN)) {
                            }
                        } else {
                            int i5 = (i2 == true ? 1 : 0) & 4;
                            i2 = i2;
                            if (i5 != 4) {
                                this.J = new ArrayList();
                                i2 = (i2 == true ? 1 : 0) | 4;
                            }
                            this.J.add(t34Var.g(ptd.T, oc7Var));
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (((i2 == true ? 1 : 0) & 1) == 1) {
                        this.H = Collections.unmodifiableList(this.H);
                    }
                    if (((i2 == true ? 1 : 0) & 2) == 2) {
                        this.I = Collections.unmodifiableList(this.I);
                    }
                    if (((i2 == true ? 1 : 0) & 4) == 4) {
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
        if (((i2 == true ? 1 : 0) & 1) == 1) {
            this.H = Collections.unmodifiableList(this.H);
        }
        if (((i2 == true ? 1 : 0) & 2) == 2) {
            this.I = Collections.unmodifiableList(this.I);
        }
        if (((i2 == true ? 1 : 0) & 4) == 4) {
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
        return O;
    }

    @Override // defpackage.aib
    public final boolean b() {
        byte b = this.M;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.H.size(); i++) {
            if (!((usd) this.H.get(i)).b()) {
                this.M = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.I.size(); i2++) {
            if (!((ctd) this.I.get(i2)).b()) {
                this.M = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.J.size(); i3++) {
            if (!((ptd) this.J.get(i3)).b()) {
                this.M = (byte) 0;
                return false;
            }
        }
        if ((this.G & 1) == 1 && !this.K.b()) {
            this.M = (byte) 0;
            return false;
        }
        if (i()) {
            this.M = (byte) 1;
            return true;
        }
        this.M = (byte) 0;
        return false;
    }

    @Override // defpackage.b3
    public final int c() {
        int i = this.N;
        if (i != -1) {
            return i;
        }
        int iD = 0;
        for (int i2 = 0; i2 < this.H.size(); i2++) {
            iD += v34.d(3, (b3) this.H.get(i2));
        }
        for (int i3 = 0; i3 < this.I.size(); i3++) {
            iD += v34.d(4, (b3) this.I.get(i3));
        }
        for (int i4 = 0; i4 < this.J.size(); i4++) {
            iD += v34.d(5, (b3) this.J.get(i4));
        }
        if ((this.G & 1) == 1) {
            iD += v34.d(30, this.K);
        }
        if ((this.G & 2) == 2) {
            iD += v34.d(32, this.L);
        }
        int size = this.F.size() + j() + iD;
        this.N = size;
        return size;
    }

    @Override // defpackage.b3
    public final i28 d() {
        return xsd.h();
    }

    @Override // defpackage.b3
    public final i28 e() {
        xsd xsdVarH = xsd.h();
        xsdVarH.j(this);
        return xsdVarH;
    }

    @Override // defpackage.b3
    public final void f(v34 v34Var) throws IOException {
        c();
        q28 q28Var = new q28((r28) this);
        for (int i = 0; i < this.H.size(); i++) {
            v34Var.o(3, (b3) this.H.get(i));
        }
        for (int i2 = 0; i2 < this.I.size(); i2++) {
            v34Var.o(4, (b3) this.I.get(i2));
        }
        for (int i3 = 0; i3 < this.J.size(); i3++) {
            v34Var.o(5, (b3) this.J.get(i3));
        }
        if ((this.G & 1) == 1) {
            v34Var.o(30, this.K);
        }
        if ((this.G & 2) == 2) {
            v34Var.o(32, this.L);
        }
        q28Var.J(200, v34Var);
        v34Var.r(this.F);
    }

    public ysd() {
        this.M = (byte) -1;
        this.N = -1;
        this.F = l22.E;
    }

    public ysd(xsd xsdVar) {
        super(xsdVar);
        this.M = (byte) -1;
        this.N = -1;
        this.F = xsdVar.E;
    }
}
