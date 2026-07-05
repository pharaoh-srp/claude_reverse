package com.anthropic.claude.analytics.events;

import defpackage.bs3;
import defpackage.fq6;
import defpackage.gi3;
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
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/anthropic/claude/analytics/events/CodeEvents$CodeComposerSurface", "", "Lcom/anthropic/claude/analytics/events/CodeEvents$CodeComposerSurface;", "<init>", "(Ljava/lang/String;I)V", "Companion", "bs3", "UNSPECIFIED", "CODE", "COWORK", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class CodeEvents$CodeComposerSurface {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ CodeEvents$CodeComposerSurface[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final bs3 Companion;
    public static final CodeEvents$CodeComposerSurface UNSPECIFIED = new CodeEvents$CodeComposerSurface("UNSPECIFIED", 0);
    public static final CodeEvents$CodeComposerSurface CODE = new CodeEvents$CodeComposerSurface("CODE", 1);
    public static final CodeEvents$CodeComposerSurface COWORK = new CodeEvents$CodeComposerSurface("COWORK", 2);

    private static final /* synthetic */ CodeEvents$CodeComposerSurface[] $values() {
        return new CodeEvents$CodeComposerSurface[]{UNSPECIFIED, CODE, COWORK};
    }

    static {
        CodeEvents$CodeComposerSurface[] codeEvents$CodeComposerSurfaceArr$values = $values();
        $VALUES = codeEvents$CodeComposerSurfaceArr$values;
        $ENTRIES = wd6.n0(codeEvents$CodeComposerSurfaceArr$values);
        Companion = new bs3();
        $cachedSerializer$delegate = yb5.w(w1a.F, new gi3(20));
    }

    private CodeEvents$CodeComposerSurface(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.CodeEvents.CodeComposerSurface", values(), new String[]{"unknown", "code", "cowork"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static CodeEvents$CodeComposerSurface valueOf(String str) {
        return (CodeEvents$CodeComposerSurface) Enum.valueOf(CodeEvents$CodeComposerSurface.class, str);
    }

    public static CodeEvents$CodeComposerSurface[] values() {
        return (CodeEvents$CodeComposerSurface[]) $VALUES.clone();
    }
}
