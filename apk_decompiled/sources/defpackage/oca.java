package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class oca {
    public final long a;
    public final float b;
    public final long c;

    public oca(nca ncaVar) {
        this.a = ncaVar.a;
        this.b = ncaVar.b;
        this.c = ncaVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oca)) {
            return false;
        }
        oca ocaVar = (oca) obj;
        return this.a == ocaVar.a && this.b == ocaVar.b && this.c == ocaVar.c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c));
    }
}
