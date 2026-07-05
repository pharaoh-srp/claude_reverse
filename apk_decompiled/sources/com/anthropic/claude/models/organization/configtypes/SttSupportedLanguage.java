package com.anthropic.claude.models.organization.configtypes;

import defpackage.gid;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.rtg;
import defpackage.stg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wof;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ4\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u001c¨\u0006."}, d2 = {"Lcom/anthropic/claude/models/organization/configtypes/SttSupportedLanguage;", "", "", "code", "display_name", "", "Lcom/anthropic/claude/models/organization/configtypes/SttVoiceOption;", "voices", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$models", "(Lcom/anthropic/claude/models/organization/configtypes/SttSupportedLanguage;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/anthropic/claude/models/organization/configtypes/SttSupportedLanguage;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCode", "getDisplay_name", "Ljava/util/List;", "getVoices", "Companion", "qtg", "rtg", "models"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SttSupportedLanguage {
    public static final int $stable = 0;
    private final String code;
    private final String display_name;
    private final List<SttVoiceOption> voices;
    public static final rtg Companion = new rtg();
    private static final kw9[] $childSerializers = {null, null, yb5.w(w1a.F, new wof(10))};

    public /* synthetic */ SttSupportedLanguage(int i, String str, String str2, List list, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.code = "";
        } else {
            this.code = str;
        }
        if ((i & 2) == 0) {
            this.display_name = "";
        } else {
            this.display_name = str2;
        }
        if ((i & 4) == 0) {
            this.voices = lm6.E;
        } else {
            this.voices = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(stg.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SttSupportedLanguage copy$default(SttSupportedLanguage sttSupportedLanguage, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sttSupportedLanguage.code;
        }
        if ((i & 2) != 0) {
            str2 = sttSupportedLanguage.display_name;
        }
        if ((i & 4) != 0) {
            list = sttSupportedLanguage.voices;
        }
        return sttSupportedLanguage.copy(str, str2, list);
    }

    public static final /* synthetic */ void write$Self$models(SttSupportedLanguage self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || !x44.r(self.code, "")) {
            output.q(serialDesc, 0, self.code);
        }
        if (output.E(serialDesc) || !x44.r(self.display_name, "")) {
            output.q(serialDesc, 1, self.display_name);
        }
        if (!output.E(serialDesc) && x44.r(self.voices, lm6.E)) {
            return;
        }
        output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.voices);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDisplay_name() {
        return this.display_name;
    }

    public final List<SttVoiceOption> component3() {
        return this.voices;
    }

    public final SttSupportedLanguage copy(String code, String display_name, List<SttVoiceOption> voices) {
        code.getClass();
        display_name.getClass();
        voices.getClass();
        return new SttSupportedLanguage(code, display_name, voices);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SttSupportedLanguage)) {
            return false;
        }
        SttSupportedLanguage sttSupportedLanguage = (SttSupportedLanguage) other;
        return x44.r(this.code, sttSupportedLanguage.code) && x44.r(this.display_name, sttSupportedLanguage.display_name) && x44.r(this.voices, sttSupportedLanguage.voices);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final List<SttVoiceOption> getVoices() {
        return this.voices;
    }

    public int hashCode() {
        return this.voices.hashCode() + kgh.l(this.code.hashCode() * 31, 31, this.display_name);
    }

    public String toString() {
        String str = this.code;
        String str2 = this.display_name;
        return gid.q(kgh.r("SttSupportedLanguage(code=", str, ", display_name=", str2, ", voices="), this.voices, ")");
    }

    public SttSupportedLanguage() {
        this((String) null, (String) null, (List) null, 7, (mq5) null);
    }

    public SttSupportedLanguage(String str, String str2, List<SttVoiceOption> list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.code = str;
        this.display_name = str2;
        this.voices = list;
    }

    public /* synthetic */ SttSupportedLanguage(String str, String str2, List list, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? lm6.E : list);
    }
}
