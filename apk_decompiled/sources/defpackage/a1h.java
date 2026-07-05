package defpackage;

import com.segment.analytics.kotlin.core.Settings;
import com.segment.analytics.kotlin.core.c;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class a1h implements vlg {
    public static final c Companion = new c();
    public final eg4 a;
    public final Settings b;
    public final boolean c;
    public final Set d;
    public final boolean e;

    public a1h(eg4 eg4Var, Settings settings, boolean z, Set set, boolean z2) {
        this.a = eg4Var;
        this.b = settings;
        this.c = z;
        this.d = set;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1h)) {
            return false;
        }
        a1h a1hVar = (a1h) obj;
        return this.a.equals(a1hVar.a) && x44.r(this.b, a1hVar.b) && this.c == a1hVar.c && this.d.equals(a1hVar.d) && this.e == a1hVar.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Settings settings = this.b;
        int iHashCode2 = (iHashCode + (settings == null ? 0 : settings.hashCode())) * 31;
        boolean z = this.c;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int iHashCode3 = (this.d.hashCode() + ((iHashCode2 + r2) * 31)) * 31;
        boolean z2 = this.e;
        return iHashCode3 + (z2 ? 1 : z2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("System(configuration=");
        sb.append(this.a);
        sb.append(", settings=");
        sb.append(this.b);
        sb.append(", running=");
        sb.append(this.c);
        sb.append(", initializedPlugins=");
        sb.append(this.d);
        sb.append(", enabled=");
        return y6a.p(sb, this.e, ')');
    }
}
