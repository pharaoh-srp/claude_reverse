package com.anthropic.claude.models.organization.configtypes;

import defpackage.ebh;
import defpackage.kw9;
import defpackage.lq6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.po1;
import defpackage.pwf;
import defpackage.pyk;
import defpackage.qo1;
import defpackage.rc1;
import defpackage.sf5;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0003\n+,B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B;\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0005\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\u001e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00192\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001dR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010)¨\u0006-"}, d2 = {"Lcom/anthropic/claude/models/organization/configtypes/BetaToolsConfig;", "", "", "", "beta_tools", "<init>", "(Ljava/util/List;)V", "", "seen0", "", "Lqo1;", "betaToolSettings", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/Set;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$models", "(Lcom/anthropic/claude/models/organization/configtypes/BetaToolsConfig;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toolSetting", "", "isBeta", "(Lqo1;)Z", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/anthropic/claude/models/organization/configtypes/BetaToolsConfig;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getBeta_tools", "Ljava/util/Set;", "Companion", "oo1", "po1", "models"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class BetaToolsConfig {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final po1 Companion = new po1();
    private final Set<qo1> betaToolSettings;
    private final List<String> beta_tools;

    static {
        rc1 rc1Var = new rc1(3);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{yb5.w(w1aVar, rc1Var), yb5.w(w1aVar, new rc1(4))};
    }

    public BetaToolsConfig(int i, List list, Set set, vnf vnfVar) {
        this.beta_tools = (i & 1) == 0 ? null : list;
        if ((i & 2) != 0) {
            this.betaToolSettings = set;
            return;
        }
        pwf pwfVar = new pwf();
        List<String> list2 = this.beta_tools;
        if (list2 != null) {
            for (String str : list2) {
                qo1.F.getClass();
                qo1 qo1VarA0 = pyk.A0(str);
                if (qo1VarA0 != null) {
                    pwfVar.add(qo1VarA0);
                }
            }
        }
        this.betaToolSettings = sf5.k(pwfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(srg.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_$0() {
        qo1[] qo1VarArrValues = qo1.values();
        qo1VarArrValues.getClass();
        return new uo0(new lq6("com.anthropic.claude.models.organization.configtypes.BetaToolsConfig.Tool", (Enum[]) qo1VarArrValues), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BetaToolsConfig copy$default(BetaToolsConfig betaToolsConfig, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = betaToolsConfig.beta_tools;
        }
        return betaToolsConfig.copy(list);
    }

    public static final void write$Self$models(BetaToolsConfig self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.beta_tools != null) {
            output.B(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.beta_tools);
        }
        if (!output.E(serialDesc)) {
            Set<qo1> set = self.betaToolSettings;
            pwf pwfVar = new pwf();
            List<String> list = self.beta_tools;
            if (list != null) {
                for (String str : list) {
                    qo1.F.getClass();
                    qo1 qo1VarA0 = pyk.A0(str);
                    if (qo1VarA0 != null) {
                        pwfVar.add(qo1VarA0);
                    }
                }
            }
            if (x44.r(set, sf5.k(pwfVar))) {
                return;
            }
        }
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.betaToolSettings);
    }

    public final List<String> component1() {
        return this.beta_tools;
    }

    public final BetaToolsConfig copy(List<String> beta_tools) {
        return new BetaToolsConfig(beta_tools);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BetaToolsConfig) && x44.r(this.beta_tools, ((BetaToolsConfig) other).beta_tools);
    }

    public final List<String> getBeta_tools() {
        return this.beta_tools;
    }

    public int hashCode() {
        List<String> list = this.beta_tools;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final boolean isBeta(qo1 toolSetting) {
        toolSetting.getClass();
        return this.betaToolSettings.contains(toolSetting);
    }

    public String toString() {
        return ebh.n("BetaToolsConfig(beta_tools=", ")", this.beta_tools);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BetaToolsConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public BetaToolsConfig(List<String> list) {
        this.beta_tools = list;
        pwf pwfVar = new pwf();
        if (list != null) {
            for (String str : list) {
                qo1.F.getClass();
                qo1 qo1VarA0 = pyk.A0(str);
                if (qo1VarA0 != null) {
                    pwfVar.add(qo1VarA0);
                }
            }
        }
        this.betaToolSettings = sf5.k(pwfVar);
    }

    public /* synthetic */ BetaToolsConfig(List list, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : list);
    }
}
