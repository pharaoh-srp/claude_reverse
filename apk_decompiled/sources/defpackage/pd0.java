package defpackage;

import com.anthropic.claude.protos.push.OpenCodeSessionRequest;

/* JADX INFO: loaded from: classes3.dex */
public final class pd0 {
    public final OpenCodeSessionRequest a;
    public final boolean b;

    public pd0(OpenCodeSessionRequest openCodeSessionRequest, boolean z) {
        openCodeSessionRequest.getClass();
        this.a = openCodeSessionRequest;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pd0)) {
            return false;
        }
        pd0 pd0Var = (pd0) obj;
        return x44.r(this.a, pd0Var.a) && this.b == pd0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CodeSessionPush(request=" + this.a + ", isCoworkSession=" + this.b + ")";
    }
}
