package defpackage;

import com.anthropic.claude.api.account.BootstrapResponse;

/* JADX INFO: loaded from: classes.dex */
public final class k78 implements l78 {
    public final BootstrapResponse a;

    public k78(BootstrapResponse bootstrapResponse) {
        bootstrapResponse.getClass();
        this.a = bootstrapResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k78) && x44.r(this.a, ((k78) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(response=" + this.a + ")";
    }
}
