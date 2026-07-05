package io.sentry;

import com.anthropic.claude.api.tasks.TaskSessionEvent;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class c7 {
    public final io.sentry.protocol.w a;
    public final m7 b;
    public final Boolean c;

    static {
        Pattern.compile("^[ \\t]*([0-9a-f]{32})-([0-9a-f]{16})(-[01])?[ \\t]*$", 2);
    }

    public c7(io.sentry.protocol.w wVar, m7 m7Var, Boolean bool) {
        this.a = wVar;
        this.b = m7Var;
        this.c = bool;
    }

    public final String a() {
        m7 m7Var = this.b;
        Boolean bool = this.c;
        io.sentry.protocol.w wVar = this.a;
        if (bool == null) {
            return wVar + "-" + m7Var;
        }
        return wVar + "-" + m7Var + "-" + (bool.booleanValue() ? "1" : TaskSessionEvent.REPLAY_FROM_START);
    }
}
