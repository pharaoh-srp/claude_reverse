package defpackage;

import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: loaded from: classes3.dex */
public final class a6c implements Iterator {
    public final /* synthetic */ int E;
    public Object F;
    public Object G;

    public a6c(l22 l22Var) {
        this.E = 1;
        this.F = new Stack();
        while (l22Var instanceof lve) {
            lve lveVar = (lve) l22Var;
            ((Stack) this.F).push(lveVar);
            l22Var = lveVar.G;
        }
        this.G = (oba) l22Var;
    }

    public oba a() {
        Stack stack = (Stack) this.F;
        oba obaVar = (oba) this.G;
        oba obaVar2 = null;
        if (obaVar == null) {
            pmf.d();
            return null;
        }
        while (true) {
            if (!stack.isEmpty()) {
                l22 l22Var = ((lve) stack.pop()).H;
                while (l22Var instanceof lve) {
                    lve lveVar = (lve) l22Var;
                    stack.push(lveVar);
                    l22Var = lveVar.G;
                }
                oba obaVar3 = (oba) l22Var;
                if (obaVar3.F.length != 0) {
                    obaVar2 = obaVar3;
                    break;
                }
            } else {
                break;
            }
        }
        this.G = obaVar2;
        return obaVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.E) {
            case 0:
                b5c b5cVar = (b5c) this.F;
                if (b5cVar != null && b5cVar != ((b5c) this.G)) {
                    break;
                }
                break;
            default:
                if (((oba) this.G) != null) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.E) {
            case 0:
                b5c b5cVar = (b5c) this.F;
                this.F = b5cVar.e;
                return b5cVar;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.E) {
            case 0:
                throw new UnsupportedOperationException("remove");
            default:
                throw new UnsupportedOperationException();
        }
    }

    public a6c(b5c b5cVar, b5c b5cVar2) {
        this.E = 0;
        this.F = b5cVar;
        this.G = b5cVar2;
    }
}
