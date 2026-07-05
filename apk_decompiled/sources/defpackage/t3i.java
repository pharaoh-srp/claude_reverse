package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class t3i {
    public final boolean a;
    public final String b;
    public final x3i c;
    public final int d;
    public final byte[] e;

    public t3i(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        int i4 = 1;
        fd9.E((i == 0) ^ (bArr2 == null));
        this.a = z;
        this.b = str;
        this.d = i;
        this.e = bArr2;
        if (str != null) {
            switch (str) {
                case "cbc1":
                case "cbcs":
                    i4 = 2;
                    break;
                case "cenc":
                case "cens":
                    break;
                default:
                    ysj.u("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    break;
            }
        }
        this.c = new x3i(i4, i2, i3, bArr);
    }
}
