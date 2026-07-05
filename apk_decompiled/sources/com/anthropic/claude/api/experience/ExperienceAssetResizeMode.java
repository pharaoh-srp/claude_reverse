package com.anthropic.claude.api.experience;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.m17;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.w1a;
import defpackage.w87;
import defpackage.wd6;
import defpackage.x87;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/anthropic/claude/api/experience/ExperienceAssetResizeMode;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "w87", "UNKNOWN", "FIXED", "ASPECT_FIT", "ASPECT_FILL", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = x87.class)
public final class ExperienceAssetResizeMode {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ExperienceAssetResizeMode[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final w87 Companion;
    public static final ExperienceAssetResizeMode UNKNOWN = new ExperienceAssetResizeMode("UNKNOWN", 0);
    public static final ExperienceAssetResizeMode FIXED = new ExperienceAssetResizeMode("FIXED", 1);
    public static final ExperienceAssetResizeMode ASPECT_FIT = new ExperienceAssetResizeMode("ASPECT_FIT", 2);
    public static final ExperienceAssetResizeMode ASPECT_FILL = new ExperienceAssetResizeMode("ASPECT_FILL", 3);

    private static final /* synthetic */ ExperienceAssetResizeMode[] $values() {
        return new ExperienceAssetResizeMode[]{UNKNOWN, FIXED, ASPECT_FIT, ASPECT_FILL};
    }

    static {
        ExperienceAssetResizeMode[] experienceAssetResizeModeArr$values = $values();
        $VALUES = experienceAssetResizeModeArr$values;
        $ENTRIES = wd6.n0(experienceAssetResizeModeArr$values);
        Companion = new w87();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new m17(29));
    }

    private ExperienceAssetResizeMode(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.experience.ExperienceAssetResizeMode", values(), new String[]{"unknown", "fixed", "aspect_fit", "aspect_fill"}, new Annotation[][]{null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ExperienceAssetResizeMode valueOf(String str) {
        return (ExperienceAssetResizeMode) Enum.valueOf(ExperienceAssetResizeMode.class, str);
    }

    public static ExperienceAssetResizeMode[] values() {
        return (ExperienceAssetResizeMode[]) $VALUES.clone();
    }
}
