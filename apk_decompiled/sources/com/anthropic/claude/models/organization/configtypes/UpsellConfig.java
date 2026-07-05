package com.anthropic.claude.models.organization.configtypes;

import defpackage.bli;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.nlh;
import defpackage.onf;
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

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tBO\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJL\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b,\u0010\u001c¨\u00060"}, d2 = {"Lcom/anthropic/claude/models/organization/configtypes/UpsellConfig;", "", "", "text", "dialog_title", "", "feature_list", "max_feature_list", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$models", "(Lcom/anthropic/claude/models/organization/configtypes/UpsellConfig;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/anthropic/claude/models/organization/configtypes/UpsellConfig;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "getDialog_title", "Ljava/util/List;", "getFeature_list", "getMax_feature_list", "Companion", "ali", "bli", "models"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class UpsellConfig {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final bli Companion = new bli();
    private final String dialog_title;
    private final List<String> feature_list;
    private final List<String> max_feature_list;
    private final String text;

    static {
        nlh nlhVar = new nlh(28);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, yb5.w(w1aVar, nlhVar), yb5.w(w1aVar, new nlh(29))};
    }

    public /* synthetic */ UpsellConfig(int i, String str, String str2, List list, List list2, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.text = null;
        } else {
            this.text = str;
        }
        if ((i & 2) == 0) {
            this.dialog_title = null;
        } else {
            this.dialog_title = str2;
        }
        if ((i & 4) == 0) {
            this.feature_list = null;
        } else {
            this.feature_list = list;
        }
        if ((i & 8) == 0) {
            this.max_feature_list = null;
        } else {
            this.max_feature_list = list2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(srg.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(srg.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpsellConfig copy$default(UpsellConfig upsellConfig, String str, String str2, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = upsellConfig.text;
        }
        if ((i & 2) != 0) {
            str2 = upsellConfig.dialog_title;
        }
        if ((i & 4) != 0) {
            list = upsellConfig.feature_list;
        }
        if ((i & 8) != 0) {
            list2 = upsellConfig.max_feature_list;
        }
        return upsellConfig.copy(str, str2, list, list2);
    }

    public static final /* synthetic */ void write$Self$models(UpsellConfig self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.text != null) {
            output.B(serialDesc, 0, srg.a, self.text);
        }
        if (output.E(serialDesc) || self.dialog_title != null) {
            output.B(serialDesc, 1, srg.a, self.dialog_title);
        }
        if (output.E(serialDesc) || self.feature_list != null) {
            output.B(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.feature_list);
        }
        if (!output.E(serialDesc) && self.max_feature_list == null) {
            return;
        }
        output.B(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.max_feature_list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDialog_title() {
        return this.dialog_title;
    }

    public final List<String> component3() {
        return this.feature_list;
    }

    public final List<String> component4() {
        return this.max_feature_list;
    }

    public final UpsellConfig copy(String text, String dialog_title, List<String> feature_list, List<String> max_feature_list) {
        return new UpsellConfig(text, dialog_title, feature_list, max_feature_list);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpsellConfig)) {
            return false;
        }
        UpsellConfig upsellConfig = (UpsellConfig) other;
        return x44.r(this.text, upsellConfig.text) && x44.r(this.dialog_title, upsellConfig.dialog_title) && x44.r(this.feature_list, upsellConfig.feature_list) && x44.r(this.max_feature_list, upsellConfig.max_feature_list);
    }

    public final String getDialog_title() {
        return this.dialog_title;
    }

    public final List<String> getFeature_list() {
        return this.feature_list;
    }

    public final List<String> getMax_feature_list() {
        return this.max_feature_list;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dialog_title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.feature_list;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.max_feature_list;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        String str = this.text;
        String str2 = this.dialog_title;
        List<String> list = this.feature_list;
        List<String> list2 = this.max_feature_list;
        StringBuilder sbR = kgh.r("UpsellConfig(text=", str, ", dialog_title=", str2, ", feature_list=");
        sbR.append(list);
        sbR.append(", max_feature_list=");
        sbR.append(list2);
        sbR.append(")");
        return sbR.toString();
    }

    public UpsellConfig() {
        this((String) null, (String) null, (List) null, (List) null, 15, (mq5) null);
    }

    public UpsellConfig(String str, String str2, List<String> list, List<String> list2) {
        this.text = str;
        this.dialog_title = str2;
        this.feature_list = list;
        this.max_feature_list = list2;
    }

    public /* synthetic */ UpsellConfig(String str, String str2, List list, List list2, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2);
    }
}
