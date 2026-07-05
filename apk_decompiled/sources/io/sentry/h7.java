package io.sentry;

import java.io.IOException;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class h7 implements m2 {
    public final Date E;
    public Date F;
    public final AtomicInteger G;
    public final String H;
    public final String I;
    public Boolean J;
    public g7 K;
    public Long L;
    public Double M;
    public final String N;
    public String O;
    public final String P;
    public final String Q;
    public String R;
    public final io.sentry.util.a S = new io.sentry.util.a();
    public ConcurrentHashMap T;

    public h7(g7 g7Var, Date date, Date date2, int i, String str, String str2, Boolean bool, Long l, Double d, String str3, String str4, String str5, String str6, String str7) {
        this.K = g7Var;
        this.E = date;
        this.F = date2;
        this.G = new AtomicInteger(i);
        this.H = str;
        this.I = str2;
        this.J = bool;
        this.L = l;
        this.M = d;
        this.N = str3;
        this.O = str4;
        this.P = str5;
        this.Q = str6;
        this.R = str7;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final h7 clone() {
        return new h7(this.K, this.E, this.F, this.G.get(), this.H, this.I, this.J, this.L, this.M, this.N, this.O, this.P, this.Q, this.R);
    }

    public final void b(Date date) {
        v vVarA = this.S.a();
        try {
            this.J = null;
            if (this.K == g7.Ok) {
                this.K = g7.Exited;
            }
            if (date != null) {
                this.F = date;
            } else {
                this.F = p.k();
            }
            if (this.F != null) {
                this.M = Double.valueOf(Math.abs(r6.getTime() - this.E.getTime()) / 1000.0d);
                long time = this.F.getTime();
                if (time < 0) {
                    time = Math.abs(time);
                }
                this.L = Long.valueOf(time);
            }
            vVarA.close();
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final Date c() {
        Date date = this.E;
        if (date == null) {
            return null;
        }
        return (Date) date.clone();
    }

    public final boolean d(g7 g7Var, String str, boolean z, String str2) {
        boolean z2;
        v vVarA = this.S.a();
        boolean z3 = true;
        if (g7Var != null) {
            try {
                this.K = g7Var;
                z2 = true;
            } catch (Throwable th) {
                try {
                    vVarA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            z2 = false;
        }
        if (str != null) {
            this.O = str;
            z2 = true;
        }
        if (z) {
            this.G.addAndGet(1);
            z2 = true;
        }
        if (str2 != null) {
            this.R = str2;
        } else {
            z3 = z2;
        }
        if (z3) {
            this.J = null;
            Date dateK = p.k();
            this.F = dateK;
            if (dateK != null) {
                long time = dateK.getTime();
                if (time < 0) {
                    time = Math.abs(time);
                }
                this.L = Long.valueOf(time);
            }
        }
        vVarA.close();
        return z3;
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) throws IOException {
        y yVar = (y) q3Var;
        yVar.n();
        String str = this.I;
        if (str != null) {
            yVar.r("sid");
            yVar.A(str);
        }
        String str2 = this.H;
        if (str2 != null) {
            yVar.r("did");
            yVar.A(str2);
        }
        if (this.J != null) {
            yVar.r("init");
            yVar.y(this.J);
        }
        yVar.r("started");
        yVar.x(a1Var, this.E);
        yVar.r("status");
        yVar.x(a1Var, this.K.name().toLowerCase(Locale.ROOT));
        if (this.L != null) {
            yVar.r("seq");
            yVar.z(this.L);
        }
        yVar.r("errors");
        yVar.w(this.G.intValue());
        if (this.M != null) {
            yVar.r("duration");
            yVar.z(this.M);
        }
        if (this.F != null) {
            yVar.r("timestamp");
            yVar.x(a1Var, this.F);
        }
        if (this.R != null) {
            yVar.r("abnormal_mechanism");
            yVar.x(a1Var, this.R);
        }
        yVar.r("attrs");
        yVar.n();
        yVar.r(BuildConfig.BUILD_TYPE);
        yVar.x(a1Var, this.Q);
        String str3 = this.P;
        if (str3 != null) {
            yVar.r("environment");
            yVar.x(a1Var, str3);
        }
        String str4 = this.N;
        if (str4 != null) {
            yVar.r("ip_address");
            yVar.x(a1Var, str4);
        }
        if (this.O != null) {
            yVar.r("user_agent");
            yVar.x(a1Var, this.O);
        }
        yVar.p();
        ConcurrentHashMap concurrentHashMap = this.T;
        if (concurrentHashMap != null) {
            for (String str5 : concurrentHashMap.keySet()) {
                e.b(this.T, str5, yVar, str5, a1Var);
            }
        }
        yVar.p();
    }
}
