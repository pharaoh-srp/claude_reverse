package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tub extends zc5 {
    public final void e(s7d s7dVar, int i) {
        float[] fArr = this.a;
        int i2 = i + 1;
        long jA = s7dVar.a(fArr[i], fArr[i2]);
        fArr[i] = Float.intBitsToFloat((int) (jA >> 32));
        fArr[i2] = Float.intBitsToFloat((int) (4294967295L & jA));
    }
}
