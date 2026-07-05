package com.anthropic.claude.models.organization.configtypes;

import defpackage.bsg;
import defpackage.ebh;
import defpackage.fr4;
import defpackage.fvh;
import defpackage.kw9;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.r55;
import defpackage.u55;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u0017\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R(\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0016R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028F¢\u0006\u0006\u001a\u0004\b&\u0010\u0016¨\u0006+"}, d2 = {"Lcom/anthropic/claude/models/organization/configtypes/CoworkStarterChipsConfig;", "", "", "Lcom/anthropic/claude/models/organization/configtypes/CoworkStarterChip;", "chips", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$models", "(Lcom/anthropic/claude/models/organization/configtypes/CoworkStarterChipsConfig;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/anthropic/claude/models/organization/configtypes/CoworkStarterChipsConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getChips", "getChips$annotations", "()V", "getValidChips", "validChips", "Companion", "u55", "t55", "models"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CoworkStarterChipsConfig {
    public static final int $stable = 0;
    public static final String CONFIG_NAME = "cowork_starter_chip_config";
    private final List<CoworkStarterChip> chips;
    public static final u55 Companion = new u55();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new fr4(26))};

    public /* synthetic */ CoworkStarterChipsConfig(int i, List list, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.chips = null;
        } else {
            this.chips = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new fvh(r55.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CoworkStarterChipsConfig copy$default(CoworkStarterChipsConfig coworkStarterChipsConfig, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = coworkStarterChipsConfig.chips;
        }
        return coworkStarterChipsConfig.copy(list);
    }

    @onf(with = fvh.class)
    public static /* synthetic */ void getChips$annotations() {
    }

    public static final /* synthetic */ void write$Self$models(CoworkStarterChipsConfig self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (!output.E(serialDesc) && self.chips == null) {
            return;
        }
        output.B(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.chips);
    }

    public final List<CoworkStarterChip> component1() {
        return this.chips;
    }

    public final CoworkStarterChipsConfig copy(List<CoworkStarterChip> chips) {
        return new CoworkStarterChipsConfig(chips);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CoworkStarterChipsConfig) && x44.r(this.chips, ((CoworkStarterChipsConfig) other).chips);
    }

    public final List<CoworkStarterChip> getChips() {
        return this.chips;
    }

    public final List<CoworkStarterChip> getValidChips() {
        Iterable iterable = this.chips;
        if (iterable == null) {
            iterable = lm6.E;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            CoworkStarterChip coworkStarterChip = (CoworkStarterChip) obj;
            if (!bsg.I0(coworkStarterChip.getId()) && !bsg.I0(coworkStarterChip.getChip_text()) && !bsg.I0(coworkStarterChip.getPrompt())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public int hashCode() {
        List<CoworkStarterChip> list = this.chips;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return ebh.n("CoworkStarterChipsConfig(chips=", ")", this.chips);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CoworkStarterChipsConfig() {
        this((List) null, 1, (mq5) (0 == true ? 1 : 0));
    }

    public CoworkStarterChipsConfig(List<CoworkStarterChip> list) {
        this.chips = list;
    }

    public /* synthetic */ CoworkStarterChipsConfig(List list, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : list);
    }
}
