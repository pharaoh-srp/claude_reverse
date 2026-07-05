package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class ae1 {
    public static final yd1 d;
    public final xd1 a;
    public final Character b;
    public volatile ae1 c;

    static {
        new zd1("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new zd1("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new ae1("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new ae1("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        d = new yd1(new xd1("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ae1(defpackage.xd1 r3, java.lang.Character r4) {
        /*
            r2 = this;
            r2.<init>()
            r2.a = r3
            if (r4 == 0) goto L17
            char r0 = r4.charValue()
            byte[] r3 = r3.g
            int r1 = r3.length
            if (r0 >= r1) goto L17
            r3 = r3[r0]
            r0 = -1
            if (r3 == r0) goto L17
            r3 = 0
            goto L18
        L17:
            r3 = 1
        L18:
            java.lang.String r0 = "Padding character %s was already in alphabet"
            defpackage.fd9.F(r3, r0, r4)
            r2.b = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ae1.<init>(xd1, java.lang.Character):void");
    }

    public final void a(StringBuilder sb, byte[] bArr, int i, int i2) {
        fd9.K(i, i + i2, bArr.length);
        xd1 xd1Var = this.a;
        int i3 = xd1Var.f;
        int i4 = xd1Var.d;
        int i5 = 0;
        fd9.E(i2 <= i3);
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | ((long) (bArr[i + i6] & 255))) << 8;
        }
        int i7 = ((i2 + 1) * 8) - i4;
        while (i5 < i2 * 8) {
            sb.append(xd1Var.b[((int) (j >>> (i7 - i5))) & xd1Var.c]);
            i5 += i4;
        }
        Character ch = this.b;
        if (ch != null) {
            while (i5 < xd1Var.f * 8) {
                sb.append(ch.charValue());
                i5 += i4;
            }
        }
    }

    public void b(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        fd9.K(0, i, bArr.length);
        while (i2 < i) {
            xd1 xd1Var = this.a;
            a(sb, bArr, i2, Math.min(xd1Var.f, i - i2));
            i2 += xd1Var.f;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ae1) {
            ae1 ae1Var = (ae1) obj;
            if (this.a.equals(ae1Var.a) && Objects.equals(this.b, ae1Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.b) ^ this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        xd1 xd1Var = this.a;
        sb.append(xd1Var);
        if (8 % xd1Var.d != 0) {
            Character ch = this.b;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public ae1(String str, String str2) {
        this(new xd1(str, str2.toCharArray()), (Character) '=');
    }
}
