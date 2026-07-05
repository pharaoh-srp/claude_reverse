package com.anthropic.claude.api.model;

import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.onf;
import defpackage.upb;
import defpackage.x44;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0002\u0015\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0017"}, d2 = {"Lcom/anthropic/claude/api/model/ModelSelectorSurface;", "", "", ExperienceToggle.DEFAULT_PARAM_KEY, "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "toString-impl", "toString", "", "hashCode-impl", "(Ljava/lang/String;)I", "hashCode", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "equals", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "upb", "tpb", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class ModelSelectorSurface {
    private final String value;
    public static final upb Companion = new upb();
    private static final String CHAT = m373constructorimpl("chat");
    private static final String CODE = m373constructorimpl("code");
    private static final String COWORK = m373constructorimpl("cowork");

    private /* synthetic */ ModelSelectorSurface(String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ModelSelectorSurface m372boximpl(String str) {
        return new ModelSelectorSurface(str);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m373constructorimpl(String str) {
        str.getClass();
        return str;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m374equalsimpl(String str, Object obj) {
        return (obj instanceof ModelSelectorSurface) && x44.r(str, ((ModelSelectorSurface) obj).m378unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m375equalsimpl0(String str, String str2) {
        return x44.r(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m376hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m377toStringimpl(String str) {
        return ij0.j("ModelSelectorSurface(value=", str, ")");
    }

    public boolean equals(Object obj) {
        return m374equalsimpl(this.value, obj);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m376hashCodeimpl(this.value);
    }

    public String toString() {
        return m377toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m378unboximpl() {
        return this.value;
    }
}
