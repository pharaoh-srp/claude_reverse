package com.anthropic.claude.sessions.types;

import defpackage.gcf;
import defpackage.gvj;
import defpackage.hcf;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0002\u001a\u001bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/anthropic/claude/sessions/types/SdkTextContent;", "Lcom/anthropic/claude/sessions/types/SdkMessageContent;", "", "type", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/SdkTextContent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getText", "Companion", "gcf", "hcf", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class SdkTextContent implements SdkMessageContent {
    public static final hcf Companion = new hcf();
    private final String text;
    private final String type;

    public /* synthetic */ SdkTextContent(int i, String str, String str2, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, gcf.a.getDescriptor());
            throw null;
        }
        this.type = str;
        this.text = str2;
    }

    public static final /* synthetic */ void write$Self$sessions(SdkTextContent self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.getType());
        output.q(serialDesc, 1, self.text);
    }

    public final String getText() {
        return this.text;
    }

    @Override // com.anthropic.claude.sessions.types.SdkMessageContent
    public String getType() {
        return this.type;
    }

    public SdkTextContent(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.type = str;
        this.text = str2;
    }
}
