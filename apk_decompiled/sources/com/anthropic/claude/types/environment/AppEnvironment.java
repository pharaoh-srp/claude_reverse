package com.anthropic.claude.types.environment;

import defpackage.fq6;
import defpackage.j7;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.si0;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/anthropic/claude/types/environment/AppEnvironment;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "si0", "PRODUCTION", "STAGING", "DEVELOPMENT", "Claude:types"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class AppEnvironment {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ AppEnvironment[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final si0 Companion;
    public static final AppEnvironment PRODUCTION = new AppEnvironment("PRODUCTION", 0);
    public static final AppEnvironment STAGING = new AppEnvironment("STAGING", 1);
    public static final AppEnvironment DEVELOPMENT = new AppEnvironment("DEVELOPMENT", 2);

    private static final /* synthetic */ AppEnvironment[] $values() {
        return new AppEnvironment[]{PRODUCTION, STAGING, DEVELOPMENT};
    }

    static {
        AppEnvironment[] appEnvironmentArr$values = $values();
        $VALUES = appEnvironmentArr$values;
        $ENTRIES = wd6.n0(appEnvironmentArr$values);
        Companion = new si0();
        $cachedSerializer$delegate = yb5.w(w1a.F, new j7(16));
    }

    private AppEnvironment(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.types.environment.AppEnvironment", values(), new String[]{"production", "staging", "development"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static AppEnvironment valueOf(String str) {
        return (AppEnvironment) Enum.valueOf(AppEnvironment.class, str);
    }

    public static AppEnvironment[] values() {
        return (AppEnvironment[]) $VALUES.clone();
    }
}
