package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ph extends of {
    public final int c;
    public final wg d;

    public ph(int i, wg wgVar) {
        this.c = i;
        this.d = wgVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ph)) {
            return false;
        }
        ph phVar = (ph) obj;
        return phVar.c == this.c && phVar.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.c), this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesGcmSiv Parameters (variant: ");
        sb.append(this.d);
        sb.append(", ");
        return vb7.l(this.c, "-byte key)", sb);
    }
}
