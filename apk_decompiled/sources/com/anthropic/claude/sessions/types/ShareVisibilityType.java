package com.anthropic.claude.sessions.types;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.p1g;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import defpackage.ztf;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/anthropic/claude/sessions/types/ShareVisibilityType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "p1g", "ORG_ONLY", "SIGN_IN_ONLY", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class ShareVisibilityType {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ShareVisibilityType[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final p1g Companion;
    public static final ShareVisibilityType ORG_ONLY = new ShareVisibilityType("ORG_ONLY", 0);
    public static final ShareVisibilityType SIGN_IN_ONLY = new ShareVisibilityType("SIGN_IN_ONLY", 1);

    private static final /* synthetic */ ShareVisibilityType[] $values() {
        return new ShareVisibilityType[]{ORG_ONLY, SIGN_IN_ONLY};
    }

    static {
        ShareVisibilityType[] shareVisibilityTypeArr$values = $values();
        $VALUES = shareVisibilityTypeArr$values;
        $ENTRIES = wd6.n0(shareVisibilityTypeArr$values);
        Companion = new p1g();
        $cachedSerializer$delegate = yb5.w(w1a.F, new ztf(28));
    }

    private ShareVisibilityType(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.sessions.types.ShareVisibilityType", values(), new String[]{"org_only", "sign_in_only"}, new Annotation[][]{null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ShareVisibilityType valueOf(String str) {
        return (ShareVisibilityType) Enum.valueOf(ShareVisibilityType.class, str);
    }

    public static ShareVisibilityType[] values() {
        return (ShareVisibilityType[]) $VALUES.clone();
    }
}
