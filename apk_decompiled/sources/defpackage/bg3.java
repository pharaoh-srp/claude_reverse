package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bg3 implements e0g {
    public static final bg3 a = new bg3();

    @Override // defpackage.e0g
    public final knk a(long j, fu9 fu9Var, cz5 cz5Var) {
        float fD = k8g.d(j) / 2.0f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fD)) << 32) | (((long) Float.floatToRawIntBits(fD)) & 4294967295L);
        return new glc(gb9.e(d4c.x(0L, j), jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits));
    }
}
