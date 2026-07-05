package com.anthropic.claude.analytics.health;

import defpackage.fq6;
import defpackage.ij8;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.tk8;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/anthropic/claude/analytics/health/HealthMetricAction;", "", "", "stringValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getStringValue", "()Ljava/lang/String;", "Companion", "tk8", "UNSPECIFIED", "LOGIN", "SIGNUP", "MESSAGE_SEND", "CONVERSATION_OPEN", "CONVERSATION_CREATE", "PROJECT_CREATE", "PROJECTS_LOAD", "PAID_CONVERSION", "ONBOARDING_COMPLETE", "VOICE_DICTATION", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class HealthMetricAction {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ HealthMetricAction[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final tk8 Companion;
    private final String stringValue;
    public static final HealthMetricAction UNSPECIFIED = new HealthMetricAction("UNSPECIFIED", 0, "unspecified");
    public static final HealthMetricAction LOGIN = new HealthMetricAction("LOGIN", 1, "auth.login");
    public static final HealthMetricAction SIGNUP = new HealthMetricAction("SIGNUP", 2, "auth.signup");
    public static final HealthMetricAction MESSAGE_SEND = new HealthMetricAction("MESSAGE_SEND", 3, "chat.message_send");
    public static final HealthMetricAction CONVERSATION_OPEN = new HealthMetricAction("CONVERSATION_OPEN", 4, "chat.conversation_open");
    public static final HealthMetricAction CONVERSATION_CREATE = new HealthMetricAction("CONVERSATION_CREATE", 5, "chat.conversation_create");
    public static final HealthMetricAction PROJECT_CREATE = new HealthMetricAction("PROJECT_CREATE", 6, "chat.project_create");
    public static final HealthMetricAction PROJECTS_LOAD = new HealthMetricAction("PROJECTS_LOAD", 7, "page.projects_load");
    public static final HealthMetricAction PAID_CONVERSION = new HealthMetricAction("PAID_CONVERSION", 8, "page.paid_conversion");
    public static final HealthMetricAction ONBOARDING_COMPLETE = new HealthMetricAction("ONBOARDING_COMPLETE", 9, "page.onboarding_complete");
    public static final HealthMetricAction VOICE_DICTATION = new HealthMetricAction("VOICE_DICTATION", 10, "voice.dictation");

    private static final /* synthetic */ HealthMetricAction[] $values() {
        return new HealthMetricAction[]{UNSPECIFIED, LOGIN, SIGNUP, MESSAGE_SEND, CONVERSATION_OPEN, CONVERSATION_CREATE, PROJECT_CREATE, PROJECTS_LOAD, PAID_CONVERSION, ONBOARDING_COMPLETE, VOICE_DICTATION};
    }

    static {
        HealthMetricAction[] healthMetricActionArr$values = $values();
        $VALUES = healthMetricActionArr$values;
        $ENTRIES = wd6.n0(healthMetricActionArr$values);
        Companion = new tk8();
        $cachedSerializer$delegate = yb5.w(w1a.F, new ij8(12));
    }

    private HealthMetricAction(String str, int i, String str2) {
        this.stringValue = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.health.HealthMetricAction", values(), new String[]{"unspecified", "auth.login", "auth.signup", "chat.message_send", "chat.conversation_open", "chat.conversation_create", "chat.project_create", "page.projects_load", "page.paid_conversion", "page.onboarding_complete", "voice.dictation"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static HealthMetricAction valueOf(String str) {
        return (HealthMetricAction) Enum.valueOf(HealthMetricAction.class, str);
    }

    public static HealthMetricAction[] values() {
        return (HealthMetricAction[]) $VALUES.clone();
    }

    public final String getStringValue() {
        return this.stringValue;
    }
}
