package com.anthropic.claude.api.experience;

import defpackage.kw9;
import defpackage.lm6;
import defpackage.m17;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.uo0;
import defpackage.v87;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.y87;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B'\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J0\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u0017R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b&\u0010\u0017¨\u0006*"}, d2 = {"Lcom/anthropic/claude/api/experience/ExperienceAssetImageVariants;", "", "", "Lcom/anthropic/claude/api/experience/ExperienceAssetScaledImage;", "light", "dark", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/experience/ExperienceAssetImageVariants;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/anthropic/claude/api/experience/ExperienceAssetImageVariants;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getLight", "getDark", "Companion", "u87", "v87", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ExperienceAssetImageVariants {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final v87 Companion = new v87();
    private final List<ExperienceAssetScaledImage> dark;
    private final List<ExperienceAssetScaledImage> light;

    static {
        m17 m17Var = new m17(27);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{yb5.w(w1aVar, m17Var), yb5.w(w1aVar, new m17(28))};
    }

    public /* synthetic */ ExperienceAssetImageVariants(int i, List list, List list2, vnf vnfVar) {
        int i2 = i & 1;
        lm6 lm6Var = lm6.E;
        if (i2 == 0) {
            this.light = lm6Var;
        } else {
            this.light = list;
        }
        if ((i & 2) == 0) {
            this.dark = lm6Var;
        } else {
            this.dark = list2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(y87.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(y87.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExperienceAssetImageVariants copy$default(ExperienceAssetImageVariants experienceAssetImageVariants, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = experienceAssetImageVariants.light;
        }
        if ((i & 2) != 0) {
            list2 = experienceAssetImageVariants.dark;
        }
        return experienceAssetImageVariants.copy(list, list2);
    }

    public static final /* synthetic */ void write$Self$api(ExperienceAssetImageVariants self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        boolean zE = output.E(serialDesc);
        lm6 lm6Var = lm6.E;
        if (zE || !x44.r(self.light, lm6Var)) {
            output.r(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.light);
        }
        if (!output.E(serialDesc) && x44.r(self.dark, lm6Var)) {
            return;
        }
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.dark);
    }

    public final List<ExperienceAssetScaledImage> component1() {
        return this.light;
    }

    public final List<ExperienceAssetScaledImage> component2() {
        return this.dark;
    }

    public final ExperienceAssetImageVariants copy(List<ExperienceAssetScaledImage> light, List<ExperienceAssetScaledImage> dark) {
        light.getClass();
        dark.getClass();
        return new ExperienceAssetImageVariants(light, dark);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExperienceAssetImageVariants)) {
            return false;
        }
        ExperienceAssetImageVariants experienceAssetImageVariants = (ExperienceAssetImageVariants) other;
        return x44.r(this.light, experienceAssetImageVariants.light) && x44.r(this.dark, experienceAssetImageVariants.dark);
    }

    public final List<ExperienceAssetScaledImage> getDark() {
        return this.dark;
    }

    public final List<ExperienceAssetScaledImage> getLight() {
        return this.light;
    }

    public int hashCode() {
        return this.dark.hashCode() + (this.light.hashCode() * 31);
    }

    public String toString() {
        return "ExperienceAssetImageVariants(light=" + this.light + ", dark=" + this.dark + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExperienceAssetImageVariants() {
        this((List) null, (List) (0 == true ? 1 : 0), 3, (mq5) (0 == true ? 1 : 0));
    }

    public ExperienceAssetImageVariants(List<ExperienceAssetScaledImage> list, List<ExperienceAssetScaledImage> list2) {
        list.getClass();
        list2.getClass();
        this.light = list;
        this.dark = list2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ExperienceAssetImageVariants(List list, List list2, int i, mq5 mq5Var) {
        int i2 = i & 1;
        lm6 lm6Var = lm6.E;
        this(i2 != 0 ? lm6Var : list, (i & 2) != 0 ? lm6Var : list2);
    }
}
