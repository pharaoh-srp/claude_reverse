package defpackage;

import com.anthropic.claude.api.chat.tool.Tool;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dr9 {
    public static final Tool.KnownTool a;
    public static final List b;

    static {
        Tool.KnownTool knownTool = new Tool.KnownTool("project_knowledge_search", "project_knowledge_search");
        a = knownTool;
        b = x44.X("web_fetch", "conversation_search", knownTool.getName());
    }
}
