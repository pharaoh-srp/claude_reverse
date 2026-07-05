package defpackage;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class sdi {
    public static final Set a;
    public static final LinkedHashSet b;
    public static final Map c;

    static {
        Set<String> setZ0 = mp0.Z0(new String[]{"ultrathink", "ultracode"});
        a = setZ0;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : setZ0) {
            b54.t0(linkedHashSet, x44.X(Character.valueOf(bsg.B0(str)), Character.valueOf(Character.toUpperCase(bsg.B0(str)))));
        }
        b = linkedHashSet;
        c = sta.h0(new cpc('`', '`'), new cpc('\"', '\"'), new cpc('<', '>'), new cpc('{', '}'), new cpc('[', ']'), new cpc('(', ')'), new cpc('\'', '\''));
    }

    public static final boolean a(Character ch) {
        if (ch != null) {
            return Character.isLetterOrDigit(ch.charValue()) || ch.charValue() == '_';
        }
        return false;
    }
}
