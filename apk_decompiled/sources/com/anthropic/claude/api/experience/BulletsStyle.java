package com.anthropic.claude.api.experience;

import defpackage.f02;
import defpackage.fq6;
import defpackage.g02;
import defpackage.kw9;
import defpackage.ll1;
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
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/anthropic/claude/api/experience/BulletsStyle;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "f02", "PLAIN", "CARD", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = g02.class)
public final class BulletsStyle {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ BulletsStyle[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final f02 Companion;
    public static final BulletsStyle PLAIN = new BulletsStyle("PLAIN", 0);
    public static final BulletsStyle CARD = new BulletsStyle("CARD", 1);

    private static final /* synthetic */ BulletsStyle[] $values() {
        return new BulletsStyle[]{PLAIN, CARD};
    }

    static {
        BulletsStyle[] bulletsStyleArr$values = $values();
        $VALUES = bulletsStyleArr$values;
        $ENTRIES = wd6.n0(bulletsStyleArr$values);
        Companion = new f02();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new ll1(12));
    }

    private BulletsStyle(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.experience.BulletsStyle", values(), new String[]{"plain", "card"}, new Annotation[][]{null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static BulletsStyle valueOf(String str) {
        return (BulletsStyle) Enum.valueOf(BulletsStyle.class, str);
    }

    public static BulletsStyle[] values() {
        return (BulletsStyle[]) $VALUES.clone();
    }
}
