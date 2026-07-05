package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class mva extends i2 {
    public final /* synthetic */ int E = 1;
    public final Object F;

    public mva(List list) {
        list.getClass();
        this.F = list;
    }

    @Override // defpackage.w0, java.util.Collection, java.util.Set
    public /* bridge */ boolean contains(Object obj) {
        switch (this.E) {
            case 0:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.E;
        Object obj = this.F;
        switch (i2) {
            case 0:
                String strGroup = ((ova) obj).a.group(i);
                return strGroup == null ? "" : strGroup;
            default:
                return ((List) obj).get(w44.B0(i, this));
        }
    }

    @Override // defpackage.w0
    public final int getSize() {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                return ((ova) obj).a.groupCount() + 1;
            default:
                return ((List) obj).size();
        }
    }

    @Override // defpackage.i2, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.E) {
            case 0:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // defpackage.i2, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.E) {
            case 1:
                return new fse(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // defpackage.i2, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.E) {
            case 0:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // defpackage.i2, java.util.List
    public ListIterator listIterator() {
        switch (this.E) {
            case 1:
                return new fse(this, 0);
            default:
                return super.listIterator();
        }
    }

    public mva(ova ovaVar) {
        this.F = ovaVar;
    }

    @Override // defpackage.i2, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.E) {
            case 1:
                return new fse(this, i);
            default:
                return super.listIterator(i);
        }
    }
}
