package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes.dex */
public final class atd extends r28 {
    public static final atd N;
    public static final sk9 O = new sk9(14);
    public final l22 F;
    public int G;
    public itd H;
    public htd I;
    public ysd J;
    public List K;
    public byte L;
    public int M;

    static {
        atd atdVar = new atd();
        N = atdVar;
        atdVar.H = itd.I;
        atdVar.I = htd.I;
        atdVar.J = ysd.O;
        atdVar.K = Collections.EMPTY_LIST;
    }

    public atd(t34 t34Var, oc7 oc7Var) {
        this.L = (byte) -1;
        this.M = -1;
        this.H = itd.I;
        this.I = htd.I;
        this.J = ysd.O;
        this.K = Collections.EMPTY_LIST;
        j22 j22Var = new j22();
        v34 v34VarJ = v34.j(j22Var, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    int iN = t34Var.n();
                    if (iN != 0) {
                        xsd xsdVarH = null;
                        dtd dtdVarG = null;
                        dtd dtdVarH = null;
                        if (iN == 10) {
                            if ((this.G & 1) == 1) {
                                itd itdVar = this.H;
                                itdVar.getClass();
                                dtdVarG = dtd.g();
                                dtdVarG.l(itdVar);
                            }
                            itd itdVar2 = (itd) t34Var.g(itd.J, oc7Var);
                            this.H = itdVar2;
                            if (dtdVarG != null) {
                                dtdVarG.l(itdVar2);
                                this.H = dtdVarG.j();
                            }
                            this.G |= 1;
                        } else if (iN == 18) {
                            if ((this.G & 2) == 2) {
                                htd htdVar = this.I;
                                htdVar.getClass();
                                dtdVarH = dtd.h();
                                dtdVarH.k(htdVar);
                            }
                            htd htdVar2 = (htd) t34Var.g(htd.J, oc7Var);
                            this.I = htdVar2;
                            if (dtdVarH != null) {
                                dtdVarH.k(htdVar2);
                                this.I = dtdVarH.i();
                            }
                            this.G |= 2;
                        } else if (iN == 26) {
                            if ((this.G & 4) == 4) {
                                ysd ysdVar = this.J;
                                ysdVar.getClass();
                                xsdVarH = xsd.h();
                                xsdVarH.j(ysdVar);
                            }
                            ysd ysdVar2 = (ysd) t34Var.g(ysd.P, oc7Var);
                            this.J = ysdVar2;
                            if (xsdVarH != null) {
                                xsdVarH.j(ysdVar2);
                                this.J = xsdVarH.i();
                            }
                            this.G |= 4;
                        } else if (iN == 34) {
                            int i = (c == true ? 1 : 0) & '\b';
                            c = c;
                            if (i != 8) {
                                this.K = new ArrayList();
                                c = '\b';
                            }
                            this.K.add(t34Var.g(esd.o0, oc7Var));
                        } else if (!n(t34Var, v34VarJ, oc7Var, iN)) {
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
                if (((c == true ? 1 : 0) & '\b') == 8) {
                    this.K = Collections.unmodifiableList(this.K);
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
        }
        if (((c == true ? 1 : 0) & '\b') == 8) {
            this.K = Collections.unmodifiableList(this.K);
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
        return N;
    }

    @Override // defpackage.aib
    public final boolean b() {
        byte b = this.L;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.G & 2) == 2 && !this.I.b()) {
            this.L = (byte) 0;
            return false;
        }
        if ((this.G & 4) == 4 && !this.J.b()) {
            this.L = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.K.size(); i++) {
            if (!((esd) this.K.get(i)).b()) {
                this.L = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.L = (byte) 1;
            return true;
        }
        this.L = (byte) 0;
        return false;
    }

    @Override // defpackage.b3
    public final int c() {
        int i = this.M;
        if (i != -1) {
            return i;
        }
        int iD = (this.G & 1) == 1 ? v34.d(1, this.H) : 0;
        if ((this.G & 2) == 2) {
            iD += v34.d(2, this.I);
        }
        if ((this.G & 4) == 4) {
            iD += v34.d(3, this.J);
        }
        for (int i2 = 0; i2 < this.K.size(); i2++) {
            iD += v34.d(4, (b3) this.K.get(i2));
        }
        int size = this.F.size() + j() + iD;
        this.M = size;
        return size;
    }

    @Override // defpackage.b3
    public final i28 d() {
        return zsd.h();
    }

    @Override // defpackage.b3
    public final i28 e() {
        zsd zsdVarH = zsd.h();
        zsdVarH.j(this);
        return zsdVarH;
    }

    @Override // defpackage.b3
    public final void f(v34 v34Var) throws IOException {
        c();
        q28 q28Var = new q28((r28) this);
        if ((this.G & 1) == 1) {
            v34Var.o(1, this.H);
        }
        if ((this.G & 2) == 2) {
            v34Var.o(2, this.I);
        }
        if ((this.G & 4) == 4) {
            v34Var.o(3, this.J);
        }
        for (int i = 0; i < this.K.size(); i++) {
            v34Var.o(4, (b3) this.K.get(i));
        }
        q28Var.J(200, v34Var);
        v34Var.r(this.F);
    }

    public atd() {
        this.L = (byte) -1;
        this.M = -1;
        this.F = l22.E;
    }

    public atd(zsd zsdVar) {
        super(zsdVar);
        this.L = (byte) -1;
        this.M = -1;
        this.F = zsdVar.E;
    }
}
