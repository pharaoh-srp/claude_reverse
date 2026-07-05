package defpackage;

import com.arkivanov.essenty.statekeeper.SerializableContainer;
import java.util.Arrays;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* JADX INFO: loaded from: classes3.dex */
public final class rnf implements KSerializer {
    public static final rnf a = new rnf();
    public static final rfd b = j8.h("SerializableContainer", kfd.t);

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        byte[] bArrCopyOf;
        decoder.getClass();
        String strS = decoder.s();
        if (x44.r(strS, ".")) {
            strS = null;
        }
        if (strS != null) {
            int i = 0;
            if (bsg.I0(strS)) {
                bArrCopyOf = new byte[0];
            } else {
                int length = strS.length();
                byte[] bArr = new byte[length];
                int[] iArr = h36.b;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                while (i2 < strS.length()) {
                    int i6 = i2 + 1;
                    char cCharAt = strS.charAt(i2);
                    if (x44.z(cCharAt, 32) > 0) {
                        if (cCharAt == '=') {
                            break;
                        }
                        int i7 = (cCharAt < 0 || cCharAt >= iArr.length) ? -1 : iArr[cCharAt];
                        if (i7 == -1) {
                            throw new IllegalStateException(("Unexpected character " + cCharAt + " (" + ((int) cCharAt) + ")) in " + strS).toString());
                        }
                        i4 = (i4 << 6) | i7;
                        i5++;
                        if (i5 == 4) {
                            bArr[i3] = (byte) (i4 >> 16);
                            bArr[i3 + 1] = (byte) ((i4 >> 8) & 255);
                            bArr[i3 + 2] = (byte) (i4 & 255);
                            i3 += 3;
                            i4 = 0;
                            i5 = 0;
                        }
                    }
                    i2 = i6;
                }
                int i8 = 0;
                while (i2 < strS.length()) {
                    int i9 = i2 + 1;
                    char cCharAt2 = strS.charAt(i2);
                    if (x44.z(cCharAt2, 32) > 0) {
                        if (cCharAt2 != '=') {
                            sz6.j("Check failed.");
                            return null;
                        }
                        i8++;
                        i4 <<= 6;
                        i5++;
                    }
                    i2 = i9;
                }
                if (i5 == 4) {
                    bArr[i3] = (byte) (i4 >> 16);
                    bArr[i3 + 1] = (byte) ((i4 >> 8) & 255);
                    bArr[i3 + 2] = (byte) (i4 & 255);
                    i3 = (i3 + 3) - i8;
                } else {
                    i = i5;
                }
                if (i != 0) {
                    mr9.f(grc.p(i, "buffered: "));
                    return null;
                }
                bArrCopyOf = i3 < length ? Arrays.copyOf(bArr, i3) : bArr;
            }
        } else {
            bArrCopyOf = null;
        }
        return new SerializableContainer(bArrCopyOf, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // defpackage.znf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void serialize(kotlinx.serialization.encoding.Encoder r8, java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rnf.serialize(kotlinx.serialization.encoding.Encoder, java.lang.Object):void");
    }
}
