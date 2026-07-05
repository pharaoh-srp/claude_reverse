package io.sentry.rrweb;

import io.sentry.a1;
import io.sentry.m2;
import io.sentry.p;
import io.sentry.q3;
import io.sentry.y;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class m extends b implements m2 {
    public String G;
    public int H;
    public long I;
    public long J;
    public String K;
    public String L;
    public int M;
    public int N;
    public int O;
    public String P;
    public int Q;
    public int R;
    public int S;
    public HashMap T;
    public ConcurrentHashMap U;
    public ConcurrentHashMap V;

    public m() {
        super(c.Custom);
        this.K = "h264";
        this.L = "mp4";
        this.P = "constant";
        this.G = "video";
    }

    @Override // io.sentry.rrweb.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        m mVar = (m) obj;
        return this.H == mVar.H && this.I == mVar.I && this.J == mVar.J && this.M == mVar.M && this.N == mVar.N && this.O == mVar.O && this.Q == mVar.Q && this.R == mVar.R && this.S == mVar.S && p.h(this.G, mVar.G) && p.h(this.K, mVar.K) && p.h(this.L, mVar.L) && p.h(this.P, mVar.P);
    }

    @Override // io.sentry.rrweb.b
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.G, Integer.valueOf(this.H), Long.valueOf(this.I), Long.valueOf(this.J), this.K, this.L, Integer.valueOf(this.M), Integer.valueOf(this.N), Integer.valueOf(this.O), this.P, Integer.valueOf(this.Q), Integer.valueOf(this.R), Integer.valueOf(this.S)});
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) {
        y yVar = (y) q3Var;
        yVar.n();
        io.sentry.config.a.F(this, yVar, a1Var);
        yVar.r("data");
        yVar.n();
        yVar.r("tag");
        yVar.A(this.G);
        yVar.r("payload");
        yVar.n();
        yVar.r("segmentId");
        yVar.w(this.H);
        yVar.r("size");
        yVar.w(this.I);
        yVar.r("duration");
        yVar.w(this.J);
        yVar.r("encoding");
        yVar.A(this.K);
        yVar.r("container");
        yVar.A(this.L);
        yVar.r("height");
        yVar.w(this.M);
        yVar.r("width");
        yVar.w(this.N);
        yVar.r("frameCount");
        yVar.w(this.O);
        yVar.r("frameRate");
        yVar.w(this.Q);
        yVar.r("frameRateType");
        yVar.A(this.P);
        yVar.r("left");
        yVar.w(this.R);
        yVar.r("top");
        yVar.w(this.S);
        ConcurrentHashMap concurrentHashMap = this.U;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.U, str, yVar, str, a1Var);
            }
        }
        yVar.p();
        ConcurrentHashMap concurrentHashMap2 = this.V;
        if (concurrentHashMap2 != null) {
            for (String str2 : concurrentHashMap2.keySet()) {
                io.sentry.e.b(this.V, str2, yVar, str2, a1Var);
            }
        }
        yVar.p();
        HashMap map = this.T;
        if (map != null) {
            for (String str3 : map.keySet()) {
                io.sentry.e.a(this.T, str3, yVar, str3, a1Var);
            }
        }
        yVar.p();
    }
}
