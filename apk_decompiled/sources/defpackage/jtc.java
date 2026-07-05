package defpackage;

import com.anthropic.claude.api.chat.messages.ThinkingSummary;
import com.anthropic.claude.chat.parse.ParsedContentBlock$Thinking;
import com.anthropic.claude.chat.parse.ParsedContentBlockId;
import java.util.Date;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jtc implements w28 {
    public static final jtc a;
    private static final SerialDescriptor descriptor;

    static {
        jtc jtcVar = new jtc();
        a = jtcVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.chat.parse.ParsedContentBlock.Thinking", jtcVar, 7);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("body", false);
        pluginGeneratedSerialDescriptor.j("startTimestamp", false);
        pluginGeneratedSerialDescriptor.j("endTimestamp", false);
        pluginGeneratedSerialDescriptor.j("latestSummary", true);
        pluginGeneratedSerialDescriptor.j("flags", true);
        pluginGeneratedSerialDescriptor.j("isComplete", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ParsedContentBlock$Thinking.$childSerializers;
        bc9 bc9Var = bc9.a;
        return new KSerializer[]{ntc.a, srg.a, bc9Var, d4c.S(bc9Var), d4c.S(mmh.a), kw9VarArr[5].getValue(), zt1.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ParsedContentBlock$Thinking.$childSerializers;
        Object obj = null;
        boolean z = true;
        int i = 0;
        boolean zU = false;
        ParsedContentBlockId parsedContentBlockId = null;
        String strV = null;
        Date date = null;
        Date date2 = null;
        ThinkingSummary thinkingSummary = null;
        Set set = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    parsedContentBlockId = (ParsedContentBlockId) ud4VarC.l(serialDescriptor, 0, ntc.a, parsedContentBlockId);
                    i |= 1;
                    break;
                case 1:
                    strV = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    date = (Date) ud4VarC.l(serialDescriptor, 2, bc9.a, date);
                    i |= 4;
                    break;
                case 3:
                    date2 = (Date) ud4VarC.m(serialDescriptor, 3, bc9.a, date2);
                    i |= 8;
                    break;
                case 4:
                    thinkingSummary = (ThinkingSummary) ud4VarC.m(serialDescriptor, 4, mmh.a, thinkingSummary);
                    i |= 16;
                    break;
                case 5:
                    set = (Set) ud4VarC.l(serialDescriptor, 5, (s06) kw9VarArr[5].getValue(), set);
                    i |= 32;
                    break;
                case 6:
                    zU = ud4VarC.u(serialDescriptor, 6);
                    i |= 64;
                    continue;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new ParsedContentBlock$Thinking(i, parsedContentBlockId, strV, date, date2, thinkingSummary, set, zU, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ParsedContentBlock$Thinking parsedContentBlock$Thinking = (ParsedContentBlock$Thinking) obj;
        encoder.getClass();
        parsedContentBlock$Thinking.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ParsedContentBlock$Thinking.write$Self$Claude_chat_parse(parsedContentBlock$Thinking, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
