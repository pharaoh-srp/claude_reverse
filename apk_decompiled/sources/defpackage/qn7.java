package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class qn7 implements Iterator, mm9 {
    public final /* synthetic */ int E;
    public final Iterator F;
    public int G;
    public Object H;
    public final /* synthetic */ ymf I;

    public qn7(m4h m4hVar) {
        this.E = 1;
        this.I = m4hVar;
        this.F = m4hVar.a.iterator();
        this.G = -1;
    }

    public void a() {
        Iterator it = this.F;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((m4h) this.I).b.invoke(next)).booleanValue()) {
                this.G = 1;
                this.H = next;
                return;
            }
        }
        this.G = 0;
    }

    public boolean c() {
        Iterator it;
        Iterator it2 = (Iterator) this.H;
        if (it2 != null && it2.hasNext()) {
            this.G = 1;
            return true;
        }
        do {
            Iterator it3 = this.F;
            if (!it3.hasNext()) {
                this.G = 2;
                this.H = null;
                return false;
            }
            Object next = it3.next();
            rn7 rn7Var = (rn7) this.I;
            it = (Iterator) rn7Var.c.invoke(rn7Var.b.invoke(next));
        } while (!it.hasNext());
        this.H = it;
        this.G = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.E) {
            case 0:
                int i = this.G;
                if (i == 1) {
                    return true;
                }
                if (i == 2) {
                    return false;
                }
                return c();
            default:
                if (this.G == -1) {
                    a();
                }
                return this.G == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.E) {
            case 0:
                int i = this.G;
                if (i == 2) {
                    pmf.d();
                } else if (i == 0 && !c()) {
                    pmf.d();
                } else {
                    this.G = 0;
                    Iterator it = (Iterator) this.H;
                    it.getClass();
                }
                break;
            default:
                if (this.G == -1) {
                    a();
                }
                if (this.G == 0) {
                    pmf.d();
                } else {
                    Object obj = this.H;
                    this.H = null;
                    this.G = -1;
                }
                break;
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.E) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public qn7(rn7 rn7Var) {
        this.E = 0;
        this.I = rn7Var;
        this.F = rn7Var.a.iterator();
    }
}
