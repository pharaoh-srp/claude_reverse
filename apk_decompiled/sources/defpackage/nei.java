package defpackage;

import com.anthropic.claude.api.chat.messages.UnknownContentBlock;
import java.util.Date;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nei implements w28 {
    public static final nei a;
    private static final SerialDescriptor descriptor;

    static {
        nei neiVar = new nei();
        a = neiVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.chat.messages.UnknownContentBlock", neiVar, 3);
        pluginGeneratedSerialDescriptor.j("start_timestamp", true);
        pluginGeneratedSerialDescriptor.j("stop_timestamp", true);
        pluginGeneratedSerialDescriptor.j("flags", true);
        pluginGeneratedSerialDescriptor.k(new gl0(2));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = UnknownContentBlock.$childSerializers;
        bc9 bc9Var = bc9.a;
        return new KSerializer[]{d4c.S(bc9Var), d4c.S(bc9Var), d4c.S((KSerializer) kw9VarArr[2].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = UnknownContentBlock.$childSerializers;
        boolean z = true;
        int i = 0;
        Date date = null;
        Date date2 = null;
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
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                set = (Set) ud4VarC.m(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), set);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new UnknownContentBlock(i, date, date2, set, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        UnknownContentBlock unknownContentBlock = (UnknownContentBlock) obj;
        encoder.getClass();
        unknownContentBlock.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        UnknownContentBlock.write$Self$api(unknownContentBlock, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
