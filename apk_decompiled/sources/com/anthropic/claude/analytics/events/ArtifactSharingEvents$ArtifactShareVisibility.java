package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.os0;
import defpackage.ts0;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareVisibility", "", "Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareVisibility;", "<init>", "(Ljava/lang/String;I)V", "Companion", "ts0", "UNSPECIFIED", "PRIVATE", "ORGANIZATION", "PUBLIC", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class ArtifactSharingEvents$ArtifactShareVisibility {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ArtifactSharingEvents$ArtifactShareVisibility[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final ts0 Companion;
    public static final ArtifactSharingEvents$ArtifactShareVisibility UNSPECIFIED = new ArtifactSharingEvents$ArtifactShareVisibility("UNSPECIFIED", 0);
    public static final ArtifactSharingEvents$ArtifactShareVisibility PRIVATE = new ArtifactSharingEvents$ArtifactShareVisibility("PRIVATE", 1);
    public static final ArtifactSharingEvents$ArtifactShareVisibility ORGANIZATION = new ArtifactSharingEvents$ArtifactShareVisibility("ORGANIZATION", 2);
    public static final ArtifactSharingEvents$ArtifactShareVisibility PUBLIC = new ArtifactSharingEvents$ArtifactShareVisibility("PUBLIC", 3);

    private static final /* synthetic */ ArtifactSharingEvents$ArtifactShareVisibility[] $values() {
        return new ArtifactSharingEvents$ArtifactShareVisibility[]{UNSPECIFIED, PRIVATE, ORGANIZATION, PUBLIC};
    }

    static {
        ArtifactSharingEvents$ArtifactShareVisibility[] artifactSharingEvents$ArtifactShareVisibilityArr$values = $values();
        $VALUES = artifactSharingEvents$ArtifactShareVisibilityArr$values;
        $ENTRIES = wd6.n0(artifactSharingEvents$ArtifactShareVisibilityArr$values);
        Companion = new ts0();
        $cachedSerializer$delegate = yb5.w(w1a.F, new os0(3));
    }

    private ArtifactSharingEvents$ArtifactShareVisibility(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.ArtifactSharingEvents.ArtifactShareVisibility", values(), new String[]{"unspecified", "private", "organization", "public"}, new Annotation[][]{null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ArtifactSharingEvents$ArtifactShareVisibility valueOf(String str) {
        return (ArtifactSharingEvents$ArtifactShareVisibility) Enum.valueOf(ArtifactSharingEvents$ArtifactShareVisibility.class, str);
    }

    public static ArtifactSharingEvents$ArtifactShareVisibility[] values() {
        return (ArtifactSharingEvents$ArtifactShareVisibility[]) $VALUES.clone();
    }
}
