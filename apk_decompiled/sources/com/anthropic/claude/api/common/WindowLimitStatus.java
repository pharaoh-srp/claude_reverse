package com.anthropic.claude.api.common;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.p3j;
import defpackage.pdj;
import defpackage.qdj;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/anthropic/claude/api/common/WindowLimitStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "pdj", "WITHIN_LIMIT", "APPROACHING_LIMIT", "EXCEEDED_LIMIT", "UNKNOWN", "Claude.api:result"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = qdj.class)
public final class WindowLimitStatus {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ WindowLimitStatus[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final pdj Companion;
    public static final WindowLimitStatus WITHIN_LIMIT = new WindowLimitStatus("WITHIN_LIMIT", 0);
    public static final WindowLimitStatus APPROACHING_LIMIT = new WindowLimitStatus("APPROACHING_LIMIT", 1);
    public static final WindowLimitStatus EXCEEDED_LIMIT = new WindowLimitStatus("EXCEEDED_LIMIT", 2);
    public static final WindowLimitStatus UNKNOWN = new WindowLimitStatus("UNKNOWN", 3);

    private static final /* synthetic */ WindowLimitStatus[] $values() {
        return new WindowLimitStatus[]{WITHIN_LIMIT, APPROACHING_LIMIT, EXCEEDED_LIMIT, UNKNOWN};
    }

    static {
        WindowLimitStatus[] windowLimitStatusArr$values = $values();
        $VALUES = windowLimitStatusArr$values;
        $ENTRIES = wd6.n0(windowLimitStatusArr$values);
        Companion = new pdj();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new p3j(23));
    }

    private WindowLimitStatus(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.common.WindowLimitStatus", values(), new String[]{"within_limit", "approaching_limit", "exceeded_limit", "unknown"}, new Annotation[][]{null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static WindowLimitStatus valueOf(String str) {
        return (WindowLimitStatus) Enum.valueOf(WindowLimitStatus.class, str);
    }

    public static WindowLimitStatus[] values() {
        return (WindowLimitStatus[]) $VALUES.clone();
    }
}
