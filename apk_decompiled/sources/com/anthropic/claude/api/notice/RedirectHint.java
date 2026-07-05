package com.anthropic.claude.api.notice;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.rod;
import defpackage.w1a;
import defpackage.w9e;
import defpackage.wd6;
import defpackage.x9e;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/anthropic/claude/api/notice/RedirectHint;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "w9e", "APP_STORE", "PLAY_STORE", "WEB_CHECKOUT", "CONTACT_ADMIN", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = x9e.class)
public final class RedirectHint {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ RedirectHint[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final w9e Companion;
    public static final RedirectHint APP_STORE = new RedirectHint("APP_STORE", 0);
    public static final RedirectHint PLAY_STORE = new RedirectHint("PLAY_STORE", 1);
    public static final RedirectHint WEB_CHECKOUT = new RedirectHint("WEB_CHECKOUT", 2);
    public static final RedirectHint CONTACT_ADMIN = new RedirectHint("CONTACT_ADMIN", 3);
    public static final RedirectHint UNKNOWN = new RedirectHint("UNKNOWN", 4);

    private static final /* synthetic */ RedirectHint[] $values() {
        return new RedirectHint[]{APP_STORE, PLAY_STORE, WEB_CHECKOUT, CONTACT_ADMIN, UNKNOWN};
    }

    static {
        RedirectHint[] redirectHintArr$values = $values();
        $VALUES = redirectHintArr$values;
        $ENTRIES = wd6.n0(redirectHintArr$values);
        Companion = new w9e();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new rod(27));
    }

    private RedirectHint(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.notice.RedirectHint", values(), new String[]{"app_store", "play_store", "web_checkout", "contact_admin", null}, new Annotation[][]{null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static RedirectHint valueOf(String str) {
        return (RedirectHint) Enum.valueOf(RedirectHint.class, str);
    }

    public static RedirectHint[] values() {
        return (RedirectHint[]) $VALUES.clone();
    }
}
