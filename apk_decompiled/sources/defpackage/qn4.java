package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qn4 {
    public static final ide a = new ide(ij0.j("<(", w44.S0(w44.i1(x44.X("system-reminder", "task-notification", "agent-notification", "bash-notification", "slack_context", "uploaded_files", "available-deferred-tools", "new-diagnostics", "critical_user_preferences_reminder", "persisted-output", "local-command-caveat", "tick", "goal", "mcp-resource", "mcp-resource-update", "mcp-polling-update", "teammate-message", "channel-message", "launch-selected-element", "connected_office_files", "thinking", "ide_opened_file", "ide_selection", "ide_diagnostics", "browser_instruction", "cell", "cell_type", "language", "tool_use_error", "bash-input", "bash-stdout", "bash-stderr", "command-message", "command-args", "local-command-stdout", "local-command-stderr", "no-action-needed", "comprehensive-mode-instructions", "cu_window_hints", "widget_context_hint", "preview-annotation-context"), new mt7(21)), "|", null, null, new fc4(12), 30), ")[^>]*>[\\s\\S]*?</\\1>\\s*"));
    public static final ide b = new ide("<command-name>(.*?)</command-name>");
    public static final Set c = mp0.Z0(new String[]{"[Request interrupted by user for tool use]", "[Request interrupted by user]"});

    public static String a(String str) {
        str.getClass();
        if (!c.contains(str)) {
            String strB = b(str);
            strB.getClass();
            if (bsg.u0(strB, "<command-name>", false)) {
                ova ovaVarB = b.b(strB);
                String str2 = ovaVarB != null ? (String) ((mva) ovaVarB.a()).get(1) : null;
                if (str2 != null) {
                    strB = str2;
                }
            }
            if (strB.length() != 0) {
                return strB;
            }
        }
        return null;
    }

    public static String b(String str) {
        str.getClass();
        return bsg.k1(a.h(str, "")).toString();
    }
}
