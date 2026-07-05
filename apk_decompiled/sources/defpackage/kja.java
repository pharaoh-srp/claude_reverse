package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kja {
    public static volatile kja i;
    public static final Object j = new Object();
    public static int k;
    public final int a;
    public final int b;
    public final int[] c;
    public final byte[] d;
    public final byte[] e;
    public final int[] f;
    public final int[] g;
    public final float[] h;

    public kja(int i2, int i3, int[] iArr, byte[] bArr, byte[] bArr2, int[] iArr2, int[] iArr3, float[] fArr) {
        this.a = i2;
        this.b = i3;
        this.c = iArr;
        this.d = bArr;
        this.e = bArr2;
        this.f = iArr2;
        this.g = iArr3;
        this.h = fArr;
    }

    public static final float a(kja kjaVar, float f, float f2, int i2, int i3) {
        return (kjaVar.h[i2 + i3] * f) + f2;
    }

    public static final float b(kja kjaVar, float f, float f2, int i2, int i3) {
        return (kjaVar.h[i2 + i3] * f) + f2;
    }
}
