package io.sentry;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class j5 extends w4 implements m2 {
    public Date T;
    public io.sentry.protocol.p U;
    public String V;
    public j2 W;
    public j2 X;
    public t5 Y;
    public String Z;
    public List a0;
    public ConcurrentHashMap b0;
    public AbstractMap c0;

    public j5() {
        io.sentry.protocol.w wVar = new io.sentry.protocol.w();
        Date dateK = p.k();
        super(wVar);
        this.T = dateK;
    }

    public final ArrayList e() {
        j2 j2Var = this.X;
        if (j2Var == null) {
            return null;
        }
        return j2Var.b();
    }

    public final ArrayList f() {
        j2 j2Var = this.W;
        if (j2Var != null) {
            return j2Var.b();
        }
        return null;
    }

    public final io.sentry.protocol.v g() {
        Boolean bool;
        j2 j2Var = this.X;
        if (j2Var == null) {
            return null;
        }
        for (io.sentry.protocol.v vVar : j2Var.b()) {
            io.sentry.protocol.o oVar = vVar.J;
            if (oVar != null && (bool = oVar.H) != null && !bool.booleanValue()) {
                return vVar;
            }
        }
        return null;
    }

    public final boolean h() {
        j2 j2Var = this.X;
        return (j2Var == null || j2Var.b().isEmpty()) ? false : true;
    }

    public final void i(List list) {
        this.a0 = list != null ? new ArrayList(list) : null;
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) {
        y yVar = (y) q3Var;
        yVar.n();
        yVar.r("timestamp");
        yVar.x(a1Var, this.T);
        if (this.U != null) {
            yVar.r("message");
            yVar.x(a1Var, this.U);
        }
        if (this.V != null) {
            yVar.r("logger");
            yVar.A(this.V);
        }
        j2 j2Var = this.W;
        if (j2Var != null && !j2Var.b().isEmpty()) {
            yVar.r("threads");
            yVar.n();
            yVar.r("values");
            yVar.x(a1Var, this.W.b());
            yVar.p();
        }
        j2 j2Var2 = this.X;
        if (j2Var2 != null && !j2Var2.b().isEmpty()) {
            yVar.r("exception");
            yVar.n();
            yVar.r("values");
            yVar.x(a1Var, this.X.b());
            yVar.p();
        }
        if (this.Y != null) {
            yVar.r("level");
            yVar.x(a1Var, this.Y);
        }
        if (this.Z != null) {
            yVar.r("transaction");
            yVar.A(this.Z);
        }
        if (this.a0 != null) {
            yVar.r("fingerprint");
            yVar.x(a1Var, this.a0);
        }
        if (this.c0 != null) {
            yVar.r("modules");
            yVar.x(a1Var, this.c0);
        }
        io.sentry.config.a.E(this, yVar, a1Var);
        ConcurrentHashMap concurrentHashMap = this.b0;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                e.b(this.b0, str, yVar, str, a1Var);
            }
        }
        yVar.p();
    }

    public j5(Throwable th) {
        this();
        this.N = th;
    }
}
