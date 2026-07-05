package com.google.android.gms.internal.measurement;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.jli;
import defpackage.mr9;
import defpackage.pmf;
import defpackage.sz6;
import defpackage.t0l;
import defpackage.vb7;

/* JADX INFO: loaded from: classes.dex */
public abstract class s0 {
    public static final jli a;

    static {
        if (t0l.e) {
            boolean z = t0l.d;
        }
        a = new jli(15);
    }

    public static int a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length && str.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (true) {
            if (i >= length) {
                break;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt < 2048) {
                i2 += (127 - cCharAt) >>> 31;
                i++;
            } else {
                int length2 = str.length();
                int i3 = 0;
                while (i < length2) {
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 < 2048) {
                        i3 += (127 - cCharAt2) >>> 31;
                    } else {
                        i3 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i) < 65536) {
                                throw new zzog(i, length2);
                            }
                            i++;
                        }
                    }
                    i++;
                }
                i2 += i3;
            }
        }
        if (i2 >= length) {
            return i2;
        }
        sz6.p(vb7.m(((long) i2) + 4294967296L, "UTF-8 length does not fit in int: "));
        return 0;
    }

    public static int b(String str, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        char cCharAt;
        a.getClass();
        int length = str.length();
        int i5 = i2 + i;
        int i6 = 0;
        while (i6 < length && (i4 = i6 + i) < i5 && (cCharAt = str.charAt(i6)) < 128) {
            bArr[i4] = (byte) cCharAt;
            i6++;
        }
        if (i6 == length) {
            return i + length;
        }
        int i7 = i + i6;
        while (i6 < length) {
            char cCharAt2 = str.charAt(i6);
            if (cCharAt2 < 128 && i7 < i5) {
                bArr[i7] = (byte) cCharAt2;
                i7++;
            } else if (cCharAt2 < 2048 && i7 <= i5 - 2) {
                int i8 = i7 + 1;
                bArr[i7] = (byte) ((cCharAt2 >>> 6) | 960);
                i7 += 2;
                bArr[i8] = (byte) ((cCharAt2 & '?') | FreeTypeConstants.FT_LOAD_PEDANTIC);
            } else {
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i7 > i5 - 3) {
                    if (i7 > i5 - 4) {
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i6 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i3)))) {
                            throw new zzog(i6, length);
                        }
                        pmf.e(cCharAt2, i7);
                        return 0;
                    }
                    int i9 = i6 + 1;
                    if (i9 != str.length()) {
                        char cCharAt3 = str.charAt(i9);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | FreeTypeConstants.FT_LOAD_PEDANTIC);
                            int i10 = i7 + 3;
                            bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | FreeTypeConstants.FT_LOAD_PEDANTIC);
                            i7 += 4;
                            bArr[i10] = (byte) ((codePoint & 63) | FreeTypeConstants.FT_LOAD_PEDANTIC);
                            i6 = i9;
                        } else {
                            i6 = i9;
                        }
                    }
                    throw new zzog(i6 - 1, length);
                }
                bArr[i7] = (byte) ((cCharAt2 >>> '\f') | 480);
                int i11 = i7 + 2;
                bArr[i7 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | FreeTypeConstants.FT_LOAD_PEDANTIC);
                i7 += 3;
                bArr[i11] = (byte) ((cCharAt2 & '?') | FreeTypeConstants.FT_LOAD_PEDANTIC);
            }
            i6++;
        }
        return i7;
    }

    public static /* synthetic */ int c(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i3 == 1) {
            byte b2 = bArr[i];
            if (b > -12 || b2 > -65) {
                return -1;
            }
            return (b2 << 8) ^ b;
        }
        if (i3 != 2) {
            mr9.u();
            return 0;
        }
        byte b3 = bArr[i];
        byte b4 = bArr[i + 1];
        if (b > -12 || b3 > -65 || b4 > -65) {
            return -1;
        }
        return (b4 << 16) ^ ((b3 << 8) ^ b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean d(byte[] bArr, int i, int i2) {
        int iC;
        a.getClass();
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            iC = 0;
        } else {
            while (i < i2) {
                int i3 = i + 1;
                iC = bArr[i];
                if (iC < 0) {
                    if (iC >= -32) {
                        if (iC >= -16) {
                            if (i3 < i2 - 2) {
                                int i4 = i + 2;
                                int i5 = bArr[i3];
                                if (i5 <= -65) {
                                    if ((((i5 + 112) + (iC << 28)) >> 30) == 0) {
                                        int i6 = i + 3;
                                        if (bArr[i4] <= -65) {
                                            i += 4;
                                            if (bArr[i6] > -65) {
                                            }
                                        }
                                    }
                                }
                                iC = -1;
                                break;
                            }
                            iC = c(bArr, i3, i2);
                            break;
                        }
                        if (i3 < i2 - 1) {
                            int i7 = i + 2;
                            char c = bArr[i3];
                            if (c <= -65 && ((iC != -32 || c >= -96) && (iC != -19 || c < -96))) {
                                i += 3;
                                if (bArr[i7] > -65) {
                                }
                            }
                            iC = -1;
                            break;
                        }
                        iC = c(bArr, i3, i2);
                        break;
                    }
                    if (i3 >= i2) {
                        break;
                    }
                    if (iC >= -62) {
                        i += 2;
                        if (bArr[i3] > -65) {
                        }
                    }
                    iC = -1;
                    break;
                }
                i = i3;
            }
            iC = 0;
        }
        return iC == 0;
    }
}
