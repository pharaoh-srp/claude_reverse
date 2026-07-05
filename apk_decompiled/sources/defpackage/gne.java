package defpackage;

import com.anthropic.claude.api.common.WindowStatus;

/* JADX INFO: loaded from: classes2.dex */
public final class gne {
    public final b5a a;
    public final WindowStatus b;

    public gne(b5a b5aVar, WindowStatus windowStatus) {
        b5aVar.getClass();
        windowStatus.getClass();
        this.a = b5aVar;
        this.b = windowStatus;
    }

    public final WindowStatus a() {
        return this.b;
    }

    public final b5a b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gne)) {
            return false;
        }
        gne gneVar = (gne) obj;
        return this.a == gneVar.a && x44.r(this.b, gneVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ResolvedLimitWindow(windowName=" + this.a + ", status=" + this.b + ")";
    }
}
