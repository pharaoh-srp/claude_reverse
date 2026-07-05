package com.anthropic.claude.tool.model;

import defpackage.c97;
import defpackage.di8;
import defpackage.ei8;
import defpackage.fq6;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/tool/model/HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType;", "", "", "loggingName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getLoggingName", "()Ljava/lang/String;", "Companion", "di8", "INSTANTANEOUS", "INTERVAL", "SERIES", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = ei8.class)
public final class HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final di8 Companion;
    public static final HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType INSTANTANEOUS = new HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType("INSTANTANEOUS", 0, "instantaneous");
    public static final HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType INTERVAL = new HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType("INTERVAL", 1, "interval");
    public static final HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType SERIES = new HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType("SERIES", 2, "series");
    private final String loggingName;

    private static final /* synthetic */ HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType[] $values() {
        return new HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType[]{INSTANTANEOUS, INTERVAL, SERIES};
    }

    static {
        HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType[] healthConnectDataTypesV0OutputDataTypesItemRecordBaseTypeArr$values = $values();
        $VALUES = healthConnectDataTypesV0OutputDataTypesItemRecordBaseTypeArr$values;
        $ENTRIES = wd6.n0(healthConnectDataTypesV0OutputDataTypesItemRecordBaseTypeArr$values);
        Companion = new di8();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new c97(27));
    }

    private HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType(String str, int i, String str2) {
        this.loggingName = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.tool.model.HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType", values(), new String[]{"instantaneous", "interval", "series"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType valueOf(String str) {
        return (HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType) Enum.valueOf(HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType.class, str);
    }

    public static HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType[] values() {
        return (HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType[]) $VALUES.clone();
    }

    public final String getLoggingName() {
        return this.loggingName;
    }
}
