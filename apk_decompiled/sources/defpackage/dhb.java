package defpackage;

import com.anthropic.claude.api.chat.messages.MessageFlag;
import com.anthropic.claude.api.chat.messages.g;
import com.anthropic.claude.api.chat.messages.h;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes2.dex */
public final class dhb implements KSerializer {
    public static final dhb a = new dhb();
    public static final rfd b = j8.h("MessageFlag", kfd.t);

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        bhb bhbVar = MessageFlag.Companion;
        String strS = decoder.s();
        bhbVar.getClass();
        strS.getClass();
        return strS.equals("self_harm_risk") ? h.a : strS.equals("election") ? g.a : new chb(strS);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        MessageFlag messageFlag = (MessageFlag) obj;
        encoder.getClass();
        messageFlag.getClass();
        encoder.F(messageFlag.getRawValue());
    }
}
