package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class isg extends hsg {
    public static String c0(char[] cArr, int i, int i2) {
        e2 e2Var = i2.Companion;
        int length = cArr.length;
        e2Var.getClass();
        e2.a(i, i2, length);
        return new String(cArr, i, i2 - i);
    }

    public static boolean d0(CharSequence charSequence, CharSequence charSequence2) {
        boolean z = charSequence instanceof String;
        if (z && charSequence2 != null) {
            return ((String) charSequence).contentEquals(charSequence2);
        }
        if (z && (charSequence2 instanceof String)) {
            return charSequence.equals(charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence != null && charSequence2 != null && charSequence.length() == charSequence2.length()) {
            int length = charSequence.length();
            for (int i = 0; i < length; i++) {
                if (charSequence.charAt(i) == charSequence2.charAt(i)) {
                }
            }
            return true;
        }
        return false;
    }

    public static String e0(byte[] bArr) {
        bArr.getClass();
        return new String(bArr, dj2.a);
    }

    public static String f0(int i, int i2, int i3, byte[] bArr) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        bArr.getClass();
        e2 e2Var = i2.Companion;
        int length = bArr.length;
        e2Var.getClass();
        e2.a(i, i2, length);
        return new String(bArr, i, i2 - i, dj2.a);
    }

    public static byte[] g0(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(dj2.a);
        bytes.getClass();
        return bytes;
    }

    public static boolean h0(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        return !z ? str.endsWith(str2) : str.regionMatches(true, str.length() - str2.length(), str2, 0, str2.length());
    }

    public static boolean j0(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static final void k0(String str) {
        throw new NumberFormatException(grc.n('\'', "Invalid number format: '", str));
    }

    public static boolean l0(int i, int i2, int i3, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    public static String m0(int i, String str) {
        str.getClass();
        if (i < 0) {
            mr9.q(vb7.p("Count 'n' must be non-negative, but was ", i, '.'));
            return null;
        }
        if (i == 0) {
            return "";
        }
        int i2 = 1;
        if (i == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length != 1) {
            StringBuilder sb = new StringBuilder(str.length() * i);
            if (1 <= i) {
                while (true) {
                    sb.append((CharSequence) str);
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                }
            }
            return sb.toString();
        }
        char cCharAt = str.charAt(0);
        char[] cArr = new char[i];
        for (int i3 = 0; i3 < i; i3++) {
            cArr[i3] = cCharAt;
        }
        return new String(cArr);
    }

    public static String n0(String str, String str2, String str3, boolean z) {
        grc.B(str, str2, str3);
        int i = 0;
        int iD0 = bsg.D0(str, str2, 0, z);
        if (iD0 < 0) {
            return str;
        }
        int length = str2.length();
        int i2 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i, iD0);
            sb.append(str3);
            i = iD0 + length;
            if (iD0 >= str.length()) {
                break;
            }
            iD0 = bsg.D0(str, str2, iD0 + i2, z);
        } while (iD0 > 0);
        sb.append((CharSequence) str, i, str.length());
        return sb.toString();
    }

    public static String o0(String str, char c, char c2) {
        str.getClass();
        String strReplace = str.replace(c, c2);
        strReplace.getClass();
        return strReplace;
    }

    public static boolean p0(String str, String str2, int i, boolean z) {
        str.getClass();
        return !z ? str.startsWith(str2, i) : l0(i, 0, str2.length(), str, str2, z);
    }

    public static boolean q0(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        return !z ? str.startsWith(str2) : l0(0, 0, str2.length(), str, str2, z);
    }

    public static Integer r0(int i, String str) {
        boolean z;
        int i2;
        int i3;
        str.getClass();
        gb9.q(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char cCharAt = str.charAt(0);
        int i5 = -2147483647;
        if (cCharAt < '0') {
            i2 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i5 = Integer.MIN_VALUE;
                z = true;
            }
        } else {
            z = false;
            i2 = 0;
        }
        int i6 = -59652323;
        while (i2 < length) {
            int iDigit = Character.digit((int) str.charAt(i2), i);
            if (iDigit < 0) {
                return null;
            }
            if ((i4 < i6 && (i6 != -59652323 || i4 < (i6 = i5 / i))) || (i3 = i4 * i) < i5 + iDigit) {
                return null;
            }
            i4 = i3 - iDigit;
            i2++;
        }
        return z ? Integer.valueOf(i4) : Integer.valueOf(-i4);
    }

    public static Integer s0(String str) {
        str.getClass();
        return r0(10, str);
    }

    public static Long t0(String str) {
        boolean z;
        str.getClass();
        gb9.q(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (cCharAt < '0') {
            z = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z = false;
                i = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i = 1;
            }
        } else {
            z = false;
        }
        long j2 = 0;
        long j3 = -256204778801521550L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j2 < j3) {
                if (j3 != -256204778801521550L) {
                    return null;
                }
                j3 = j / 10;
                if (j2 < j3) {
                    return null;
                }
            }
            long j4 = j2 * 10;
            long j5 = iDigit;
            if (j4 < j + j5) {
                return null;
            }
            j2 = j4 - j5;
            i++;
        }
        return z ? Long.valueOf(j2) : Long.valueOf(-j2);
    }
}
