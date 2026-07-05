package defpackage;

import android.content.Context;
import java.io.IOException;
import java.net.SocketException;
import okio.RealBufferedSource;

/* JADX INFO: loaded from: classes.dex */
public final class w47 {
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;

    public w47(Context context, String str, g11 g11Var, boolean z, boolean z2) {
        context.getClass();
        g11Var.getClass();
        this.c = context;
        this.d = str;
        this.e = g11Var;
        this.a = z;
        this.b = z2;
    }

    public static IOException a(w47 w47Var, long j, boolean z, boolean z2, IOException iOException, int i) {
        boolean z3 = (i & 4) == 0;
        if ((i & 8) != 0) {
            z2 = false;
        }
        if (iOException != null) {
            w47Var.f(iOException);
        }
        if (z2) {
            tz6 tz6Var = ((f4e) w47Var.c).I;
            if (iOException != null) {
                tz6Var.r((f4e) w47Var.c, iOException);
            } else {
                tz6Var.p((f4e) w47Var.c, j);
            }
        }
        if (z3) {
            tz6 tz6Var2 = ((f4e) w47Var.c).I;
            if (iOException != null) {
                tz6Var2.w((f4e) w47Var.c, iOException);
            } else {
                tz6Var2.u((f4e) w47Var.c, j);
            }
        }
        return ((f4e) w47Var.c).i(w47Var, z2 && !z, z3 && !z, z3 && z, z2 && z, iOException);
    }

    public u47 b(kie kieVar, boolean z) {
        kieVar.getClass();
        this.a = z;
        tie tieVar = kieVar.d;
        tieVar.getClass();
        long jContentLength = tieVar.contentLength();
        ((f4e) this.c).I.q((f4e) this.c);
        return new u47(this, ((y47) this.e).f(kieVar, jContentLength), jContentLength, false);
    }

    public g4e c() {
        x47 x47VarK = ((y47) this.e).k();
        g4e g4eVar = x47VarK instanceof g4e ? (g4e) x47VarK : null;
        if (g4eVar != null) {
            return g4eVar;
        }
        sz6.j("no connection for CONNECT tunnels");
        return null;
    }

    public y4e d(pqe pqeVar) throws IOException {
        w47 w47Var;
        String strA;
        long jE;
        try {
            strA = pqeVar.J.a("Content-Type");
            if (strA == null) {
                strA = null;
            }
            jE = ((y47) this.e).e(pqeVar);
            w47Var = this;
        } catch (IOException e) {
            e = e;
            w47Var = this;
        }
        try {
            return new y4e(strA, jE, new RealBufferedSource(new v47(w47Var, ((y47) this.e).a(pqeVar), jE, false)));
        } catch (IOException e2) {
            e = e2;
            IOException iOException = e;
            ((f4e) w47Var.c).I.w((f4e) w47Var.c, iOException);
            w47Var.f(iOException);
            throw iOException;
        }
    }

    public nqe e(boolean z) throws IOException {
        try {
            nqe nqeVarG = ((y47) this.e).g(z);
            if (nqeVarG == null) {
                return nqeVarG;
            }
            nqeVarG.n = this;
            return nqeVarG;
        } catch (IOException e) {
            ((f4e) this.c).I.w((f4e) this.c, e);
            f(e);
            throw e;
        }
    }

    public void f(IOException iOException) {
        this.b = true;
        ((y47) this.e).k().f((f4e) this.c, iOException);
    }

    public xv8 g() throws SocketException {
        f4e f4eVar = (f4e) this.c;
        if (f4eVar.O) {
            sz6.j("Check failed.");
            return null;
        }
        f4eVar.O = true;
        f4eVar.J.l();
        synchronized (f4eVar) {
            if (f4eVar.W == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (f4eVar.S || f4eVar.T) {
                throw new IllegalStateException("Check failed.");
            }
            if (f4eVar.Q) {
                throw new IllegalStateException("Check failed.");
            }
            if (!f4eVar.R) {
                throw new IllegalStateException("Check failed.");
            }
            f4eVar.R = false;
            f4eVar.S = true;
            f4eVar.T = true;
        }
        x47 x47VarK = ((y47) this.e).k();
        x47VarK.getClass();
        g4e g4eVar = (g4e) x47VarK;
        g4eVar.e.setSoTimeout(0);
        g4eVar.e();
        return new xv8(this);
    }

    public void h(kie kieVar) throws IOException {
        kieVar.getClass();
        try {
            ((f4e) this.c).I.t((f4e) this.c);
            ((y47) this.e).b(kieVar);
            ((f4e) this.c).I.s((f4e) this.c, kieVar);
        } catch (IOException e) {
            ((f4e) this.c).I.r((f4e) this.c, e);
            f(e);
            throw e;
        }
    }

    public w47(f4e f4eVar, z47 z47Var, y47 y47Var) {
        z47Var.getClass();
        this.c = f4eVar;
        this.d = z47Var;
        this.e = y47Var;
    }
}
