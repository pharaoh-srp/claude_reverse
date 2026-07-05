package io.sentry;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y6 extends w4 implements m2 {
    public File T;
    public int X;
    public Date Z;
    public HashMap d0;
    public io.sentry.protocol.w W = new io.sentry.protocol.w();
    public String U = "replay_event";
    public x6 V = x6.SESSION;
    public List b0 = new ArrayList();
    public List c0 = new ArrayList();
    public List a0 = new ArrayList();
    public Date Y = p.k();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y6.class == obj.getClass()) {
            y6 y6Var = (y6) obj;
            if (this.X == y6Var.X && p.h(this.U, y6Var.U) && this.V == y6Var.V && p.h(this.W, y6Var.W) && p.h(this.a0, y6Var.a0) && p.h(this.b0, y6Var.b0) && p.h(this.c0, y6Var.c0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.U, this.V, this.W, Integer.valueOf(this.X), this.a0, this.b0, this.c0});
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) {
        y yVar = (y) q3Var;
        yVar.n();
        yVar.r("type");
        yVar.A(this.U);
        yVar.r("replay_type");
        yVar.x(a1Var, this.V);
        yVar.r("segment_id");
        yVar.w(this.X);
        yVar.r("timestamp");
        yVar.x(a1Var, this.Y);
        if (this.W != null) {
            yVar.r("replay_id");
            yVar.x(a1Var, this.W);
        }
        if (this.Z != null) {
            yVar.r("replay_start_timestamp");
            yVar.x(a1Var, this.Z);
        }
        if (this.a0 != null) {
            yVar.r("urls");
            yVar.x(a1Var, this.a0);
        }
        if (this.b0 != null) {
            yVar.r("error_ids");
            yVar.x(a1Var, this.b0);
        }
        if (this.c0 != null) {
            yVar.r("trace_ids");
            yVar.x(a1Var, this.c0);
        }
        io.sentry.config.a.E(this, yVar, a1Var);
        HashMap map = this.d0;
        if (map != null) {
            for (String str : map.keySet()) {
                e.a(this.d0, str, yVar, str, a1Var);
            }
        }
        yVar.p();
    }
}
