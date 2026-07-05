package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class kif {
    public static final pb0 a = new pb0(Float.NaN, Float.NaN);
    public static final d9i b = new d9i(new a6f(18), new a6f(19));
    public static final long c;
    public static final yig d;

    static {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.01f)) << 32) | (((long) Float.floatToRawIntBits(0.01f)) & 4294967295L);
        c = jFloatToRawIntBits;
        d = new yig(3, new fcc(jFloatToRawIntBits));
    }
}
