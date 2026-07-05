package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pue {
    public final vsk a;
    public final rsk b;
    public final ssk c;
    public final psk d;

    public pue(vsk vskVar, rsk rskVar, ssk sskVar, psk pskVar) {
        this.a = vskVar;
        this.b = rskVar;
        this.c = sskVar;
        this.d = pskVar;
    }

    public final psk a() {
        return this.d;
    }

    public final rsk b() {
        return this.b;
    }

    public final ssk c() {
        return this.c;
    }

    public final vsk d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pue)) {
            return false;
        }
        pue pueVar = (pue) obj;
        return this.a.equals(pueVar.a) && this.b.equals(pueVar.b) && this.c.equals(pueVar.c) && this.d.equals(pueVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
