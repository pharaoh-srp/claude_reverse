package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class i51 {
    public static final i51 e = new i51(-1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public i51(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = tpi.y(i3) ? tpi.n(i3) * i2 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i51)) {
            return false;
        }
        i51 i51Var = (i51) obj;
        return this.a == i51Var.a && this.b == i51Var.b && this.c == i51Var.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
        sb.append(this.a);
        sb.append(", channelCount=");
        sb.append(this.b);
        sb.append(", encoding=");
        return vb7.r(sb, this.c, ']');
    }
}
