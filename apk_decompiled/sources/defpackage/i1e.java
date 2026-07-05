package defpackage;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i1e {
    public static final ig a = new ig(7);

    public static byte[] a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) a.get()).nextBytes(bArr);
        return bArr;
    }
}
