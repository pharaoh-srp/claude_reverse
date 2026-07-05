package defpackage;

import com.anthropic.claude.types.environment.AppEnvironment;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ve0 extends ze0 {
    public final String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve0(String str) {
        super(str, AppEnvironment.DEVELOPMENT, true, (Set) null, 24);
        str.getClass();
        this.g = str;
    }

    @Override // defpackage.ze0
    public final String a() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ve0) && x44.r(this.g, ((ve0) obj).g);
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final String toString() {
        return ij0.j("Custom(url=", this.g, ")");
    }
}
