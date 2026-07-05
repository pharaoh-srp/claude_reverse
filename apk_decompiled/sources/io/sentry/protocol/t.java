package io.sentry.protocol;

import io.sentry.a1;
import io.sentry.m2;
import io.sentry.q3;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class t implements m2 {
    public String E;
    public Integer F;
    public Integer G;
    public Integer H;
    public HashMap I;

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) throws IOException {
        io.sentry.y yVar = (io.sentry.y) q3Var;
        yVar.n();
        if (this.E != null) {
            yVar.r("sdk_name");
            yVar.A(this.E);
        }
        if (this.F != null) {
            yVar.r("version_major");
            yVar.z(this.F);
        }
        if (this.G != null) {
            yVar.r("version_minor");
            yVar.z(this.G);
        }
        if (this.H != null) {
            yVar.r("version_patchlevel");
            yVar.z(this.H);
        }
        HashMap map = this.I;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.e.a(this.I, str, yVar, str, a1Var);
            }
        }
        yVar.p();
    }
}
