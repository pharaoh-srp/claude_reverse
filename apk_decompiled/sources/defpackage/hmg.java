package defpackage;

import io.sentry.e0;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class hmg implements Iterator, mm9 {
    public final mdg E;
    public final Iterator F;
    public int G;
    public Map.Entry H;
    public Map.Entry I;
    public final /* synthetic */ int J;

    public hmg(mdg mdgVar, Iterator it, int i) {
        this.J = i;
        this.E = mdgVar;
        this.F = it;
        this.G = mdgVar.d().d;
        a();
    }

    public final void a() {
        this.H = this.I;
        Iterator it = this.F;
        this.I = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.I != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.J) {
            case 0:
                a();
                if (this.H == null) {
                    e0.b();
                }
                break;
            case 1:
                Map.Entry entry = this.I;
                if (entry == null) {
                    e0.b();
                } else {
                    a();
                }
                break;
            default:
                Map.Entry entry2 = this.I;
                if (entry2 == null) {
                    e0.b();
                } else {
                    a();
                }
                break;
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        mdg mdgVar = this.E;
        if (mdgVar.d().d != this.G) {
            sz6.c();
            return;
        }
        Map.Entry entry = this.H;
        if (entry == null) {
            e0.b();
            return;
        }
        mdgVar.remove(entry.getKey());
        this.H = null;
        this.G = mdgVar.d().d;
    }
}
