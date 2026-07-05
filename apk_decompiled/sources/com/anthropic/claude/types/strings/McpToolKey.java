package com.anthropic.claude.types.strings;

import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.bsg;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.n4b;
import defpackage.onf;
import defpackage.x44;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0002\u0015\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\n\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0017"}, d2 = {"Lcom/anthropic/claude/types/strings/McpToolKey;", "", "", ExperienceToggle.DEFAULT_PARAM_KEY, "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/anthropic/claude/types/strings/McpServerId;", "extractServerId-CNqihKI", "extractServerId", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getValue", "Companion", "n4b", "m4b", "Claude:types"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class McpToolKey {
    public static final n4b Companion = new n4b();
    private static final String EMPTY = m1044constructorimpl("");
    private final String value;

    private /* synthetic */ McpToolKey(String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ McpToolKey m1043boximpl(String str) {
        return new McpToolKey(str);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m1044constructorimpl(String str) {
        str.getClass();
        return str;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1045equalsimpl(String str, Object obj) {
        return (obj instanceof McpToolKey) && x44.r(str, ((McpToolKey) obj).m1050unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1046equalsimpl0(String str, String str2) {
        return x44.r(str, str2);
    }

    /* JADX INFO: renamed from: extractServerId-CNqihKI, reason: not valid java name */
    public static final String m1047extractServerIdCNqihKI(String str) {
        String strG1 = bsg.g1(str, ':');
        if (strG1.length() <= 0) {
            strG1 = null;
        }
        if (strG1 != null) {
            return McpServerId.m1030constructorimpl(strG1);
        }
        return null;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1048hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1049toStringimpl(String str) {
        return ij0.j("McpToolKey(value=", str, ")");
    }

    public boolean equals(Object other) {
        return m1045equalsimpl(this.value, other);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m1048hashCodeimpl(this.value);
    }

    public String toString() {
        return m1049toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m1050unboximpl() {
        return this.value;
    }
}
