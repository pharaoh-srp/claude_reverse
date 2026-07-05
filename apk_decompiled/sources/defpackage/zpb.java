package defpackage;

import com.anthropic.claude.api.chat.ModelSelection;
import com.anthropic.claude.api.chat.messages.ModelUpdateEvent;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zpb implements w28 {
    public static final zpb a;
    private static final SerialDescriptor descriptor;

    static {
        zpb zpbVar = new zpb();
        a = zpbVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("model_update", zpbVar, 6);
        pluginGeneratedSerialDescriptor.j("from_model", false);
        pluginGeneratedSerialDescriptor.j("to_model", false);
        pluginGeneratedSerialDescriptor.j("reason", true);
        pluginGeneratedSerialDescriptor.j("category", true);
        pluginGeneratedSerialDescriptor.j("explanation", true);
        pluginGeneratedSerialDescriptor.j("learn_more_url", true);
        pluginGeneratedSerialDescriptor.k(new gl0(11));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        KSerializer kSerializerS = d4c.S(srgVar);
        KSerializer kSerializerS2 = d4c.S(srgVar);
        KSerializer kSerializerS3 = d4c.S(srgVar);
        KSerializer kSerializerS4 = d4c.S(srgVar);
        lob lobVar = lob.a;
        return new KSerializer[]{lobVar, lobVar, kSerializerS, kSerializerS2, kSerializerS3, kSerializerS4};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        ModelSelection modelSelection = null;
        ModelSelection modelSelection2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    modelSelection = (ModelSelection) ud4VarC.l(serialDescriptor, 0, lob.a, modelSelection);
                    i |= 1;
                    break;
                case 1:
                    modelSelection2 = (ModelSelection) ud4VarC.l(serialDescriptor, 1, lob.a, modelSelection2);
                    i |= 2;
                    break;
                case 2:
                    str = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str2);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str3);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str4);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ModelUpdateEvent(i, modelSelection, modelSelection2, str, str2, str3, str4, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ModelUpdateEvent modelUpdateEvent = (ModelUpdateEvent) obj;
        encoder.getClass();
        modelUpdateEvent.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ModelUpdateEvent.write$Self$api(modelUpdateEvent, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
