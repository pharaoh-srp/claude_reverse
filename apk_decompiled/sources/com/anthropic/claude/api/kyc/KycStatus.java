package com.anthropic.claude.api.kyc;

import defpackage.fq6;
import defpackage.ks9;
import defpackage.kw9;
import defpackage.ls9;
import defpackage.m99;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.os9;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.wg6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/anthropic/claude/api/kyc/KycStatus;", "", "<init>", "(Ljava/lang/String;I)V", "", "isBlocking", "()Z", "Companion", "ks9", "NOT_REQUIRED", "VERIFIED", "CREATED", "IN_PROGRESS", "MANUAL_REVIEW", "FAILED", "EXPIRED", "DENIED", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = os9.class)
public final class KycStatus {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ KycStatus[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final ks9 Companion;
    public static final KycStatus NOT_REQUIRED = new KycStatus("NOT_REQUIRED", 0);
    public static final KycStatus VERIFIED = new KycStatus("VERIFIED", 1);
    public static final KycStatus CREATED = new KycStatus("CREATED", 2);
    public static final KycStatus IN_PROGRESS = new KycStatus("IN_PROGRESS", 3);
    public static final KycStatus MANUAL_REVIEW = new KycStatus("MANUAL_REVIEW", 4);
    public static final KycStatus FAILED = new KycStatus("FAILED", 5);
    public static final KycStatus EXPIRED = new KycStatus("EXPIRED", 6);
    public static final KycStatus DENIED = new KycStatus("DENIED", 7);
    public static final KycStatus UNKNOWN = new KycStatus("UNKNOWN", 8);

    private static final /* synthetic */ KycStatus[] $values() {
        return new KycStatus[]{NOT_REQUIRED, VERIFIED, CREATED, IN_PROGRESS, MANUAL_REVIEW, FAILED, EXPIRED, DENIED, UNKNOWN};
    }

    static {
        KycStatus[] kycStatusArr$values = $values();
        $VALUES = kycStatusArr$values;
        $ENTRIES = wd6.n0(kycStatusArr$values);
        Companion = new ks9();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new m99(5));
    }

    private KycStatus(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.kyc.KycStatus", values(), new String[]{"not_required", "verified", "created", "in_progress", "manual_review", "failed", "expired", "denied", null}, new Annotation[][]{null, null, null, null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static KycStatus valueOf(String str) {
        return (KycStatus) Enum.valueOf(KycStatus.class, str);
    }

    public static KycStatus[] values() {
        return (KycStatus[]) $VALUES.clone();
    }

    public final boolean isBlocking() {
        switch (ls9.a[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return false;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                wg6.i();
                return false;
        }
    }
}
