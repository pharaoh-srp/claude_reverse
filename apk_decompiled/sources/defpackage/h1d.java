package defpackage;

import com.anthropic.claude.tool.model.PhoneCallCompletedOutput;

/* JADX INFO: loaded from: classes3.dex */
public final class h1d implements j1d {
    public final PhoneCallCompletedOutput a;

    public h1d(PhoneCallCompletedOutput phoneCallCompletedOutput) {
        phoneCallCompletedOutput.getClass();
        this.a = phoneCallCompletedOutput;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h1d) && x44.r(this.a, ((h1d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Parsed(result=" + this.a + ")";
    }
}
