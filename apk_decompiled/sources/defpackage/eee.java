package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eee extends fwj {
    public final fwj l;
    public final int m;

    public eee(fwj fwjVar, int i) {
        this.l = fwjVar;
        this.m = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eee)) {
            return false;
        }
        eee eeeVar = (eee) obj;
        return eeeVar.l.equals(this.l) && eeeVar.m == this.m;
    }

    public final int hashCode() {
        return this.l.hashCode() + (this.m * 31);
    }
}
