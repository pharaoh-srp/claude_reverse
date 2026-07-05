package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gxk implements Callable {
    public final /* synthetic */ boolean E;
    public final /* synthetic */ String F;
    public final /* synthetic */ juk G;

    public /* synthetic */ gxk(boolean z, String str, juk jukVar) {
        this.E = z;
        this.F = str;
        this.G = jukVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MessageDigest messageDigest;
        boolean z = this.E;
        String str = this.F;
        juk jukVar = this.G;
        String str2 = (z || !z0l.b(str, jukVar, true, false).F) ? "not allowed" : "debug cert rejected";
        int i = 0;
        while (true) {
            if (i >= 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                break;
            }
            i++;
        }
        dgj.v(messageDigest);
        byte[] bArrDigest = messageDigest.digest(jukVar.k);
        int length = bArrDigest.length;
        char[] cArr = new char[length + length];
        int i2 = 0;
        for (byte b : bArrDigest) {
            char[] cArr2 = xsc.d;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
            i2 += 2;
        }
        return str2 + ": pkg=" + str + ", sha256=" + new String(cArr) + ", atk=" + z + ", ver=12451000.false";
    }
}
