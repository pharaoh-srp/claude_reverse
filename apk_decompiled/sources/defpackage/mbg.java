package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class mbg implements Iterator {
    public int E = -1;
    public boolean F;
    public Iterator G;
    public final /* synthetic */ ebg H;

    public mbg(ebg ebgVar) {
        this.H = ebgVar;
    }

    public final Iterator a() {
        if (this.G == null) {
            this.G = this.H.G.entrySet().iterator();
        }
        return this.G;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.E + 1 < this.H.F.size() || a().hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.F = true;
        int i = this.E + 1;
        this.E = i;
        ebg ebgVar = this.H;
        return i < ebgVar.F.size() ? (Map.Entry) ebgVar.F.get(this.E) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.F) {
            sz6.j("remove() was called before next()");
            return;
        }
        this.F = false;
        int i = ebg.J;
        ebg ebgVar = this.H;
        ebgVar.c();
        if (this.E >= ebgVar.F.size()) {
            a().remove();
            return;
        }
        int i2 = this.E;
        this.E = i2 - 1;
        ebgVar.g(i2);
    }
}
