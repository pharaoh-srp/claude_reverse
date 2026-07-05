package com.anthropic.claude.models.organization.configtypes;

import com.anthropic.claude.types.strings._ServerLocalizedString;
import defpackage.al4;
import defpackage.gvj;
import defpackage.jce;
import defpackage.kw9;
import defpackage.l84;
import defpackage.mdj;
import defpackage.onf;
import defpackage.rp4;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wkj;
import defpackage.x44;
import defpackage.yb5;
import defpackage.zk4;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bB-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0014\u0010\u0018\u001a\u00060\u0004j\u0002`\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R$\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0019¨\u0006-"}, d2 = {"Lcom/anthropic/claude/models/organization/configtypes/ConsentConfigAndroid;", "", "", "version", "Lcom/anthropic/claude/types/strings/_ServerLocalizedString;", "Lcom/anthropic/claude/types/strings/ServerLocalizedString;", "text", "<init>", "(ILcom/anthropic/claude/types/strings/_ServerLocalizedString;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IILcom/anthropic/claude/types/strings/_ServerLocalizedString;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$models", "(Lcom/anthropic/claude/models/organization/configtypes/ConsentConfigAndroid;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Lcom/anthropic/claude/types/strings/_ServerLocalizedString;", "copy", "(ILcom/anthropic/claude/types/strings/_ServerLocalizedString;)Lcom/anthropic/claude/models/organization/configtypes/ConsentConfigAndroid;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getVersion", "Lcom/anthropic/claude/types/strings/_ServerLocalizedString;", "getText", "getText$annotations", "()V", "Companion", "zk4", "al4", "models"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ConsentConfigAndroid {
    public static final int $stable = 0;
    private final _ServerLocalizedString text;
    private final int version;
    public static final al4 Companion = new al4();
    private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new l84(17))};

    public /* synthetic */ ConsentConfigAndroid(int i, int i2, _ServerLocalizedString _serverlocalizedstring, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, zk4.a.getDescriptor());
            throw null;
        }
        this.version = i2;
        this.text = _serverlocalizedstring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_() {
        return new rp4(jce.a.b(_ServerLocalizedString.class), wkj.a, new KSerializer[0]);
    }

    public static /* synthetic */ ConsentConfigAndroid copy$default(ConsentConfigAndroid consentConfigAndroid, int i, _ServerLocalizedString _serverlocalizedstring, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = consentConfigAndroid.version;
        }
        if ((i2 & 2) != 0) {
            _serverlocalizedstring = consentConfigAndroid.text;
        }
        return consentConfigAndroid.copy(i, _serverlocalizedstring);
    }

    public static /* synthetic */ void getText$annotations() {
    }

    public static final /* synthetic */ void write$Self$models(ConsentConfigAndroid self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.l(0, self.version, serialDesc);
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.text);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final _ServerLocalizedString getText() {
        return this.text;
    }

    public final ConsentConfigAndroid copy(int version, _ServerLocalizedString text) {
        text.getClass();
        return new ConsentConfigAndroid(version, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConsentConfigAndroid)) {
            return false;
        }
        ConsentConfigAndroid consentConfigAndroid = (ConsentConfigAndroid) other;
        return this.version == consentConfigAndroid.version && x44.r(this.text, consentConfigAndroid.text);
    }

    public final _ServerLocalizedString getText() {
        return this.text;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.text.hashCode() + (Integer.hashCode(this.version) * 31);
    }

    public String toString() {
        return "ConsentConfigAndroid(version=" + this.version + ", text=" + this.text + ")";
    }

    public ConsentConfigAndroid(int i, _ServerLocalizedString _serverlocalizedstring) {
        _serverlocalizedstring.getClass();
        this.version = i;
        this.text = _serverlocalizedstring;
    }
}
