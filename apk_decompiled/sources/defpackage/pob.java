package defpackage;

import com.anthropic.claude.api.model.ModelSelectorConfig;
import com.anthropic.claude.api.model.ModelSelectorSurface;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pob implements w28 {
    public static final pob a;
    private static final SerialDescriptor descriptor;

    static {
        pob pobVar = new pob();
        a = pobVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.model.ModelSelectorConfig", pobVar, 2);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("models", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{tpb.a, ModelSelectorConfig.$childSerializers[1].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ModelSelectorConfig.$childSerializers;
        boolean z = true;
        int i = 0;
        String strM378unboximpl = null;
        List list = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                ModelSelectorSurface modelSelectorSurface = (ModelSelectorSurface) ud4VarC.l(serialDescriptor, 0, tpb.a, strM378unboximpl != null ? ModelSelectorSurface.m372boximpl(strM378unboximpl) : null);
                strM378unboximpl = modelSelectorSurface != null ? modelSelectorSurface.m378unboximpl() : null;
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                list = (List) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), list);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ModelSelectorConfig(i, strM378unboximpl, list, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ModelSelectorConfig modelSelectorConfig = (ModelSelectorConfig) obj;
        encoder.getClass();
        modelSelectorConfig.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ModelSelectorConfig.write$Self$api(modelSelectorConfig, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
