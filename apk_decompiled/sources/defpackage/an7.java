package defpackage;

import com.anthropic.claude.api.chat.messages.ApiHelpline;
import com.anthropic.claude.api.chat.messages.FlagBlock;
import com.anthropic.claude.api.chat.messages.MessageFlag;
import java.util.Date;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class an7 implements w28 {
    public static final an7 a;
    private static final SerialDescriptor descriptor;

    static {
        an7 an7Var = new an7();
        a = an7Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flag", an7Var, 5);
        pluginGeneratedSerialDescriptor.j("start_timestamp", true);
        pluginGeneratedSerialDescriptor.j("stop_timestamp", true);
        pluginGeneratedSerialDescriptor.j("flag", false);
        pluginGeneratedSerialDescriptor.j("helpline", true);
        pluginGeneratedSerialDescriptor.j("flags", true);
        pluginGeneratedSerialDescriptor.k(new gl0(2));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = FlagBlock.$childSerializers;
        bc9 bc9Var = bc9.a;
        return new KSerializer[]{d4c.S(bc9Var), d4c.S(bc9Var), dhb.a, d4c.S(ef0.a), d4c.S((KSerializer) kw9VarArr[4].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = FlagBlock.$childSerializers;
        boolean z = true;
        int i = 0;
        Date date = null;
        Date date2 = null;
        MessageFlag messageFlag = null;
        ApiHelpline apiHelpline = null;
        Set set = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                date = (Date) ud4VarC.m(serialDescriptor, 0, bc9.a, date);
                i |= 1;
            } else if (iX == 1) {
                date2 = (Date) ud4VarC.m(serialDescriptor, 1, bc9.a, date2);
                i |= 2;
            } else if (iX == 2) {
                messageFlag = (MessageFlag) ud4VarC.l(serialDescriptor, 2, dhb.a, messageFlag);
                i |= 4;
            } else if (iX == 3) {
                apiHelpline = (ApiHelpline) ud4VarC.m(serialDescriptor, 3, ef0.a, apiHelpline);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                set = (Set) ud4VarC.m(serialDescriptor, 4, (s06) kw9VarArr[4].getValue(), set);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new FlagBlock(i, date, date2, messageFlag, apiHelpline, set, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        FlagBlock flagBlock = (FlagBlock) obj;
        encoder.getClass();
        flagBlock.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        FlagBlock.write$Self$api(flagBlock, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
