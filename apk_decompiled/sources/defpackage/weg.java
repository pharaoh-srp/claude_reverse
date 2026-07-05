package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class weg implements ie4, Iterable, mm9 {
    public final sag E;
    public final int F;
    public final eee G;

    public weg(sag sagVar, int i, g18 g18Var, eee eeeVar) {
        this.E = sagVar;
        this.F = i;
        this.G = eeeVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof weg)) {
            return false;
        }
        weg wegVar = (weg) obj;
        return wegVar.F == this.F && wegVar.E == this.E && wegVar.G.equals(this.G);
    }

    public final int hashCode() {
        return this.G.hashCode() + ((this.E.hashCode() + (this.F * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new veg(this.E, this.F, null, this.G);
    }
}
