package com.anthropic.claude.models.organization.configtypes;

import defpackage.aug;
import defpackage.crg;
import defpackage.gid;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.plg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import defpackage.ztg;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B7\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBK\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0018\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018JF\u0010\u001b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u0018R\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b(\u0010\u0018R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b)\u0010\u0018¨\u0006-"}, d2 = {"Lcom/anthropic/claude/models/organization/configtypes/StudentConfig;", "", "", "Lcom/anthropic/claude/models/organization/configtypes/StarterPromptConfig;", "study", "career", "research", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$models", "(Lcom/anthropic/claude/models/organization/configtypes/StudentConfig;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "component3", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/anthropic/claude/models/organization/configtypes/StudentConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getStudy", "getCareer", "getResearch", "Companion", "ztg", "aug", "models"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class StudentConfig {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final aug Companion = new aug();
    private final List<StarterPromptConfig> career;
    private final List<StarterPromptConfig> research;
    private final List<StarterPromptConfig> study;

    static {
        crg crgVar = new crg(9);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{yb5.w(w1aVar, crgVar), yb5.w(w1aVar, new crg(10)), yb5.w(w1aVar, new crg(11))};
    }

    public /* synthetic */ StudentConfig(int i, List list, List list2, List list3, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, ztg.a.getDescriptor());
            throw null;
        }
        this.study = list;
        this.career = list2;
        this.research = list3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(plg.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(plg.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new uo0(plg.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StudentConfig copy$default(StudentConfig studentConfig, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = studentConfig.study;
        }
        if ((i & 2) != 0) {
            list2 = studentConfig.career;
        }
        if ((i & 4) != 0) {
            list3 = studentConfig.research;
        }
        return studentConfig.copy(list, list2, list3);
    }

    public static final /* synthetic */ void write$Self$models(StudentConfig self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.B(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.study);
        output.B(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.career);
        output.B(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.research);
    }

    public final List<StarterPromptConfig> component1() {
        return this.study;
    }

    public final List<StarterPromptConfig> component2() {
        return this.career;
    }

    public final List<StarterPromptConfig> component3() {
        return this.research;
    }

    public final StudentConfig copy(List<StarterPromptConfig> study, List<StarterPromptConfig> career, List<StarterPromptConfig> research) {
        return new StudentConfig(study, career, research);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StudentConfig)) {
            return false;
        }
        StudentConfig studentConfig = (StudentConfig) other;
        return x44.r(this.study, studentConfig.study) && x44.r(this.career, studentConfig.career) && x44.r(this.research, studentConfig.research);
    }

    public final List<StarterPromptConfig> getCareer() {
        return this.career;
    }

    public final List<StarterPromptConfig> getResearch() {
        return this.research;
    }

    public final List<StarterPromptConfig> getStudy() {
        return this.study;
    }

    public int hashCode() {
        List<StarterPromptConfig> list = this.study;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<StarterPromptConfig> list2 = this.career;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<StarterPromptConfig> list3 = this.research;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public String toString() {
        List<StarterPromptConfig> list = this.study;
        List<StarterPromptConfig> list2 = this.career;
        List<StarterPromptConfig> list3 = this.research;
        StringBuilder sb = new StringBuilder("StudentConfig(study=");
        sb.append(list);
        sb.append(", career=");
        sb.append(list2);
        sb.append(", research=");
        return gid.q(sb, list3, ")");
    }

    public StudentConfig(List<StarterPromptConfig> list, List<StarterPromptConfig> list2, List<StarterPromptConfig> list3) {
        this.study = list;
        this.career = list2;
        this.research = list3;
    }
}
