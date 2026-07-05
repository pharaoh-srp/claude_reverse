package io.sentry;

import defpackage.ij0;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class v7 implements m2 {
    public final io.sentry.protocol.w E;
    public final String F;
    public final String G;
    public final String H;
    public HashMap I;

    public v7(io.sentry.protocol.w wVar, String str, String str2, String str3) {
        this.E = wVar;
        this.F = str;
        this.G = str2;
        this.H = str3;
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) {
        y yVar = (y) q3Var;
        yVar.n();
        yVar.r("event_id");
        this.E.serialize(yVar, a1Var);
        String str = this.F;
        if (str != null) {
            yVar.r("name");
            yVar.A(str);
        }
        String str2 = this.G;
        if (str2 != null) {
            yVar.r("email");
            yVar.A(str2);
        }
        String str3 = this.H;
        if (str3 != null) {
            yVar.r("comments");
            yVar.A(str3);
        }
        HashMap map = this.I;
        if (map != null) {
            for (String str4 : map.keySet()) {
                e.a(this.I, str4, yVar, str4, a1Var);
            }
        }
        yVar.p();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserFeedback{eventId=");
        sb.append(this.E);
        sb.append(", name='");
        sb.append(this.F);
        sb.append("', email='");
        sb.append(this.G);
        sb.append("', comments='");
        return ij0.m(sb, this.H, "'}");
    }
}
