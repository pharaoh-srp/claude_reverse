package com.anthropic.claude.analytics.events;

import defpackage.baj;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.p3j;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/anthropic/claude/analytics/events/WidgetEvents$ShortcutType", "", "Lcom/anthropic/claude/analytics/events/WidgetEvents$ShortcutType;", "<init>", "(Ljava/lang/String;I)V", "Companion", "baj", "UNSPECIFIED", "ARTIFACT_IN_CHAT", "CHAT", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class WidgetEvents$ShortcutType {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ WidgetEvents$ShortcutType[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final baj Companion;
    public static final WidgetEvents$ShortcutType UNSPECIFIED = new WidgetEvents$ShortcutType("UNSPECIFIED", 0);
    public static final WidgetEvents$ShortcutType ARTIFACT_IN_CHAT = new WidgetEvents$ShortcutType("ARTIFACT_IN_CHAT", 1);
    public static final WidgetEvents$ShortcutType CHAT = new WidgetEvents$ShortcutType("CHAT", 2);

    private static final /* synthetic */ WidgetEvents$ShortcutType[] $values() {
        return new WidgetEvents$ShortcutType[]{UNSPECIFIED, ARTIFACT_IN_CHAT, CHAT};
    }

    static {
        WidgetEvents$ShortcutType[] widgetEvents$ShortcutTypeArr$values = $values();
        $VALUES = widgetEvents$ShortcutTypeArr$values;
        $ENTRIES = wd6.n0(widgetEvents$ShortcutTypeArr$values);
        Companion = new baj();
        $cachedSerializer$delegate = yb5.w(w1a.F, new p3j(20));
    }

    private WidgetEvents$ShortcutType(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.WidgetEvents.ShortcutType", values(), new String[]{"unspecified", "artifact_in_chat", "chat"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static WidgetEvents$ShortcutType valueOf(String str) {
        return (WidgetEvents$ShortcutType) Enum.valueOf(WidgetEvents$ShortcutType.class, str);
    }

    public static WidgetEvents$ShortcutType[] values() {
        return (WidgetEvents$ShortcutType[]) $VALUES.clone();
    }
}
