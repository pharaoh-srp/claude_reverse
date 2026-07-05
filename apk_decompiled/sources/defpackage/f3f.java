package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class f3f extends g3f implements Iterator {
    public e3f E;
    public boolean F = true;
    public final /* synthetic */ h3f G;

    public f3f(h3f h3fVar) {
        this.G = h3fVar;
    }

    @Override // defpackage.g3f
    public final void a(e3f e3fVar) {
        e3f e3fVar2 = this.E;
        if (e3fVar == e3fVar2) {
            e3f e3fVar3 = e3fVar2.H;
            this.E = e3fVar3;
            this.F = e3fVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.F) {
            return this.G.E != null;
        }
        e3f e3fVar = this.E;
        return (e3fVar == null || e3fVar.G == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.F) {
            this.F = false;
            this.E = this.G.E;
        } else {
            e3f e3fVar = this.E;
            this.E = e3fVar != null ? e3fVar.G : null;
        }
        return this.E;
    }
}
