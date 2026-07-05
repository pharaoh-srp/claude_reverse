package defpackage;

import com.anthropic.claude.api.common.RateLimit;

/* JADX INFO: loaded from: classes3.dex */
public final class vuf implements fvf {
    public final RateLimit a;

    public vuf(RateLimit rateLimit) {
        rateLimit.getClass();
        this.a = rateLimit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vuf) && x44.r(this.a, ((vuf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RateLimitChanged(rateLimit=" + this.a + ")";
    }
}
