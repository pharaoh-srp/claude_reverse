package com.anthropic.claude.api.artifacts;

import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.eu0;
import defpackage.fq6;
import defpackage.fu0;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/api/artifacts/ArtifactVisibility;", "", "", ExperienceToggle.DEFAULT_PARAM_KEY, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "eu0", "UNKNOWN", "SHARED", "PRIVATE", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = fu0.class)
public final class ArtifactVisibility {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ArtifactVisibility[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final eu0 Companion;
    private final String value;
    public static final ArtifactVisibility UNKNOWN = new ArtifactVisibility("UNKNOWN", 0, "unknown");
    public static final ArtifactVisibility SHARED = new ArtifactVisibility("SHARED", 1, "shared");
    public static final ArtifactVisibility PRIVATE = new ArtifactVisibility("PRIVATE", 2, "private");

    private static final /* synthetic */ ArtifactVisibility[] $values() {
        return new ArtifactVisibility[]{UNKNOWN, SHARED, PRIVATE};
    }

    static {
        ArtifactVisibility[] artifactVisibilityArr$values = $values();
        $VALUES = artifactVisibilityArr$values;
        $ENTRIES = wd6.n0(artifactVisibilityArr$values);
        Companion = new eu0();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new os0(26));
    }

    private ArtifactVisibility(String str, int i, String str2) {
        this.value = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.artifacts.ArtifactVisibility", values(), new String[]{"unknown", "shared", "private"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ArtifactVisibility valueOf(String str) {
        return (ArtifactVisibility) Enum.valueOf(ArtifactVisibility.class, str);
    }

    public static ArtifactVisibility[] values() {
        return (ArtifactVisibility[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
