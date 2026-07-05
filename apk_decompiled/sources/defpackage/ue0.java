package defpackage;

import com.anthropic.claude.types.environment.AppEnvironment;

/* JADX INFO: loaded from: classes.dex */
public final class ue0 extends ze0 {
    public static final ue0 g = new ue0("http://10.0.2.2:8000", AppEnvironment.DEVELOPMENT, true, null, 24);

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ue0);
    }

    public final int hashCode() {
        return 54330509;
    }

    public final String toString() {
        return "AndroidEmulatorLocalhost";
    }
}
