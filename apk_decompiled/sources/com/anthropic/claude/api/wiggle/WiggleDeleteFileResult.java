package com.anthropic.claude.api.wiggle;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.p3j;
import defpackage.qaj;
import defpackage.raj;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/anthropic/claude/api/wiggle/WiggleDeleteFileResult;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "qaj", "SUCCESS", "NOT_FOUND", "STORAGE_ERROR", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = raj.class)
public final class WiggleDeleteFileResult {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ WiggleDeleteFileResult[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final qaj Companion;
    public static final WiggleDeleteFileResult SUCCESS = new WiggleDeleteFileResult("SUCCESS", 0);
    public static final WiggleDeleteFileResult NOT_FOUND = new WiggleDeleteFileResult("NOT_FOUND", 1);
    public static final WiggleDeleteFileResult STORAGE_ERROR = new WiggleDeleteFileResult("STORAGE_ERROR", 2);
    public static final WiggleDeleteFileResult UNKNOWN = new WiggleDeleteFileResult("UNKNOWN", 3);

    private static final /* synthetic */ WiggleDeleteFileResult[] $values() {
        return new WiggleDeleteFileResult[]{SUCCESS, NOT_FOUND, STORAGE_ERROR, UNKNOWN};
    }

    static {
        WiggleDeleteFileResult[] wiggleDeleteFileResultArr$values = $values();
        $VALUES = wiggleDeleteFileResultArr$values;
        $ENTRIES = wd6.n0(wiggleDeleteFileResultArr$values);
        Companion = new qaj();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new p3j(21));
    }

    private WiggleDeleteFileResult(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.wiggle.WiggleDeleteFileResult", values(), new String[]{"success", "not_found", "storage_error", "unknown"}, new Annotation[][]{null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static WiggleDeleteFileResult valueOf(String str) {
        return (WiggleDeleteFileResult) Enum.valueOf(WiggleDeleteFileResult.class, str);
    }

    public static WiggleDeleteFileResult[] values() {
        return (WiggleDeleteFileResult[]) $VALUES.clone();
    }
}
