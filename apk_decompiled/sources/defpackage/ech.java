package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ech implements fe0 {
    public static final ech F = new ech(null);
    public final String E;

    public /* synthetic */ ech(String str) {
        this.E = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ech) {
            return gb9.v(this.E, ((ech) obj).E);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E});
    }
}
