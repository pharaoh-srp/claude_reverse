package defpackage;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class egk {
    public static final vfk d;
    public final rfk a;
    public final Character b;
    public volatile egk c;

    static {
        new bgk("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new bgk("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new egk("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new egk("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        d = new vfk(new rfk("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }

    public egk(rfk rfkVar, Character ch) {
        this.a = rfkVar;
        if (ch != null) {
            byte[] bArr = rfkVar.g;
            if (bArr.length > 61 && bArr[61] != -1) {
                sz6.p(dpk.j("Padding character %s was already in alphabet", ch));
                throw null;
            }
        }
        this.b = ch;
    }

    public void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        zok.i(0, i, bArr.length);
        while (i2 < i) {
            rfk rfkVar = this.a;
            b(sb, bArr, i2, Math.min(rfkVar.f, i - i2));
            i2 += rfkVar.f;
        }
    }

    public final void b(StringBuilder sb, byte[] bArr, int i, int i2) {
        zok.i(i, i + i2, bArr.length);
        rfk rfkVar = this.a;
        int i3 = rfkVar.f;
        int i4 = rfkVar.d;
        if (i2 > i3) {
            mr9.y();
            return;
        }
        int i5 = 0;
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | ((long) (bArr[i + i6] & 255))) << 8;
        }
        int i7 = (i2 + 1) * 8;
        while (i5 < i2 * 8) {
            sb.append(rfkVar.b[((int) (j >>> ((i7 - i4) - i5))) & rfkVar.c]);
            i5 += i4;
        }
        if (this.b != null) {
            while (i5 < rfkVar.f * 8) {
                sb.append('=');
                i5 += i4;
            }
        }
    }

    public final String c(byte[] bArr, int i) {
        zok.i(0, i, bArr.length);
        rfk rfkVar = this.a;
        int i2 = rfkVar.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(rfkVar.e * rqk.n(i, i2));
        try {
            a(sb, bArr, i);
            return sb.toString();
        } catch (IOException e) {
            sz6.h(e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof egk) {
            egk egkVar = (egk) obj;
            if (this.a.equals(egkVar.a) && Objects.equals(this.b, egkVar.b)) {
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
        rfk rfkVar = this.a;
        sb.append(rfkVar);
        if (8 % rfkVar.d != 0) {
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

    public egk(String str, String str2) {
        this(new rfk(str, str2.toCharArray()), (Character) '=');
    }
}
