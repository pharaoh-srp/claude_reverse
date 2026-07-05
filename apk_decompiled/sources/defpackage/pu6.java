package defpackage;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pu6 {
    public static final Pattern a = Pattern.compile("[\\\\&]");
    public static final Pattern b = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    public static final Pattern c;
    public static final bm4 d;

    static {
        Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");
        c = Pattern.compile("[ \t\r\n]+");
        d = new bm4();
    }

    public static String a(String str) {
        String str2;
        StringBuilder sb = null;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\"') {
                str2 = "&quot;";
            } else if (cCharAt == '&') {
                str2 = "&amp;";
            } else if (cCharAt == '<') {
                str2 = "&lt;";
            } else if (cCharAt != '>') {
                if (sb != null) {
                    sb.append(cCharAt);
                }
            } else {
                str2 = "&gt;";
            }
            if (sb == null) {
                sb = new StringBuilder();
                sb.append((CharSequence) str, 0, i);
            }
            sb.append(str2);
        }
        return sb != null ? sb.toString() : str;
    }

    public static String b(String str) {
        String strTrim = str.trim();
        Locale locale = Locale.ROOT;
        return c.matcher(strTrim.toLowerCase(locale).toUpperCase(locale)).replaceAll(" ");
    }

    public static String c(String str) {
        if (!a.matcher(str).find()) {
            return str;
        }
        Matcher matcher = b.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length() + 16);
        int iEnd = 0;
        do {
            sb.append((CharSequence) str, iEnd, matcher.start());
            String strGroup = matcher.group();
            d.getClass();
            if (strGroup.charAt(0) == '\\') {
                sb.append((CharSequence) strGroup, 1, strGroup.length());
            } else {
                sb.append(vp8.a(strGroup));
            }
            iEnd = matcher.end();
        } while (matcher.find());
        if (iEnd != str.length()) {
            sb.append((CharSequence) str, iEnd, str.length());
        }
        return sb.toString();
    }
}
