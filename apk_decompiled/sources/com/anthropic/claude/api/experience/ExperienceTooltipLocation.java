package com.anthropic.claude.api.experience;

import defpackage.c97;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.w1a;
import defpackage.wa7;
import defpackage.wd6;
import defpackage.xa7;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/anthropic/claude/api/experience/ExperienceTooltipLocation;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "wa7", "UNKNOWN", "MODEL_SELECTOR", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = xa7.class)
public final class ExperienceTooltipLocation {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ExperienceTooltipLocation[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final wa7 Companion;
    public static final ExperienceTooltipLocation UNKNOWN = new ExperienceTooltipLocation("UNKNOWN", 0);
    public static final ExperienceTooltipLocation MODEL_SELECTOR = new ExperienceTooltipLocation("MODEL_SELECTOR", 1);

    private static final /* synthetic */ ExperienceTooltipLocation[] $values() {
        return new ExperienceTooltipLocation[]{UNKNOWN, MODEL_SELECTOR};
    }

    static {
        ExperienceTooltipLocation[] experienceTooltipLocationArr$values = $values();
        $VALUES = experienceTooltipLocationArr$values;
        $ENTRIES = wd6.n0(experienceTooltipLocationArr$values);
        Companion = new wa7();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new c97(3));
    }

    private ExperienceTooltipLocation(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.experience.ExperienceTooltipLocation", values(), new String[]{"unknown", "model_selector"}, new Annotation[][]{null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ExperienceTooltipLocation valueOf(String str) {
        return (ExperienceTooltipLocation) Enum.valueOf(ExperienceTooltipLocation.class, str);
    }

    public static ExperienceTooltipLocation[] values() {
        return (ExperienceTooltipLocation[]) $VALUES.clone();
    }
}
