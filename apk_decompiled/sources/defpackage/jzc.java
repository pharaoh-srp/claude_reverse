package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class jzc implements Iterator, mm9 {
    public final /* synthetic */ int E;
    public Object F;
    public final Object G;
    public int H;

    public jzc(Object obj, Map map, int i) {
        this.E = i;
        switch (i) {
            case 1:
                this.F = obj;
                this.G = map;
                break;
            default:
                map.getClass();
                this.F = obj;
                this.G = map;
                break;
        }
    }

    public void a() {
        Object objInvoke;
        int i = this.H;
        uj7 uj7Var = (uj7) this.G;
        if (i == -2) {
            objInvoke = ((zy7) uj7Var.b).a();
        } else {
            bz7 bz7Var = (bz7) uj7Var.c;
            Object obj = this.F;
            obj.getClass();
            objInvoke = bz7Var.invoke(obj);
        }
        this.F = objInvoke;
        this.H = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.E) {
            case 0:
                return this.H < ((Map) this.G).size();
            case 1:
                return this.H < ((Map) this.G).size();
            default:
                if (this.H < 0) {
                    a();
                }
                return this.H == 1;
        }
    }

    @Override // java.util.Iterator
    public Object next() {
        int i = this.E;
        Object obj = this.G;
        Object obj2 = null;
        switch (i) {
            case 0:
                if (hasNext()) {
                    obj2 = this.F;
                    this.H++;
                    Object obj3 = ((Map) obj).get(obj2);
                    if (obj3 == null) {
                        throw new ConcurrentModificationException(grc.t(obj2, "Hash code of an element (", ") has changed after it was added to the persistent set."));
                    }
                    this.F = ((r7a) obj3).b;
                } else {
                    pmf.d();
                }
                return obj2;
            case 1:
                if (hasNext()) {
                    obj2 = this.F;
                    this.H++;
                    Object obj4 = ((Map) obj).get(obj2);
                    if (obj4 == null) {
                        throw new ConcurrentModificationException(grc.t(obj2, "Hash code of an element (", ") has changed after it was added to the persistent set."));
                    }
                    this.F = ((s7a) obj4).b;
                } else {
                    pmf.d();
                }
                return obj2;
            default:
                if (this.H < 0) {
                    a();
                }
                if (this.H == 0) {
                    pmf.d();
                    return null;
                }
                Object obj5 = this.F;
                obj5.getClass();
                this.H = -1;
                return obj5;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        switch (this.E) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public jzc(uj7 uj7Var) {
        this.E = 2;
        this.G = uj7Var;
        this.H = -2;
    }
}
