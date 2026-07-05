package com.anthropic.claude.api.model;

import com.anthropic.claude.types.strings._ServerLocalizedString;
import defpackage.d4c;
import defpackage.jce;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.rp4;
import defpackage.ulb;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wkj;
import defpackage.x44;
import defpackage.yb5;
import defpackage.ypb;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\u0005\u0010\u0006B%\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u0017\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010\u0016¨\u0006'"}, d2 = {"Lcom/anthropic/claude/api/model/ModelTooltip;", "", "Lcom/anthropic/claude/types/strings/_ServerLocalizedString;", "Lcom/anthropic/claude/types/strings/ServerLocalizedString;", "content", "<init>", "(Lcom/anthropic/claude/types/strings/_ServerLocalizedString;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/types/strings/_ServerLocalizedString;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/model/ModelTooltip;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/types/strings/_ServerLocalizedString;", "copy", "(Lcom/anthropic/claude/types/strings/_ServerLocalizedString;)Lcom/anthropic/claude/api/model/ModelTooltip;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/types/strings/_ServerLocalizedString;", "getContent", "Companion", "xpb", "ypb", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ModelTooltip {
    public static final int $stable = 0;
    private final _ServerLocalizedString content;
    public static final ypb Companion = new ypb();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new ulb(22))};

    public /* synthetic */ ModelTooltip(int i, _ServerLocalizedString _serverlocalizedstring, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.content = null;
        } else {
            this.content = _serverlocalizedstring;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_() {
        return new rp4(jce.a.b(_ServerLocalizedString.class), d4c.S(wkj.a), new KSerializer[0]);
    }

    public static /* synthetic */ ModelTooltip copy$default(ModelTooltip modelTooltip, _ServerLocalizedString _serverlocalizedstring, int i, Object obj) {
        if ((i & 1) != 0) {
            _serverlocalizedstring = modelTooltip.content;
        }
        return modelTooltip.copy(_serverlocalizedstring);
    }

    public static final /* synthetic */ void write$Self$api(ModelTooltip self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (!output.E(serialDesc) && self.content == null) {
            return;
        }
        output.B(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.content);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final _ServerLocalizedString getContent() {
        return this.content;
    }

    public final ModelTooltip copy(_ServerLocalizedString content) {
        return new ModelTooltip(content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ModelTooltip) && x44.r(this.content, ((ModelTooltip) other).content);
    }

    public final _ServerLocalizedString getContent() {
        return this.content;
    }

    public int hashCode() {
        _ServerLocalizedString _serverlocalizedstring = this.content;
        if (_serverlocalizedstring == null) {
            return 0;
        }
        return _serverlocalizedstring.hashCode();
    }

    public String toString() {
        return "ModelTooltip(content=" + this.content + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ModelTooltip() {
        this((_ServerLocalizedString) null, 1, (mq5) (0 == true ? 1 : 0));
    }

    public ModelTooltip(_ServerLocalizedString _serverlocalizedstring) {
        this.content = _serverlocalizedstring;
    }

    public /* synthetic */ ModelTooltip(_ServerLocalizedString _serverlocalizedstring, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : _serverlocalizedstring);
    }
}
