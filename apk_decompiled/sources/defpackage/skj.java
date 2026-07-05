package defpackage;

import com.anthropic.claude.api.tasks.TaskSessionEvent;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class skj {
    public static final void a(gmf gmfVar, String str, String str2) {
        gmfVar.getClass();
        str.getClass();
        str2.getClass();
        ArrayList arrayList = (ArrayList) gmfVar.F;
        arrayList.add(str);
        arrayList.add(bsg.k1(str2).toString());
    }

    public static mwi b(qh9 qh9Var) {
        try {
            return new mwi(qh9Var.s("count").k());
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type FrozenFrame", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type FrozenFrame", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type FrozenFrame", e3);
            return null;
        }
    }

    public static final void c(String str) {
        str.getClass();
        if (str.length() <= 0) {
            sz6.p("name is empty");
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('!' > cCharAt || cCharAt >= 127) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                gb9.q(16);
                String string = Integer.toString(cCharAt, 16);
                string.getClass();
                if (string.length() < 2) {
                    string = TaskSessionEvent.REPLAY_FROM_START.concat(string);
                }
                sb.append(string);
                sb.append(" at ");
                sb.append(i);
                sb.append(" in header name: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final void d(String str, String str2) {
        str.getClass();
        str2.getClass();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                gb9.q(16);
                String string = Integer.toString(cCharAt, 16);
                string.getClass();
                if (string.length() < 2) {
                    string = TaskSessionEvent.REPLAY_FROM_START.concat(string);
                }
                sb.append(string);
                sb.append(" at ");
                sb.append(i);
                sb.append(" in ");
                sb.append(str2);
                sb.append(" value");
                sb.append(zkj.k(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }
}
