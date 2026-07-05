package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vo3 {
    public static final byte[] a = isg.g0("anthropic.ccr.client_event.v1");
    public static final Base64.Encoder b = Base64.getEncoder();

    public static byte[] a(JsonObject jsonObject) throws IOException {
        int i;
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            String key = entry.getKey();
            if (!x44.r(key, "uuid") && !x44.r(key, "type")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        String string = new JsonObject(linkedHashMap).toString();
        ax5 ax5Var = new ax5(13, false);
        ax5Var.F = new StringBuilder();
        yg9 yg9Var = new yg9();
        yg9Var.c = string;
        yg9Var.b = string.length();
        int i2 = yg9Var.a;
        char cG = yg9Var.g();
        yg9Var.a = i2;
        if (cG == '[') {
            yg9Var.g();
            yg9Var.d = yg9Var.c();
        } else {
            yg9Var.h('{');
            yg9Var.d = yg9Var.e();
        }
        do {
            i = yg9Var.a;
            if (i >= yg9Var.b) {
                ax5Var.H(yg9Var.d);
                byte[] bytes = ((StringBuilder) ax5Var.F).toString().getBytes("utf-8");
                bytes.getClass();
                return bytes;
            }
            str = yg9Var.c;
            yg9Var.a = i + 1;
        } while (yg9.a(str.charAt(i)));
        xh6.c("Improperly terminated JSON object");
        return null;
    }

    public static byte[] b(byte[] bArr) {
        if (bArr.length < 8 || bArr[0] != 48) {
            sz6.p("Not a DER ECDSA signature");
            return null;
        }
        bae baeVar = new bae();
        baeVar.E = 2;
        int i = bArr[1] & 255;
        if (i == 129) {
            baeVar.E = 3;
            i = bArr[2] & 255;
        }
        if (baeVar.E + i != bArr.length) {
            sz6.p("DER SEQUENCE length mismatch");
            return null;
        }
        byte[] bArrC = c(bArr, baeVar);
        byte[] bArrC2 = c(bArr, baeVar);
        if (baeVar.E == bArr.length) {
            return mp0.Q0(bArrC, bArrC2);
        }
        sz6.p("Trailing bytes after DER ECDSA signature");
        return null;
    }

    public static final byte[] c(byte[] bArr, bae baeVar) {
        int i = baeVar.E;
        int i2 = i + 1;
        baeVar.E = i2;
        if (bArr[i] != 2) {
            sz6.p("Expected DER INTEGER");
            return null;
        }
        int i3 = i + 2;
        baeVar.E = i3;
        int i4 = bArr[i2] & 255;
        if (1 > i4 || i4 >= 34) {
            mr9.q(grc.u("Invalid DER INTEGER length ", i4, " for P-256 scalar"));
            return null;
        }
        byte[] bArrX0 = mp0.x0(bArr, i3, i3 + i4);
        baeVar.E += i4;
        if (bArrX0.length == 33) {
            if (bArrX0[0] != 0) {
                sz6.p("Unexpected 33-byte INTEGER without sign padding");
                return null;
            }
            bArrX0 = mp0.x0(bArrX0, 1, bArrX0.length);
        }
        if (bArrX0.length <= 32) {
            return mp0.Q0(new byte[32 - bArrX0.length], bArrX0);
        }
        sz6.p("P-256 scalar exceeds 32 bytes");
        return null;
    }

    public static byte[] d(String str, String str2, String str3, byte[] bArr) throws IOException {
        str.getClass();
        str2.getClass();
        str3.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(a);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(isg.g0(str));
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(isg.g0(str2));
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(isg.g0(str3));
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(MessageDigest.getInstance("SHA-256").digest(bArr));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }
}
