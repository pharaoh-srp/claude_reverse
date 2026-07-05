package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class d7a {
    public static long modifiedCalcCircularRefElementOffset(long j, long j2) {
        return wfi.REF_ARRAY_BASE + ((j & j2) << (wfi.REF_ELEMENT_SHIFT - 1));
    }
}
