package defpackage;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public abstract class hrj extends AbstractCollection implements Serializable {
    public static final Object[] F = new Object[0];
    public static final Object[] G = new Object[0];
    public static final Object[] H = new Object[0];
    public final /* synthetic */ int E;

    public abstract int a(Object[] objArr);

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.E) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.E) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public int b() {
        switch (this.E) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.E) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public int e() {
        switch (this.E) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public Object[] g() {
        switch (this.E) {
        }
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.E) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.E) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.E) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.E) {
            case 0:
                objArr.getClass();
                int size = size();
                int length = objArr.length;
                if (length < size) {
                    Object[] objArrG = g();
                    if (objArrG == null) {
                        objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
                    }
                } else if (length > size) {
                    objArr[size] = null;
                }
                a(objArr);
                break;
            case 1:
                objArr.getClass();
                int size2 = size();
                int length2 = objArr.length;
                if (length2 < size2) {
                    Object[] objArrG2 = g();
                    if (objArrG2 == null) {
                        objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size2);
                    }
                } else if (length2 > size2) {
                    objArr[size2] = null;
                }
                a(objArr);
                break;
            default:
                objArr.getClass();
                int size3 = size();
                int length3 = objArr.length;
                if (length3 < size3) {
                    Object[] objArrG3 = g();
                    if (objArrG3 == null) {
                        objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size3);
                    }
                } else if (length3 > size3) {
                    objArr[size3] = null;
                }
                a(objArr);
                break;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        switch (this.E) {
            case 0:
                return toArray(F);
            case 1:
                return toArray(G);
            default:
                return toArray(H);
        }
    }
}
