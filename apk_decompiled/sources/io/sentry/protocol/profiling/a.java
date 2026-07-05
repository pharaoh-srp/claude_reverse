package io.sentry.protocol.profiling;

import io.sentry.a1;
import io.sentry.e;
import io.sentry.m2;
import io.sentry.q3;
import io.sentry.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements m2 {
    public List E = new ArrayList();
    public List F = new ArrayList();
    public List G = new ArrayList();
    public Map H = new HashMap();
    public ConcurrentHashMap I;

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) {
        y yVar = (y) q3Var;
        yVar.n();
        yVar.r("samples");
        yVar.x(a1Var, this.E);
        yVar.r("stacks");
        yVar.x(a1Var, this.F);
        yVar.r("frames");
        yVar.x(a1Var, this.G);
        yVar.r("thread_metadata");
        yVar.x(a1Var, this.H);
        ConcurrentHashMap concurrentHashMap = this.I;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                e.b(this.I, str, yVar, str, a1Var);
            }
        }
        yVar.p();
    }
}
