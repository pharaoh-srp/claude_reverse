package com.anthropic.claude.api.experience;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.ll1;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.p52;
import defpackage.q52;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/anthropic/claude/api/experience/CacheType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "p52", "UNKNOWN", "ACCOUNT", "ACCOUNT_PROFILE", "ACCOUNT_SETTINGS", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = q52.class)
public final class CacheType {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ CacheType[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final p52 Companion;
    public static final CacheType UNKNOWN = new CacheType("UNKNOWN", 0);
    public static final CacheType ACCOUNT = new CacheType("ACCOUNT", 1);
    public static final CacheType ACCOUNT_PROFILE = new CacheType("ACCOUNT_PROFILE", 2);
    public static final CacheType ACCOUNT_SETTINGS = new CacheType("ACCOUNT_SETTINGS", 3);

    private static final /* synthetic */ CacheType[] $values() {
        return new CacheType[]{UNKNOWN, ACCOUNT, ACCOUNT_PROFILE, ACCOUNT_SETTINGS};
    }

    static {
        CacheType[] cacheTypeArr$values = $values();
        $VALUES = cacheTypeArr$values;
        $ENTRIES = wd6.n0(cacheTypeArr$values);
        Companion = new p52();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new ll1(15));
    }

    private CacheType(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.experience.CacheType", values(), new String[]{"unknown", "account", "account_profile", "account_settings"}, new Annotation[][]{null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static CacheType valueOf(String str) {
        return (CacheType) Enum.valueOf(CacheType.class, str);
    }

    public static CacheType[] values() {
        return (CacheType[]) $VALUES.clone();
    }
}
