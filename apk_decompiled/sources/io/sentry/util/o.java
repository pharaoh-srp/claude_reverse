package io.sentry.util;

import defpackage.vb7;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public static final Charset a = Charset.forName("UTF-8");
    public static final Pattern b = Pattern.compile("[\\W_]+");

    public static String a(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String strSubstring = str.substring(0, 1);
        Locale locale = Locale.ROOT;
        sb.append(strSubstring.toUpperCase(locale));
        sb.append(str.substring(1).toLowerCase(locale));
        return sb.toString();
    }

    public static String b(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            sb.append((CharSequence) it.next());
            while (it.hasNext()) {
                sb.append((CharSequence) ",");
                sb.append((CharSequence) it.next());
            }
        }
        return sb.toString();
    }

    public static String c(String str) {
        return (str != null && str.startsWith("\"") && str.endsWith("\"")) ? vb7.j(1, 1, str) : str;
    }
}
