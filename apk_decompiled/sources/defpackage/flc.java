package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class flc extends knk {
    public final l9e k;

    public flc(l9e l9eVar) {
        this.k = l9eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof flc) {
            return this.k.equals(((flc) obj).k);
        }
        return false;
    }

    public final int hashCode() {
        return this.k.hashCode();
    }

    @Override // defpackage.knk
    public final l9e w() {
        return this.k;
    }
}
