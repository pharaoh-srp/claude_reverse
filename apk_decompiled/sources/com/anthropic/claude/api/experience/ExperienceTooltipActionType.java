package com.anthropic.claude.api.experience;

import defpackage.c97;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.ua7;
import defpackage.va7;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/anthropic/claude/api/experience/ExperienceTooltipActionType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "ua7", "UNKNOWN", "OPEN_MODEL_SELECTOR", "DISMISS", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = va7.class)
public final class ExperienceTooltipActionType {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ExperienceTooltipActionType[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final ua7 Companion;
    public static final ExperienceTooltipActionType UNKNOWN = new ExperienceTooltipActionType("UNKNOWN", 0);
    public static final ExperienceTooltipActionType OPEN_MODEL_SELECTOR = new ExperienceTooltipActionType("OPEN_MODEL_SELECTOR", 1);
    public static final ExperienceTooltipActionType DISMISS = new ExperienceTooltipActionType("DISMISS", 2);

    private static final /* synthetic */ ExperienceTooltipActionType[] $values() {
        return new ExperienceTooltipActionType[]{UNKNOWN, OPEN_MODEL_SELECTOR, DISMISS};
    }

    static {
        ExperienceTooltipActionType[] experienceTooltipActionTypeArr$values = $values();
        $VALUES = experienceTooltipActionTypeArr$values;
        $ENTRIES = wd6.n0(experienceTooltipActionTypeArr$values);
        Companion = new ua7();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new c97(2));
    }

    private ExperienceTooltipActionType(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.experience.ExperienceTooltipActionType", values(), new String[]{"unknown", "open_model_selector", "dismiss"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ExperienceTooltipActionType valueOf(String str) {
        return (ExperienceTooltipActionType) Enum.valueOf(ExperienceTooltipActionType.class, str);
    }

    public static ExperienceTooltipActionType[] values() {
        return (ExperienceTooltipActionType[]) $VALUES.clone();
    }
}
