package com.anthropic.claude.api.experience;

import defpackage.ab7;
import defpackage.c97;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import defpackage.za7;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/anthropic/claude/api/experience/ExperienceTrackActionType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "za7", "UNKNOWN", "ACTIONED", "DISMISSED", "SHOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = ab7.class)
public final class ExperienceTrackActionType {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ExperienceTrackActionType[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final za7 Companion;
    public static final ExperienceTrackActionType UNKNOWN = new ExperienceTrackActionType("UNKNOWN", 0);
    public static final ExperienceTrackActionType ACTIONED = new ExperienceTrackActionType("ACTIONED", 1);
    public static final ExperienceTrackActionType DISMISSED = new ExperienceTrackActionType("DISMISSED", 2);
    public static final ExperienceTrackActionType SHOWN = new ExperienceTrackActionType("SHOWN", 3);

    private static final /* synthetic */ ExperienceTrackActionType[] $values() {
        return new ExperienceTrackActionType[]{UNKNOWN, ACTIONED, DISMISSED, SHOWN};
    }

    static {
        ExperienceTrackActionType[] experienceTrackActionTypeArr$values = $values();
        $VALUES = experienceTrackActionTypeArr$values;
        $ENTRIES = wd6.n0(experienceTrackActionTypeArr$values);
        Companion = new za7();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new c97(4));
    }

    private ExperienceTrackActionType(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.experience.ExperienceTrackActionType", values(), new String[]{"unknown", "actioned", "dismissed", "shown"}, new Annotation[][]{null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ExperienceTrackActionType valueOf(String str) {
        return (ExperienceTrackActionType) Enum.valueOf(ExperienceTrackActionType.class, str);
    }

    public static ExperienceTrackActionType[] values() {
        return (ExperienceTrackActionType[]) $VALUES.clone();
    }
}
