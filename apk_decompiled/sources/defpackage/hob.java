package defpackage;

import com.anthropic.claude.chat.modelselector.ModelRedirect;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hob implements w28 {
    public static final hob a;
    private static final SerialDescriptor descriptor;

    static {
        hob hobVar = new hob();
        a = hobVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.chat.modelselector.ModelRedirect", hobVar, 3);
        pluginGeneratedSerialDescriptor.j("destination_model_name", false);
        pluginGeneratedSerialDescriptor.j("explanation", false);
        pluginGeneratedSerialDescriptor.j("redirect_on", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ModelRedirect.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, kw9VarArr[2].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ModelRedirect.$childSerializers;
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        List list = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                strV2 = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                list = (List) ud4VarC.l(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), list);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ModelRedirect(i, strV, strV2, list, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ModelRedirect modelRedirect = (ModelRedirect) obj;
        encoder.getClass();
        modelRedirect.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ModelRedirect.write$Self$chat(modelRedirect, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
