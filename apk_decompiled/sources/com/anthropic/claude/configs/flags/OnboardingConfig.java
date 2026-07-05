package com.anthropic.claude.configs.flags;

import defpackage.e2c;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qec;
import defpackage.rec;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u001a¨\u0006+"}, d2 = {"Lcom/anthropic/claude/configs/flags/OnboardingConfig;", "", "", "", "pages", "", "showAnnualPricePerMonth", "<init>", "(Ljava/util/List;Z)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;ZLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$configs", "(Lcom/anthropic/claude/configs/flags/OnboardingConfig;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Z", "copy", "(Ljava/util/List;Z)Lcom/anthropic/claude/configs/flags/OnboardingConfig;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getPages", "Z", "getShowAnnualPricePerMonth", "Companion", "rec", "qec", "configs"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class OnboardingConfig {
    public static final int $stable = 0;
    public static final String FEATURE_KEY = "mobile_new_onboarding_config";
    private final List<String> pages;
    private final boolean showAnnualPricePerMonth;
    public static final rec Companion = new rec();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new e2c(21)), null};
    private static final OnboardingConfig DEFAULT = new OnboardingConfig(x44.X("intro", "name", "age", "phone", "grove", "subscription"), false, 2, (mq5) null);

    public /* synthetic */ OnboardingConfig(int i, List list, boolean z, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, qec.a.getDescriptor());
            throw null;
        }
        this.pages = list;
        if ((i & 2) == 0) {
            this.showAnnualPricePerMonth = false;
        } else {
            this.showAnnualPricePerMonth = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(srg.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OnboardingConfig copy$default(OnboardingConfig onboardingConfig, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = onboardingConfig.pages;
        }
        if ((i & 2) != 0) {
            z = onboardingConfig.showAnnualPricePerMonth;
        }
        return onboardingConfig.copy(list, z);
    }

    public static final /* synthetic */ void write$Self$configs(OnboardingConfig self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, (znf) $childSerializers[0].getValue(), self.pages);
        if (output.E(serialDesc) || self.showAnnualPricePerMonth) {
            output.p(serialDesc, 1, self.showAnnualPricePerMonth);
        }
    }

    public final List<String> component1() {
        return this.pages;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getShowAnnualPricePerMonth() {
        return this.showAnnualPricePerMonth;
    }

    public final OnboardingConfig copy(List<String> pages, boolean showAnnualPricePerMonth) {
        pages.getClass();
        return new OnboardingConfig(pages, showAnnualPricePerMonth);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnboardingConfig)) {
            return false;
        }
        OnboardingConfig onboardingConfig = (OnboardingConfig) other;
        return x44.r(this.pages, onboardingConfig.pages) && this.showAnnualPricePerMonth == onboardingConfig.showAnnualPricePerMonth;
    }

    public final List<String> getPages() {
        return this.pages;
    }

    public final boolean getShowAnnualPricePerMonth() {
        return this.showAnnualPricePerMonth;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showAnnualPricePerMonth) + (this.pages.hashCode() * 31);
    }

    public String toString() {
        return "OnboardingConfig(pages=" + this.pages + ", showAnnualPricePerMonth=" + this.showAnnualPricePerMonth + ")";
    }

    public OnboardingConfig(List<String> list, boolean z) {
        list.getClass();
        this.pages = list;
        this.showAnnualPricePerMonth = z;
    }

    public /* synthetic */ OnboardingConfig(List list, boolean z, int i, mq5 mq5Var) {
        this(list, (i & 2) != 0 ? false : z);
    }
}
