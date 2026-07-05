package com.anthropic.claude.api.account;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.q1e;
import defpackage.t1e;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import defpackage.zcd;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/anthropic/claude/api/account/RateLimitUpsell;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "q1e", "UPGRADE_TO_PRO", "UPGRADE_TO_MAX", "GET_MORE_USAGE", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = t1e.class)
public final class RateLimitUpsell {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ RateLimitUpsell[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final q1e Companion;
    public static final RateLimitUpsell UPGRADE_TO_PRO = new RateLimitUpsell("UPGRADE_TO_PRO", 0);
    public static final RateLimitUpsell UPGRADE_TO_MAX = new RateLimitUpsell("UPGRADE_TO_MAX", 1);
    public static final RateLimitUpsell GET_MORE_USAGE = new RateLimitUpsell("GET_MORE_USAGE", 2);
    public static final RateLimitUpsell UNKNOWN = new RateLimitUpsell("UNKNOWN", 3);

    private static final /* synthetic */ RateLimitUpsell[] $values() {
        return new RateLimitUpsell[]{UPGRADE_TO_PRO, UPGRADE_TO_MAX, GET_MORE_USAGE, UNKNOWN};
    }

    static {
        RateLimitUpsell[] rateLimitUpsellArr$values = $values();
        $VALUES = rateLimitUpsellArr$values;
        $ENTRIES = wd6.n0(rateLimitUpsellArr$values);
        Companion = new q1e();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new zcd(5));
    }

    private RateLimitUpsell(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.account.RateLimitUpsell", values(), new String[]{"upgrade_to_pro", "upgrade_to_max", "get_more_usage", "unknown"}, new Annotation[][]{null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static RateLimitUpsell valueOf(String str) {
        return (RateLimitUpsell) Enum.valueOf(RateLimitUpsell.class, str);
    }

    public static RateLimitUpsell[] values() {
        return (RateLimitUpsell[]) $VALUES.clone();
    }
}
