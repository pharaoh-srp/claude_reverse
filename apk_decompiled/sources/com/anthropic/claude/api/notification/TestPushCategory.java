package com.anthropic.claude.api.notification;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.n7h;
import defpackage.onf;
import defpackage.oq5;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import defpackage.zch;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/anthropic/claude/api/notification/TestPushCategory;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "zch", "COMPLETION", "CODE", "CONWAY_WAKE", "CONWAY_DIRECT", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class TestPushCategory {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ TestPushCategory[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final zch Companion;
    public static final TestPushCategory COMPLETION = new TestPushCategory("COMPLETION", 0);
    public static final TestPushCategory CODE = new TestPushCategory("CODE", 1);
    public static final TestPushCategory CONWAY_WAKE = new TestPushCategory("CONWAY_WAKE", 2);
    public static final TestPushCategory CONWAY_DIRECT = new TestPushCategory("CONWAY_DIRECT", 3);

    private static final /* synthetic */ TestPushCategory[] $values() {
        return new TestPushCategory[]{COMPLETION, CODE, CONWAY_WAKE, CONWAY_DIRECT};
    }

    static {
        TestPushCategory[] testPushCategoryArr$values = $values();
        $VALUES = testPushCategoryArr$values;
        $ENTRIES = wd6.n0(testPushCategoryArr$values);
        Companion = new zch();
        $cachedSerializer$delegate = yb5.w(w1a.F, new n7h(11));
    }

    private TestPushCategory(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.notification.TestPushCategory", values(), new String[]{"completion", "bogosort", "conway_wake", "conway_direct"}, new Annotation[][]{null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static TestPushCategory valueOf(String str) {
        return (TestPushCategory) Enum.valueOf(TestPushCategory.class, str);
    }

    public static TestPushCategory[] values() {
        return (TestPushCategory[]) $VALUES.clone();
    }
}
