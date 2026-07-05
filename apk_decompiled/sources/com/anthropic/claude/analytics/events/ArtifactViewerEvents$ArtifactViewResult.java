package com.anthropic.claude.analytics.events;

import defpackage.bu0;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.os0;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/anthropic/claude/analytics/events/ArtifactViewerEvents$ArtifactViewResult", "", "Lcom/anthropic/claude/analytics/events/ArtifactViewerEvents$ArtifactViewResult;", "<init>", "(Ljava/lang/String;I)V", "Companion", "bu0", "UNSPECIFIED", "LOADED", "TIMEOUT", "ABANDONED", "ERROR", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class ArtifactViewerEvents$ArtifactViewResult {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ArtifactViewerEvents$ArtifactViewResult[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final bu0 Companion;
    public static final ArtifactViewerEvents$ArtifactViewResult UNSPECIFIED = new ArtifactViewerEvents$ArtifactViewResult("UNSPECIFIED", 0);
    public static final ArtifactViewerEvents$ArtifactViewResult LOADED = new ArtifactViewerEvents$ArtifactViewResult("LOADED", 1);
    public static final ArtifactViewerEvents$ArtifactViewResult TIMEOUT = new ArtifactViewerEvents$ArtifactViewResult("TIMEOUT", 2);
    public static final ArtifactViewerEvents$ArtifactViewResult ABANDONED = new ArtifactViewerEvents$ArtifactViewResult("ABANDONED", 3);
    public static final ArtifactViewerEvents$ArtifactViewResult ERROR = new ArtifactViewerEvents$ArtifactViewResult("ERROR", 4);

    private static final /* synthetic */ ArtifactViewerEvents$ArtifactViewResult[] $values() {
        return new ArtifactViewerEvents$ArtifactViewResult[]{UNSPECIFIED, LOADED, TIMEOUT, ABANDONED, ERROR};
    }

    static {
        ArtifactViewerEvents$ArtifactViewResult[] artifactViewerEvents$ArtifactViewResultArr$values = $values();
        $VALUES = artifactViewerEvents$ArtifactViewResultArr$values;
        $ENTRIES = wd6.n0(artifactViewerEvents$ArtifactViewResultArr$values);
        Companion = new bu0();
        $cachedSerializer$delegate = yb5.w(w1a.F, new os0(23));
    }

    private ArtifactViewerEvents$ArtifactViewResult(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.ArtifactViewerEvents.ArtifactViewResult", values(), new String[]{"unspecified", "loaded", "timeout", "abandoned", "error"}, new Annotation[][]{null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ArtifactViewerEvents$ArtifactViewResult valueOf(String str) {
        return (ArtifactViewerEvents$ArtifactViewResult) Enum.valueOf(ArtifactViewerEvents$ArtifactViewResult.class, str);
    }

    public static ArtifactViewerEvents$ArtifactViewResult[] values() {
        return (ArtifactViewerEvents$ArtifactViewResult[]) $VALUES.clone();
    }
}
