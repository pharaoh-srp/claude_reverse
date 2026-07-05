package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class wac {
    public static final Object[] a = new Object[0];
    public static final qvb b = new qvb(0);

    public static final void a(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            gtk.h("Index " + i + " is out of bounds. The list has " + size + " elements.");
            throw null;
        }
    }

    public static final void b(int i, int i2, List list) {
        int size = list.size();
        if (i > i2) {
            gtk.f("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
            throw null;
        }
        if (i < 0) {
            gtk.h("fromIndex (" + i + ") is less than 0.");
            throw null;
        }
        if (i2 <= size) {
            return;
        }
        gtk.h("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
        throw null;
    }
}
