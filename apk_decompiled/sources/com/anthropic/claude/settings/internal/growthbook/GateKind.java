package com.anthropic.claude.settings.internal.growthbook;

import defpackage.c97;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.lq6;
import defpackage.m18;
import defpackage.mdj;
import defpackage.onf;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/anthropic/claude/settings/internal/growthbook/GateKind;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "m18", "BOOLEAN", "STRING", "NUMBER", "JSON", "UNKNOWN", "settings"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class GateKind {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ GateKind[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final m18 Companion;
    public static final GateKind BOOLEAN = new GateKind("BOOLEAN", 0);
    public static final GateKind STRING = new GateKind("STRING", 1);
    public static final GateKind NUMBER = new GateKind("NUMBER", 2);
    public static final GateKind JSON = new GateKind("JSON", 3);
    public static final GateKind UNKNOWN = new GateKind("UNKNOWN", 4);

    private static final /* synthetic */ GateKind[] $values() {
        return new GateKind[]{BOOLEAN, STRING, NUMBER, JSON, UNKNOWN};
    }

    static {
        GateKind[] gateKindArr$values = $values();
        $VALUES = gateKindArr$values;
        $ENTRIES = wd6.n0(gateKindArr$values);
        Companion = new m18();
        $cachedSerializer$delegate = yb5.w(w1a.F, new c97(13));
    }

    private GateKind(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _init_$_anonymous_() {
        GateKind[] gateKindArrValues = values();
        gateKindArrValues.getClass();
        return new lq6("com.anthropic.claude.settings.internal.growthbook.GateKind", (Enum[]) gateKindArrValues);
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static GateKind valueOf(String str) {
        return (GateKind) Enum.valueOf(GateKind.class, str);
    }

    public static GateKind[] values() {
        return (GateKind[]) $VALUES.clone();
    }
}
