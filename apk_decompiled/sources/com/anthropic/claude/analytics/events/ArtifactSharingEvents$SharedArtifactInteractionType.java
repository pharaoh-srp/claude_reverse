package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.os0;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import defpackage.ys0;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/anthropic/claude/analytics/events/ArtifactSharingEvents$SharedArtifactInteractionType", "", "Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$SharedArtifactInteractionType;", "<init>", "(Ljava/lang/String;I)V", "Companion", "ys0", "UNSPECIFIED", "REPORT", "REMIX", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class ArtifactSharingEvents$SharedArtifactInteractionType {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ArtifactSharingEvents$SharedArtifactInteractionType[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final ys0 Companion;
    public static final ArtifactSharingEvents$SharedArtifactInteractionType UNSPECIFIED = new ArtifactSharingEvents$SharedArtifactInteractionType("UNSPECIFIED", 0);
    public static final ArtifactSharingEvents$SharedArtifactInteractionType REPORT = new ArtifactSharingEvents$SharedArtifactInteractionType("REPORT", 1);
    public static final ArtifactSharingEvents$SharedArtifactInteractionType REMIX = new ArtifactSharingEvents$SharedArtifactInteractionType("REMIX", 2);

    private static final /* synthetic */ ArtifactSharingEvents$SharedArtifactInteractionType[] $values() {
        return new ArtifactSharingEvents$SharedArtifactInteractionType[]{UNSPECIFIED, REPORT, REMIX};
    }

    static {
        ArtifactSharingEvents$SharedArtifactInteractionType[] artifactSharingEvents$SharedArtifactInteractionTypeArr$values = $values();
        $VALUES = artifactSharingEvents$SharedArtifactInteractionTypeArr$values;
        $ENTRIES = wd6.n0(artifactSharingEvents$SharedArtifactInteractionTypeArr$values);
        Companion = new ys0();
        $cachedSerializer$delegate = yb5.w(w1a.F, new os0(7));
    }

    private ArtifactSharingEvents$SharedArtifactInteractionType(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.ArtifactSharingEvents.SharedArtifactInteractionType", values(), new String[]{"unspecified", "report", "remix"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ArtifactSharingEvents$SharedArtifactInteractionType valueOf(String str) {
        return (ArtifactSharingEvents$SharedArtifactInteractionType) Enum.valueOf(ArtifactSharingEvents$SharedArtifactInteractionType.class, str);
    }

    public static ArtifactSharingEvents$SharedArtifactInteractionType[] values() {
        return (ArtifactSharingEvents$SharedArtifactInteractionType[]) $VALUES.clone();
    }
}
