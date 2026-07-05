package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class o2 implements Iterator {
    public final /* synthetic */ int E = 0;
    public final Iterator F;
    public Object G;
    public final /* synthetic */ Object H;

    public o2(x2 x2Var) {
        this.H = x2Var;
        Collection collection = x2Var.F;
        this.G = collection;
        this.F = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public void a() {
        x2 x2Var = (x2) this.H;
        x2Var.b();
        if (x2Var.F == ((Collection) this.G)) {
            return;
        }
        sz6.c();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.E) {
            case 0:
                break;
            case 1:
                break;
            default:
                a();
                break;
        }
        return this.F.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.E;
        Iterator it = this.F;
        switch (i) {
            case 0:
                Map.Entry entry = (Map.Entry) it.next();
                this.G = (Collection) entry.getValue();
                return ((p2) this.H).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) it.next();
                this.G = entry2;
                return entry2.getKey();
            default:
                a();
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.E;
        Object obj = this.H;
        Iterator it = this.F;
        switch (i) {
            case 0:
                fd9.L("no calls to next() since the last call to remove()", ((Collection) this.G) != null);
                it.remove();
                ((p2) obj).H.I -= ((Collection) this.G).size();
                ((Collection) this.G).clear();
                this.G = null;
                break;
            case 1:
                fd9.L("no calls to next() since the last call to remove()", ((Map.Entry) this.G) != null);
                Collection collection = (Collection) ((Map.Entry) this.G).getValue();
                it.remove();
                ((q2) obj).F.I -= collection.size();
                collection.clear();
                this.G = null;
                break;
            default:
                it.remove();
                x2 x2Var = (x2) obj;
                x2Var.I.I--;
                x2Var.e();
                break;
        }
    }

    public o2(x2 x2Var, ListIterator listIterator) {
        this.H = x2Var;
        this.G = x2Var.F;
        this.F = listIterator;
    }

    public o2(q2 q2Var, Iterator it) {
        this.F = it;
        this.H = q2Var;
    }

    public o2(p2 p2Var) {
        this.H = p2Var;
        this.F = p2Var.G.entrySet().iterator();
    }
}
