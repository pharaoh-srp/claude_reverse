package defpackage;

import java.util.Arrays;
import java.util.Base64;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z5e {
    public static final byte[] a;
    public static final byte[] b;
    public static final Base64.Decoder c;
    public static final Base64.Encoder d;
    public static final Base64.Encoder e;

    static {
        byte[] bArrG0 = isg.g0("anthropic.reattest.v1");
        int length = bArrG0.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArrG0, length + 1);
        bArrCopyOf[length] = 0;
        a = bArrCopyOf;
        byte[] bArrG02 = isg.g0("anthropic.reattest_rotate.v1");
        int length2 = bArrG02.length;
        byte[] bArrCopyOf2 = Arrays.copyOf(bArrG02, length2 + 1);
        bArrCopyOf2[length2] = 0;
        b = bArrCopyOf2;
        c = Base64.getUrlDecoder();
        d = Base64.getUrlEncoder().withoutPadding();
        e = Base64.getEncoder();
    }

    public static byte[] a(long j, String str, String str2) {
        return isg.g0(str + "\n" + str2 + "\n" + j);
    }

    public static byte[] b(String str) {
        str.getClass();
        byte[] bArrDecode = c.decode(str);
        if (bArrDecode.length == 32) {
            return bArrDecode;
        }
        mr9.q(grc.p(bArrDecode.length, "Expected 32-byte nonce, got "));
        return null;
    }

    public static Map c(String str, long j, byte[] bArr) {
        str.getClass();
        cpc cpcVar = new cpc("X-Trusted-Device-Id", str);
        cpc cpcVar2 = new cpc("X-Trusted-Device-Timestamp", String.valueOf(j));
        String strEncodeToString = e.encodeToString(bArr);
        strEncodeToString.getClass();
        return sta.h0(cpcVar, cpcVar2, new cpc("X-Trusted-Device-Signature", strEncodeToString));
    }

    public static byte[] d(byte[] bArr) {
        return mp0.Q0(a, bArr);
    }
}
