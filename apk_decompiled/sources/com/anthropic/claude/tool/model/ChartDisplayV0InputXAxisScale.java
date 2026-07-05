package com.anthropic.claude.tool.model;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.lk2;
import defpackage.ll1;
import defpackage.mdj;
import defpackage.mk2;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/anthropic/claude/tool/model/ChartDisplayV0InputXAxisScale;", "", "", "loggingName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getLoggingName", "()Ljava/lang/String;", "Companion", "lk2", "LINEAR", "LOG", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = mk2.class)
public final class ChartDisplayV0InputXAxisScale {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ChartDisplayV0InputXAxisScale[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final lk2 Companion;
    public static final ChartDisplayV0InputXAxisScale LINEAR = new ChartDisplayV0InputXAxisScale("LINEAR", 0, "linear");
    public static final ChartDisplayV0InputXAxisScale LOG = new ChartDisplayV0InputXAxisScale("LOG", 1, "log");
    private final String loggingName;

    private static final /* synthetic */ ChartDisplayV0InputXAxisScale[] $values() {
        return new ChartDisplayV0InputXAxisScale[]{LINEAR, LOG};
    }

    static {
        ChartDisplayV0InputXAxisScale[] chartDisplayV0InputXAxisScaleArr$values = $values();
        $VALUES = chartDisplayV0InputXAxisScaleArr$values;
        $ENTRIES = wd6.n0(chartDisplayV0InputXAxisScaleArr$values);
        Companion = new lk2();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new ll1(28));
    }

    private ChartDisplayV0InputXAxisScale(String str, int i, String str2) {
        this.loggingName = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.tool.model.ChartDisplayV0InputXAxisScale", values(), new String[]{"linear", "log"}, new Annotation[][]{null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ChartDisplayV0InputXAxisScale valueOf(String str) {
        return (ChartDisplayV0InputXAxisScale) Enum.valueOf(ChartDisplayV0InputXAxisScale.class, str);
    }

    public static ChartDisplayV0InputXAxisScale[] values() {
        return (ChartDisplayV0InputXAxisScale[]) $VALUES.clone();
    }

    public final String getLoggingName() {
        return this.loggingName;
    }
}
