package com.anthropic.claude.api.account;

import com.anthropic.claude.api.feature.Feature;
import defpackage.kw9;
import defpackage.ld5;
import defpackage.lf7;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.rk3;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B'\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ0\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010\u001dR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b,\u0010\u001d¨\u00060"}, d2 = {"Lcom/anthropic/claude/api/account/CurrentUserAccess;", "", "", "Lcom/anthropic/claude/api/account/FeatureAccess;", "features", "account_features", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/account/CurrentUserAccess;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/anthropic/claude/api/feature/Feature;", "feature", "Lcom/anthropic/claude/api/account/FeatureAccessStatus;", "statusFor", "(Lcom/anthropic/claude/api/feature/Feature;)Lcom/anthropic/claude/api/account/FeatureAccessStatus;", "accountStatusFor", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/anthropic/claude/api/account/CurrentUserAccess;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getFeatures", "getAccount_features", "Companion", "kd5", "ld5", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CurrentUserAccess {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final ld5 Companion = new ld5();
    private final List<FeatureAccess> account_features;
    private final List<FeatureAccess> features;

    static {
        rk3 rk3Var = new rk3(14);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{yb5.w(w1aVar, rk3Var), yb5.w(w1aVar, new rk3(15))};
    }

    public /* synthetic */ CurrentUserAccess(int i, List list, List list2, vnf vnfVar) {
        int i2 = i & 1;
        lm6 lm6Var = lm6.E;
        if (i2 == 0) {
            this.features = lm6Var;
        } else {
            this.features = list;
        }
        if ((i & 2) == 0) {
            this.account_features = lm6Var;
        } else {
            this.account_features = list2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(lf7.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(lf7.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CurrentUserAccess copy$default(CurrentUserAccess currentUserAccess, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = currentUserAccess.features;
        }
        if ((i & 2) != 0) {
            list2 = currentUserAccess.account_features;
        }
        return currentUserAccess.copy(list, list2);
    }

    public static final /* synthetic */ void write$Self$api(CurrentUserAccess self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        boolean zE = output.E(serialDesc);
        lm6 lm6Var = lm6.E;
        if (zE || !x44.r(self.features, lm6Var)) {
            output.r(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.features);
        }
        if (!output.E(serialDesc) && x44.r(self.account_features, lm6Var)) {
            return;
        }
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.account_features);
    }

    public final FeatureAccessStatus accountStatusFor(Feature feature) {
        Object next;
        feature.getClass();
        Iterator<T> it = this.account_features.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (x44.r(((FeatureAccess) next).getFeature(), feature.getValue())) {
                break;
            }
        }
        FeatureAccess featureAccess = (FeatureAccess) next;
        if (featureAccess != null) {
            return featureAccess.getStatus();
        }
        return null;
    }

    public final List<FeatureAccess> component1() {
        return this.features;
    }

    public final List<FeatureAccess> component2() {
        return this.account_features;
    }

    public final CurrentUserAccess copy(List<FeatureAccess> features, List<FeatureAccess> account_features) {
        features.getClass();
        account_features.getClass();
        return new CurrentUserAccess(features, account_features);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrentUserAccess)) {
            return false;
        }
        CurrentUserAccess currentUserAccess = (CurrentUserAccess) other;
        return x44.r(this.features, currentUserAccess.features) && x44.r(this.account_features, currentUserAccess.account_features);
    }

    public final List<FeatureAccess> getAccount_features() {
        return this.account_features;
    }

    public final List<FeatureAccess> getFeatures() {
        return this.features;
    }

    public int hashCode() {
        return this.account_features.hashCode() + (this.features.hashCode() * 31);
    }

    public final FeatureAccessStatus statusFor(Feature feature) {
        Object next;
        feature.getClass();
        Iterator<T> it = this.features.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (x44.r(((FeatureAccess) next).getFeature(), feature.getValue())) {
                break;
            }
        }
        FeatureAccess featureAccess = (FeatureAccess) next;
        if (featureAccess != null) {
            return featureAccess.getStatus();
        }
        return null;
    }

    public String toString() {
        return "CurrentUserAccess(features=" + this.features + ", account_features=" + this.account_features + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CurrentUserAccess() {
        this((List) null, (List) (0 == true ? 1 : 0), 3, (mq5) (0 == true ? 1 : 0));
    }

    public CurrentUserAccess(List<FeatureAccess> list, List<FeatureAccess> list2) {
        list.getClass();
        list2.getClass();
        this.features = list;
        this.account_features = list2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CurrentUserAccess(List list, List list2, int i, mq5 mq5Var) {
        int i2 = i & 1;
        lm6 lm6Var = lm6.E;
        this(i2 != 0 ? lm6Var : list, (i & 2) != 0 ? lm6Var : list2);
    }
}
