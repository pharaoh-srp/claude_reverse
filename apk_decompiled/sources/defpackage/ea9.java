package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ea9 extends ja9 {
    public final boolean a;
    public final long b;
    public final long c;
    public final boolean d;
    public final int e;

    public ea9(boolean z, long j, long j2, boolean z2, int i) {
        this.a = z;
        this.b = j;
        this.c = j2;
        this.d = z2;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea9)) {
            return false;
        }
        ea9 ea9Var = (ea9) obj;
        return this.a == ea9Var.a && this.b == ea9Var.b && this.c == ea9Var.c && this.d == ea9Var.d && this.e == ea9Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + fsh.p(fsh.p(vb7.e(vb7.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configuration(trackErrors=");
        sb.append(this.a);
        sb.append(", batchSize=");
        sb.append(this.b);
        ij0.u(this.c, ", batchUploadFrequency=", ", useProxy=", sb);
        sb.append(this.d);
        sb.append(", useLocalEncryption=false, batchProcessingLevel=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
