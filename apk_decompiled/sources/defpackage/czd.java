package defpackage;

import com.squareup.wire.AnyMessage;

/* JADX INFO: loaded from: classes3.dex */
public final class czd {
    public final ujb a;
    public final AnyMessage b;

    public czd(ujb ujbVar, AnyMessage anyMessage) {
        this.a = ujbVar;
        this.b = anyMessage;
    }

    public final ujb a() {
        return this.a;
    }

    public final AnyMessage b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof czd)) {
            return false;
        }
        czd czdVar = (czd) obj;
        return this.a.equals(czdVar.a) && this.b.equals(czdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Operation(method=" + this.a + ", rawRequest=" + this.b + ")";
    }
}
