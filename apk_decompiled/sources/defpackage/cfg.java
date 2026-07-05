package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class cfg {
    public final int a;
    public final int b;
    public final int c;

    public cfg(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static cfg a(int i, int i2, int i3) {
        return new cfg(i, i2, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && cfg.class == obj.getClass()) {
            cfg cfgVar = (cfg) obj;
            if (this.a == cfgVar.a && this.b == cfgVar.b && this.c == cfgVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SourceSpan{line=");
        sb.append(this.a);
        sb.append(", column=");
        sb.append(this.b);
        sb.append(", length=");
        return vb7.l(this.c, "}", sb);
    }
}
