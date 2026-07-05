package com.anthropic.claude.sessions.types;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.o1g;
import defpackage.onf;
import defpackage.oq5;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/anthropic/claude/sessions/types/ShareStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "o1g", "UNSPECIFIED", "ACTIVE", "REVOKED", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class ShareStatus {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ShareStatus[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final o1g Companion;
    public static final ShareStatus UNSPECIFIED = new ShareStatus("UNSPECIFIED", 0);
    public static final ShareStatus ACTIVE = new ShareStatus("ACTIVE", 1);
    public static final ShareStatus REVOKED = new ShareStatus("REVOKED", 2);

    private static final /* synthetic */ ShareStatus[] $values() {
        return new ShareStatus[]{UNSPECIFIED, ACTIVE, REVOKED};
    }

    static {
        ShareStatus[] shareStatusArr$values = $values();
        $VALUES = shareStatusArr$values;
        $ENTRIES = wd6.n0(shareStatusArr$values);
        Companion = new o1g();
        $cachedSerializer$delegate = yb5.w(w1a.F, new ztf(27));
    }

    private ShareStatus(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.sessions.types.ShareStatus", values(), new String[]{"unspecified", "active", "revoked"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ShareStatus valueOf(String str) {
        return (ShareStatus) Enum.valueOf(ShareStatus.class, str);
    }

    public static ShareStatus[] values() {
        return (ShareStatus[]) $VALUES.clone();
    }
}
