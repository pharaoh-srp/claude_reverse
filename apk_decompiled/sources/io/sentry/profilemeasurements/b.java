package io.sentry.profilemeasurements;

import com.anthropic.claude.api.experience.ExperienceToggle;
import io.sentry.a1;
import io.sentry.e;
import io.sentry.m2;
import io.sentry.p;
import io.sentry.q3;
import io.sentry.y;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b implements m2 {
    public ConcurrentHashMap E;
    public double F;
    public String G;
    public double H;

    public b(Long l, Number number, long j) {
        this.G = l.toString();
        this.H = number.doubleValue();
        this.F = j / 1.0E9d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return p.h(this.E, bVar.E) && this.G.equals(bVar.G) && this.H == bVar.H && this.F == bVar.F;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E, this.G, Double.valueOf(this.H)});
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) {
        y yVar = (y) q3Var;
        yVar.n();
        yVar.r(ExperienceToggle.DEFAULT_PARAM_KEY);
        yVar.x(a1Var, Double.valueOf(this.H));
        yVar.r("elapsed_since_start_ns");
        yVar.x(a1Var, this.G);
        yVar.r("timestamp");
        yVar.x(a1Var, BigDecimal.valueOf(this.F).setScale(6, RoundingMode.DOWN));
        ConcurrentHashMap concurrentHashMap = this.E;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                e.b(this.E, str, yVar, str, a1Var);
            }
        }
        yVar.p();
    }
}
