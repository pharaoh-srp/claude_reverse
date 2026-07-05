package com.anthropic.claude.tool.model;

import defpackage.fq6;
import defpackage.hk2;
import defpackage.ik2;
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
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/tool/model/ChartDisplayV0InputStyle;", "", "", "loggingName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getLoggingName", "()Ljava/lang/String;", "Companion", "hk2", "LINE", "BAR", "SCATTER", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = ik2.class)
public final class ChartDisplayV0InputStyle {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ChartDisplayV0InputStyle[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final hk2 Companion;
    private final String loggingName;
    public static final ChartDisplayV0InputStyle LINE = new ChartDisplayV0InputStyle("LINE", 0, "line");
    public static final ChartDisplayV0InputStyle BAR = new ChartDisplayV0InputStyle("BAR", 1, "bar");
    public static final ChartDisplayV0InputStyle SCATTER = new ChartDisplayV0InputStyle("SCATTER", 2, "scatter");

    private static final /* synthetic */ ChartDisplayV0InputStyle[] $values() {
        return new ChartDisplayV0InputStyle[]{LINE, BAR, SCATTER};
    }

    static {
        ChartDisplayV0InputStyle[] chartDisplayV0InputStyleArr$values = $values();
        $VALUES = chartDisplayV0InputStyleArr$values;
        $ENTRIES = wd6.n0(chartDisplayV0InputStyleArr$values);
        Companion = new hk2();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new ll1(26));
    }

    private ChartDisplayV0InputStyle(String str, int i, String str2) {
        this.loggingName = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.tool.model.ChartDisplayV0InputStyle", values(), new String[]{"line", "bar", "scatter"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ChartDisplayV0InputStyle valueOf(String str) {
        return (ChartDisplayV0InputStyle) Enum.valueOf(ChartDisplayV0InputStyle.class, str);
    }

    public static ChartDisplayV0InputStyle[] values() {
        return (ChartDisplayV0InputStyle[]) $VALUES.clone();
    }

    public final String getLoggingName() {
        return this.loggingName;
    }
}
