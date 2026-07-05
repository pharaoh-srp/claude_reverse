package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ir8 {
    public static final Map c = Collections.EMPTY_MAP;
    public final StringBuilder a;
    public char b = 0;

    public ir8(StringBuilder sb) {
        this.a = sb;
    }

    public final void a(String str) {
        try {
            this.a.append((CharSequence) str);
            int length = str.length();
            if (length != 0) {
                this.b = str.charAt(length - 1);
            }
        } catch (IOException e) {
            xh6.h(e);
        }
    }

    public final void b() {
        char c2 = this.b;
        if (c2 == 0 || c2 == '\n') {
            return;
        }
        a("\n");
    }

    public final void c(String str) {
        d(str, c, false);
    }

    public final void d(String str, Map map, boolean z) {
        a("<");
        a(str);
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                a(" ");
                a(pu6.a((String) entry.getKey()));
                a("=\"");
                a(pu6.a((String) entry.getValue()));
                a("\"");
            }
        }
        if (z) {
            a(" /");
        }
        a(">");
    }
}
