package defpackage;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import okio.Buffer;

/* JADX INFO: loaded from: classes.dex */
public final class fdc implements u82 {
    public final nd5 E;
    public final Object F;
    public final Object[] G;
    public final t82 H;
    public final br4 I;
    public volatile boolean J;
    public v82 K;
    public Throwable L;
    public boolean M;

    public fdc(nd5 nd5Var, Object obj, Object[] objArr, t82 t82Var, br4 br4Var) {
        this.E = nd5Var;
        this.F = obj;
        this.G = objArr;
        this.H = t82Var;
        this.I = br4Var;
    }

    public final v82 a() {
        vs8 vs8VarI;
        nd5 nd5Var = this.E;
        zh4[] zh4VarArr = (zh4[]) nd5Var.l;
        Object[] objArr = this.G;
        int length = objArr.length;
        if (length != zh4VarArr.length) {
            sz6.p(vb7.l(zh4VarArr.length, ")", vb7.u("Argument count (", length, ") doesn't match expected count (")));
            return null;
        }
        zie zieVar = new zie((String) nd5Var.h, (vs8) nd5Var.g, (String) nd5Var.i, (wg8) nd5Var.j, (p8b) nd5Var.k, nd5Var.a, nd5Var.b, nd5Var.c);
        if (nd5Var.d) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            zh4VarArr[i].j(zieVar, objArr[i]);
        }
        us8 us8Var = zieVar.d;
        if (us8Var != null) {
            vs8VarI = us8Var.c();
        } else {
            String str = zieVar.c;
            vs8 vs8Var = zieVar.b;
            vs8VarI = vs8Var.i(str);
            if (vs8VarI == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(vs8Var);
                String str2 = zieVar.c;
                sb.append(", Relative: ");
                sb.append(str2);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        tie yieVar = zieVar.k;
        if (yieVar == null) {
            epk epkVar = zieVar.j;
            if (epkVar != null) {
                yieVar = epkVar.o();
            } else {
                fub fubVar = zieVar.i;
                if (fubVar != null) {
                    yieVar = fubVar.b();
                } else if (zieVar.h) {
                    yieVar = tie.create((p8b) null, new byte[0]);
                }
            }
        }
        p8b p8bVar = zieVar.g;
        gmf gmfVar = zieVar.f;
        if (p8bVar != null) {
            if (yieVar != null) {
                yieVar = new yie(yieVar, p8bVar);
            } else {
                gmfVar.s("Content-Type", p8bVar.a);
            }
        }
        jie jieVar = zieVar.e;
        jieVar.getClass();
        jieVar.a = vs8VarI;
        jieVar.c = gmfVar.v().g();
        jieVar.e(zieVar.a, yieVar);
        jieVar.f(wb9.class, new wb9((Class) nd5Var.e, this.F, (Method) nd5Var.f, arrayList));
        v82 v82VarA = this.H.a(new kie(jieVar));
        if (v82VarA != null) {
            return v82VarA;
        }
        mr9.h("Call.Factory returned null.");
        return null;
    }

    public final v82 b() throws IOException {
        v82 v82Var = this.K;
        if (v82Var != null) {
            return v82Var;
        }
        Throwable th = this.L;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            v82 v82VarA = a();
            this.K = v82VarA;
            return v82VarA;
        } catch (IOException | Error | RuntimeException e) {
            zni.a0(e);
            this.L = e;
            throw e;
        }
    }

    public final oqe c(pqe pqeVar) throws IOException {
        rqe rqeVar = pqeVar.K;
        nqe nqeVarC = pqeVar.c();
        nqeVarC.g = new edc(rqeVar.e(), rqeVar.d());
        pqe pqeVarA = nqeVarC.a();
        int i = pqeVarA.H;
        if (i < 200 || i >= 300) {
            try {
                Buffer buffer = new Buffer();
                rqeVar.G0().F0(buffer);
                qqe qqeVar = new qqe(rqeVar.e(), rqeVar.d(), buffer);
                if (pqeVarA.U) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                return new oqe(pqeVarA, null, qqeVar);
            } finally {
                rqeVar.close();
            }
        }
        if (i == 204 || i == 205) {
            rqeVar.close();
            return oqe.b(null, pqeVarA);
        }
        ddc ddcVar = new ddc(rqeVar);
        try {
            return oqe.b(this.I.h(ddcVar), pqeVarA);
        } catch (RuntimeException e) {
            IOException iOException = ddcVar.H;
            if (iOException == null) {
                throw e;
            }
            throw iOException;
        }
    }

    @Override // defpackage.u82
    public final void cancel() {
        v82 v82Var;
        this.J = true;
        synchronized (this) {
            v82Var = this.K;
        }
        if (v82Var != null) {
            ((f4e) v82Var).cancel();
        }
    }

    @Override // defpackage.u82
    /* JADX INFO: renamed from: clone */
    public final u82 mo1179clone() {
        return new fdc(this.E, this.F, this.G, this.H, this.I);
    }

    @Override // defpackage.u82
    public final void e(h92 h92Var) {
        v82 v82Var;
        Throwable th;
        synchronized (this) {
            try {
                if (this.M) {
                    throw new IllegalStateException("Already executed.");
                }
                this.M = true;
                v82Var = this.K;
                th = this.L;
                if (v82Var == null && th == null) {
                    try {
                        v82 v82VarA = a();
                        this.K = v82VarA;
                        v82Var = v82VarA;
                    } catch (Throwable th2) {
                        th = th2;
                        zni.a0(th);
                        this.L = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            h92Var.q(this, th);
            return;
        }
        if (this.J) {
            ((f4e) v82Var).cancel();
        }
        ((f4e) v82Var).d(new q28(this, h92Var));
    }

    @Override // defpackage.u82
    public final boolean isCanceled() {
        boolean z = true;
        if (this.J) {
            return true;
        }
        synchronized (this) {
            v82 v82Var = this.K;
            if (v82Var == null || !((f4e) v82Var).V) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.u82
    public final synchronized kie l0() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return ((f4e) b()).F;
    }

    public final Object clone() {
        return new fdc(this.E, this.F, this.G, this.H, this.I);
    }
}
