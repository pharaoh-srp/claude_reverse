package com.anthropic.claude.code.remote;

import com.anthropic.claude.types.strings.ModelId;
import defpackage.bsg;
import defpackage.ide;
import defpackage.isg;
import defpackage.jrf;
import defpackage.kgh;
import defpackage.mp0;
import defpackage.vb7;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j {
    public static final long a;
    public static final ide b;
    public static final ide c;
    public static final ide d;
    public static final Set e;

    static {
        Set set = jrf.B;
        a = jrf.A + 150000;
        b = new ide("^claude-([a-z]+)-(\\d+)(?:-(\\d{1,2}))?(?!\\d)(?:-\\d{8})?(-fast)?");
        c = new ide("^(?:claude-)?([a-z]+)-v(\\d+)((?:-[a-z]+)*)");
        d = new ide("^(?:claude-)?([a-z]+)((?:-[a-z]+)*)-latest$");
        e = mp0.Z0(new String[]{"opus", "sonnet", "haiku"});
    }

    public static final String a(String str) {
        str.getClass();
        if (bsg.z0(str, ']')) {
            int iK0 = bsg.K0(str, '[', 0, 6);
            Integer numValueOf = Integer.valueOf(iK0);
            if (iK0 < 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                String strJ = vb7.j(1, numValueOf.intValue() + 1, str);
                if (strJ.length() > 0) {
                    return strJ;
                }
            }
        }
        return null;
    }

    public static final String b(String str) {
        str.getClass();
        return a(str) == null ? str : ModelId.m1059constructorimpl(str.substring(0, bsg.K0(str, '[', 0, 6)));
    }

    public static final boolean c(String str) {
        if (str == null) {
            return false;
        }
        return bsg.u0(str, "bridge_offline", true) || bsg.u0(str, "bridge is offline", true);
    }

    public static final String d(String str) {
        String string;
        if (str.length() > 0) {
            StringBuilder sb = new StringBuilder();
            String strValueOf = String.valueOf(str.charAt(0));
            strValueOf.getClass();
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            sb.append((Object) upperCase);
            sb.append(str.substring(1));
            string = sb.toString();
        } else {
            string = str;
        }
        int i = str.length() > 3 ? 3 : 1;
        return str.length() <= i ? string : kgh.o(bsg.j1(i, string), isg.m0(str.length() - i, "*"));
    }
}
