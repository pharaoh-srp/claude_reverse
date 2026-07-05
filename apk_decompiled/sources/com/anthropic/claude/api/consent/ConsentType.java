package com.anthropic.claude.api.consent;

import defpackage.cl4;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.l84;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/anthropic/claude/api/consent/ConsentType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "cl4", "CONSUMER_HEALTH", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class ConsentType {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ConsentType[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final ConsentType CONSUMER_HEALTH = new ConsentType("CONSUMER_HEALTH", 0);
    public static final cl4 Companion;

    private static final /* synthetic */ ConsentType[] $values() {
        return new ConsentType[]{CONSUMER_HEALTH};
    }

    static {
        ConsentType[] consentTypeArr$values = $values();
        $VALUES = consentTypeArr$values;
        $ENTRIES = wd6.n0(consentTypeArr$values);
        Companion = new cl4();
        $cachedSerializer$delegate = yb5.w(w1a.F, new l84(18));
    }

    private ConsentType(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.consent.ConsentType", values(), new String[]{"consumer_health"}, new Annotation[][]{null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ConsentType valueOf(String str) {
        return (ConsentType) Enum.valueOf(ConsentType.class, str);
    }

    public static ConsentType[] values() {
        return (ConsentType[]) $VALUES.clone();
    }
}
