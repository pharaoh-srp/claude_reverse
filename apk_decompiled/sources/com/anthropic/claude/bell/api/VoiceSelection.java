package com.anthropic.claude.bell.api;

import defpackage.ij0;
import defpackage.mdj;
import defpackage.onf;
import defpackage.x44;
import defpackage.z4j;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0002\u0015\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0017"}, d2 = {"Lcom/anthropic/claude/bell/api/VoiceSelection;", "", "", "id", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "toString-impl", "toString", "", "hashCode-impl", "(Ljava/lang/String;)I", "hashCode", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Companion", "z4j", "y4j", "bell"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class VoiceSelection {
    private static final String AIRY;
    private static final List<VoiceSelection> BUNDLED;
    private static final String BUTTERY;
    public static final z4j Companion = new z4j();
    private static final String DEFAULT;
    private static final String GLASSY;
    private static final String MELLOW;
    private static final String ROUNDED;
    private final String id;

    static {
        String strM574constructorimpl = m574constructorimpl("buttery");
        BUTTERY = strM574constructorimpl;
        String strM574constructorimpl2 = m574constructorimpl("airy");
        AIRY = strM574constructorimpl2;
        String strM574constructorimpl3 = m574constructorimpl("mellow");
        MELLOW = strM574constructorimpl3;
        String strM574constructorimpl4 = m574constructorimpl("glassy");
        GLASSY = strM574constructorimpl4;
        String strM574constructorimpl5 = m574constructorimpl("rounded");
        ROUNDED = strM574constructorimpl5;
        DEFAULT = strM574constructorimpl;
        BUNDLED = x44.X(m573boximpl(strM574constructorimpl), m573boximpl(strM574constructorimpl2), m573boximpl(strM574constructorimpl3), m573boximpl(strM574constructorimpl4), m573boximpl(strM574constructorimpl5));
    }

    private /* synthetic */ VoiceSelection(String str) {
        this.id = str;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ VoiceSelection m573boximpl(String str) {
        return new VoiceSelection(str);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m574constructorimpl(String str) {
        str.getClass();
        return str;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m575equalsimpl(String str, Object obj) {
        return (obj instanceof VoiceSelection) && x44.r(str, ((VoiceSelection) obj).m579unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m576equalsimpl0(String str, String str2) {
        return x44.r(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m577hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m578toStringimpl(String str) {
        return ij0.j("VoiceSelection(id=", str, ")");
    }

    public boolean equals(Object obj) {
        return m575equalsimpl(this.id, obj);
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return m577hashCodeimpl(this.id);
    }

    public String toString() {
        return m578toStringimpl(this.id);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m579unboximpl() {
        return this.id;
    }
}
