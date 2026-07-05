package io.sentry.profilemeasurements;

import io.sentry.a1;
import io.sentry.e;
import io.sentry.m2;
import io.sentry.p;
import io.sentry.q3;
import io.sentry.y;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a implements m2 {
    public ConcurrentHashMap E;
    public String F;
    public Collection G;

    public a(String str, AbstractCollection abstractCollection) {
        this.F = str;
        this.G = abstractCollection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return p.h(this.E, aVar.E) && this.F.equals(aVar.F) && new ArrayList(this.G).equals(new ArrayList(aVar.G));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E, this.F, this.G});
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) {
        y yVar = (y) q3Var;
        yVar.n();
        yVar.r("unit");
        yVar.x(a1Var, this.F);
        yVar.r("values");
        yVar.x(a1Var, this.G);
        ConcurrentHashMap concurrentHashMap = this.E;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                e.b(this.E, str, yVar, str, a1Var);
            }
        }
        yVar.p();
    }
}
