package com.anthropic.claude.api.experience;

import defpackage.aa7;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.rk3;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import defpackage.z97;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/api/experience/ExperiencePlacement;", "", "", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "Companion", "z97", "UNKNOWN", "ANDROID_SPOTLIGHT", "ANDROID_CHAT_TOOLTIP", "ANDROID_CODE_SESSION_LIST_BANNER", "ANDROID_CHAT_INPUT_BANNER", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = aa7.class)
public final class ExperiencePlacement {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ExperiencePlacement[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final z97 Companion;
    private final String key;
    public static final ExperiencePlacement UNKNOWN = new ExperiencePlacement("UNKNOWN", 0, "unknown");
    public static final ExperiencePlacement ANDROID_SPOTLIGHT = new ExperiencePlacement("ANDROID_SPOTLIGHT", 1, "android-spotlight");
    public static final ExperiencePlacement ANDROID_CHAT_TOOLTIP = new ExperiencePlacement("ANDROID_CHAT_TOOLTIP", 2, "android-chat-tooltip");
    public static final ExperiencePlacement ANDROID_CODE_SESSION_LIST_BANNER = new ExperiencePlacement("ANDROID_CODE_SESSION_LIST_BANNER", 3, "android-code-session-list-banner");
    public static final ExperiencePlacement ANDROID_CHAT_INPUT_BANNER = new ExperiencePlacement("ANDROID_CHAT_INPUT_BANNER", 4, "android-chat-input-banner");

    private static final /* synthetic */ ExperiencePlacement[] $values() {
        return new ExperiencePlacement[]{UNKNOWN, ANDROID_SPOTLIGHT, ANDROID_CHAT_TOOLTIP, ANDROID_CODE_SESSION_LIST_BANNER, ANDROID_CHAT_INPUT_BANNER};
    }

    static {
        ExperiencePlacement[] experiencePlacementArr$values = $values();
        $VALUES = experiencePlacementArr$values;
        $ENTRIES = wd6.n0(experiencePlacementArr$values);
        Companion = new z97();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new rk3(27));
    }

    private ExperiencePlacement(String str, int i, String str2) {
        this.key = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.experience.ExperiencePlacement", values(), new String[]{"unknown", "android-spotlight", "android-chat-tooltip", "android-code-session-list-banner", "android-chat-input-banner"}, new Annotation[][]{null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ExperiencePlacement valueOf(String str) {
        return (ExperiencePlacement) Enum.valueOf(ExperiencePlacement.class, str);
    }

    public static ExperiencePlacement[] values() {
        return (ExperiencePlacement[]) $VALUES.clone();
    }
}
