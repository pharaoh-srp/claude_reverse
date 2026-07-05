package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class lqi implements KSerializer {
    public static final lqi a = new lqi();
    public static final rfd b = new rfd("kotlin.uuid.Uuid", kfd.t);

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        String strS = decoder.s();
        strS.getClass();
        int length = strS.length();
        int i = 0;
        if (length == 32) {
            long j = 0;
            while (i < 16) {
                long j2 = j << 4;
                char cCharAt = strS.charAt(i);
                if ((cCharAt >>> '\b') == 0) {
                    long j3 = nm8.b[cCharAt];
                    if (j3 >= 0) {
                        j = j2 | j3;
                        i++;
                    }
                }
                mpk.j0(strS, i, "a hexadecimal digit");
                throw null;
            }
            long j4 = 0;
            for (int i2 = 16; i2 < 32; i2++) {
                long j5 = j4 << 4;
                char cCharAt2 = strS.charAt(i2);
                if ((cCharAt2 >>> '\b') == 0) {
                    long j6 = nm8.b[cCharAt2];
                    if (j6 >= 0) {
                        j4 = j5 | j6;
                    }
                }
                mpk.j0(strS, i2, "a hexadecimal digit");
                throw null;
            }
            if (j != 0 || j4 != 0) {
                return new kqi(j, j4);
            }
        } else {
            if (length != 36) {
                StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                sb.append(strS.length() <= 64 ? strS : strS.substring(0, 64).concat("..."));
                sb.append("\" of length ");
                sb.append(strS.length());
                throw new IllegalArgumentException(sb.toString());
            }
            long j7 = 0;
            while (i < 8) {
                long j8 = j7 << 4;
                char cCharAt3 = strS.charAt(i);
                if ((cCharAt3 >>> '\b') == 0) {
                    long j9 = nm8.b[cCharAt3];
                    if (j9 >= 0) {
                        j7 = j8 | j9;
                        i++;
                    }
                }
                mpk.j0(strS, i, "a hexadecimal digit");
                throw null;
            }
            if (strS.charAt(8) != '-') {
                mpk.j0(strS, 8, "'-' (hyphen)");
                throw null;
            }
            long j10 = 0;
            for (int i3 = 9; i3 < 13; i3++) {
                long j11 = j10 << 4;
                char cCharAt4 = strS.charAt(i3);
                if ((cCharAt4 >>> '\b') == 0) {
                    long j12 = nm8.b[cCharAt4];
                    if (j12 >= 0) {
                        j10 = j11 | j12;
                    }
                }
                mpk.j0(strS, i3, "a hexadecimal digit");
                throw null;
            }
            if (strS.charAt(13) != '-') {
                mpk.j0(strS, 13, "'-' (hyphen)");
                throw null;
            }
            long j13 = 0;
            for (int i4 = 14; i4 < 18; i4++) {
                long j14 = j13 << 4;
                char cCharAt5 = strS.charAt(i4);
                if ((cCharAt5 >>> '\b') == 0) {
                    long j15 = nm8.b[cCharAt5];
                    if (j15 >= 0) {
                        j13 = j14 | j15;
                    }
                }
                mpk.j0(strS, i4, "a hexadecimal digit");
                throw null;
            }
            if (strS.charAt(18) != '-') {
                mpk.j0(strS, 18, "'-' (hyphen)");
                throw null;
            }
            long j16 = 0;
            for (int i5 = 19; i5 < 23; i5++) {
                long j17 = j16 << 4;
                char cCharAt6 = strS.charAt(i5);
                if ((cCharAt6 >>> '\b') == 0) {
                    long j18 = nm8.b[cCharAt6];
                    if (j18 >= 0) {
                        j16 = j17 | j18;
                    }
                }
                mpk.j0(strS, i5, "a hexadecimal digit");
                throw null;
            }
            if (strS.charAt(23) != '-') {
                mpk.j0(strS, 23, "'-' (hyphen)");
                throw null;
            }
            long j19 = 0;
            for (int i6 = 24; i6 < 36; i6++) {
                long j20 = j19 << 4;
                char cCharAt7 = strS.charAt(i6);
                if ((cCharAt7 >>> '\b') == 0) {
                    long j21 = nm8.b[cCharAt7];
                    if (j21 >= 0) {
                        j19 = j20 | j21;
                    }
                }
                mpk.j0(strS, i6, "a hexadecimal digit");
                throw null;
            }
            long j22 = (j7 << 32) | (j10 << 16) | j13;
            long j23 = (j16 << 48) | j19;
            if (j22 != 0 || j23 != 0) {
                return new kqi(j22, j23);
            }
        }
        return kqi.G;
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        kqi kqiVar = (kqi) obj;
        encoder.getClass();
        kqiVar.getClass();
        encoder.F(kqiVar.toString());
    }
}
