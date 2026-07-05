package com.anthropic.claude.api.experience;

import defpackage.c97;
import defpackage.f97;
import defpackage.fq6;
import defpackage.g97;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/anthropic/claude/api/experience/ExperienceButtonType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "f97", "UNKNOWN", "PRIMARY", "SECONDARY", "DESTRUCTIVE", "TINTED", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = g97.class)
public final class ExperienceButtonType {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ExperienceButtonType[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final f97 Companion;
    public static final ExperienceButtonType UNKNOWN = new ExperienceButtonType("UNKNOWN", 0);
    public static final ExperienceButtonType PRIMARY = new ExperienceButtonType("PRIMARY", 1);
    public static final ExperienceButtonType SECONDARY = new ExperienceButtonType("SECONDARY", 2);
    public static final ExperienceButtonType DESTRUCTIVE = new ExperienceButtonType("DESTRUCTIVE", 3);
    public static final ExperienceButtonType TINTED = new ExperienceButtonType("TINTED", 4);

    private static final /* synthetic */ ExperienceButtonType[] $values() {
        return new ExperienceButtonType[]{UNKNOWN, PRIMARY, SECONDARY, DESTRUCTIVE, TINTED};
    }

    static {
        ExperienceButtonType[] experienceButtonTypeArr$values = $values();
        $VALUES = experienceButtonTypeArr$values;
        $ENTRIES = wd6.n0(experienceButtonTypeArr$values);
        Companion = new f97();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new c97(1));
    }

    private ExperienceButtonType(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.experience.ExperienceButtonType", values(), new String[]{"unknown", "primary", "secondary", "destructive", "tinted"}, new Annotation[][]{null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ExperienceButtonType valueOf(String str) {
        return (ExperienceButtonType) Enum.valueOf(ExperienceButtonType.class, str);
    }

    public static ExperienceButtonType[] values() {
        return (ExperienceButtonType[]) $VALUES.clone();
    }
}
