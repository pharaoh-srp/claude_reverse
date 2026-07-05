package com.anthropic.claude.ui.demo.app;

import defpackage.fdi;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.lq6;
import defpackage.mdj;
import defpackage.n7h;
import defpackage.onf;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0081\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/anthropic/claude/ui/demo/app/UiDemoAppDestination;", "", "", "title", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Companion", "fdi", "HOME", "COMMON_COMPONENTS", "demo"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class UiDemoAppDestination {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ UiDemoAppDestination[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final fdi Companion;
    private final String title;
    public static final UiDemoAppDestination HOME = new UiDemoAppDestination("HOME", 0, "Home");
    public static final UiDemoAppDestination COMMON_COMPONENTS = new UiDemoAppDestination("COMMON_COMPONENTS", 1, "Common UI Components");

    private static final /* synthetic */ UiDemoAppDestination[] $values() {
        return new UiDemoAppDestination[]{HOME, COMMON_COMPONENTS};
    }

    static {
        UiDemoAppDestination[] uiDemoAppDestinationArr$values = $values();
        $VALUES = uiDemoAppDestinationArr$values;
        $ENTRIES = wd6.n0(uiDemoAppDestinationArr$values);
        Companion = new fdi();
        $cachedSerializer$delegate = yb5.w(w1a.F, new n7h(28));
    }

    private UiDemoAppDestination(String str, int i, String str2) {
        this.title = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _init_$_anonymous_() {
        UiDemoAppDestination[] uiDemoAppDestinationArrValues = values();
        uiDemoAppDestinationArrValues.getClass();
        return new lq6("com.anthropic.claude.ui.demo.app.UiDemoAppDestination", (Enum[]) uiDemoAppDestinationArrValues);
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static UiDemoAppDestination valueOf(String str) {
        return (UiDemoAppDestination) Enum.valueOf(UiDemoAppDestination.class, str);
    }

    public static UiDemoAppDestination[] values() {
        return (UiDemoAppDestination[]) $VALUES.clone();
    }

    public final String getTitle() {
        return this.title;
    }
}
