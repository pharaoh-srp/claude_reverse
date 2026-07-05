package com.anthropic.claude.types.strings;

import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.bmh;
import defpackage.emh;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.onf;
import defpackage.x44;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u000b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0016"}, d2 = {"Lcom/anthropic/claude/types/strings/ThinkingMode;", "", "", ExperienceToggle.DEFAULT_PARAM_KEY, "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "", "isNonThinkingMode-impl", "(Ljava/lang/String;)Z", "isNonThinkingMode", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getValue", "Companion", "bmh", "Claude:types"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = emh.class)
public final class ThinkingMode {
    public static final bmh Companion = new bmh();
    private static final String NORMAL = m1143constructorimpl("normal");
    private static final String OFF = m1143constructorimpl("off");
    private final String value;

    private /* synthetic */ ThinkingMode(String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ThinkingMode m1142boximpl(String str) {
        return new ThinkingMode(str);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m1143constructorimpl(String str) {
        str.getClass();
        return str;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1144equalsimpl(String str, Object obj) {
        return (obj instanceof ThinkingMode) && x44.r(str, ((ThinkingMode) obj).m1149unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1145equalsimpl0(String str, String str2) {
        return x44.r(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1146hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: isNonThinkingMode-impl, reason: not valid java name */
    public static final boolean m1147isNonThinkingModeimpl(String str) {
        return m1145equalsimpl0(str, NORMAL);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1148toStringimpl(String str) {
        return ij0.j("ThinkingMode(value=", str, ")");
    }

    public boolean equals(Object other) {
        return m1144equalsimpl(this.value, other);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m1146hashCodeimpl(this.value);
    }

    public String toString() {
        return m1148toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m1149unboximpl() {
        return this.value;
    }
}
