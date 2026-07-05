package com.anthropic.claude.types.strings;

import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.onf;
import defpackage.qle;
import defpackage.rle;
import defpackage.x44;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0007\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0013"}, d2 = {"Lcom/anthropic/claude/types/strings/ResearchMode;", "", "", ExperienceToggle.DEFAULT_PARAM_KEY, "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getValue", "Companion", "qle", "Claude:types"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = rle.class)
public final class ResearchMode {
    private final String value;
    public static final qle Companion = new qle();
    private static final String ADVANCED = m1094constructorimpl("advanced");
    private static final String LIGHT = m1094constructorimpl("light");
    private static final String NONE = m1094constructorimpl("none");

    private /* synthetic */ ResearchMode(String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ResearchMode m1093boximpl(String str) {
        return new ResearchMode(str);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m1094constructorimpl(String str) {
        str.getClass();
        return str;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1095equalsimpl(String str, Object obj) {
        return (obj instanceof ResearchMode) && x44.r(str, ((ResearchMode) obj).m1099unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1096equalsimpl0(String str, String str2) {
        return x44.r(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1097hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1098toStringimpl(String str) {
        return ij0.j("ResearchMode(value=", str, ")");
    }

    public boolean equals(Object other) {
        return m1095equalsimpl(this.value, other);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m1097hashCodeimpl(this.value);
    }

    public String toString() {
        return m1098toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m1099unboximpl() {
        return this.value;
    }
}
