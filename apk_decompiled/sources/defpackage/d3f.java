package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class d3f extends g3f implements Iterator {
    public e3f E;
    public e3f F;
    public final /* synthetic */ int G;

    public d3f(e3f e3fVar, e3f e3fVar2, int i) {
        this.G = i;
        this.E = e3fVar2;
        this.F = e3fVar;
    }

    @Override // defpackage.g3f
    public final void a(e3f e3fVar) {
        e3f e3fVar2;
        e3f e3fVarB = null;
        if (this.E == e3fVar && e3fVar == this.F) {
            this.F = null;
            this.E = null;
        }
        e3f e3fVar3 = this.E;
        if (e3fVar3 == e3fVar) {
            switch (this.G) {
                case 0:
                    e3fVar2 = e3fVar3.H;
                    break;
                default:
                    e3fVar2 = e3fVar3.G;
                    break;
            }
            this.E = e3fVar2;
        }
        e3f e3fVar4 = this.F;
        if (e3fVar4 == e3fVar) {
            e3f e3fVar5 = this.E;
            if (e3fVar4 != e3fVar5 && e3fVar5 != null) {
                e3fVarB = b(e3fVar4);
            }
            this.F = e3fVarB;
        }
    }

    public final e3f b(e3f e3fVar) {
        switch (this.G) {
            case 0:
                return e3fVar.G;
            default:
                return e3fVar.H;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.F != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        e3f e3fVar = this.F;
        e3f e3fVar2 = this.E;
        this.F = (e3fVar == e3fVar2 || e3fVar2 == null) ? null : b(e3fVar);
        return e3fVar;
    }
}
