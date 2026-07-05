package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ycd extends kjc {
    public final Object E;

    public ycd(Object obj) {
        this.E = obj;
    }

    @Override // defpackage.kjc
    public final Object a() {
        return this.E;
    }

    @Override // defpackage.kjc
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ycd) {
            return this.E.equals(((ycd) obj).E);
        }
        return false;
    }

    public final int hashCode() {
        return this.E.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.E + ")";
    }
}
