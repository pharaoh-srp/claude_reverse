package defpackage;

import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gi5 {
    public static final Charset a;

    static {
        Pattern.compile("(?i)\\bcharset=\\s*(?:[\"'])?([^\\s,;\"']*)");
        Charset charsetForName = Charset.forName("UTF-8");
        a = charsetForName;
        charsetForName.name();
        wzd.K("meta[http-equiv=content-type], meta[charset]");
    }
}
