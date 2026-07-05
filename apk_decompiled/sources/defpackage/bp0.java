package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class bp0 extends w6g implements Map {
    public vo0 H;
    public xo0 I;
    public zo0 J;

    @Override // java.util.Map
    public final Set entrySet() {
        vo0 vo0Var = this.H;
        if (vo0Var != null) {
            return vo0Var;
        }
        vo0 vo0Var2 = new vo0(0, this);
        this.H = vo0Var2;
        return vo0Var2;
    }

    public final boolean j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i = this.G;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.G;
    }

    @Override // java.util.Map
    public final Set keySet() {
        xo0 xo0Var = this.I;
        if (xo0Var != null) {
            return xo0Var;
        }
        xo0 xo0Var2 = new xo0(this);
        this.I = xo0Var2;
        return xo0Var2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.G;
        int i = this.G;
        int[] iArr = this.E;
        if (iArr.length < size) {
            this.E = Arrays.copyOf(iArr, size);
            this.F = Arrays.copyOf(this.F, size * 2);
        }
        if (this.G != i) {
            sz6.c();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        zo0 zo0Var = this.J;
        if (zo0Var != null) {
            return zo0Var;
        }
        zo0 zo0Var2 = new zo0(this);
        this.J = zo0Var2;
        return zo0Var2;
    }
}
