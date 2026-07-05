package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.gi3;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.sq3;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/anthropic/claude/analytics/events/CodeBlockEvents$CodeBlockAction", "", "Lcom/anthropic/claude/analytics/events/CodeBlockEvents$CodeBlockAction;", "<init>", "(Ljava/lang/String;I)V", "Companion", "sq3", "UNSPECIFIED", "COPY", "FULL_SCREEN", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class CodeBlockEvents$CodeBlockAction {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ CodeBlockEvents$CodeBlockAction[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final sq3 Companion;
    public static final CodeBlockEvents$CodeBlockAction UNSPECIFIED = new CodeBlockEvents$CodeBlockAction("UNSPECIFIED", 0);
    public static final CodeBlockEvents$CodeBlockAction COPY = new CodeBlockEvents$CodeBlockAction("COPY", 1);
    public static final CodeBlockEvents$CodeBlockAction FULL_SCREEN = new CodeBlockEvents$CodeBlockAction("FULL_SCREEN", 2);

    private static final /* synthetic */ CodeBlockEvents$CodeBlockAction[] $values() {
        return new CodeBlockEvents$CodeBlockAction[]{UNSPECIFIED, COPY, FULL_SCREEN};
    }

    static {
        CodeBlockEvents$CodeBlockAction[] codeBlockEvents$CodeBlockActionArr$values = $values();
        $VALUES = codeBlockEvents$CodeBlockActionArr$values;
        $ENTRIES = wd6.n0(codeBlockEvents$CodeBlockActionArr$values);
        Companion = new sq3();
        $cachedSerializer$delegate = yb5.w(w1a.F, new gi3(11));
    }

    private CodeBlockEvents$CodeBlockAction(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.CodeBlockEvents.CodeBlockAction", values(), new String[]{"unknown", "copy", "full_screen"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static CodeBlockEvents$CodeBlockAction valueOf(String str) {
        return (CodeBlockEvents$CodeBlockAction) Enum.valueOf(CodeBlockEvents$CodeBlockAction.class, str);
    }

    public static CodeBlockEvents$CodeBlockAction[] values() {
        return (CodeBlockEvents$CodeBlockAction[]) $VALUES.clone();
    }
}
