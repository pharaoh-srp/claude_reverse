package com.anthropic.claude.models.organization.configtypes;

import defpackage.chg;
import defpackage.e79;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qtg;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wof;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import defpackage.zt1;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000223B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b \u0010!JF\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u001dJ\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001dR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b\n\u0010!¨\u00064"}, d2 = {"Lcom/anthropic/claude/models/organization/configtypes/SpeechInputConfig;", "", "", "maximum_request_duration_seconds", "", "default_language_code", "", "Lcom/anthropic/claude/models/organization/configtypes/SttSupportedLanguage;", "supported_languages", "", "is_voice_multilingual_enabled", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$models", "(Lcom/anthropic/claude/models/organization/configtypes/SpeechInputConfig;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "component4", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)Lcom/anthropic/claude/models/organization/configtypes/SpeechInputConfig;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getMaximum_request_duration_seconds", "Ljava/lang/String;", "getDefault_language_code", "Ljava/util/List;", "getSupported_languages", "Ljava/lang/Boolean;", "Companion", "bhg", "chg", "models"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SpeechInputConfig {
    public static final int $stable = 0;
    private final String default_language_code;
    private final Boolean is_voice_multilingual_enabled;
    private final Integer maximum_request_duration_seconds;
    private final List<SttSupportedLanguage> supported_languages;
    public static final chg Companion = new chg();
    private static final kw9[] $childSerializers = {null, null, yb5.w(w1a.F, new wof(4)), null};

    public /* synthetic */ SpeechInputConfig(int i, Integer num, String str, List list, Boolean bool, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.maximum_request_duration_seconds = null;
        } else {
            this.maximum_request_duration_seconds = num;
        }
        if ((i & 2) == 0) {
            this.default_language_code = null;
        } else {
            this.default_language_code = str;
        }
        if ((i & 4) == 0) {
            this.supported_languages = null;
        } else {
            this.supported_languages = list;
        }
        if ((i & 8) == 0) {
            this.is_voice_multilingual_enabled = null;
        } else {
            this.is_voice_multilingual_enabled = bool;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(qtg.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpeechInputConfig copy$default(SpeechInputConfig speechInputConfig, Integer num, String str, List list, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            num = speechInputConfig.maximum_request_duration_seconds;
        }
        if ((i & 2) != 0) {
            str = speechInputConfig.default_language_code;
        }
        if ((i & 4) != 0) {
            list = speechInputConfig.supported_languages;
        }
        if ((i & 8) != 0) {
            bool = speechInputConfig.is_voice_multilingual_enabled;
        }
        return speechInputConfig.copy(num, str, list, bool);
    }

    public static final /* synthetic */ void write$Self$models(SpeechInputConfig self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.maximum_request_duration_seconds != null) {
            output.B(serialDesc, 0, e79.a, self.maximum_request_duration_seconds);
        }
        if (output.E(serialDesc) || self.default_language_code != null) {
            output.B(serialDesc, 1, srg.a, self.default_language_code);
        }
        if (output.E(serialDesc) || self.supported_languages != null) {
            output.B(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.supported_languages);
        }
        if (!output.E(serialDesc) && self.is_voice_multilingual_enabled == null) {
            return;
        }
        output.B(serialDesc, 3, zt1.a, self.is_voice_multilingual_enabled);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getMaximum_request_duration_seconds() {
        return this.maximum_request_duration_seconds;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDefault_language_code() {
        return this.default_language_code;
    }

    public final List<SttSupportedLanguage> component3() {
        return this.supported_languages;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getIs_voice_multilingual_enabled() {
        return this.is_voice_multilingual_enabled;
    }

    public final SpeechInputConfig copy(Integer maximum_request_duration_seconds, String default_language_code, List<SttSupportedLanguage> supported_languages, Boolean is_voice_multilingual_enabled) {
        return new SpeechInputConfig(maximum_request_duration_seconds, default_language_code, supported_languages, is_voice_multilingual_enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpeechInputConfig)) {
            return false;
        }
        SpeechInputConfig speechInputConfig = (SpeechInputConfig) other;
        return x44.r(this.maximum_request_duration_seconds, speechInputConfig.maximum_request_duration_seconds) && x44.r(this.default_language_code, speechInputConfig.default_language_code) && x44.r(this.supported_languages, speechInputConfig.supported_languages) && x44.r(this.is_voice_multilingual_enabled, speechInputConfig.is_voice_multilingual_enabled);
    }

    public final String getDefault_language_code() {
        return this.default_language_code;
    }

    public final Integer getMaximum_request_duration_seconds() {
        return this.maximum_request_duration_seconds;
    }

    public final List<SttSupportedLanguage> getSupported_languages() {
        return this.supported_languages;
    }

    public int hashCode() {
        Integer num = this.maximum_request_duration_seconds;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.default_language_code;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<SttSupportedLanguage> list = this.supported_languages;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.is_voice_multilingual_enabled;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean is_voice_multilingual_enabled() {
        return this.is_voice_multilingual_enabled;
    }

    public String toString() {
        return "SpeechInputConfig(maximum_request_duration_seconds=" + this.maximum_request_duration_seconds + ", default_language_code=" + this.default_language_code + ", supported_languages=" + this.supported_languages + ", is_voice_multilingual_enabled=" + this.is_voice_multilingual_enabled + ")";
    }

    public SpeechInputConfig() {
        this((Integer) null, (String) null, (List) null, (Boolean) null, 15, (mq5) null);
    }

    public SpeechInputConfig(Integer num, String str, List<SttSupportedLanguage> list, Boolean bool) {
        this.maximum_request_duration_seconds = num;
        this.default_language_code = str;
        this.supported_languages = list;
        this.is_voice_multilingual_enabled = bool;
    }

    public /* synthetic */ SpeechInputConfig(Integer num, String str, List list, Boolean bool, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : bool);
    }
}
