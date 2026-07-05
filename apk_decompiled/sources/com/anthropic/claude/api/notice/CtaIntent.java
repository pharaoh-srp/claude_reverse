package com.anthropic.claude.api.notice;

import defpackage.fq6;
import defpackage.h85;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.xc5;
import defpackage.yb5;
import defpackage.yc5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/anthropic/claude/api/notice/CtaIntent;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "xc5", "UPGRADE", "BUY_CREDIT", "SWITCH_MODEL", "VIEW_USAGE", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = yc5.class)
public final class CtaIntent {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ CtaIntent[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final xc5 Companion;
    public static final CtaIntent UPGRADE = new CtaIntent("UPGRADE", 0);
    public static final CtaIntent BUY_CREDIT = new CtaIntent("BUY_CREDIT", 1);
    public static final CtaIntent SWITCH_MODEL = new CtaIntent("SWITCH_MODEL", 2);
    public static final CtaIntent VIEW_USAGE = new CtaIntent("VIEW_USAGE", 3);
    public static final CtaIntent UNKNOWN = new CtaIntent("UNKNOWN", 4);

    private static final /* synthetic */ CtaIntent[] $values() {
        return new CtaIntent[]{UPGRADE, BUY_CREDIT, SWITCH_MODEL, VIEW_USAGE, UNKNOWN};
    }

    static {
        CtaIntent[] ctaIntentArr$values = $values();
        $VALUES = ctaIntentArr$values;
        $ENTRIES = wd6.n0(ctaIntentArr$values);
        Companion = new xc5();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new h85(3));
    }

    private CtaIntent(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.notice.CtaIntent", values(), new String[]{"upgrade", "buy_credit", "switch_model", "view_usage", null}, new Annotation[][]{null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static CtaIntent valueOf(String str) {
        return (CtaIntent) Enum.valueOf(CtaIntent.class, str);
    }

    public static CtaIntent[] values() {
        return (CtaIntent[]) $VALUES.clone();
    }
}
