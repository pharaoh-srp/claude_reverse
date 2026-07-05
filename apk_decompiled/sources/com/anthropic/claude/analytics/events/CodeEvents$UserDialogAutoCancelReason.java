package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.gx3;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.wt3;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/anthropic/claude/analytics/events/CodeEvents$UserDialogAutoCancelReason", "", "Lcom/anthropic/claude/analytics/events/CodeEvents$UserDialogAutoCancelReason;", "<init>", "(Ljava/lang/String;I)V", "Companion", "gx3", "UNSPECIFIED", "UNKNOWN_KIND", "MALFORMED_PAYLOAD", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class CodeEvents$UserDialogAutoCancelReason {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ CodeEvents$UserDialogAutoCancelReason[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final gx3 Companion;
    public static final CodeEvents$UserDialogAutoCancelReason UNSPECIFIED = new CodeEvents$UserDialogAutoCancelReason("UNSPECIFIED", 0);
    public static final CodeEvents$UserDialogAutoCancelReason UNKNOWN_KIND = new CodeEvents$UserDialogAutoCancelReason("UNKNOWN_KIND", 1);
    public static final CodeEvents$UserDialogAutoCancelReason MALFORMED_PAYLOAD = new CodeEvents$UserDialogAutoCancelReason("MALFORMED_PAYLOAD", 2);

    private static final /* synthetic */ CodeEvents$UserDialogAutoCancelReason[] $values() {
        return new CodeEvents$UserDialogAutoCancelReason[]{UNSPECIFIED, UNKNOWN_KIND, MALFORMED_PAYLOAD};
    }

    static {
        CodeEvents$UserDialogAutoCancelReason[] codeEvents$UserDialogAutoCancelReasonArr$values = $values();
        $VALUES = codeEvents$UserDialogAutoCancelReasonArr$values;
        $ENTRIES = wd6.n0(codeEvents$UserDialogAutoCancelReasonArr$values);
        Companion = new gx3();
        $cachedSerializer$delegate = yb5.w(w1a.F, new wt3(13));
    }

    private CodeEvents$UserDialogAutoCancelReason(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.CodeEvents.UserDialogAutoCancelReason", values(), new String[]{"unknown", "unknown_kind", "malformed_payload"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static CodeEvents$UserDialogAutoCancelReason valueOf(String str) {
        return (CodeEvents$UserDialogAutoCancelReason) Enum.valueOf(CodeEvents$UserDialogAutoCancelReason.class, str);
    }

    public static CodeEvents$UserDialogAutoCancelReason[] values() {
        return (CodeEvents$UserDialogAutoCancelReason[]) $VALUES.clone();
    }
}
