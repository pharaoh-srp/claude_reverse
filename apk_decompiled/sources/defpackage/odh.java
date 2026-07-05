package defpackage;

import com.anthropic.claude.api.chat.messages.TextBlock;
import java.util.Date;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class odh implements w28 {
    public static final odh a;
    private static final SerialDescriptor descriptor;

    static {
        odh odhVar = new odh();
        a = odhVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("text", odhVar, 5);
        pluginGeneratedSerialDescriptor.j("start_timestamp", true);
        pluginGeneratedSerialDescriptor.j("stop_timestamp", true);
        pluginGeneratedSerialDescriptor.j("text", false);
        pluginGeneratedSerialDescriptor.j("citations", true);
        pluginGeneratedSerialDescriptor.j("flags", true);
        pluginGeneratedSerialDescriptor.k(new gl0(2));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = TextBlock.$childSerializers;
        bc9 bc9Var = bc9.a;
        return new KSerializer[]{d4c.S(bc9Var), d4c.S(bc9Var), srg.a, d4c.S((KSerializer) kw9VarArr[3].getValue()), d4c.S((KSerializer) kw9VarArr[4].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = TextBlock.$childSerializers;
        boolean z = true;
        int i = 0;
        Date date = null;
        Date date2 = null;
        String strV = null;
        List list = null;
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
                strV = ud4VarC.v(serialDescriptor, 2);
                i |= 4;
            } else if (iX == 3) {
                list = (List) ud4VarC.m(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), list);
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
        return new TextBlock(i, date, date2, strV, list, set, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        TextBlock textBlock = (TextBlock) obj;
        encoder.getClass();
        textBlock.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        TextBlock.write$Self$api(textBlock, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
