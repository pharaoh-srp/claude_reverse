package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class br {
    public static final Set a = mp0.Z0(new String[]{"Agent", "mcp__remote-devices__start_task", "mcp__remote-devices__start_code_task", "mcp__dispatch__start_task", "mcp__dispatch__start_code_task"});

    public static boolean a(String str) {
        str.getClass();
        if (a.contains(str)) {
            return true;
        }
        return isg.q0(str, "mcp__", false) && isg.h0(str, "__create_session", false);
    }
}
