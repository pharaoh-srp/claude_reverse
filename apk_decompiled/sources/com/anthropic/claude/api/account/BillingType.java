package com.anthropic.claude.api.account;

import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.pp1;
import defpackage.rc1;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/anthropic/claude/api/account/BillingType;", "", "", ExperienceToggle.DEFAULT_PARAM_KEY, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "Companion", "pp1", "NONE", "STRIPE_SELF_SERVE_SUBSCRIPTION", "STRIPE_SUBSCRIPTION_CONTRACTED", "STRIPE_SUBSCRIPTION_ENTERPRISE_SELF_SERVE", "EXTERNAL_SUBSCRIPTION_CONTRACTED", "AWS_MARKETPLACE", "AZURE_AI_FOUNDRY", "APPLE_SUBSCRIPTION", "GOOGLE_PLAY_SUBSCRIPTION", "API_EVALUATION", "PREPAID", "USAGE_BASED", "C4E_CONSUMPTION_TRIAL", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class BillingType {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ BillingType[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final pp1 Companion;
    private final String value;
    public static final BillingType NONE = new BillingType("NONE", 0, "none");
    public static final BillingType STRIPE_SELF_SERVE_SUBSCRIPTION = new BillingType("STRIPE_SELF_SERVE_SUBSCRIPTION", 1, "stripe_subscription");
    public static final BillingType STRIPE_SUBSCRIPTION_CONTRACTED = new BillingType("STRIPE_SUBSCRIPTION_CONTRACTED", 2, "stripe_subscription_contracted");
    public static final BillingType STRIPE_SUBSCRIPTION_ENTERPRISE_SELF_SERVE = new BillingType("STRIPE_SUBSCRIPTION_ENTERPRISE_SELF_SERVE", 3, "stripe_subscription_enterprise_self_serve");
    public static final BillingType EXTERNAL_SUBSCRIPTION_CONTRACTED = new BillingType("EXTERNAL_SUBSCRIPTION_CONTRACTED", 4, "external_subscription_contracted");
    public static final BillingType AWS_MARKETPLACE = new BillingType("AWS_MARKETPLACE", 5, "aws_marketplace");
    public static final BillingType AZURE_AI_FOUNDRY = new BillingType("AZURE_AI_FOUNDRY", 6, "azure_ai_foundry");
    public static final BillingType APPLE_SUBSCRIPTION = new BillingType("APPLE_SUBSCRIPTION", 7, "apple_subscription");
    public static final BillingType GOOGLE_PLAY_SUBSCRIPTION = new BillingType("GOOGLE_PLAY_SUBSCRIPTION", 8, "google_play_subscription");
    public static final BillingType API_EVALUATION = new BillingType("API_EVALUATION", 9, "api_evaluation");
    public static final BillingType PREPAID = new BillingType("PREPAID", 10, "prepaid");
    public static final BillingType USAGE_BASED = new BillingType("USAGE_BASED", 11, "usage_based");
    public static final BillingType C4E_CONSUMPTION_TRIAL = new BillingType("C4E_CONSUMPTION_TRIAL", 12, "c4e_consumption_trial");

    private static final /* synthetic */ BillingType[] $values() {
        return new BillingType[]{NONE, STRIPE_SELF_SERVE_SUBSCRIPTION, STRIPE_SUBSCRIPTION_CONTRACTED, STRIPE_SUBSCRIPTION_ENTERPRISE_SELF_SERVE, EXTERNAL_SUBSCRIPTION_CONTRACTED, AWS_MARKETPLACE, AZURE_AI_FOUNDRY, APPLE_SUBSCRIPTION, GOOGLE_PLAY_SUBSCRIPTION, API_EVALUATION, PREPAID, USAGE_BASED, C4E_CONSUMPTION_TRIAL};
    }

    static {
        BillingType[] billingTypeArr$values = $values();
        $VALUES = billingTypeArr$values;
        $ENTRIES = wd6.n0(billingTypeArr$values);
        Companion = new pp1();
        $cachedSerializer$delegate = yb5.w(w1a.F, new rc1(5));
    }

    private BillingType(String str, int i, String str2) {
        this.value = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.account.BillingType", values(), new String[]{"none", "stripe_subscription", "stripe_subscription_contracted", "stripe_subscription_enterprise_self_serve", "external_subscription_contracted", "aws_marketplace", "azure_ai_foundry", "apple_subscription", "google_play_subscription", "api_evaluation", "prepaid", "usage_based", "c4e_consumption_trial"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static BillingType valueOf(String str) {
        return (BillingType) Enum.valueOf(BillingType.class, str);
    }

    public static BillingType[] values() {
        return (BillingType[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
