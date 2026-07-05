package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class wfi {
    public static final long REF_ARRAY_BASE;
    public static final int REF_ELEMENT_SHIFT;

    static {
        int iArrayIndexScale = pfi.UNSAFE.arrayIndexScale(Object[].class);
        if (4 == iArrayIndexScale) {
            REF_ELEMENT_SHIFT = 2;
        } else {
            if (8 != iArrayIndexScale) {
                sz6.j(grc.p(iArrayIndexScale, "Unknown pointer size: "));
                return;
            }
            REF_ELEMENT_SHIFT = 3;
        }
        REF_ARRAY_BASE = r0.arrayBaseOffset(Object[].class);
    }

    public static <E> E[] allocateRefArray(int i) {
        return (E[]) new Object[i];
    }

    public static <E> E lvRefElement(E[] eArr, long j) {
        return (E) pfi.UNSAFE.getObjectVolatile(eArr, j);
    }

    public static <E> void soRefElement(E[] eArr, long j, E e) {
        pfi.UNSAFE.putOrderedObject(eArr, j, e);
    }
}
