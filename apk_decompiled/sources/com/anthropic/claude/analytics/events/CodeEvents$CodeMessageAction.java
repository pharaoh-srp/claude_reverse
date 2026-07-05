package com.anthropic.claude.analytics.events;

import defpackage.cs3;
import defpackage.fq6;
import defpackage.gi3;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/anthropic/claude/analytics/events/CodeEvents$CodeMessageAction", "", "Lcom/anthropic/claude/analytics/events/CodeEvents$CodeMessageAction;", "<init>", "(Ljava/lang/String;I)V", "Companion", "cs3", "UNSPECIFIED", "COPY", "SPEAK", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class CodeEvents$CodeMessageAction {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ CodeEvents$CodeMessageAction[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final cs3 Companion;
    public static final CodeEvents$CodeMessageAction UNSPECIFIED = new CodeEvents$CodeMessageAction("UNSPECIFIED", 0);
    public static final CodeEvents$CodeMessageAction COPY = new CodeEvents$CodeMessageAction("COPY", 1);
    public static final CodeEvents$CodeMessageAction SPEAK = new CodeEvents$CodeMessageAction("SPEAK", 2);

    private static final /* synthetic */ CodeEvents$CodeMessageAction[] $values() {
        return new CodeEvents$CodeMessageAction[]{UNSPECIFIED, COPY, SPEAK};
    }

    static {
        CodeEvents$CodeMessageAction[] codeEvents$CodeMessageActionArr$values = $values();
        $VALUES = codeEvents$CodeMessageActionArr$values;
        $ENTRIES = wd6.n0(codeEvents$CodeMessageActionArr$values);
        Companion = new cs3();
        $cachedSerializer$delegate = yb5.w(w1a.F, new gi3(21));
    }

    private CodeEvents$CodeMessageAction(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.CodeEvents.CodeMessageAction", values(), new String[]{"unknown", "copy", "speak"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static CodeEvents$CodeMessageAction valueOf(String str) {
        return (CodeEvents$CodeMessageAction) Enum.valueOf(CodeEvents$CodeMessageAction.class, str);
    }

    public static CodeEvents$CodeMessageAction[] values() {
        return (CodeEvents$CodeMessageAction[]) $VALUES.clone();
    }
}
