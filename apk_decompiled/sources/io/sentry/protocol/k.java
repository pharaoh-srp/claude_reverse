package io.sentry.protocol;

import com.pvporbit.freetype.FreeTypeConstants;
import io.sentry.a1;
import io.sentry.m2;
import io.sentry.q3;
import java.util.AbstractMap;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class k implements m2 {
    public String E;
    public String F;
    public String G;
    public w H;
    public w I;
    public String J;
    public AbstractMap K;

    public k(String str) {
        if (str.length() > 4096) {
            this.E = str.substring(0, FreeTypeConstants.FT_LOAD_MONOCHROME);
        } else {
            this.E = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return io.sentry.p.h(this.E, kVar.E) && io.sentry.p.h(this.F, kVar.F) && io.sentry.p.h(this.G, kVar.G) && io.sentry.p.h(this.H, kVar.H) && io.sentry.p.h(this.I, kVar.I) && io.sentry.p.h(this.J, kVar.J) && io.sentry.p.h(this.K, kVar.K);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E, this.F, this.G, this.H, this.I, this.J, this.K});
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) {
        io.sentry.y yVar = (io.sentry.y) q3Var;
        yVar.n();
        yVar.r("message");
        yVar.A(this.E);
        if (this.F != null) {
            yVar.r("contact_email");
            yVar.A(this.F);
        }
        if (this.G != null) {
            yVar.r("name");
            yVar.A(this.G);
        }
        if (this.H != null) {
            yVar.r("associated_event_id");
            this.H.serialize(yVar, a1Var);
        }
        if (this.I != null) {
            yVar.r("replay_id");
            this.I.serialize(yVar, a1Var);
        }
        if (this.J != null) {
            yVar.r("url");
            yVar.A(this.J);
        }
        AbstractMap abstractMap = this.K;
        if (abstractMap != null) {
            for (String str : abstractMap.keySet()) {
                Object obj = this.K.get(str);
                yVar.r(str);
                yVar.x(a1Var, obj);
            }
        }
        yVar.p();
    }

    public final String toString() {
        return "Feedback{message='" + this.E + "', contactEmail='" + this.F + "', name='" + this.G + "', associatedEventId=" + this.H + ", replayId=" + this.I + ", url='" + this.J + "', unknown=" + this.K + '}';
    }
}
