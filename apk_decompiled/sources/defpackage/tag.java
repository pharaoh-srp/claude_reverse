package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class tag implements ie4, Iterable, mm9 {
    public final sag E;
    public final int F;
    public final int G;

    public tag(sag sagVar, int i, int i2) {
        this.E = sagVar;
        this.F = i;
        this.G = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tag)) {
            return false;
        }
        tag tagVar = (tag) obj;
        return tagVar.F == this.F && tagVar.G == this.G && tagVar.E == this.E;
    }

    public final int hashCode() {
        return (this.E.hashCode() * 31) + this.F;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        sag sagVar = this.E;
        if (sagVar.L != this.G) {
            uag.f();
        }
        int i = this.F;
        sagVar.l(i);
        return new db8(sagVar, i + 1, sagVar.E[(i * 5) + 3] + i);
    }
}
