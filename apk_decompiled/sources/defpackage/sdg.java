package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class sdg {
    public static final b79 a = new b79(1, 15, 1);

    public static final long a(byte[] bArr, int i) {
        long jB = b(bArr, i);
        long jB2 = b(bArr, i + 4);
        if ((2147483648L & jB) == 0) {
            jB += 4294967296L;
        }
        return ((jB2 * 1000) / 4294967296L) + ((jB - 2208988800L) * 1000);
    }

    public static final long b(byte[] bArr, int i) {
        return (((long) bArr[i + 3]) & 255) | ((((long) bArr[i]) & 255) << 24) | ((((long) bArr[i + 1]) & 255) << 16) | ((((long) bArr[i + 2]) & 255) << 8);
    }
}
