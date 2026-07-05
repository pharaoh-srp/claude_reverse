package com.anthropic.claude.models.organization.configtypes;

import com.anthropic.claude.types.strings.ModelId;
import defpackage.dmk;
import defpackage.ebh;
import defpackage.ew0;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kw9;
import defpackage.lm6;
import defpackage.lq6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.pvg;
import defpackage.u91;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnb;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0003%&'B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010\u0016¨\u0006\u0004"}, d2 = {"Lcom/anthropic/claude/models/organization/configtypes/AvailableModelsConfig;", "", "", "Lcom/anthropic/claude/models/organization/configtypes/AvailableModelsConfig$AvailableModel;", "models", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$models", "(Lcom/anthropic/claude/models/organization/configtypes/AvailableModelsConfig;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/anthropic/claude/models/organization/configtypes/AvailableModelsConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getModels", "Companion", "AvailableModel", "t91", "u91"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class AvailableModelsConfig {
    public static final int $stable = 0;
    private final List<AvailableModel> models;
    public static final u91 Companion = new u91();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new ew0(6))};

    public /* synthetic */ AvailableModelsConfig(int i, List list, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.models = lm6.E;
        } else {
            this.models = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(a.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AvailableModelsConfig copy$default(AvailableModelsConfig availableModelsConfig, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = availableModelsConfig.models;
        }
        return availableModelsConfig.copy(list);
    }

    public static final /* synthetic */ void write$Self$models(AvailableModelsConfig self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (!output.E(serialDesc) && x44.r(self.models, lm6.E)) {
            return;
        }
        output.r(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.models);
    }

    public final List<AvailableModel> component1() {
        return this.models;
    }

    public final AvailableModelsConfig copy(List<AvailableModel> models) {
        models.getClass();
        return new AvailableModelsConfig(models);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AvailableModelsConfig) && x44.r(this.models, ((AvailableModelsConfig) other).models);
    }

    public final List<AvailableModel> getModels() {
        return this.models;
    }

    public int hashCode() {
        return this.models.hashCode();
    }

    public String toString() {
        return ebh.n("AvailableModelsConfig(models=", ")", this.models);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AvailableModelsConfig() {
        this((List) null, 1, (mq5) (0 == true ? 1 : 0));
    }

    public AvailableModelsConfig(List<AvailableModel> list) {
        list.getClass();
        this.models = list;
    }

    public /* synthetic */ AvailableModelsConfig(List list, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? lm6.E : list);
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J$\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lcom/anthropic/claude/models/organization/configtypes/AvailableModelsConfig$AvailableModel;", "", "Lcom/anthropic/claude/types/strings/ModelId;", "model_id", "", "minimum_tier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lmq5;)V", "", "seen0", "Lpvg;", "minimumTier", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lpvg;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$models", "(Lcom/anthropic/claude/models/organization/configtypes/AvailableModelsConfig$AvailableModel;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-i-4oh0I", "()Ljava/lang/String;", "component1", "component2", "copy-xe3n0YA", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/models/organization/configtypes/AvailableModelsConfig$AvailableModel;", "copy", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getModel_id-i-4oh0I", "getMinimum_tier", "Lpvg;", "getMinimumTier", "()Lpvg;", "Companion", "com/anthropic/claude/models/organization/configtypes/a", "com/anthropic/claude/models/organization/configtypes/b", "models"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class AvailableModel {
        public static final int $stable = 0;
        private final pvg minimumTier;
        private final String minimum_tier;
        private final String model_id;
        public static final b Companion = new b();
        private static final kw9[] $childSerializers = {null, null, yb5.w(w1a.F, new ew0(7))};

        private /* synthetic */ AvailableModel(int i, String str, String str2, pvg pvgVar, vnf vnfVar) {
            if (3 != (i & 3)) {
                gvj.f(i, 3, a.a.getDescriptor());
                throw null;
            }
            this.model_id = str;
            this.minimum_tier = str2;
            if ((i & 4) == 0) {
                this.minimumTier = dmk.c(str2);
            } else {
                this.minimumTier = pvgVar;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final KSerializer _childSerializers$_anonymous_() {
            pvg[] pvgVarArrValues = pvg.values();
            pvgVarArrValues.getClass();
            return new lq6("com.anthropic.claude.api.account.SubscriptionLevel", (Enum[]) pvgVarArrValues);
        }

        /* JADX INFO: renamed from: copy-xe3n0YA$default, reason: not valid java name */
        public static /* synthetic */ AvailableModel m773copyxe3n0YA$default(AvailableModel availableModel, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = availableModel.model_id;
            }
            if ((i & 2) != 0) {
                str2 = availableModel.minimum_tier;
            }
            return availableModel.m775copyxe3n0YA(str, str2);
        }

        public static final /* synthetic */ void write$Self$models(AvailableModel self, vd4 output, SerialDescriptor serialDesc) {
            kw9[] kw9VarArr = $childSerializers;
            output.r(serialDesc, 0, vnb.a, ModelId.m1058boximpl(self.model_id));
            output.q(serialDesc, 1, self.minimum_tier);
            if (!output.E(serialDesc) && self.minimumTier == dmk.c(self.minimum_tier)) {
                return;
            }
            output.B(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.minimumTier);
        }

        /* JADX INFO: renamed from: component1-i-4oh0I, reason: not valid java name and from getter */
        public final String getModel_id() {
            return this.model_id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMinimum_tier() {
            return this.minimum_tier;
        }

        /* JADX INFO: renamed from: copy-xe3n0YA, reason: not valid java name */
        public final AvailableModel m775copyxe3n0YA(String model_id, String minimum_tier) {
            model_id.getClass();
            minimum_tier.getClass();
            return new AvailableModel(model_id, minimum_tier, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AvailableModel)) {
                return false;
            }
            AvailableModel availableModel = (AvailableModel) other;
            return ModelId.m1061equalsimpl0(this.model_id, availableModel.model_id) && x44.r(this.minimum_tier, availableModel.minimum_tier);
        }

        public final pvg getMinimumTier() {
            return this.minimumTier;
        }

        public final String getMinimum_tier() {
            return this.minimum_tier;
        }

        /* JADX INFO: renamed from: getModel_id-i-4oh0I, reason: not valid java name */
        public final String m776getModel_idi4oh0I() {
            return this.model_id;
        }

        public int hashCode() {
            return this.minimum_tier.hashCode() + (ModelId.m1062hashCodeimpl(this.model_id) * 31);
        }

        public String toString() {
            return ij0.l("AvailableModel(model_id=", ModelId.m1063toStringimpl(this.model_id), ", minimum_tier=", this.minimum_tier, ")");
        }

        public /* synthetic */ AvailableModel(String str, String str2, mq5 mq5Var) {
            this(str, str2);
        }

        public /* synthetic */ AvailableModel(int i, String str, String str2, pvg pvgVar, vnf vnfVar, mq5 mq5Var) {
            this(i, str, str2, pvgVar, vnfVar);
        }

        private AvailableModel(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.model_id = str;
            this.minimum_tier = str2;
            this.minimumTier = dmk.c(str2);
        }
    }
}
