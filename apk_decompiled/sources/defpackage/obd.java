package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class obd extends sf5 {
    public final Object g;
    public final long h;

    public obd(Object obj, long j) {
        this.g = obj;
        this.h = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof obd)) {
            return false;
        }
        obd obdVar = (obd) obj;
        return this.g.equals(obdVar.g) && this.h == obdVar.h;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + (this.g.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PredictiveBackHandlerInfo(owner=");
        sb.append(this.g);
        sb.append(", compositeKey=");
        return ebh.p(sb, this.h, ')');
    }
}
