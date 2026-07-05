package com.anthropic.claude.analytics.events;

import defpackage.au0;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/anthropic/claude/analytics/events/ArtifactViewerEvents$ArtifactKind", "", "Lcom/anthropic/claude/analytics/events/ArtifactViewerEvents$ArtifactKind;", "<init>", "(Ljava/lang/String;I)V", "Companion", "au0", "UNSPECIFIED", "IN_MESSAGE", "WIGGLE", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class ArtifactViewerEvents$ArtifactKind {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ArtifactViewerEvents$ArtifactKind[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final au0 Companion;
    public static final ArtifactViewerEvents$ArtifactKind UNSPECIFIED = new ArtifactViewerEvents$ArtifactKind("UNSPECIFIED", 0);
    public static final ArtifactViewerEvents$ArtifactKind IN_MESSAGE = new ArtifactViewerEvents$ArtifactKind("IN_MESSAGE", 1);
    public static final ArtifactViewerEvents$ArtifactKind WIGGLE = new ArtifactViewerEvents$ArtifactKind("WIGGLE", 2);

    private static final /* synthetic */ ArtifactViewerEvents$ArtifactKind[] $values() {
        return new ArtifactViewerEvents$ArtifactKind[]{UNSPECIFIED, IN_MESSAGE, WIGGLE};
    }

    static {
        ArtifactViewerEvents$ArtifactKind[] artifactViewerEvents$ArtifactKindArr$values = $values();
        $VALUES = artifactViewerEvents$ArtifactKindArr$values;
        $ENTRIES = wd6.n0(artifactViewerEvents$ArtifactKindArr$values);
        Companion = new au0();
        $cachedSerializer$delegate = yb5.w(w1a.F, new os0(22));
    }

    private ArtifactViewerEvents$ArtifactKind(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.ArtifactViewerEvents.ArtifactKind", values(), new String[]{"unspecified", "in_message", "wiggle"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ArtifactViewerEvents$ArtifactKind valueOf(String str) {
        return (ArtifactViewerEvents$ArtifactKind) Enum.valueOf(ArtifactViewerEvents$ArtifactKind.class, str);
    }

    public static ArtifactViewerEvents$ArtifactKind[] values() {
        return (ArtifactViewerEvents$ArtifactKind[]) $VALUES.clone();
    }
}
