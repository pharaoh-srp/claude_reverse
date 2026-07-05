package com.anthropic.claude.analytics.events;

import defpackage.b5;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.vj0;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/anthropic/claude/analytics/events/AppIntentEvents$AppIntentType", "", "Lcom/anthropic/claude/analytics/events/AppIntentEvents$AppIntentType;", "<init>", "(Ljava/lang/String;I)V", "Companion", "vj0", "UNSPECIFIED", "ASK_CLAUDE", "OPEN_CLAUDE", "CAMERA_CAPTURE", "DICTATION", "VOICE_MODE", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class AppIntentEvents$AppIntentType {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ AppIntentEvents$AppIntentType[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final vj0 Companion;
    public static final AppIntentEvents$AppIntentType UNSPECIFIED = new AppIntentEvents$AppIntentType("UNSPECIFIED", 0);
    public static final AppIntentEvents$AppIntentType ASK_CLAUDE = new AppIntentEvents$AppIntentType("ASK_CLAUDE", 1);
    public static final AppIntentEvents$AppIntentType OPEN_CLAUDE = new AppIntentEvents$AppIntentType("OPEN_CLAUDE", 2);
    public static final AppIntentEvents$AppIntentType CAMERA_CAPTURE = new AppIntentEvents$AppIntentType("CAMERA_CAPTURE", 3);
    public static final AppIntentEvents$AppIntentType DICTATION = new AppIntentEvents$AppIntentType("DICTATION", 4);
    public static final AppIntentEvents$AppIntentType VOICE_MODE = new AppIntentEvents$AppIntentType("VOICE_MODE", 5);

    private static final /* synthetic */ AppIntentEvents$AppIntentType[] $values() {
        return new AppIntentEvents$AppIntentType[]{UNSPECIFIED, ASK_CLAUDE, OPEN_CLAUDE, CAMERA_CAPTURE, DICTATION, VOICE_MODE};
    }

    static {
        AppIntentEvents$AppIntentType[] appIntentEvents$AppIntentTypeArr$values = $values();
        $VALUES = appIntentEvents$AppIntentTypeArr$values;
        $ENTRIES = wd6.n0(appIntentEvents$AppIntentTypeArr$values);
        Companion = new vj0();
        $cachedSerializer$delegate = yb5.w(w1a.F, new b5(24));
    }

    private AppIntentEvents$AppIntentType(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.AppIntentEvents.AppIntentType", values(), new String[]{"unknown", "ask_claude", "open_claude", "camera_capture", "dictation", "voice_mode"}, new Annotation[][]{null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static AppIntentEvents$AppIntentType valueOf(String str) {
        return (AppIntentEvents$AppIntentType) Enum.valueOf(AppIntentEvents$AppIntentType.class, str);
    }

    public static AppIntentEvents$AppIntentType[] values() {
        return (AppIntentEvents$AppIntentType[]) $VALUES.clone();
    }
}
