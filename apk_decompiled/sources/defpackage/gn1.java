package defpackage;

import android.os.SystemClock;
import com.anthropic.claude.bell.api.BellApiClientMessage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gn1 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ tn1 F;

    public /* synthetic */ gn1(tn1 tn1Var, int i) {
        this.E = i;
        this.F = tn1Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        Long lValueOf;
        BellApiClientMessage.ClientMetrics clientMetricsA;
        int i = this.E;
        tn1 tn1Var = this.F;
        switch (i) {
            case 0:
                return Boolean.valueOf(tn1Var.v() || tn1Var.w());
            case 1:
                Boolean bool = (Boolean) tn1Var.g.m.getValue();
                bool.getClass();
                return bool;
            case 2:
                g5j g5jVar = tn1Var.B;
                if (g5jVar != null) {
                    synchronized (g5jVar) {
                        if (g5jVar.u == null) {
                            g5jVar.u = (Long) g5jVar.f.a();
                        }
                    }
                }
                cp3 cp3Var = tn1Var.C;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                synchronized (cp3Var) {
                    Long l = (Long) cp3Var.e;
                    if (l != null && !cp3Var.c) {
                        long jLongValue = jElapsedRealtime - l.longValue();
                        if (jLongValue >= 0) {
                            cp3Var.c = true;
                            lValueOf = Long.valueOf(jLongValue);
                        }
                    }
                    lValueOf = null;
                }
                if (lValueOf != null && (clientMetricsA = dp3.a(((Boolean) tn1Var.g.q.getValue()).booleanValue(), lValueOf, null, 4)) != null) {
                    tn1Var.s.b(clientMetricsA);
                }
                return iei.a;
            case 3:
                if (!tn1Var.v() && !tn1Var.w() && !tn1Var.q().b && ((fj1) tn1Var.U.getValue()) == fj1.G) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                if (!tn1Var.v() && !tn1Var.w() && !tn1Var.q().b && (tn1Var.q().f || tn1Var.q().g || tn1Var.q().h)) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
