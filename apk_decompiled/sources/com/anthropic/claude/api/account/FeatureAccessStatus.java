package com.anthropic.claude.api.account;

import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.fq6;
import defpackage.jd7;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.sf7;
import defpackage.tf7;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/anthropic/claude/api/account/FeatureAccessStatus;", "", "", ExperienceToggle.DEFAULT_PARAM_KEY, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getValue", "Companion", "sf7", "AVAILABLE", "BLOCKED_BY_PLATFORM", "BLOCKED_BY_ORG_ADMIN", "BLOCKED_BY_ENTITLEMENT", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = tf7.class)
public final class FeatureAccessStatus {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ FeatureAccessStatus[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final sf7 Companion;
    private final String value;
    public static final FeatureAccessStatus AVAILABLE = new FeatureAccessStatus("AVAILABLE", 0, "available");
    public static final FeatureAccessStatus BLOCKED_BY_PLATFORM = new FeatureAccessStatus("BLOCKED_BY_PLATFORM", 1, "blocked_by_platform");
    public static final FeatureAccessStatus BLOCKED_BY_ORG_ADMIN = new FeatureAccessStatus("BLOCKED_BY_ORG_ADMIN", 2, "blocked_by_org_admin");
    public static final FeatureAccessStatus BLOCKED_BY_ENTITLEMENT = new FeatureAccessStatus("BLOCKED_BY_ENTITLEMENT", 3, "blocked_by_entitlement");
    public static final FeatureAccessStatus UNKNOWN = new FeatureAccessStatus("UNKNOWN", 4, "unknown");

    private static final /* synthetic */ FeatureAccessStatus[] $values() {
        return new FeatureAccessStatus[]{AVAILABLE, BLOCKED_BY_PLATFORM, BLOCKED_BY_ORG_ADMIN, BLOCKED_BY_ENTITLEMENT, UNKNOWN};
    }

    static {
        FeatureAccessStatus[] featureAccessStatusArr$values = $values();
        $VALUES = featureAccessStatusArr$values;
        $ENTRIES = wd6.n0(featureAccessStatusArr$values);
        Companion = new sf7();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new jd7(2));
    }

    private FeatureAccessStatus(String str, int i, String str2) {
        this.value = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.account.FeatureAccessStatus", values(), new String[]{"available", "blocked_by_platform", "blocked_by_org_admin", "blocked_by_entitlement", null}, new Annotation[][]{null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static FeatureAccessStatus valueOf(String str) {
        return (FeatureAccessStatus) Enum.valueOf(FeatureAccessStatus.class, str);
    }

    public static FeatureAccessStatus[] values() {
        return (FeatureAccessStatus[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
