package com.anthropic.claude.api.export;

import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.c97;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.lb7;
import defpackage.mdj;
import defpackage.ob7;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/anthropic/claude/api/export/ExportStatus;", "", "", ExperienceToggle.DEFAULT_PARAM_KEY, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "lb7", "NOT_FOUND", "READY", "EXPORT_NOT_ALLOWED", "INCORRECT_CREATOR", "INCORRECT_ORG", "EXPORT_EXPIRED", "EXPORT_USED", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = ob7.class)
public final class ExportStatus {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ExportStatus[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final lb7 Companion;
    private final String value;
    public static final ExportStatus NOT_FOUND = new ExportStatus("NOT_FOUND", 0, "not_found");
    public static final ExportStatus READY = new ExportStatus("READY", 1, "ready");
    public static final ExportStatus EXPORT_NOT_ALLOWED = new ExportStatus("EXPORT_NOT_ALLOWED", 2, "export_not_allowed");
    public static final ExportStatus INCORRECT_CREATOR = new ExportStatus("INCORRECT_CREATOR", 3, "incorrect_creator");
    public static final ExportStatus INCORRECT_ORG = new ExportStatus("INCORRECT_ORG", 4, "incorrect_org");
    public static final ExportStatus EXPORT_EXPIRED = new ExportStatus("EXPORT_EXPIRED", 5, "export_expired");
    public static final ExportStatus EXPORT_USED = new ExportStatus("EXPORT_USED", 6, "export_used");
    public static final ExportStatus UNKNOWN = new ExportStatus("UNKNOWN", 7, "unknown");

    private static final /* synthetic */ ExportStatus[] $values() {
        return new ExportStatus[]{NOT_FOUND, READY, EXPORT_NOT_ALLOWED, INCORRECT_CREATOR, INCORRECT_ORG, EXPORT_EXPIRED, EXPORT_USED, UNKNOWN};
    }

    static {
        ExportStatus[] exportStatusArr$values = $values();
        $VALUES = exportStatusArr$values;
        $ENTRIES = wd6.n0(exportStatusArr$values);
        Companion = new lb7();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new c97(6));
    }

    private ExportStatus(String str, int i, String str2) {
        this.value = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.export.ExportStatus", values(), new String[]{"not_found", "ready", "export_not_allowed", "incorrect_creator", "incorrect_org", "export_expired", "export_used", "unknown"}, new Annotation[][]{null, null, null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ExportStatus valueOf(String str) {
        return (ExportStatus) Enum.valueOf(ExportStatus.class, str);
    }

    public static ExportStatus[] values() {
        return (ExportStatus[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
