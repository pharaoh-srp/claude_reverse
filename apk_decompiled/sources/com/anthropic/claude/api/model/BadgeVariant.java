package com.anthropic.claude.api.model;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.rc1;
import defpackage.sc1;
import defpackage.tc1;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/anthropic/claude/api/model/BadgeVariant;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "sc1", "NEUTRAL", "ACCENT", "WARNING", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = tc1.class)
public final class BadgeVariant {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ BadgeVariant[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final sc1 Companion;
    public static final BadgeVariant NEUTRAL = new BadgeVariant("NEUTRAL", 0);
    public static final BadgeVariant ACCENT = new BadgeVariant("ACCENT", 1);
    public static final BadgeVariant WARNING = new BadgeVariant("WARNING", 2);

    private static final /* synthetic */ BadgeVariant[] $values() {
        return new BadgeVariant[]{NEUTRAL, ACCENT, WARNING};
    }

    static {
        BadgeVariant[] badgeVariantArr$values = $values();
        $VALUES = badgeVariantArr$values;
        $ENTRIES = wd6.n0(badgeVariantArr$values);
        Companion = new sc1();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new rc1(0));
    }

    private BadgeVariant(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.model.BadgeVariant", values(), new String[]{"neutral", "accent", "warning"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static BadgeVariant valueOf(String str) {
        return (BadgeVariant) Enum.valueOf(BadgeVariant.class, str);
    }

    public static BadgeVariant[] values() {
        return (BadgeVariant[]) $VALUES.clone();
    }
}
