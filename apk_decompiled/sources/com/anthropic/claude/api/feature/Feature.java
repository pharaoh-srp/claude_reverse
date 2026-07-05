package com.anthropic.claude.api.feature;

import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.ff7;
import defpackage.fq6;
import defpackage.jd7;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.qg7;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lcom/anthropic/claude/api/feature/Feature;", "", "", ExperienceToggle.DEFAULT_PARAM_KEY, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "ff7", "UNKNOWN", "WEB_SEARCH", "SAFFRON", "WIGGLE", "DITTOS", "CHAT", "CLAUDE_CODE_WEB", "CLAUDE_CODE_AUTO_PERMISSIONS", "TOOL_APPROVAL_DEFAULT_ALWAYS_ALLOW", "PUBLIC_PROJECTS", "CONVERSATION_PREFERENCES", "CONVERSATION_SEARCH", "DRAMATIC_SHRIMP", "THIRD_PARTY_ANALYTICS", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = qg7.class)
public final class Feature {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ Feature[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final ff7 Companion;
    private final String value;
    public static final Feature UNKNOWN = new Feature("UNKNOWN", 0, "unknown");
    public static final Feature WEB_SEARCH = new Feature("WEB_SEARCH", 1, "web_search");
    public static final Feature SAFFRON = new Feature("SAFFRON", 2, "saffron");
    public static final Feature WIGGLE = new Feature("WIGGLE", 3, "wiggle");
    public static final Feature DITTOS = new Feature("DITTOS", 4, "dittos");
    public static final Feature CHAT = new Feature("CHAT", 5, "chat");
    public static final Feature CLAUDE_CODE_WEB = new Feature("CLAUDE_CODE_WEB", 6, "claude_code_web");
    public static final Feature CLAUDE_CODE_AUTO_PERMISSIONS = new Feature("CLAUDE_CODE_AUTO_PERMISSIONS", 7, "claude_code_desktop_auto_permissions");
    public static final Feature TOOL_APPROVAL_DEFAULT_ALWAYS_ALLOW = new Feature("TOOL_APPROVAL_DEFAULT_ALWAYS_ALLOW", 8, "tool_approval_default_always_allow");
    public static final Feature PUBLIC_PROJECTS = new Feature("PUBLIC_PROJECTS", 9, "public_projects");
    public static final Feature CONVERSATION_PREFERENCES = new Feature("CONVERSATION_PREFERENCES", 10, "conversation_preferences");
    public static final Feature CONVERSATION_SEARCH = new Feature("CONVERSATION_SEARCH", 11, "conversation_search");
    public static final Feature DRAMATIC_SHRIMP = new Feature("DRAMATIC_SHRIMP", 12, "dramatic_shrimp");
    public static final Feature THIRD_PARTY_ANALYTICS = new Feature("THIRD_PARTY_ANALYTICS", 13, "third_party_analytics");

    private static final /* synthetic */ Feature[] $values() {
        return new Feature[]{UNKNOWN, WEB_SEARCH, SAFFRON, WIGGLE, DITTOS, CHAT, CLAUDE_CODE_WEB, CLAUDE_CODE_AUTO_PERMISSIONS, TOOL_APPROVAL_DEFAULT_ALWAYS_ALLOW, PUBLIC_PROJECTS, CONVERSATION_PREFERENCES, CONVERSATION_SEARCH, DRAMATIC_SHRIMP, THIRD_PARTY_ANALYTICS};
    }

    static {
        Feature[] featureArr$values = $values();
        $VALUES = featureArr$values;
        $ENTRIES = wd6.n0(featureArr$values);
        Companion = new ff7();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new jd7(1));
    }

    private Feature(String str, int i, String str2) {
        this.value = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.feature.Feature", values(), new String[]{"unknown", "web_search", "saffron", "wiggle", "dittos", "chat", "claude_code_web", "claude_code_desktop_auto_permissions", "tool_approval_default_always_allow", "public_projects", "conversation_preferences", "conversation_search", "dramatic_shrimp", "third_party_analytics"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static Feature valueOf(String str) {
        return (Feature) Enum.valueOf(Feature.class, str);
    }

    public static Feature[] values() {
        return (Feature[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
