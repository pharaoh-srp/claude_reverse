package com.anthropic.claude.models.organization.configtypes;

import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.ttg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J0\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u0017¨\u0006*"}, d2 = {"Lcom/anthropic/claude/models/organization/configtypes/SttVoiceOption;", "", "", "id", "display_name", "preview_url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$models", "(Lcom/anthropic/claude/models/organization/configtypes/SttVoiceOption;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/models/organization/configtypes/SttVoiceOption;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getDisplay_name", "getPreview_url", "Companion", "stg", "ttg", "models"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SttVoiceOption {
    public static final int $stable = 0;
    public static final ttg Companion = new ttg();
    private final String display_name;
    private final String id;
    private final String preview_url;

    public /* synthetic */ SttVoiceOption(int i, String str, String str2, String str3, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.display_name = "";
        } else {
            this.display_name = str2;
        }
        if ((i & 4) == 0) {
            this.preview_url = null;
        } else {
            this.preview_url = str3;
        }
    }

    public static /* synthetic */ SttVoiceOption copy$default(SttVoiceOption sttVoiceOption, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sttVoiceOption.id;
        }
        if ((i & 2) != 0) {
            str2 = sttVoiceOption.display_name;
        }
        if ((i & 4) != 0) {
            str3 = sttVoiceOption.preview_url;
        }
        return sttVoiceOption.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$models(SttVoiceOption self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || !x44.r(self.id, "")) {
            output.q(serialDesc, 0, self.id);
        }
        if (output.E(serialDesc) || !x44.r(self.display_name, "")) {
            output.q(serialDesc, 1, self.display_name);
        }
        if (!output.E(serialDesc) && self.preview_url == null) {
            return;
        }
        output.B(serialDesc, 2, srg.a, self.preview_url);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDisplay_name() {
        return this.display_name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPreview_url() {
        return this.preview_url;
    }

    public final SttVoiceOption copy(String id, String display_name, String preview_url) {
        id.getClass();
        display_name.getClass();
        return new SttVoiceOption(id, display_name, preview_url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SttVoiceOption)) {
            return false;
        }
        SttVoiceOption sttVoiceOption = (SttVoiceOption) other;
        return x44.r(this.id, sttVoiceOption.id) && x44.r(this.display_name, sttVoiceOption.display_name) && x44.r(this.preview_url, sttVoiceOption.preview_url);
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final String getId() {
        return this.id;
    }

    public final String getPreview_url() {
        return this.preview_url;
    }

    public int hashCode() {
        int iL = kgh.l(this.id.hashCode() * 31, 31, this.display_name);
        String str = this.preview_url;
        return iL + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.id;
        String str2 = this.display_name;
        return ij0.m(kgh.r("SttVoiceOption(id=", str, ", display_name=", str2, ", preview_url="), this.preview_url, ")");
    }

    public SttVoiceOption() {
        this((String) null, (String) null, (String) null, 7, (mq5) null);
    }

    public SttVoiceOption(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.display_name = str2;
        this.preview_url = str3;
    }

    public /* synthetic */ SttVoiceOption(String str, String str2, String str3, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3);
    }
}
