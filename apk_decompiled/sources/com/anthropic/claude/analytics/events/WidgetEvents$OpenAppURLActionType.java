package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.p3j;
import defpackage.w1a;
import defpackage.w9j;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/anthropic/claude/analytics/events/WidgetEvents$OpenAppURLActionType", "", "Lcom/anthropic/claude/analytics/events/WidgetEvents$OpenAppURLActionType;", "<init>", "(Ljava/lang/String;I)V", "Companion", "w9j", "UNSPECIFIED", "NEW_CHAT", "OPEN_CAMERA", "START_DICTATION", "OPEN", "START_VOICE", "OPEN_PHOTO_LIBRARY", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class WidgetEvents$OpenAppURLActionType {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ WidgetEvents$OpenAppURLActionType[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final w9j Companion;
    public static final WidgetEvents$OpenAppURLActionType UNSPECIFIED = new WidgetEvents$OpenAppURLActionType("UNSPECIFIED", 0);
    public static final WidgetEvents$OpenAppURLActionType NEW_CHAT = new WidgetEvents$OpenAppURLActionType("NEW_CHAT", 1);
    public static final WidgetEvents$OpenAppURLActionType OPEN_CAMERA = new WidgetEvents$OpenAppURLActionType("OPEN_CAMERA", 2);
    public static final WidgetEvents$OpenAppURLActionType START_DICTATION = new WidgetEvents$OpenAppURLActionType("START_DICTATION", 3);
    public static final WidgetEvents$OpenAppURLActionType OPEN = new WidgetEvents$OpenAppURLActionType("OPEN", 4);
    public static final WidgetEvents$OpenAppURLActionType START_VOICE = new WidgetEvents$OpenAppURLActionType("START_VOICE", 5);
    public static final WidgetEvents$OpenAppURLActionType OPEN_PHOTO_LIBRARY = new WidgetEvents$OpenAppURLActionType("OPEN_PHOTO_LIBRARY", 6);

    private static final /* synthetic */ WidgetEvents$OpenAppURLActionType[] $values() {
        return new WidgetEvents$OpenAppURLActionType[]{UNSPECIFIED, NEW_CHAT, OPEN_CAMERA, START_DICTATION, OPEN, START_VOICE, OPEN_PHOTO_LIBRARY};
    }

    static {
        WidgetEvents$OpenAppURLActionType[] widgetEvents$OpenAppURLActionTypeArr$values = $values();
        $VALUES = widgetEvents$OpenAppURLActionTypeArr$values;
        $ENTRIES = wd6.n0(widgetEvents$OpenAppURLActionTypeArr$values);
        Companion = new w9j();
        $cachedSerializer$delegate = yb5.w(w1a.F, new p3j(17));
    }

    private WidgetEvents$OpenAppURLActionType(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.WidgetEvents.OpenAppURLActionType", values(), new String[]{"unspecified", "new_chat", "open_camera", "start_dictation", "open", "start_voice", "open_photo_library"}, new Annotation[][]{null, null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static WidgetEvents$OpenAppURLActionType valueOf(String str) {
        return (WidgetEvents$OpenAppURLActionType) Enum.valueOf(WidgetEvents$OpenAppURLActionType.class, str);
    }

    public static WidgetEvents$OpenAppURLActionType[] values() {
        return (WidgetEvents$OpenAppURLActionType[]) $VALUES.clone();
    }
}
