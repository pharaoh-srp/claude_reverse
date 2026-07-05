package com.anthropic.claude.login;

import defpackage.fq6;
import defpackage.h9j;
import defpackage.kw9;
import defpackage.lq6;
import defpackage.mdj;
import defpackage.onf;
import defpackage.p3j;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/anthropic/claude/login/WelcomeNotice;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "h9j", "SessionExpired", "AccountRestricted", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class WelcomeNotice {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ WelcomeNotice[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final h9j Companion;
    public static final WelcomeNotice SessionExpired = new WelcomeNotice("SessionExpired", 0);
    public static final WelcomeNotice AccountRestricted = new WelcomeNotice("AccountRestricted", 1);

    private static final /* synthetic */ WelcomeNotice[] $values() {
        return new WelcomeNotice[]{SessionExpired, AccountRestricted};
    }

    static {
        WelcomeNotice[] welcomeNoticeArr$values = $values();
        $VALUES = welcomeNoticeArr$values;
        $ENTRIES = wd6.n0(welcomeNoticeArr$values);
        Companion = new h9j();
        $cachedSerializer$delegate = yb5.w(w1a.F, new p3j(16));
    }

    private WelcomeNotice(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _init_$_anonymous_() {
        WelcomeNotice[] welcomeNoticeArrValues = values();
        welcomeNoticeArrValues.getClass();
        return new lq6("com.anthropic.claude.login.WelcomeNotice", (Enum[]) welcomeNoticeArrValues);
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static WelcomeNotice valueOf(String str) {
        return (WelcomeNotice) Enum.valueOf(WelcomeNotice.class, str);
    }

    public static WelcomeNotice[] values() {
        return (WelcomeNotice[]) $VALUES.clone();
    }
}
