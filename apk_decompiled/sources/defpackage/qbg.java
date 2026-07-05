package defpackage;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class qbg extends AbstractSet {
    public static final /* synthetic */ int G = 0;
    public Object E;
    public int F;

    public static final qbg a() {
        return new qbg();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Object obj2;
        int i = this.F;
        if (i == 0) {
            this.E = obj;
        } else {
            Object obj3 = this.E;
            if (i == 1) {
                if (x44.r(obj3, obj)) {
                    return false;
                }
                this.E = new Object[]{this.E, obj};
            } else if (i < 5) {
                obj3.getClass();
                Object[] objArr = (Object[]) obj3;
                if (mp0.o0(obj, objArr)) {
                    return false;
                }
                int i2 = this.F;
                if (i2 == 4) {
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    LinkedHashSet linkedHashSet = new LinkedHashSet(tta.d0(objArrCopyOf.length));
                    mp0.W0(objArrCopyOf, linkedHashSet);
                    linkedHashSet.add(obj);
                    obj2 = linkedHashSet;
                } else {
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i2 + 1);
                    objArrCopyOf2[objArrCopyOf2.length - 1] = obj;
                    obj2 = objArrCopyOf2;
                }
                this.E = obj2;
            } else {
                obj3.getClass();
                if (!nai.m(obj3).add(obj)) {
                    return false;
                }
            }
        }
        this.F++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.E = null;
        this.F = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.F;
        if (i == 0) {
            return false;
        }
        if (i == 1) {
            return x44.r(this.E, obj);
        }
        Object obj2 = this.E;
        if (i < 5) {
            obj2.getClass();
            return mp0.o0(obj, (Object[]) obj2);
        }
        obj2.getClass();
        return ((Set) obj2).contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.F;
        if (i == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        Object obj = this.E;
        if (i == 1) {
            return new dnf(1, obj);
        }
        if (i < 5) {
            obj.getClass();
            return new syc((Object[]) obj);
        }
        obj.getClass();
        return nai.m(obj).iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.F;
    }
}
