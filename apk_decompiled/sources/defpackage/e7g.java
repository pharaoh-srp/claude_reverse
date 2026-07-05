package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class e7g extends ctk {
    public final String k(String str) {
        if (str == null || str.isEmpty()) {
            return "/";
        }
        boolean z = vf4.O1.I;
        StringBuilder sb = null;
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int iIndexOf = str.indexOf(47, i);
            if (iIndexOf != i) {
                int length = iIndexOf == -1 ? str.length() : iIndexOf;
                int i3 = length - i;
                if (i3 > 3 || i3 <= 1 || (str.charAt(i) | ' ') != 118) {
                    int length2 = sb != null ? sb.length() : i;
                    boolean z2 = false;
                    while (i < length && !z2) {
                        char cCharAt = str.charAt(i);
                        i2--;
                        boolean z3 = i2 < 0 && cCharAt <= '9' && cCharAt >= '0';
                        if (!z3) {
                            if (Character.isWhitespace(cCharAt)) {
                                if (sb == null) {
                                    sb = new StringBuilder();
                                    sb.append((CharSequence) str, 0, i);
                                }
                                if (z && sb.length() > 0) {
                                    sb.append(cCharAt);
                                }
                            } else if (sb != null) {
                                sb.append(cCharAt);
                            }
                        }
                        i++;
                        z2 = z3;
                    }
                    if (z2) {
                        if (sb == null) {
                            sb = new StringBuilder();
                            sb.append((CharSequence) str, 0, length2);
                        }
                        sb.setLength(length2);
                        sb.append('?');
                    }
                } else {
                    boolean z4 = true;
                    for (int i4 = i + 1; i4 < length; i4++) {
                        char cCharAt2 = str.charAt(i4);
                        z4 &= cCharAt2 <= '9' && cCharAt2 >= '0';
                    }
                    if (!z4) {
                        if (sb == null) {
                            sb = new StringBuilder();
                            sb.append((CharSequence) str, 0, i);
                        }
                        sb.append('?');
                    } else if (sb != null) {
                        sb.append((CharSequence) str, i, length);
                    }
                }
                i = length + 1;
            } else {
                i++;
            }
            if (iIndexOf != -1 && sb != null) {
                sb.append('/');
            }
        }
        return sb == null ? str : sb.length() == 0 ? "/" : sb.toString();
    }
}
