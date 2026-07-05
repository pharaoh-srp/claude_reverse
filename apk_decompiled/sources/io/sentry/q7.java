package io.sentry;

import defpackage.mr9;

/* JADX INFO: loaded from: classes.dex */
public final class q7 {
    public final w6 a;

    public q7(w6 w6Var) {
        this.a = w6Var;
    }

    public final r7 a(y yVar) {
        Double dZ;
        Double d = (Double) yVar.G;
        s7 s7Var = (s7) yVar.F;
        r7 r7Var = s7Var.H;
        if (r7Var != null) {
            return p.b(r7Var);
        }
        w6 w6Var = this.a;
        w6Var.getProfilesSampler();
        Double profilesSampleRate = w6Var.getProfilesSampleRate();
        Boolean boolValueOf = Boolean.valueOf(profilesSampleRate != null && profilesSampleRate.doubleValue() >= d.doubleValue());
        if (w6Var.getTracesSampler() != null) {
            try {
                dZ = ((mr9) w6Var.getTracesSampler()).z(yVar);
            } catch (Throwable th) {
                w6Var.getLogger().d(t5.ERROR, "Error in the 'TracesSamplerCallback' callback.", th);
                dZ = null;
            }
            if (dZ != null) {
                return new r7(Boolean.valueOf(dZ.doubleValue() >= d.doubleValue()), dZ, d, boolValueOf, profilesSampleRate);
            }
        }
        r7 r7Var2 = s7Var.V;
        if (r7Var2 != null) {
            return p.b(r7Var2);
        }
        Double tracesSampleRate = w6Var.getTracesSampleRate();
        Double dValueOf = tracesSampleRate != null ? Double.valueOf(tracesSampleRate.doubleValue() / Math.pow(2.0d, w6Var.getBackpressureMonitor().a())) : null;
        if (dValueOf != null) {
            return new r7(Boolean.valueOf(dValueOf.doubleValue() >= d.doubleValue()), dValueOf, d, boolValueOf, profilesSampleRate);
        }
        Boolean bool = Boolean.FALSE;
        return new r7(bool, null, d, bool, null);
    }
}
