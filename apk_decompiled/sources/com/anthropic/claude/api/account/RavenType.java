package com.anthropic.claude.api.account;

import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.v1e;
import defpackage.w1a;
import defpackage.w1e;
import defpackage.wd6;
import defpackage.yb5;
import defpackage.zcd;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\u0007j\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/api/account/RavenType;", "", "", ExperienceToggle.DEFAULT_PARAM_KEY, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getValue", "Companion", "v1e", "TEAM", "ENTERPRISE", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = w1e.class)
public final class RavenType {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ RavenType[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final v1e Companion;
    private final String value;
    public static final RavenType TEAM = new RavenType("TEAM", 0, "team");
    public static final RavenType ENTERPRISE = new RavenType("ENTERPRISE", 1, "enterprise");

    private static final /* synthetic */ RavenType[] $values() {
        return new RavenType[]{TEAM, ENTERPRISE};
    }

    static {
        RavenType[] ravenTypeArr$values = $values();
        $VALUES = ravenTypeArr$values;
        $ENTRIES = wd6.n0(ravenTypeArr$values);
        Companion = new v1e();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new zcd(6));
    }

    private RavenType(String str, int i, String str2) {
        this.value = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.account.RavenType", values(), new String[]{"team", "enterprise"}, new Annotation[][]{null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static RavenType valueOf(String str) {
        return (RavenType) Enum.valueOf(RavenType.class, str);
    }

    public static RavenType[] values() {
        return (RavenType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
